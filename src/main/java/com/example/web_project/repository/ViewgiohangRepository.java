package com.example.web_project.repository;

import com.example.web_project.entities.Viewgiohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewgiohangRepository extends JpaRepository<Viewgiohang, Integer> {
    List<Viewgiohang> findByBillID(Integer billID);

    List<Viewgiohang> findByIdAccount(Integer IdAccount);
    // Các phương thức truy vấn khác nếu cần

    @Query("SELECT v FROM Viewgiohang v WHERE v.username = :username")
    List<Viewgiohang> getViewgiohangByUsername(@Param("username") String username);
}
