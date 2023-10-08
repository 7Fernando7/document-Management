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
import java.math.BigDecimal;


/**
 * <p>Clase Java para cabeceraRequestType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="cabeceraRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empresa" type="{http://www.abast.org}empresaType"/&gt;
 *         &lt;element name="tipo" type="{http://www.abast.org}tipoType"/&gt;
 *         &lt;element name="titulo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descripcion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cliente" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localizador" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numeroDocumento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fechaDocumento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-99999999999999999999"/&gt;
 *               &lt;maxExclusive value="99999999999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="categoria" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idocPadre"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;maxExclusive value="999999999999999"/&gt;
 *               &lt;minInclusive value="-999999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aplicacion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="usuario"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rolUsuario"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
@XmlType(name = "cabeceraRequestType", propOrder = {
        "empresa",
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
        "rolUsuario"
})
public class CabeceraRequestType
        implements ToString {

    @XmlElement(required = true)
    protected EmpresaType empresa;
    @XmlElement(required = true)
    protected TipoType tipo;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String descripcion;
    protected String cliente;
    protected String localizador;
    protected String numeroDocumento;
    protected BigDecimal fechaDocumento;
    protected String categoria;
    @XmlElement(required = true)
    protected BigDecimal idocPadre;
    @XmlElement(required = true)
    protected String aplicacion;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String rolUsuario;

    /**
     * Obtiene el valor de la propiedad empresa.
     *
     * @return possible object is
     * {@link EmpresaType }
     */
    public EmpresaType getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     *
     * @param value allowed object is
     *              {@link EmpresaType }
     */
    public void setEmpresa(EmpresaType value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     *
     * @return possible object is
     * {@link TipoType }
     */
    public TipoType getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     *
     * @param value allowed object is
     *              {@link TipoType }
     */
    public void setTipo(TipoType value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad localizador.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define el valor de la propiedad localizador.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDocumento.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setFechaDocumento(BigDecimal value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad idocPadre.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getIdocPadre() {
        return idocPadre;
    }

    /**
     * Define el valor de la propiedad idocPadre.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setIdocPadre(BigDecimal value) {
        this.idocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicacion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAplicacion() {
        return aplicacion;
    }

    /**
     * Define el valor de la propiedad aplicacion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAplicacion(String value) {
        this.aplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad rolUsuario.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRolUsuario() {
        return rolUsuario;
    }

    /**
     * Define el valor de la propiedad rolUsuario.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRolUsuario(String value) {
        this.rolUsuario = value;
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
            EmpresaType theEmpresa;
            theEmpresa = this.getEmpresa();
            strategy.appendField(locator, this, "empresa", buffer, theEmpresa);
        }
        {
            TipoType theTipo;
            theTipo = this.getTipo();
            strategy.appendField(locator, this, "tipo", buffer, theTipo);
        }
        {
            String theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        {
            String theDescripcion;
            theDescripcion = this.getDescripcion();
            strategy.appendField(locator, this, "descripcion", buffer, theDescripcion);
        }
        {
            String theCliente;
            theCliente = this.getCliente();
            strategy.appendField(locator, this, "cliente", buffer, theCliente);
        }
        {
            String theLocalizador;
            theLocalizador = this.getLocalizador();
            strategy.appendField(locator, this, "localizador", buffer, theLocalizador);
        }
        {
            String theNumeroDocumento;
            theNumeroDocumento = this.getNumeroDocumento();
            strategy.appendField(locator, this, "numeroDocumento", buffer, theNumeroDocumento);
        }
        {
            BigDecimal theFechaDocumento;
            theFechaDocumento = this.getFechaDocumento();
            strategy.appendField(locator, this, "fechaDocumento", buffer, theFechaDocumento);
        }
        {
            String theCategoria;
            theCategoria = this.getCategoria();
            strategy.appendField(locator, this, "categoria", buffer, theCategoria);
        }
        {
            BigDecimal theIdocPadre;
            theIdocPadre = this.getIdocPadre();
            strategy.appendField(locator, this, "idocPadre", buffer, theIdocPadre);
        }
        {
            String theAplicacion;
            theAplicacion = this.getAplicacion();
            strategy.appendField(locator, this, "aplicacion", buffer, theAplicacion);
        }
        {
            String theUsuario;
            theUsuario = this.getUsuario();
            strategy.appendField(locator, this, "usuario", buffer, theUsuario);
        }
        {
            String theRolUsuario;
            theRolUsuario = this.getRolUsuario();
            strategy.appendField(locator, this, "rolUsuario", buffer, theRolUsuario);
        }
        return buffer;
    }

}
