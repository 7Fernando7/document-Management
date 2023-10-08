//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:29 PM CET 
//


package com.ccl.documentmanagementintapi.domain.ws.thumbnail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ccl.documentmanagementintapi.domain.ws.thumbnail package.
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

    private final static QName _ThumbnailProcessRequest_QNAME = new QName("http://www.transfesa.com/common/schema/thumbnail", "thumbnailProcessRequest");
    private final static QName _AbastDocumentRequest_QNAME = new QName("http://www.transfesa.com/abast/schema/document", "abastDocumentRequest");
    private final static QName _AbastDocumentResponse_QNAME = new QName("http://www.transfesa.com/abast/schema/document", "abastDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccl.documentmanagementintapi.domain.ws.thumbnail
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ThumbnailProcessRequestType }
     */
    public ThumbnailProcessRequestType createThumbnailProcessRequestType() {
        return new ThumbnailProcessRequestType();
    }

    /**
     * Create an instance of {@link AdditionalDataType }
     */
    public AdditionalDataType createAdditionalDataType() {
        return new AdditionalDataType();
    }

    /**
     * Create an instance of {@link NotificationDataType }
     */
    public NotificationDataType createNotificationDataType() {
        return new NotificationDataType();
    }

    /**
     * Create an instance of {@link AbastDocumentRequestType }
     */
    public AbastDocumentRequestType createAbastDocumentRequestType() {
        return new AbastDocumentRequestType();
    }

    /**
     * Create an instance of {@link AbastDocumentResponseType }
     */
    public AbastDocumentResponseType createAbastDocumentResponseType() {
        return new AbastDocumentResponseType();
    }

    /**
     * Create an instance of {@link AbastDataType }
     */
    public AbastDataType createAbastDataType() {
        return new AbastDataType();
    }

    /**
     * Create an instance of {@link DocumentType }
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link GpsCoordinatesType }
     */
    public GpsCoordinatesType createGpsCoordinatesType() {
        return new GpsCoordinatesType();
    }

    /**
     * Create an instance of {@link InfoDeviceType }
     */
    public InfoDeviceType createInfoDeviceType() {
        return new InfoDeviceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThumbnailProcessRequestType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ThumbnailProcessRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/common/schema/thumbnail", name = "thumbnailProcessRequest")
    public JAXBElement<ThumbnailProcessRequestType> createThumbnailProcessRequest(ThumbnailProcessRequestType value) {
        return new JAXBElement<ThumbnailProcessRequestType>(_ThumbnailProcessRequest_QNAME, ThumbnailProcessRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbastDocumentRequestType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbastDocumentRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/abast/schema/document", name = "abastDocumentRequest")
    public JAXBElement<AbastDocumentRequestType> createAbastDocumentRequest(AbastDocumentRequestType value) {
        return new JAXBElement<AbastDocumentRequestType>(_AbastDocumentRequest_QNAME, AbastDocumentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbastDocumentResponseType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AbastDocumentResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/abast/schema/document", name = "abastDocumentResponse")
    public JAXBElement<AbastDocumentResponseType> createAbastDocumentResponse(AbastDocumentResponseType value) {
        return new JAXBElement<AbastDocumentResponseType>(_AbastDocumentResponse_QNAME, AbastDocumentResponseType.class, null, value);
    }

}
