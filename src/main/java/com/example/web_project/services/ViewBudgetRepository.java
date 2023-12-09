package com.example.web_project.services;

import com.example.web_project.entities.Viewbudget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ViewBudgetRepository extends JpaRepository<Viewbudget, Integer> {
//    @Query(value = "SELECT TOP 1 * FROM Viewbudget WHERE ")
    List<Viewbudget> findAllByYearBetweenOrderByYearDesc(Integer yearBefore, Integer yearNow);

    List<Viewbudget> findAllByYearOrderByYearDesc(Integer yearNow);
}
