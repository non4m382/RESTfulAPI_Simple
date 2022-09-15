//package com.example.restfulapi_simple.repository;
//
//import com.example.restfulapi_simple.model.Product;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Repository
//public class ProductRepositorySimple {
//    private List<Product> productList = new ArrayList<>();
//
//    public void createProducts() {
//        productList.add(new Product(1, "A", 10, 2));
//        productList.add(new Product(2, "B", 12, 3));
//        productList.add(new Product(3, "C", 14, 4));
//    }
//
//    public List<Product> getAllProducts() {
//        return productList;
//    }
//
//    public Product findById(int id) {
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getId() == id) {
//                return productList.get(i);
//            }
//        }
//        return null;
//    }
//
//    public List<Product> search(String name) {
//        return productList.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
//    }
//
//    public Product saveProduct(Product p) {
//        Product product = new Product();
//        product.setId(p.getId());
//        product.setName(p.getName());
//        product.setQuantity(p.getQuantity());
//        product.setPrice(p.getPrice());
//        productList.add(product);
//        return product;
//    }
//
//    public String deleteProduct(int id) {
//        productList.removeIf(x -> x.getId() == id);
//        return null;
//    }
//
//    public Product update(Product product) {
//        int id = -1;
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getId() == (product.getId())) {
//                id = product.getId();
//                break;
//            }
//        }
//        if (id == -1) return null;
//
//        Product product1 = new Product();
//        product1.setId(id);
//        product1.setName(product.getName());
//        product1.setQuantity(product.getQuantity());
//        product1.setPrice(product.getPrice());
//        return product1;
//    }
//
//}
