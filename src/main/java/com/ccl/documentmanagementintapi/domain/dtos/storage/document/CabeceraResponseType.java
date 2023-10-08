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
 * <p>Clase Java para cabeceraResponseType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="cabeceraResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreFichero"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="binario" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabeceraResponseType", propOrder = {
        "nombreFichero",
        "binario",
        "id",
        "createdBy",
        "creationDate",
        "lastUpdatedBy",
        "lastUpdateDate"
})
public class CabeceraResponseType
        implements ToString {

    @XmlElement(required = true)
    protected String nombreFichero;
    @XmlElement(required = true)
    protected byte[] binario;
    protected Object id;
    protected Object createdBy;
    protected Object creationDate;
    protected Object lastUpdatedBy;
    protected Object lastUpdateDate;

    /**
     * Obtiene el valor de la propiedad nombreFichero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombreFichero() {
        return nombreFichero;
    }

    /**
     * Define el valor de la propiedad nombreFichero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombreFichero(String value) {
        this.nombreFichero = value;
    }

    /**
     * Obtiene el valor de la propiedad binario.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getBinario() {
        return binario;
    }

    /**
     * Define el valor de la propiedad binario.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setBinario(byte[] value) {
        this.binario = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad createdBy.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    /**
     * Define el valor de la propiedad createdBy.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCreatedBy(Object value) {
        this.createdBy = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCreationDate(Object value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdatedBy.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Define el valor de la propiedad lastUpdatedBy.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLastUpdatedBy(Object value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateDate.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define el valor de la propiedad lastUpdateDate.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLastUpdateDate(Object value) {
        this.lastUpdateDate = value;
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
            String theNombreFichero;
            theNombreFichero = this.getNombreFichero();
            strategy.appendField(locator, this, "nombreFichero", buffer, theNombreFichero);
        }
        {
            byte[] theBinario;
            theBinario = this.getBinario();
            strategy.appendField(locator, this, "binario", buffer, theBinario);
        }
        {
            Object theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Object theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            strategy.appendField(locator, this, "createdBy", buffer, theCreatedBy);
        }
        {
            Object theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate);
        }
        {
            Object theLastUpdatedBy;
            theLastUpdatedBy = this.getLastUpdatedBy();
            strategy.appendField(locator, this, "lastUpdatedBy", buffer, theLastUpdatedBy);
        }
        {
            Object theLastUpdateDate;
            theLastUpdateDate = this.getLastUpdateDate();
            strategy.appendField(locator, this, "lastUpdateDate", buffer, theLastUpdateDate);
        }
        return buffer;
    }

}
