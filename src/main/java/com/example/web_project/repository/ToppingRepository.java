package com.example.web_project.repository;

import com.example.web_project.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Integer> {
    // Tìm topping theo tên
    List<Topping> findByTopping(String topping);

    // Tìm topping theo chi phí
    List<Topping> findByCost(Integer cost);
}
