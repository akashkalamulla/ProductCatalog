package com.Product.Catalog.repository;

import com.Product.Catalog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepositroy extends JpaRepository<Catalog,Integer> {

    @Query("Select c from Catalog c where c.ProductName=?1")
    List<Catalog> findByProductName(String ProductName);

    @Query("Select c from Catalog c where c. ProductId=?1")
    List<Catalog> findProductId(int ProductId);
}
