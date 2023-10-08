//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:29 PM CET 
//


package com.ccl.documentmanagementintapi.domain.ws.thumbnail;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;


/**
 * <p>Clase Java para documentType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="documentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="idAnubisCiDocument" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateLocator" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imageContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gpsCoordinates" type="{http://www.transfesa.com/common/schema/document}gpsCoordinatesType" minOccurs="0"/&gt;
 *         &lt;element name="infoDevice" type="{http://www.transfesa.com/common/schema/document}infoDeviceType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentType", namespace = "http://www.transfesa.com/common/schema/document", propOrder = {

})
public class DocumentType
        implements ToString {

    protected Integer idAnubisCiDocument;
    @XmlElement(required = true)
    protected String locator;
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dateLocator;
    protected String deliveryStatus;
    protected String comments;
    @XmlElement(required = true)
    protected String imageName;
    @XmlElement(required = true)
    protected byte[] imageContent;
    protected String category;
    protected GpsCoordinatesType gpsCoordinates;
    protected InfoDeviceType infoDevice;

    /**
     * Obtiene el valor de la propiedad idAnubisCiDocument.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIdAnubisCiDocument() {
        return idAnubisCiDocument;
    }

    /**
     * Define el valor de la propiedad idAnubisCiDocument.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIdAnubisCiDocument(Integer value) {
        this.idAnubisCiDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad locator.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Define el valor de la propiedad locator.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Obtiene el valor de la propiedad dateLocator.
     *
     * @return possible object is
     * {@link OffsetDateTime }
     */
    public OffsetDateTime getDateLocator() {
        return dateLocator;
    }

    /**
     * Define el valor de la propiedad dateLocator.
     *
     * @param value allowed object is
     *              {@link OffsetDateTime }
     */
    public void setDateLocator(OffsetDateTime value) {
        this.dateLocator = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryStatus.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Define el valor de la propiedad deliveryStatus.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad imageName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Define el valor de la propiedad imageName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    /**
     * Obtiene el valor de la propiedad imageContent.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getImageContent() {
        return imageContent;
    }

    /**
     * Define el valor de la propiedad imageContent.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setImageContent(byte[] value) {
        this.imageContent = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsCoordinates.
     *
     * @return possible object is
     * {@link GpsCoordinatesType }
     */
    public GpsCoordinatesType getGpsCoordinates() {
        return gpsCoordinates;
    }

    /**
     * Define el valor de la propiedad gpsCoordinates.
     *
     * @param value allowed object is
     *              {@link GpsCoordinatesType }
     */
    public void setGpsCoordinates(GpsCoordinatesType value) {
        this.gpsCoordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad infoDevice.
     *
     * @return possible object is
     * {@link InfoDeviceType }
     */
    public InfoDeviceType getInfoDevice() {
        return infoDevice;
    }

    /**
     * Define el valor de la propiedad infoDevice.
     *
     * @param value allowed object is
     *              {@link InfoDeviceType }
     */
    public void setInfoDevice(InfoDeviceType value) {
        this.infoDevice = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Integer theIdAnubisCiDocument;
            theIdAnubisCiDocument = this.getIdAnubisCiDocument();
            strategy.appendField(locator, this, "idAnubisCiDocument", buffer, theIdAnubisCiDocument);
        }
        {
            String theLocator;
            theLocator = this.getLocator();
            strategy.appendField(locator, this, "locator", buffer, theLocator);
        }
        {
            OffsetDateTime theDateLocator;
            theDateLocator = this.getDateLocator();
            strategy.appendField(locator, this, "dateLocator", buffer, theDateLocator);
        }
        {
            String theDeliveryStatus;
            theDeliveryStatus = this.getDeliveryStatus();
            strategy.appendField(locator, this, "deliveryStatus", buffer, theDeliveryStatus);
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            String theImageName;
            theImageName = this.getImageName();
            strategy.appendField(locator, this, "imageName", buffer, theImageName);
        }
        {
            byte[] theImageContent;
            theImageContent = this.getImageContent();
            strategy.appendField(locator, this, "imageContent", buffer, theImageContent);
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            GpsCoordinatesType theGpsCoordinates;
            theGpsCoordinates = this.getGpsCoordinates();
            strategy.appendField(locator, this, "gpsCoordinates", buffer, theGpsCoordinates);
        }
        {
            InfoDeviceType theInfoDevice;
            theInfoDevice = this.getInfoDevice();
            strategy.appendField(locator, this, "infoDevice", buffer, theInfoDevice);
        }
        return buffer;
    }

}
