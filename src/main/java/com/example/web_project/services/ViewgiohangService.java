package com.example.web_project.services;

import com.example.web_project.entities.Viewgiohang;

import java.util.List;

public interface ViewgiohangService {
    List<Viewgiohang> getAllViewgiohang();

    Viewgiohang getViewgiohangById(Integer id);

    Viewgiohang createViewgiohang(Viewgiohang viewgiohang);

    Viewgiohang updateViewgiohang(Integer id, Viewgiohang updatedViewgiohang);

    void deleteViewgiohang(Integer id);

    List<Viewgiohang> getViewgiohangByBillID(Integer billID);

    List<Viewgiohang> getViewgiohangByUsername(String username);
}
