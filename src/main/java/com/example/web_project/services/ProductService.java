package com.example.web_project.services;

import com.example.web_project.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Integer productId);

    Product createProduct(Product product);

    Product updateProduct(Integer productId, Product updatedProduct);

    void deleteProduct(Integer productId);

    List<Product> getProductsByCategory(String category);
}
