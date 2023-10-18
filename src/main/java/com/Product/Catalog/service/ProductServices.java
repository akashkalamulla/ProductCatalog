package com.Product.Catalog.service;

import com.Product.Catalog.model.Catalog;
import com.Product.Catalog.repository.CatalogRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductServices {

    @Autowired
    CatalogRepositroy catalogRepositroy;

    public List<Catalog> getAllProducts(){
        return catalogRepositroy.findAll();
    }

}
