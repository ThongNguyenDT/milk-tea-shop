package com.example.web_project.repository;

import com.example.web_project.entities.Drinkcost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkcostRepository extends JpaRepository<Drinkcost, Integer> {

    Double findTotalCostByIdSizeAndIdFoamAndIdAddinAndIdTopping(
            @Param("idSize") Integer idSize,
            @Param("idFoam") Integer idFoam,
            @Param("idAddin") Integer idAddin,
            @Param("idTopping") Integer idTopping
    );
    Integer findIDDrinkTypeByIdSizeAndIdAddinAndIdFoamAndIdTopping(
            @Param("idSize") Integer idSize,
            @Param("idAddin") Integer idAddin,
            @Param("idFoam") Integer idFoam,
            @Param("idTopping") Integer idTopping
    );

}
