package com.example.restfulapi_simple.service;

import com.example.restfulapi_simple.model.Product;
import com.example.restfulapi_simple.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository repository;

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
    public Product findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        Product p = repository.findById(product.getId()).get();
        if (p == null) return p;

        if (!product.getName().equalsIgnoreCase(""))
            p.setName(product.getName());
//        if (!product.getQuantity())

        p.setQuantity(product.getQuantity());
        p.setPrice(product.getPrice());

        return repository.save(p);
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "removed product " + id;
    }
}
