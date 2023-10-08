//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:31 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification.document.delete;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceInfoType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="DeviceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoType", propOrder = {
        "imei",
        "deviceId",
        "mac",
        "deviceOS",
        "appVersion"
})
public class DeviceInfoType
        implements ToString {

    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "DeviceId")
    protected String deviceId;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "DeviceOS")
    protected String deviceOS;
    @XmlElement(name = "AppVersion")
    protected String appVersion;

    /**
     * Obtiene el valor de la propiedad imei.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Define el valor de la propiedad imei.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIMEI(String value) {
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
    public String getMAC() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceOS.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeviceOS() {
        return deviceOS;
    }

    /**
     * Define el valor de la propiedad deviceOS.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeviceOS(String value) {
        this.deviceOS = value;
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
            String theIMEI;
            theIMEI = this.getIMEI();
            strategy.appendField(locator, this, "imei", buffer, theIMEI);
        }
        {
            String theDeviceId;
            theDeviceId = this.getDeviceId();
            strategy.appendField(locator, this, "deviceId", buffer, theDeviceId);
        }
        {
            String theMAC;
            theMAC = this.getMAC();
            strategy.appendField(locator, this, "mac", buffer, theMAC);
        }
        {
            String theDeviceOS;
            theDeviceOS = this.getDeviceOS();
            strategy.appendField(locator, this, "deviceOS", buffer, theDeviceOS);
        }
        {
            String theAppVersion;
            theAppVersion = this.getAppVersion();
            strategy.appendField(locator, this, "appVersion", buffer, theAppVersion);
        }
        return buffer;
    }

}
