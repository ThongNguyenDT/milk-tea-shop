package com.example.web_project.repository;

import com.example.web_project.entities.Earn;
import com.example.web_project.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EarnRepository extends JpaRepository<Earn, Integer> {
    // Tìm thu nhập theo thời gian
    List<Earn> findAllByIdTime(Time time);

    // Tìm thu nhập theo ID thời gian
    List<Earn> findAllByIdTime_Id(Integer timeId);

    // Tìm thu nhập theo mức độ kiếm được
    List<Earn> findByEarn(Integer earn);
}
