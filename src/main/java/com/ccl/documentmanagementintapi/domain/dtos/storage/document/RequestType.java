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
 * <p>Clase Java para RequestType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabecera" type="{http://www.abast.org}cabeceraRequestType" minOccurs="0"/&gt;
 *         &lt;element name="anexos" type="{http://www.abast.org}anexoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
        "cabecera",
        "anexos"
})
public class RequestType
        implements ToString {

    protected CabeceraRequestType cabecera;
    protected AnexoType anexos;

    /**
     * Obtiene el valor de la propiedad cabecera.
     *
     * @return possible object is
     * {@link CabeceraRequestType }
     */
    public CabeceraRequestType getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     *
     * @param value allowed object is
     *              {@link CabeceraRequestType }
     */
    public void setCabecera(CabeceraRequestType value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad anexos.
     *
     * @return possible object is
     * {@link AnexoType }
     */
    public AnexoType getAnexos() {
        return anexos;
    }

    /**
     * Define el valor de la propiedad anexos.
     *
     * @param value allowed object is
     *              {@link AnexoType }
     */
    public void setAnexos(AnexoType value) {
        this.anexos = value;
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
            CabeceraRequestType theCabecera;
            theCabecera = this.getCabecera();
            strategy.appendField(locator, this, "cabecera", buffer, theCabecera);
        }
        {
            AnexoType theAnexos;
            theAnexos = this.getAnexos();
            strategy.appendField(locator, this, "anexos", buffer, theAnexos);
        }
        return buffer;
    }

}
