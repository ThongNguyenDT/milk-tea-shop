package com.example.web_project.repository;

import com.example.web_project.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
    // Tìm kích thước theo tên
    List<Size> findBySize(String size);

    // Tìm kích thước theo chi phí
    List<Size> findByCost(Integer cost);
}
