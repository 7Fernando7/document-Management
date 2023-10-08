//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.storage.document;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anexoResponseType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="anexoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="secundario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anexoResponseType", propOrder = {
        "principal",
        "secundario"
})
public class AnexoResponseType
        implements ToString {

    @XmlElement(required = true)
    protected String principal;
    @XmlElement(required = true)
    protected String secundario;

    /**
     * Obtiene el valor de la propiedad principal.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Define el valor de la propiedad principal.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Obtiene el valor de la propiedad secundario.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSecundario() {
        return secundario;
    }

    /**
     * Define el valor de la propiedad secundario.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSecundario(String value) {
        this.secundario = value;
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
            String thePrincipal;
            thePrincipal = this.getPrincipal();
            strategy.appendField(locator, this, "principal", buffer, thePrincipal);
        }
        {
            String theSecundario;
            theSecundario = this.getSecundario();
            strategy.appendField(locator, this, "secundario", buffer, theSecundario);
        }
        return buffer;
    }

}
