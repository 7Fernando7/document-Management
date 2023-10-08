//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadDocumentNotification_QNAME = new QName("http://www.transfesa.com/notification/upload_document_notification", "UploadDocumentNotification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccl.documentmanagementintapi.domain.dtos.notification.document.upload
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadDocumentNotificationType }
     */
    public UploadDocumentNotificationType createUploadDocumentNotificationType() {
        return new UploadDocumentNotificationType();
    }

    /**
     * Create an instance of {@link DocumentInfoType }
     */
    public DocumentInfoType createDocumentInfoType() {
        return new DocumentInfoType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentNotificationType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadDocumentNotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/notification/upload_document_notification", name = "UploadDocumentNotification")
    public JAXBElement<UploadDocumentNotificationType> createUploadDocumentNotification(UploadDocumentNotificationType value) {
        return new JAXBElement<UploadDocumentNotificationType>(_UploadDocumentNotification_QNAME, UploadDocumentNotificationType.class, null, value);
    }

}
