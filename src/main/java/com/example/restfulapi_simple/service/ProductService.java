package com.example.restfulapi_simple.service;

import com.example.restfulapi_simple.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    //Save operation
    Product saveProduct(Product product);

    // Read operation
    List<Product> getProductList();

    // Find operation
    Optional<Product> findById(int id);

    // Update operation
    Product updateProduct(Product product);

    // Delete operation
    String deleteProduct(int id);



}
