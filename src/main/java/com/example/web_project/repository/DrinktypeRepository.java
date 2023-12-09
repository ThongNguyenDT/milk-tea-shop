package com.example.web_project.repository;

import com.example.web_project.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinktypeRepository extends JpaRepository<Drinktype, Integer> {
    // Tìm loại đồ uống theo kích thước
    List<Drinktype> findAllBySizeID(Size size);

    // Tìm loại đồ uống theo ID kích thước
    List<Drinktype> findAllBySizeID_Id(Integer sizeId);

    // Tìm loại đồ uống theo foam
    List<Drinktype> findAllByFoamID(Foam foam);

    // Tìm loại đồ uống theo ID foam
    List<Drinktype> findAllByFoamID_Id(Integer foamId);

    // Tìm loại đồ uống theo topping
    List<Drinktype> findAllByToppingID(Topping topping);

    // Tìm loại đồ uống theo ID topping
    List<Drinktype> findAllByToppingID_Id(Integer toppingId);

    // Tìm loại đồ uống theo addin
    List<Drinktype> findAllByAddinID(Addin addin);

    // Tìm loại đồ uống theo ID addin
    List<Drinktype> findAllByAddinID_Id(Integer addinId);
}
