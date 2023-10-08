//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:29 PM CET 
//


package com.ccl.documentmanagementintapi.domain.ws.document;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abastDataType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="abastDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idScanvisioDocument" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mainDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idocPadre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userRole" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abastDataType", propOrder = {
        "idScanvisioDocument",
        "companyCode",
        "typeId",
        "title",
        "mainDescription",
        "idocPadre",
        "application",
        "user",
        "userRole",
        "documentDescription",
        "client",
        "docNumber"
})
public class AbastDataType
        implements ToString {

    protected Integer idScanvisioDocument;
    @XmlElement(required = true)
    protected String companyCode;
    @XmlElement(required = true)
    protected String typeId;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String mainDescription;
    @XmlElement(required = true)
    protected String idocPadre;
    @XmlElement(required = true)
    protected String application;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String userRole;
    @XmlElement(required = true)
    protected String documentDescription;
    protected String client;
    protected String docNumber;

    /**
     * Obtiene el valor de la propiedad idScanvisioDocument.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIdScanvisioDocument() {
        return idScanvisioDocument;
    }

    /**
     * Define el valor de la propiedad idScanvisioDocument.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIdScanvisioDocument(Integer value) {
        this.idScanvisioDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad companyCode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Define el valor de la propiedad companyCode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad typeId.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Define el valor de la propiedad typeId.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTypeId(String value) {
        this.typeId = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad mainDescription.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMainDescription() {
        return mainDescription;
    }

    /**
     * Define el valor de la propiedad mainDescription.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMainDescription(String value) {
        this.mainDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad idocPadre.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdocPadre() {
        return idocPadre;
    }

    /**
     * Define el valor de la propiedad idocPadre.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdocPadre(String value) {
        this.idocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad application.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplication() {
        return application;
    }

    /**
     * Define el valor de la propiedad application.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad userRole.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Define el valor de la propiedad userRole.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * Obtiene el valor de la propiedad documentDescription.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Define el valor de la propiedad documentDescription.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad client.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Define el valor de la propiedad docNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
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
            Integer theIdScanvisioDocument;
            theIdScanvisioDocument = this.getIdScanvisioDocument();
            strategy.appendField(locator, this, "idScanvisioDocument", buffer, theIdScanvisioDocument);
        }
        {
            String theCompanyCode;
            theCompanyCode = this.getCompanyCode();
            strategy.appendField(locator, this, "companyCode", buffer, theCompanyCode);
        }
        {
            String theTypeId;
            theTypeId = this.getTypeId();
            strategy.appendField(locator, this, "typeId", buffer, theTypeId);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            String theMainDescription;
            theMainDescription = this.getMainDescription();
            strategy.appendField(locator, this, "mainDescription", buffer, theMainDescription);
        }
        {
            String theIdocPadre;
            theIdocPadre = this.getIdocPadre();
            strategy.appendField(locator, this, "idocPadre", buffer, theIdocPadre);
        }
        {
            String theApplication;
            theApplication = this.getApplication();
            strategy.appendField(locator, this, "application", buffer, theApplication);
        }
        {
            String theUser;
            theUser = this.getUser();
            strategy.appendField(locator, this, "user", buffer, theUser);
        }
        {
            String theUserRole;
            theUserRole = this.getUserRole();
            strategy.appendField(locator, this, "userRole", buffer, theUserRole);
        }
        {
            String theDocumentDescription;
            theDocumentDescription = this.getDocumentDescription();
            strategy.appendField(locator, this, "documentDescription", buffer, theDocumentDescription);
        }
        {
            String theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            String theDocNumber;
            theDocNumber = this.getDocNumber();
            strategy.appendField(locator, this, "docNumber", buffer, theDocNumber);
        }
        return buffer;
    }

}
