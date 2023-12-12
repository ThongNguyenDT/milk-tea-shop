package com.example.web_project.repository;

import com.example.web_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Tìm sản phẩm theo tên
    List<Product> findByName(String name);

    // Tìm sản phẩm theo chi phí
//    List<Product> findByCost(Integer cost);

//    List<Product> findAllByCategory(String category);

//    Double findCost(int idProduct);
}
