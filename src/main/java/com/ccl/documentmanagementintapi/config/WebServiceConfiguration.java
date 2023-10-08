package com.ccl.documentmanagementintapi.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "anubisAbastDocument")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema anubisAbastDocumentSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("anubisAbastDocument");
        wsdl11Definition.setLocationUri("/ws/anubisAbastDocument");
        wsdl11Definition.setTargetNamespace("http://www.transfesa.com/api_anubis_document/AnubisAbastDocument");
        wsdl11Definition.setSchema(anubisAbastDocumentSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema anubisAbastDocumentSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/AnubisAbastDocument.xsd"));
    }

}
