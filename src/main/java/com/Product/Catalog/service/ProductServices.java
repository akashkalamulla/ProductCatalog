package com.Product.Catalog.service;

import com.Product.Catalog.model.Catalog;
import com.Product.Catalog.repository.CatalogRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductServices {

    @Autowired
    CatalogRepositroy catalogRepositroy;

    public List<Catalog> getAllProducts(){
        return catalogRepositroy.findAll();
    }

    public Catalog getproductByID(int id){
        return catalogRepositroy.findById(id).get();
    }
    public Catalog CreateProduct(Catalog catalog){
        return catalogRepositroy.save(catalog);
    }

    public Catalog UpdateProductDetails(@RequestBody Catalog catalog){
        return catalogRepositroy.save(catalog);
    }

    public void DeletProduct(int id){
        catalogRepositroy.deleteById(id);
    }

    public List<Catalog> findByName(String ProductName){
        return catalogRepositroy.findByProductName(ProductName);
    }

    public List<Catalog> findByProductId(int ProductId){
        return catalogRepositroy.findProductId(ProductId);
    }


}
