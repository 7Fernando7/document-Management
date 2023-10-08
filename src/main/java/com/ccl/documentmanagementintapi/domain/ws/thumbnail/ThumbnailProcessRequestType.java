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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para thumbnailProcessRequest_Type complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="thumbnailProcessRequest_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notificationData" type="{http://www.transfesa.com/common/schema/thumbnail}notificationDataType"/&gt;
 *         &lt;element name="abastData" type="{http://www.transfesa.com/abast/schema/document}abastDataType"/&gt;
 *         &lt;element name="document" type="{http://www.transfesa.com/common/schema/document}documentType"/&gt;
 *         &lt;element name="additional_Data" type="{http://www.transfesa.com/common/schema/thumbnail}additional_Data_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thumbnailProcessRequest_Type", namespace = "http://www.transfesa.com/common/schema/thumbnail", propOrder = {
        "uuid",
        "notificationData",
        "abastData",
        "document",
        "additionalData"
})
public class ThumbnailProcessRequestType
        implements ToString {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected NotificationDataType notificationData;
    @XmlElement(required = true)
    protected AbastDataType abastData;
    @XmlElement(required = true)
    protected DocumentType document;
    @XmlElement(name = "additional_Data", required = true)
    protected AdditionalDataType additionalData;

    /**
     * Obtiene el valor de la propiedad uuid.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationData.
     *
     * @return possible object is
     * {@link NotificationDataType }
     */
    public NotificationDataType getNotificationData() {
        return notificationData;
    }

    /**
     * Define el valor de la propiedad notificationData.
     *
     * @param value allowed object is
     *              {@link NotificationDataType }
     */
    public void setNotificationData(NotificationDataType value) {
        this.notificationData = value;
    }

    /**
     * Obtiene el valor de la propiedad abastData.
     *
     * @return possible object is
     * {@link AbastDataType }
     */
    public AbastDataType getAbastData() {
        return abastData;
    }

    /**
     * Define el valor de la propiedad abastData.
     *
     * @param value allowed object is
     *              {@link AbastDataType }
     */
    public void setAbastData(AbastDataType value) {
        this.abastData = value;
    }

    /**
     * Obtiene el valor de la propiedad document.
     *
     * @return possible object is
     * {@link DocumentType }
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Define el valor de la propiedad document.
     *
     * @param value allowed object is
     *              {@link DocumentType }
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalData.
     *
     * @return possible object is
     * {@link AdditionalDataType }
     */
    public AdditionalDataType getAdditionalData() {
        return additionalData;
    }

    /**
     * Define el valor de la propiedad additionalData.
     *
     * @param value allowed object is
     *              {@link AdditionalDataType }
     */
    public void setAdditionalData(AdditionalDataType value) {
        this.additionalData = value;
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
            String theUuid;
            theUuid = this.getUuid();
            strategy.appendField(locator, this, "uuid", buffer, theUuid);
        }
        {
            NotificationDataType theNotificationData;
            theNotificationData = this.getNotificationData();
            strategy.appendField(locator, this, "notificationData", buffer, theNotificationData);
        }
        {
            AbastDataType theAbastData;
            theAbastData = this.getAbastData();
            strategy.appendField(locator, this, "abastData", buffer, theAbastData);
        }
        {
            DocumentType theDocument;
            theDocument = this.getDocument();
            strategy.appendField(locator, this, "document", buffer, theDocument);
        }
        {
            AdditionalDataType theAdditionalData;
            theAdditionalData = this.getAdditionalData();
            strategy.appendField(locator, this, "additionalData", buffer, theAdditionalData);
        }
        return buffer;
    }

}
