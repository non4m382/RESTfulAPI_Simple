package com.example.restfulapi_simple.repository;

import com.example.restfulapi_simple.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    Product
}
