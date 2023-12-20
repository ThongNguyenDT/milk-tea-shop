package com.example.web_project.services;

import com.example.web_project.entities.Account;
import com.example.web_project.entities.Drinktype;
import com.example.web_project.entities.Product;

public interface PrebuyService {
    void addToOrder(Product idProduct, int count, int idSize, int idAddin, int idFoam, int idTopping, int idAccount);
    Drinktype getDrinkTypeID(int idSize, int idAddin, int idFoam, int idTopping);
}
