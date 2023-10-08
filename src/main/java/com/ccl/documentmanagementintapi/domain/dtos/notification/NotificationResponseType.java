//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificationResponse_Type complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="NotificationResponse_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DsError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationResponse_Type", namespace = "http://www.transfesa.com/api_notification/schema/notificationresponse", propOrder = {
        "cdError",
        "dsError"
})
public class NotificationResponseType
        implements ToString {

    @XmlElement(name = "CdError", required = true)
    protected String cdError;
    @XmlElement(name = "DsError")
    protected String dsError;

    /**
     * Obtiene el valor de la propiedad cdError.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCdError() {
        return cdError;
    }

    /**
     * Define el valor de la propiedad cdError.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCdError(String value) {
        this.cdError = value;
    }

    /**
     * Obtiene el valor de la propiedad dsError.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDsError() {
        return dsError;
    }

    /**
     * Define el valor de la propiedad dsError.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDsError(String value) {
        this.dsError = value;
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
            String theCdError;
            theCdError = this.getCdError();
            strategy.appendField(locator, this, "cdError", buffer, theCdError);
        }
        {
            String theDsError;
            theDsError = this.getDsError();
            strategy.appendField(locator, this, "dsError", buffer, theDsError);
        }
        return buffer;
    }

}
