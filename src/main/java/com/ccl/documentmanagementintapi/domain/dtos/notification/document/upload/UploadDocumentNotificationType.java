//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification generated once an UPLOAD_DOCUMENT document has been uploaded to Abast-ScanVisio service
 *
 * <p>Clase Java para UploadDocumentNotificationType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="UploadDocumentNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AbastDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AbastDsError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentInfo" type="{http://www.transfesa.com/notification/upload_document_notification}DocumentInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentNotificationType", propOrder = {
        "abastDocumentId",
        "abastDsError",
        "documentInfo"
})
public class UploadDocumentNotificationType
        implements ToString {

    @XmlElement(name = "AbastDocumentId", required = true)
    protected String abastDocumentId;
    @XmlElement(name = "AbastDsError")
    protected String abastDsError;
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
     * Obtiene el valor de la propiedad abastDsError.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbastDsError() {
        return abastDsError;
    }

    /**
     * Define el valor de la propiedad abastDsError.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAbastDsError(String value) {
        this.abastDsError = value;
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
            String theAbastDsError;
            theAbastDsError = this.getAbastDsError();
            strategy.appendField(locator, this, "abastDsError", buffer, theAbastDsError);
        }
        {
            DocumentInfoType theDocumentInfo;
            theDocumentInfo = this.getDocumentInfo();
            strategy.appendField(locator, this, "documentInfo", buffer, theDocumentInfo);
        }
        return buffer;
    }

}
