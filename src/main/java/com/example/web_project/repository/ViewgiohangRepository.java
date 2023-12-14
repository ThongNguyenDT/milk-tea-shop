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

    @Query("SELECT a.id as BillID, b.id as BillInfoID, c.id as AccountID, c.username, b.count, b.drinkTypeID as DrinkTypeID,d.cost as ProductCost, b.productID, d.name as ProductName " +
            "FROM Bill a LEFT JOIN a.billinfos b LEFT JOIN a.idAccount c LEFT JOIN b.productID d WHERE c.username = :username")
    List<Object[]> getViewgiohangByUsername(@Param("username") String username);

}