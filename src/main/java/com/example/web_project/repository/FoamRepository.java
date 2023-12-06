package com.example.web_project.repository;

import com.example.web_project.entities.Foam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoamRepository extends JpaRepository<Foam, Integer> {
    // Tìm foam theo tên
    List<Foam> findByFoam(String foam);

    // Tìm foam theo chi phí
    List<Foam> findByCost(Integer cost);
}
