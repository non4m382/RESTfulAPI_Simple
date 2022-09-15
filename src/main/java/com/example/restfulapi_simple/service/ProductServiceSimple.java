//package com.example.restfulapi_simple.service;
//
//import com.example.restfulapi_simple.model.Product;
//import com.example.restfulapi_simple.repository.ProductRepositorySimple;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    private final ProductRepositorySimple repository;
//
//    public ProductService(ProductRepositorySimple repository) {
//        this.repository = repository;
//    }
//
//    public String createProduct() {
//        repository.createProducts();
//        return "initialized";
//    }
//
//    public Product saveProduct(Product product) {
//        return repository.saveProduct(product);
//    }
//
//    public List<Product> getProducts() {
//        return repository.getAllProducts();
//    }
//
//    public Product getProductById(int id) {
//        return repository.findById(id);
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteProduct(id);
//        return "product removed " + id;
//    }
//
//    public Product updateProduct(Product product) {
//        return repository.update(product);
//    }
//}
