package com.ederrafo.soapservice1;

import com.ederrafo.soapservice1.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductWsImpl implements ProductWs {


    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(1);
        product.setName("Ber");
        product.setDescription("Bear Full");
        product.setPrice(12);
        products.add(product);
        return products;
    }
}
