package com.example.web_project.repository;

import com.example.web_project.entities.Drinkcost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkcostRepository extends JpaRepository<Drinkcost, Integer>, JpaSpecificationExecutor<Drinkcost> {
    // Tìm chi phí theo ID loại đồ uống
    List<Drinkcost> findByIdDrinkType(Integer idDrinkType);

    // Tìm chi phí theo ID kích thước
    List<Drinkcost> findByIdSize(Integer idSize);

    // Tìm chi phí theo ID addin
    List<Drinkcost> findByIdAddin(Integer idAddin);

    // Tìm chi phí theo ID topping
    List<Drinkcost> findByIdTopping(Integer idTopping);

    // Tìm chi phí theo ID foam
    List<Drinkcost> findByIdFoam(Integer idFoam);

    // Tìm chi phí theo TotalCost
    List<Drinkcost> findByTotalCost(Long totalCost);
}
