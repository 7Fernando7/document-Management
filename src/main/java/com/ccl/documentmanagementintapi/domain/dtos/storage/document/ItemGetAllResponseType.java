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
 * <p>Clase Java para itemGetAllResponseType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="itemGetAllResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="idocPadre" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="aplicacion" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="rolUsuario" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemGetAllResponseType", propOrder = {
        "id",
        "codigoEmpresa",
        "tipo",
        "titulo",
        "descripcion",
        "cliente",
        "localizador",
        "numeroDocumento",
        "fechaDocumento",
        "categoria",
        "idocPadre",
        "aplicacion",
        "usuario",
        "rolUsuario",
        "fechaCreacion"
})
public class ItemGetAllResponseType
        implements ToString {

    @XmlElement(required = true)
    protected Object id;
    @XmlElement(required = true)
    protected Object codigoEmpresa;
    @XmlElement(required = true)
    protected Object tipo;
    @XmlElement(required = true)
    protected Object titulo;
    @XmlElement(required = true)
    protected Object descripcion;
    @XmlElement(required = true)
    protected Object cliente;
    @XmlElement(required = true)
    protected Object localizador;
    @XmlElement(required = true)
    protected Object numeroDocumento;
    @XmlElement(required = true)
    protected Object fechaDocumento;
    @XmlElement(required = true)
    protected Object categoria;
    @XmlElement(required = true)
    protected Object idocPadre;
    @XmlElement(required = true)
    protected Object aplicacion;
    @XmlElement(required = true)
    protected Object usuario;
    @XmlElement(required = true)
    protected Object rolUsuario;
    @XmlElement(required = true)
    protected Object fechaCreacion;

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
     * Obtiene el valor de la propiedad codigoEmpresa.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Define el valor de la propiedad codigoEmpresa.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCodigoEmpresa(Object value) {
        this.codigoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setTipo(Object value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setTitulo(Object value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setDescripcion(Object value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCliente(Object value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad localizador.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getLocalizador() {
        return localizador;
    }

    /**
     * Define el valor de la propiedad localizador.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setLocalizador(Object value) {
        this.localizador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setNumeroDocumento(Object value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setFechaDocumento(Object value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setCategoria(Object value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad idocPadre.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getIdocPadre() {
        return idocPadre;
    }

    /**
     * Define el valor de la propiedad idocPadre.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setIdocPadre(Object value) {
        this.idocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicacion.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getAplicacion() {
        return aplicacion;
    }

    /**
     * Define el valor de la propiedad aplicacion.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setAplicacion(Object value) {
        this.aplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setUsuario(Object value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad rolUsuario.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getRolUsuario() {
        return rolUsuario;
    }

    /**
     * Define el valor de la propiedad rolUsuario.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setRolUsuario(Object value) {
        this.rolUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setFechaCreacion(Object value) {
        this.fechaCreacion = value;
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
            Object theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Object theCodigoEmpresa;
            theCodigoEmpresa = this.getCodigoEmpresa();
            strategy.appendField(locator, this, "codigoEmpresa", buffer, theCodigoEmpresa);
        }
        {
            Object theTipo;
            theTipo = this.getTipo();
            strategy.appendField(locator, this, "tipo", buffer, theTipo);
        }
        {
            Object theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        {
            Object theDescripcion;
            theDescripcion = this.getDescripcion();
            strategy.appendField(locator, this, "descripcion", buffer, theDescripcion);
        }
        {
            Object theCliente;
            theCliente = this.getCliente();
            strategy.appendField(locator, this, "cliente", buffer, theCliente);
        }
        {
            Object theLocalizador;
            theLocalizador = this.getLocalizador();
            strategy.appendField(locator, this, "localizador", buffer, theLocalizador);
        }
        {
            Object theNumeroDocumento;
            theNumeroDocumento = this.getNumeroDocumento();
            strategy.appendField(locator, this, "numeroDocumento", buffer, theNumeroDocumento);
        }
        {
            Object theFechaDocumento;
            theFechaDocumento = this.getFechaDocumento();
            strategy.appendField(locator, this, "fechaDocumento", buffer, theFechaDocumento);
        }
        {
            Object theCategoria;
            theCategoria = this.getCategoria();
            strategy.appendField(locator, this, "categoria", buffer, theCategoria);
        }
        {
            Object theIdocPadre;
            theIdocPadre = this.getIdocPadre();
            strategy.appendField(locator, this, "idocPadre", buffer, theIdocPadre);
        }
        {
            Object theAplicacion;
            theAplicacion = this.getAplicacion();
            strategy.appendField(locator, this, "aplicacion", buffer, theAplicacion);
        }
        {
            Object theUsuario;
            theUsuario = this.getUsuario();
            strategy.appendField(locator, this, "usuario", buffer, theUsuario);
        }
        {
            Object theRolUsuario;
            theRolUsuario = this.getRolUsuario();
            strategy.appendField(locator, this, "rolUsuario", buffer, theRolUsuario);
        }
        {
            Object theFechaCreacion;
            theFechaCreacion = this.getFechaCreacion();
            strategy.appendField(locator, this, "fechaCreacion", buffer, theFechaCreacion);
        }
        return buffer;
    }

}
