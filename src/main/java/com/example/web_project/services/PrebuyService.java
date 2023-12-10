package com.example.web_project.services;

public interface PrebuyService {
    void addToOrder(int idProduct, int count, int idSize, int idAddin, int idFoam, int idTopping, int idAccount);
    Integer findIDDrinkTypeBySizeAndAddinAndFoamAndTopping(int idSize, int idAddin, int idFoam, int idTopping);
    Double calculateTotalCost(int idSize, int idFoam, int idAddin, int idTopping, int idProduct);
}
