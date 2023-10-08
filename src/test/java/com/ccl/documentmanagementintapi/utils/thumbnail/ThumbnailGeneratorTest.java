package com.ccl.documentmanagementintapi.utils.thumbnail;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.ResourceUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.nio.file.Files;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class ThumbnailGeneratorTest {

    @InjectMocks
    private ThumbnailGenerator thumbnailGenerator;

    private File sourceImage;
    private File expectedImage;

    @Before
    @SneakyThrows
    public void init() {
        sourceImage = ResourceUtils.getFile("classpath:original_image.jpg");
        expectedImage = ResourceUtils.getFile("classpath:expected_image.jpg");
    }

    @Test
    @SneakyThrows
    public void createThumbnail_shouldGenerateExactResult() {
        byte[] sourceImageBytes = Files.readAllBytes(sourceImage.toPath());
        byte[] expectedImageBytes = Files.readAllBytes(expectedImage.toPath());

        byte[] resultImageBytes = thumbnailGenerator.generateThumbnail(sourceImageBytes, "jpg", 150, 150);

//        assertThat(Arrays.equals(resultImageBytes, expectedImageBytes)).isTrue();
        Assert.assertArrayEquals(resultImageBytes, expectedImageBytes);
    }

    @Test
    @SneakyThrows
    public void createThumbnail_shouldGenerateExactStringResult() {
        byte[] sourceImageBytes = Files.readAllBytes(sourceImage.toPath());
        byte[] expectedImageBytes = Files.readAllBytes(expectedImage.toPath());

        String sourceImageString = DatatypeConverter.printBase64Binary(sourceImageBytes);
        String expectedImageString = DatatypeConverter.printBase64Binary(expectedImageBytes);

        String resultImageString = thumbnailGenerator.generateThumbnail(sourceImageString, "jpg", 150, 150);

//        log.info("expectedImage STRING: {}", expectedImageString);
//        log.info("resultImage STRING: {}", resultImageString);
        Assert.assertEquals(expectedImageString, resultImageString);
    }

    @Test(expected = IllegalArgumentException.class)
    @SneakyThrows
    public void createThumbnail_shouldGenerateIllegalArgumentException() {
        byte[] sourceImageBytes = Files.readAllBytes(sourceImage.toPath());

        thumbnailGenerator.generateThumbnail(sourceImageBytes, "asdf", -25, 150);
    }
}