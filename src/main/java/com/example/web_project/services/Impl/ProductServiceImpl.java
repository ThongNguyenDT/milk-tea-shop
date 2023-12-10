package com.example.web_project.services.Impl;

import com.example.web_project.entities.Product;
import com.example.web_project.repository.ProductRepository;
import com.example.web_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        return optionalProduct.orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        // Add any validation or business logic before saving
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Integer productId, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();
            // Update properties of existingProduct with those of updatedProduct
            // Save the updated product
            return productRepository.save(existingProduct);
        } else {
            return null; // Product not found
        }
    }

    @Override
    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

    // You may add more methods based on your application's requirements
}
