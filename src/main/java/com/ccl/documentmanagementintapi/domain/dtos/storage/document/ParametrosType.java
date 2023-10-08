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


/**
 * <p>Clase Java para parametrosType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="parametrosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="id"/&gt;
 *               &lt;enumeration value="codigoEmpresa"/&gt;
 *               &lt;enumeration value="tipo"/&gt;
 *               &lt;enumeration value="titulo"/&gt;
 *               &lt;enumeration value="descripcion"/&gt;
 *               &lt;enumeration value="cliente"/&gt;
 *               &lt;enumeration value="localizador"/&gt;
 *               &lt;enumeration value="numeroDocumento"/&gt;
 *               &lt;enumeration value="fechaDocumento"/&gt;
 *               &lt;enumeration value="categoria"/&gt;
 *               &lt;enumeration value="idocPadre"/&gt;
 *               &lt;enumeration value="aplicacion"/&gt;
 *               &lt;enumeration value="usuario"/&gt;
 *               &lt;enumeration value="rolUsuario"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valorHasta" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tipo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NUMERO_ENTERO"/&gt;
 *               &lt;enumeration value="FECHA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosType", propOrder = {
        "nombre",
        "valor",
        "valorHasta",
        "tipo"
})
public class ParametrosType
        implements ToString {

    protected String nombre;
    protected String valor;
    protected String valorHasta;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad nombre.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorHasta.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValorHasta() {
        return valorHasta;
    }

    /**
     * Define el valor de la propiedad valorHasta.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValorHasta(String value) {
        this.valorHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipo(String value) {
        this.tipo = value;
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
            String theNombre;
            theNombre = this.getNombre();
            strategy.appendField(locator, this, "nombre", buffer, theNombre);
        }
        {
            String theValor;
            theValor = this.getValor();
            strategy.appendField(locator, this, "valor", buffer, theValor);
        }
        {
            String theValorHasta;
            theValorHasta = this.getValorHasta();
            strategy.appendField(locator, this, "valorHasta", buffer, theValorHasta);
        }
        {
            String theTipo;
            theTipo = this.getTipo();
            strategy.appendField(locator, this, "tipo", buffer, theTipo);
        }
        return buffer;
    }

}
