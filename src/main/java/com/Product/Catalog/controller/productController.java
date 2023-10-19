package com.Product.Catalog.controller;

import com.Product.Catalog.model.Catalog;
import com.Product.Catalog.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    @Autowired
    ProductServices productServices;

    @GetMapping(path = "/products")
    public List<Catalog> getAll(){
        return productServices.getAllProducts();
    }

    @GetMapping(path = "/products/{id}")
    public Catalog getProductFromCatalogId(@PathVariable int id){
        return productServices.getproductByID(id);
    }

    @PostMapping(path = "/products")
    public Catalog CreateProduct(@RequestBody Catalog catalog){
        return productServices.CreateProduct(catalog);
    }

    @PutMapping(path = "/products")
    public Catalog UpdateProductDetails(@RequestBody Catalog catalog){
        return productServices.UpdateProductDetails(catalog);
    }

    @DeleteMapping(path = "/products/{id}")
    public void DeleteProduct(@PathVariable int id){
        productServices.DeletProduct(id);
    }

    @GetMapping(path = "/products",params = "productname")
    public List<Catalog> findByProductName(@RequestParam String ProductName){
        return productServices.findByName(ProductName);
    }

    @GetMapping(path = "/prodcuts", params = "productid")
    public List<Catalog> findByProductId(@RequestParam int ProductId){
        return productServices.findByProductId(ProductId);
    }


}
