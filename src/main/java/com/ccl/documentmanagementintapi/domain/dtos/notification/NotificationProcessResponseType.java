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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificationProcessResponse_Type complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="NotificationProcessResponse_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationProcessResponse_Type", propOrder = {
        "responseCode",
        "errorDescription"
})
public class NotificationProcessResponseType
        implements ToString {

    protected int responseCode;
    protected String errorDescription;

    /**
     * Obtiene el valor de la propiedad responseCode.
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDescription.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Define el valor de la propiedad errorDescription.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
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
            int theResponseCode;
            theResponseCode = (true ? this.getResponseCode() : 0);
            strategy.appendField(locator, this, "responseCode", buffer, theResponseCode);
        }
        {
            String theErrorDescription;
            theErrorDescription = this.getErrorDescription();
            strategy.appendField(locator, this, "errorDescription", buffer, theErrorDescription);
        }
        return buffer;
    }

}
