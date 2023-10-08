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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification generated once an UPLOAD_THUMBNAIL thumbnail has been uploaded to Abast-ScanVisio service
 *
 * <p>Clase Java para UploadThumbnailNotificationType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="UploadThumbnailNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AbastDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentInfo" type="{http://www.transfesa.com/notification/upload_thumbnail_notification}DocumentInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadThumbnailNotificationType", propOrder = {
        "abastDocumentId",
        "documentInfo"
})
public class UploadThumbnailNotificationType
        implements ToString {

    @XmlElement(name = "AbastDocumentId", required = true)
    protected String abastDocumentId;
    @XmlElement(name = "DocumentInfo", required = true)
    protected DocumentInfoType documentInfo;

    /**
     * Obtiene el valor de la propiedad abastDocumentId.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbastDocumentId() {
        return abastDocumentId;
    }

    /**
     * Define el valor de la propiedad abastDocumentId.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAbastDocumentId(String value) {
        this.abastDocumentId = value;
    }

    /**
     * Obtiene el valor de la propiedad documentInfo.
     *
     * @return possible object is
     * {@link DocumentInfoType }
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Define el valor de la propiedad documentInfo.
     *
     * @param value allowed object is
     *              {@link DocumentInfoType }
     */
    public void setDocumentInfo(DocumentInfoType value) {
        this.documentInfo = value;
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
            String theAbastDocumentId;
            theAbastDocumentId = this.getAbastDocumentId();
            strategy.appendField(locator, this, "abastDocumentId", buffer, theAbastDocumentId);
        }
        {
            DocumentInfoType theDocumentInfo;
            theDocumentInfo = this.getDocumentInfo();
            strategy.appendField(locator, this, "documentInfo", buffer, theDocumentInfo);
        }
        return buffer;
    }

}
