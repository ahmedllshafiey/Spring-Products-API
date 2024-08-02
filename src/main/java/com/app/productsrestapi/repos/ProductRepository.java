package com.app.productsrestapi.repos;

import com.app.productsrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {}
