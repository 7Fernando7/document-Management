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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para additional_Data_Type complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="additional_Data_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CIDocument_Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="abast_Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_Data_Type", namespace = "http://www.transfesa.com/common/schema/thumbnail", propOrder = {
        "ciDocumentId",
        "abastId"
})
public class AdditionalDataType
        implements ToString {

    @XmlElement(name = "CIDocument_Id")
    protected Long ciDocumentId;
    @XmlElement(name = "abast_Id")
    protected long abastId;

    /**
     * Obtiene el valor de la propiedad ciDocumentId.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCIDocumentId() {
        return ciDocumentId;
    }

    /**
     * Define el valor de la propiedad ciDocumentId.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCIDocumentId(Long value) {
        this.ciDocumentId = value;
    }

    /**
     * Obtiene el valor de la propiedad abastId.
     */
    public long getAbastId() {
        return abastId;
    }

    /**
     * Define el valor de la propiedad abastId.
     */
    public void setAbastId(long value) {
        this.abastId = value;
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
            Long theCIDocumentId;
            theCIDocumentId = this.getCIDocumentId();
            strategy.appendField(locator, this, "ciDocumentId", buffer, theCIDocumentId);
        }
        {
            long theAbastId;
            theAbastId = (true ? this.getAbastId() : 0L);
            strategy.appendField(locator, this, "abastId", buffer, theAbastId);
        }
        return buffer;
    }

}
