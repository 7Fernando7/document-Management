//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:31 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification.thumbnail;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoordinatesType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="CoordinatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinatesType", propOrder = {
        "latitude",
        "longitude"
})
public class CoordinatesType
        implements ToString {

    @XmlElement(name = "Latitude", required = true)
    protected String latitude;
    @XmlElement(name = "Longitude", required = true)
    protected String longitude;

    /**
     * Obtiene el valor de la propiedad latitude.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLongitude(String value) {
        this.longitude = value;
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
            String theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude);
        }
        {
            String theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude);
        }
        return buffer;
    }

}
