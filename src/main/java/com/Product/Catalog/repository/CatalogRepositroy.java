package com.Product.Catalog.repository;

import com.Product.Catalog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepositroy extends JpaRepository<Catalog,Integer> {
}
