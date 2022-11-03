package com.ederrafo.soapservice1.configuration;


import com.ederrafo.soapservice1.ProductWs;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private ProductWs productWs;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint= new EndpointImpl(bus, productWs);
        endpoint.publish("/products");
        return endpoint;
    }


}
