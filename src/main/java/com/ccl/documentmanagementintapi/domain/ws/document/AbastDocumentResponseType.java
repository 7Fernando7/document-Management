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
 * <p>Clase Java para abastDocumentResponseType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="abastDocumentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="cdAbast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idDocAbast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dsError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abastDocumentResponseType", propOrder = {

})
public class AbastDocumentResponseType
        implements ToString {

    protected String cdAbast;
    protected String idDocAbast;
    @XmlElement(required = true)
    protected String cdError;
    protected String dsError;

    /**
     * Obtiene el valor de la propiedad cdAbast.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCdAbast() {
        return cdAbast;
    }

    /**
     * Define el valor de la propiedad cdAbast.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCdAbast(String value) {
        this.cdAbast = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocAbast.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdDocAbast() {
        return idDocAbast;
    }

    /**
     * Define el valor de la propiedad idDocAbast.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdDocAbast(String value) {
        this.idDocAbast = value;
    }

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
            String theCdAbast;
            theCdAbast = this.getCdAbast();
            strategy.appendField(locator, this, "cdAbast", buffer, theCdAbast);
        }
        {
            String theIdDocAbast;
            theIdDocAbast = this.getIdDocAbast();
            strategy.appendField(locator, this, "idDocAbast", buffer, theIdDocAbast);
        }
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
