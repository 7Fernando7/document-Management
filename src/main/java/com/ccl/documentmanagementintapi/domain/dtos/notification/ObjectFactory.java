//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.03 a las 12:47:30 PM CET 
//


package com.ccl.documentmanagementintapi.domain.dtos.notification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ccl.documentmanagementintapi.domain.dtos.notification package.
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

    private final static QName _Notification_QNAME = new QName("http://www.transfesa.com/schema/notification", "Notification");
    private final static QName _NotificationProcessResponse_QNAME = new QName("http://www.transfesa.com/schema/notification", "NotificationProcessResponse");
    private final static QName _NotificationResponse_QNAME = new QName("http://www.transfesa.com/api_notification/schema/notificationresponse", "NotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccl.documentmanagementintapi.domain.dtos.notification
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationType }
     */
    public NotificationType createNotificationType() {
        return new NotificationType();
    }

    /**
     * Create an instance of {@link NotificationProcessResponseType }
     */
    public NotificationProcessResponseType createNotificationProcessResponseType() {
        return new NotificationProcessResponseType();
    }

    /**
     * Create an instance of {@link PropertyType }
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link NotificationResponseType }
     */
    public NotificationResponseType createNotificationResponseType() {
        return new NotificationResponseType();
    }

    /**
     * Create an instance of {@link NotificationType.Properties }
     */
    public NotificationType.Properties createNotificationTypeProperties() {
        return new NotificationType.Properties();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/schema/notification", name = "Notification")
    public JAXBElement<NotificationType> createNotification(NotificationType value) {
        return new JAXBElement<NotificationType>(_Notification_QNAME, NotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationProcessResponseType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotificationProcessResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/schema/notification", name = "NotificationProcessResponse")
    public JAXBElement<NotificationProcessResponseType> createNotificationProcessResponse(NotificationProcessResponseType value) {
        return new JAXBElement<NotificationProcessResponseType>(_NotificationProcessResponse_QNAME, NotificationProcessResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationResponseType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link NotificationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.transfesa.com/api_notification/schema/notificationresponse", name = "NotificationResponse")
    public JAXBElement<NotificationResponseType> createNotificationResponse(NotificationResponseType value) {
        return new JAXBElement<NotificationResponseType>(_NotificationResponse_QNAME, NotificationResponseType.class, null, value);
    }

}
