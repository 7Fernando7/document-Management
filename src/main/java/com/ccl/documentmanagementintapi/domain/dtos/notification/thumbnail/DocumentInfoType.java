//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:31 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification.thumbnail;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;


/**
 * <p>Clase Java para DocumentInfoType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DocumentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Locator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coordinates" type="{http://www.transfesa.com/notification/upload_thumbnail_notification}CoordinatesType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceInfo" type="{http://www.transfesa.com/notification/upload_thumbnail_notification}DeviceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Idoc_padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfoType", propOrder = {
        "locator",
        "dateTime",
        "deliveryStatus",
        "description",
        "fileComments",
        "fileName",
        "category",
        "coordinates",
        "deviceInfo",
        "documentTitle",
        "idocPadre",
        "user",
        "userRol",
        "client",
        "docNumber"
})
public class DocumentInfoType
        implements ToString {

    @XmlElement(name = "Locator", required = true)
    protected String locator;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dateTime;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FileComments")
    protected String fileComments;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Coordinates")
    protected CoordinatesType coordinates;
    @XmlElement(name = "DeviceInfo")
    protected DeviceInfoType deviceInfo;
    @XmlElement(name = "DocumentTitle")
    protected String documentTitle;
    @XmlElement(name = "Idoc_padre")
    protected String idocPadre;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "UserRol")
    protected String userRol;
    @XmlElement(name = "Client")
    protected String client;
    @XmlElement(name = "DocNumber")
    protected String docNumber;

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
     * Obtiene el valor de la propiedad dateTime.
     *
     * @return possible object is
     * {@link OffsetDateTime }
     */
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     *
     * @param value allowed object is
     *              {@link OffsetDateTime }
     */
    public void setDateTime(OffsetDateTime value) {
        this.dateTime = value;
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
     * Obtiene el valor de la propiedad description.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad fileComments.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileComments() {
        return fileComments;
    }

    /**
     * Define el valor de la propiedad fileComments.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileComments(String value) {
        this.fileComments = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Obtiene el valor de la propiedad coordinates.
     *
     * @return possible object is
     * {@link CoordinatesType }
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Define el valor de la propiedad coordinates.
     *
     * @param value allowed object is
     *              {@link CoordinatesType }
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceInfo.
     *
     * @return possible object is
     * {@link DeviceInfoType }
     */
    public DeviceInfoType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Define el valor de la propiedad deviceInfo.
     *
     * @param value allowed object is
     *              {@link DeviceInfoType }
     */
    public void setDeviceInfo(DeviceInfoType value) {
        this.deviceInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad documentTitle.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Define el valor de la propiedad documentTitle.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad idocPadre.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdocPadre() {
        return idocPadre;
    }

    /**
     * Define el valor de la propiedad idocPadre.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdocPadre(String value) {
        this.idocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad userRol.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserRol() {
        return userRol;
    }

    /**
     * Define el valor de la propiedad userRol.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserRol(String value) {
        this.userRol = value;
    }

    /**
     * Obtiene el valor de la propiedad client.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Define el valor de la propiedad docNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
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
            String theLocator;
            theLocator = this.getLocator();
            strategy.appendField(locator, this, "locator", buffer, theLocator);
        }
        {
            OffsetDateTime theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            String theDeliveryStatus;
            theDeliveryStatus = this.getDeliveryStatus();
            strategy.appendField(locator, this, "deliveryStatus", buffer, theDeliveryStatus);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theFileComments;
            theFileComments = this.getFileComments();
            strategy.appendField(locator, this, "fileComments", buffer, theFileComments);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName);
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            CoordinatesType theCoordinates;
            theCoordinates = this.getCoordinates();
            strategy.appendField(locator, this, "coordinates", buffer, theCoordinates);
        }
        {
            DeviceInfoType theDeviceInfo;
            theDeviceInfo = this.getDeviceInfo();
            strategy.appendField(locator, this, "deviceInfo", buffer, theDeviceInfo);
        }
        {
            String theDocumentTitle;
            theDocumentTitle = this.getDocumentTitle();
            strategy.appendField(locator, this, "documentTitle", buffer, theDocumentTitle);
        }
        {
            String theIdocPadre;
            theIdocPadre = this.getIdocPadre();
            strategy.appendField(locator, this, "idocPadre", buffer, theIdocPadre);
        }
        {
            String theUser;
            theUser = this.getUser();
            strategy.appendField(locator, this, "user", buffer, theUser);
        }
        {
            String theUserRol;
            theUserRol = this.getUserRol();
            strategy.appendField(locator, this, "userRol", buffer, theUserRol);
        }
        {
            String theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            String theDocNumber;
            theDocNumber = this.getDocNumber();
            strategy.appendField(locator, this, "docNumber", buffer, theDocNumber);
        }
        return buffer;
    }

}
