package com.example.restfulapi_simple.service;

import com.example.restfulapi_simple.model.Product;
import com.example.restfulapi_simple.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getProductList() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.ofNullable(repository.findById(id).orElse(null));
    }

    @Override
    public Product updateProduct(Product product) {

        return repository.save(product);
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "removed product " + id;
    }
}
