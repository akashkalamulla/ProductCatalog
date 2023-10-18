package com.Product.Catalog.controller;

import com.Product.Catalog.model.Catalog;
import com.Product.Catalog.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {

    @Autowired
    ProductServices productServices;

    @GetMapping(path = "/products")
    public List<Catalog> getAll(){
        return productServices.getAllProducts();
    }

}
