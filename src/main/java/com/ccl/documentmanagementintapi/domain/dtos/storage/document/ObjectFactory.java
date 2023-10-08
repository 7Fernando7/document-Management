//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.storage.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ccl.documentmanagementintapi.domain.dtos.scanvisio.document package.
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

    private final static QName _Request_QNAME = new QName("http://www.abast.org", "Request");
    private final static QName _RequestGet_QNAME = new QName("http://www.abast.org", "RequestGet");
    private final static QName _RequestDelete_QNAME = new QName("http://www.abast.org", "RequestDelete");
    private final static QName _RequestGetAll_QNAME = new QName("http://www.abast.org", "RequestGetAll");
    private final static QName _ResponseAll_QNAME = new QName("http://www.abast.org", "ResponseAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccl.documentmanagementintapi.domain.dtos.scanvisio.document
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestType }
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link RequestTypeGet }
     */
    public RequestTypeGet createRequestTypeGet() {
        return new RequestTypeGet();
    }

    /**
     * Create an instance of {@link RequestTypeDelete }
     */
    public RequestTypeDelete createRequestTypeDelete() {
        return new RequestTypeDelete();
    }

    /**
     * Create an instance of {@link RequestTypeGetAll }
     */
    public RequestTypeGetAll createRequestTypeGetAll() {
        return new RequestTypeGetAll();
    }

    /**
     * Create an instance of {@link AnyType }
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link ResponseType }
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ErrorType }
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ItemResponseType }
     */
    public ItemResponseType createItemResponseType() {
        return new ItemResponseType();
    }

    /**
     * Create an instance of {@link ResponseTypeGetAll }
     */
    public ResponseTypeGetAll createResponseTypeGetAll() {
        return new ResponseTypeGetAll();
    }

    /**
     * Create an instance of {@link Header }
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link CabeceraRequestType }
     */
    public CabeceraRequestType createCabeceraRequestType() {
        return new CabeceraRequestType();
    }

    /**
     * Create an instance of {@link CabeceraRequestTypeGet }
     */
    public CabeceraRequestTypeGet createCabeceraRequestTypeGet() {
        return new CabeceraRequestTypeGet();
    }

    /**
     * Create an instance of {@link CabeceraRequestTypeDelete }
     */
    public CabeceraRequestTypeDelete createCabeceraRequestTypeDelete() {
        return new CabeceraRequestTypeDelete();
    }

    /**
     * Create an instance of {@link EmpresaType }
     */
    public EmpresaType createEmpresaType() {
        return new EmpresaType();
    }

    /**
     * Create an instance of {@link TipoType }
     */
    public TipoType createTipoType() {
        return new TipoType();
    }

    /**
     * Create an instance of {@link AnexoType }
     */
    public AnexoType createAnexoType() {
        return new AnexoType();
    }

    /**
     * Create an instance of {@link AnexoPrincipalType }
     */
    public AnexoPrincipalType createAnexoPrincipalType() {
        return new AnexoPrincipalType();
    }

    /**
     * Create an instance of {@link CabeceraResponseType }
     */
    public CabeceraResponseType createCabeceraResponseType() {
        return new CabeceraResponseType();
    }

    /**
     * Create an instance of {@link LineasResponseType }
     */
    public LineasResponseType createLineasResponseType() {
        return new LineasResponseType();
    }

    /**
     * Create an instance of {@link AnexoResponseType }
     */
    public AnexoResponseType createAnexoResponseType() {
        return new AnexoResponseType();
    }

    /**
     * Create an instance of {@link CabeceraRequestTypeGetAll }
     */
    public CabeceraRequestTypeGetAll createCabeceraRequestTypeGetAll() {
        return new CabeceraRequestTypeGetAll();
    }

    /**
     * Create an instance of {@link ItemGetAllType }
     */
    public ItemGetAllType createItemGetAllType() {
        return new ItemGetAllType();
    }

    /**
     * Create an instance of {@link ParametrosType }
     */
    public ParametrosType createParametrosType() {
        return new ParametrosType();
    }

    /**
     * Create an instance of {@link ItemGetAllResponseType }
     */
    public ItemGetAllResponseType createItemGetAllResponseType() {
        return new ItemGetAllResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.abast.org", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTypeGet }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequestTypeGet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.abast.org", name = "RequestGet")
    public JAXBElement<RequestTypeGet> createRequestGet(RequestTypeGet value) {
        return new JAXBElement<RequestTypeGet>(_RequestGet_QNAME, RequestTypeGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTypeDelete }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequestTypeDelete }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.abast.org", name = "RequestDelete")
    public JAXBElement<RequestTypeDelete> createRequestDelete(RequestTypeDelete value) {
        return new JAXBElement<RequestTypeDelete>(_RequestDelete_QNAME, RequestTypeDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTypeGetAll }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequestTypeGetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.abast.org", name = "RequestGetAll")
    public JAXBElement<RequestTypeGetAll> createRequestGetAll(RequestTypeGetAll value) {
        return new JAXBElement<RequestTypeGetAll>(_RequestGetAll_QNAME, RequestTypeGetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.abast.org", name = "ResponseAll")
    public JAXBElement<AnyType> createResponseAll(AnyType value) {
        return new JAXBElement<AnyType>(_ResponseAll_QNAME, AnyType.class, null, value);
    }

}
