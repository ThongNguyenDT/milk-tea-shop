package com.example.web_project.repository;

import com.example.web_project.entities.Viewmonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewMonthRepository  extends JpaRepository<Viewmonth, Integer> {

    List<Viewmonth> findAll();
}
