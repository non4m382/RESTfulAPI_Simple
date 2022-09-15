package com.example.restfulapi_simple.service;

import com.example.restfulapi_simple.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    //Save operation
    Product saveProduct(Product product);

    // Read operation
    List<Product> getProductList();

    // Find operation
    Product findById(int id);

    // Update operation
    Product updateProduct(Product product);

    // Delete operation
    String deleteProduct(int id);



}
