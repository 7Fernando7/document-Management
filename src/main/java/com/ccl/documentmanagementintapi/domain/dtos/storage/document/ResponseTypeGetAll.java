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
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para ResponseTypeGetAll complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ResponseTypeGetAll"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="errores" type="{http://www.abast.org}errorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://www.abast.org}itemGetAllType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseTypeGetAll", propOrder = {
        "codigo",
        "errores",
        "item"
})
public class ResponseTypeGetAll
        implements ToString {

    protected Object codigo;
    protected List<ErrorType> errores;
    protected ItemGetAllType item;

    /**
     * Obtiene el valor de la propiedad codigo.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCodigo(Object value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the errores property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errores property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrores().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     */
    public List<ErrorType> getErrores() {
        if (errores == null) {
            errores = new ArrayList<ErrorType>();
        }
        return this.errores;
    }

    /**
     * Obtiene el valor de la propiedad item.
     *
     * @return possible object is
     * {@link ItemGetAllType }
     */
    public ItemGetAllType getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     *
     * @param value allowed object is
     *              {@link ItemGetAllType }
     */
    public void setItem(ItemGetAllType value) {
        this.item = value;
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
            Object theCodigo;
            theCodigo = this.getCodigo();
            strategy.appendField(locator, this, "codigo", buffer, theCodigo);
        }
        {
            List<ErrorType> theErrores;
            theErrores = (((this.errores != null) && (!this.errores.isEmpty())) ? this.getErrores() : null);
            strategy.appendField(locator, this, "errores", buffer, theErrores);
        }
        {
            ItemGetAllType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem);
        }
        return buffer;
    }

}
