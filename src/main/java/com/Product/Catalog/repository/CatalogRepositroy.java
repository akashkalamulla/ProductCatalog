package com.Product.Catalog.repository;

import com.Product.Catalog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepositroy extends JpaRepository<Catalog,Integer> {
}
