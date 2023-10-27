package com.Product.Catalog.service;

import com.Product.Catalog.model.Product;
import com.Product.Catalog.repository.CatalogRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private CatalogRepositroy catalogRepositroy;

    public List<Product> getAllProducts() {
        return catalogRepositroy.findAll();
    }

    public Product getProductByID(int id) {
        Optional<Product> product = catalogRepositroy.findById(id);
        return product.orElse(null);
    }

    public Product createProduct(Product product) {
        return catalogRepositroy.save(product);
    }

    public Product updateProductDetails(@RequestBody Product product) {
        return catalogRepositroy.save(product);
    }

    public void deleteProduct(int id) {
        catalogRepositroy.deleteById(id);
    }


}
