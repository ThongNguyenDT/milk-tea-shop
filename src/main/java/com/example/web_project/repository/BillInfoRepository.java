package com.example.web_project.repository;

import com.example.web_project.entities.Billinfo;
import com.example.web_project.entities.Viewgiohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BillInfoRepository extends JpaRepository<Billinfo, Integer> {


    @Modifying
    @Query("DELETE FROM Billinfo b WHERE b.id = :id")
    void deleteById(@Param("id") Integer id);

}
