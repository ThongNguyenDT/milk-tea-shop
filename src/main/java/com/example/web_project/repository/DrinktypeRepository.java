package com.example.web_project.repository;

import com.example.web_project.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DrinktypeRepository extends JpaRepository<Drinktype, Integer> {
    List<Drinktype> findAllBySizeID(Size size);

    List<Drinktype> findAllBySizeID_Id(Integer sizeId);

    List<Drinktype> findAllByFoamID(Foam foam);

    List<Drinktype> findAllByFoamID_Id(Integer foamId);

    List<Drinktype> findAllByToppingID(Topping topping);

    List<Drinktype> findAllByToppingID_Id(Integer toppingId);

    List<Drinktype> findAllByAddinID(Addin addin);

    List<Drinktype> findAllByAddinID_Id(Integer addinId);
    @Query("SELECT (b.cost + c.cost + d.cost) AS totalCost FROM Drinktype a LEFT JOIN a.sizeID b LEFT JOIN a.foamID c LEFT JOIN a.toppingID d WHERE a.id = :drinkTypeID")
    Integer getDrinkTypeCost(@Param("drinkTypeID") Integer drinkTypeID);

    @Query("SELECT new Drinktype(a.id) FROM Drinktype a WHERE a.sizeID.id = :sizeId AND a.addinID.id = :addinId AND a.foamID.id = :foamId AND a.toppingID.id = :toppingId")
    Drinktype getDrinkTypeID(
            @Param("sizeId") int sizeId,
            @Param("addinId") int addinId,
            @Param("foamId") int foamId,
            @Param("toppingId") int toppingId
    );

}
