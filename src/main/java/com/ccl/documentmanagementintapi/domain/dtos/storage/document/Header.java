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
 * <p>Clase Java para header complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="header"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_ts" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="areadoc" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "header", propOrder = {
        "ts",
        "clientId",
        "hash",
        "areadoc"
})
public class Header
        implements ToString {

    @XmlElement(name = "_ts", required = true)
    protected Object ts;
    @XmlElement(required = true)
    protected Object clientId;
    @XmlElement(required = true)
    protected Object hash;
    @XmlElement(required = true)
    protected Object areadoc;

    /**
     * Obtiene el valor de la propiedad ts.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getTs() {
        return ts;
    }

    /**
     * Define el valor de la propiedad ts.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setTs(Object value) {
        this.ts = value;
    }

    /**
     * Obtiene el valor de la propiedad clientId.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getClientId() {
        return clientId;
    }

    /**
     * Define el valor de la propiedad clientId.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setClientId(Object value) {
        this.clientId = value;
    }

    /**
     * Obtiene el valor de la propiedad hash.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setHash(Object value) {
        this.hash = value;
    }

    /**
     * Obtiene el valor de la propiedad areadoc.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getAreadoc() {
        return areadoc;
    }

    /**
     * Define el valor de la propiedad areadoc.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setAreadoc(Object value) {
        this.areadoc = value;
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
            Object theTs;
            theTs = this.getTs();
            strategy.appendField(locator, this, "ts", buffer, theTs);
        }
        {
            Object theClientId;
            theClientId = this.getClientId();
            strategy.appendField(locator, this, "clientId", buffer, theClientId);
        }
        {
            Object theHash;
            theHash = this.getHash();
            strategy.appendField(locator, this, "hash", buffer, theHash);
        }
        {
            Object theAreadoc;
            theAreadoc = this.getAreadoc();
            strategy.appendField(locator, this, "areadoc", buffer, theAreadoc);
        }
        return buffer;
    }

}
