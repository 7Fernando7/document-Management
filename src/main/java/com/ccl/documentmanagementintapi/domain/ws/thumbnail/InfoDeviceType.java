//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:29 PM CET 
//


package com.ccl.documentmanagementintapi.domain.ws.thumbnail;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para infoDeviceType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="infoDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceSO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoDeviceType", namespace = "http://www.transfesa.com/common/schema/document", propOrder = {

})
public class InfoDeviceType
        implements ToString {

    protected String imei;
    protected String deviceId;
    protected String mac;
    protected String deviceSO;
    protected String appVersion;

    /**
     * Obtiene el valor de la propiedad imei.
     *
     * @return possible object is
     * {@link String }
     */
    public String getImei() {
        return imei;
    }

    /**
     * Define el valor de la propiedad imei.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceId.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Define el valor de la propiedad deviceId.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMac() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceSO.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeviceSO() {
        return deviceSO;
    }

    /**
     * Define el valor de la propiedad deviceSO.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeviceSO(String value) {
        this.deviceSO = value;
    }

    /**
     * Obtiene el valor de la propiedad appVersion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Define el valor de la propiedad appVersion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
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
            String theImei;
            theImei = this.getImei();
            strategy.appendField(locator, this, "imei", buffer, theImei);
        }
        {
            String theDeviceId;
            theDeviceId = this.getDeviceId();
            strategy.appendField(locator, this, "deviceId", buffer, theDeviceId);
        }
        {
            String theMac;
            theMac = this.getMac();
            strategy.appendField(locator, this, "mac", buffer, theMac);
        }
        {
            String theDeviceSO;
            theDeviceSO = this.getDeviceSO();
            strategy.appendField(locator, this, "deviceSO", buffer, theDeviceSO);
        }
        {
            String theAppVersion;
            theAppVersion = this.getAppVersion();
            strategy.appendField(locator, this, "appVersion", buffer, theAppVersion);
        }
        return buffer;
    }

}
