package com.ccl.documentmanagementintapi.utils.thumbnail;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.exif.ExifIFD0Directory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;
import java.util.UUID;

public class ThumbnailGenerator {

    private byte[] originalImage;
    private String fileType;
    private int widthThumbnail;
    private int heightThumbnail;
    private int widthOriginal;
    private int heightOriginal;
    private int orientation;

    public String generateThumbnail(String originalBase64, String fileType, int width, int height) throws Exception {
        this.originalImage = decoder(originalBase64);
        this.fileType = fileType;
        this.widthThumbnail = width;
        this.heightThumbnail = height;

        validate();

        return encoder(processImageWithSize());
    }

    public byte[] generateThumbnail(byte[] originalBase64Byte, String fileType, int width, int height) throws Exception {
        this.originalImage = originalBase64Byte;
        this.fileType = fileType;
        this.widthThumbnail = width;
        this.heightThumbnail = height;

        validate();

        return processImageWithSize();
    }

    private byte[] processImageWithSize() throws Exception {

        BufferedImage image;
        ByteArrayInputStream bis = new ByteArrayInputStream(this.originalImage);
        image = ImageIO.read(bis);
        bis.close();

        this.widthOriginal = image.getWidth();
        this.heightOriginal = image.getHeight();
        checkImageOrientation();

        if (this.widthOriginal < this.widthThumbnail || this.heightOriginal < this.heightThumbnail) {
            // imagenes con medidas más pequeñas que las de la miniatura
            return createSmallThumbnail(image);
        } else {
            // imagenes con medidas superiores a las de la miniatura
            return createThumbnail(image);
        }
    }

    private byte[] createThumbnail(BufferedImage image) throws Exception {
        /*
        java.io.File out = new java.io.File ("temp/out.png");
        ImageIO.write (image, "png", out);
        */
        BufferedImage thumbnailImage;
        BufferedImage imageCorrect = correctOrientation(image);

        generateBytesArray(imageCorrect);

        if (this.orientation == 6) {
            // El resultado del correctOrientation es una imagen del mismo tamaño, bien orientada y con la parte sobrante en negro
            // Quitamos la parte negra sobrante de la imagen, recortandola
            float correctWidth = this.heightOriginal * 0.57f;
            BufferedImage imageCut = imageCorrect.getSubimage(0, 0, ((int) correctWidth), this.heightOriginal);
            thumbnailImage = Image.resize(imageCut, Image.Method.ULTRA_QUALITY, this.widthThumbnail, this.heightThumbnail);
        } else if (this.orientation == 8) {
            // El resultado del correctOrientation es una imagen del mismo tamaño, bien orientada y con la parte sobrante en negro
            // Quitamos la parte negra sobrante de la imagen, recortandola
            BufferedImage imageCut = imageCorrect.getSubimage(0, 0, this.heightOriginal, this.heightOriginal);
            thumbnailImage = Image.resize(imageCut, Image.Method.ULTRA_QUALITY, this.widthThumbnail, this.heightThumbnail);
        } else {
            // Casos optimos. La imagen original se reescala directamente a la mida de la miniatura.
            thumbnailImage = Image.resize(imageCorrect, Image.Method.BALANCED, this.widthThumbnail, this.heightThumbnail);
        }
        byte[] imageBytes = generateBytesArray(thumbnailImage);
        return imageBytes;
    }

    private byte[] createSmallThumbnail(BufferedImage image) throws Exception {
        /*
        java.io.File out = new java.io.File ("temp/out.png");
        ImageIO.write (image, "png", out);
        */
        BufferedImage imageCorrect = correctOrientation(image);

        if (this.widthOriginal < this.widthThumbnail && this.heightOriginal < this.heightThumbnail) {
            // imagen con ambas medidas más pequeñas que las de la miniatura. Se devuelva la imagen original bien oriantada
            return generateBytesArray(imageCorrect);
        } else {
            //imagen com una medida de las 2 más pequeña que las de la miniatura. En este caso se crea una miniatura adaptada
            BufferedImage thumbail = Image.resize(imageCorrect, Image.Method.BALANCED, this.widthThumbnail, this.heightThumbnail);
            return generateBytesArray(thumbail);
        }
    }

