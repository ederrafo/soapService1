package com.ederrafo.soapservice1;

import com.ederrafo.soapservice1.entities.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductWs {
    @WebMethod
    List<Product> getProducts();
}
