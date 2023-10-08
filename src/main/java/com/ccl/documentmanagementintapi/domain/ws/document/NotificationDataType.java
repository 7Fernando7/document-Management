//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:29 PM CET 
//


package com.ccl.documentmanagementintapi.domain.ws.document;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notificationDataType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="notificationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationDataType", namespace = "http://www.transfesa.com/processor/schema/document", propOrder = {
        "origin",
        "operationType"
})
public class NotificationDataType
        implements ToString {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String operationType;

    /**
     * Obtiene el valor de la propiedad origin.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad operationType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Define el valor de la propiedad operationType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperationType(String value) {
        this.operationType = value;
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
            String theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        {
            String theOperationType;
            theOperationType = this.getOperationType();
            strategy.appendField(locator, this, "operationType", buffer, theOperationType);
        }
        return buffer;
    }

}