    private byte[] generateBytesArray(BufferedImage image) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(image, this.fileType, bos);
        byte[] imageBytes = bos.toByteArray();
        bos.close();
        /*
        FileOutputStream fileOuputStream = new FileOutputStream("temp/thumb/out.png");
        fileOuputStream.write(imageBytes);
        fileOuputStream.close();
        */
        return imageBytes;
    }

    private void validate() {
        Validate.notNull(this.originalImage, "Original image must not be %s", null);
        Validate.matchesPattern(this.fileType.toUpperCase(), "JPG|JPEG|PNG", "File type not supported: %s", this.fileType);
        Validate.isTrue(this.widthThumbnail > 0, "Width value must be greater than zero: %d", this.widthThumbnail);
        Validate.isTrue(this.heightThumbnail > 0, "Height value must be greater than zero: %d", this.heightThumbnail);
    }

    private byte[] decoder(String originalBase64) {
        return Base64.getDecoder().decode(originalBase64);
    }

    private String encoder(byte[] originalBase64) {
        return Base64.getEncoder().encodeToString(originalBase64);
    }

    private void checkImageOrientation() throws IOException, ImageProcessingException, MetadataException {
        if (StringUtils.equals("JPG", StringUtils.upperCase(this.fileType)) || StringUtils.equals("JPEG", StringUtils.upperCase(this.fileType))) {
            File file = new File("temp/" + UUID.randomUUID() + "." + this.fileType);
            FileUtils.touch(file);
            FileUtils.writeByteArrayToFile(file, this.originalImage);
            Metadata metadata = ImageMetadataReader.readMetadata(file);
            ExifIFD0Directory exifIFD0Directory = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
            if (exifIFD0Directory == null || !exifIFD0Directory.containsTag(ExifIFD0Directory.TAG_ORIENTATION)) {
                this.orientation = 1;
            } else {
                this.orientation = exifIFD0Directory.getInt(ExifIFD0Directory.TAG_ORIENTATION);
            }
            FileUtils.deleteQuietly(file);
        }
    }

    public BufferedImage correctOrientation(BufferedImage bimg) throws ImageProcessingException, IOException, MetadataException {
        // Determine which correction is needed
        AffineTransform t = new AffineTransform();
        switch (this.orientation) {
            case 1:
                // no correction necessary skip and return the image
                return bimg;
            case 2: // Flip X
                t.scale(-1.0, 1.0);
                t.translate(-this.widthOriginal, 0);
                return transform(bimg, t);
            case 3: // PI rotation
                t.translate(this.widthOriginal, this.heightOriginal);
                t.rotate(Math.PI);
                return transform(bimg, t);
            case 4: // Flip Y
                t.scale(1.0, -1.0);
                t.translate(0, -this.heightOriginal);
                return transform(bimg, t);
            case 5: // - PI/2 and Flip X
                t.rotate(-Math.PI / 2);
                t.scale(-1.0, 1.0);
                return transform(bimg, t);
            case 6: // -PI/2 and -width
                t.scale(0.57, 0.57);
                t.translate(this.heightOriginal, 0);
                t.rotate(Math.PI / 2);
                return transform(bimg, t);
            case 7: // PI/2 and Flip
                t.scale(-1.0, 1.0);
                t.translate(this.heightOriginal, 0);
                t.translate(0, this.widthOriginal);
                t.rotate(3 * Math.PI / 2);
                return transform(bimg, t);
            case 8: // PI / 2
                t.translate(0, this.widthOriginal);
                t.rotate(3 * Math.PI / 2);
                return transform(bimg, t);
            default:
                return bimg;
        }
    }

    private static BufferedImage transform(BufferedImage bimage, AffineTransform transform) throws IOException {
        // Create an transformation operation
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BICUBIC);

        // Create an instance of the resulting image, with the same width, height and image type than the referenced one
        BufferedImage destinationImage = new BufferedImage(bimage.getWidth(), bimage.getHeight(), bimage.getType());
        op.filter(bimage, destinationImage);

        return destinationImage;
    }
}
