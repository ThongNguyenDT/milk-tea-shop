package com.example.web_project.repository;

import com.example.web_project.entities.Cost;
import com.example.web_project.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostRepository extends JpaRepository<Cost, Integer> {
    // Tìm chi phí theo thời gian
    List<Cost> findAllByIdTime(Time time);

    // Tìm chi phí theo ID thời gian
    List<Cost> findAllByIdTime_Id(Integer timeId);

    // Tìm chi phí theo ID thời gian và ID chi phí
    List<Cost> findAllByIdTime_IdAndId(Integer timeId, Integer costId);
}
