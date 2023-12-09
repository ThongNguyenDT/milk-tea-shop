package com.example.web_project.services.Impl;
import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.repository.ViewgiohangRepository;

import com.example.web_project.services.ViewgiohangService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViewgiohangServiceImpl implements ViewgiohangService {

    private final ViewgiohangRepository viewgiohangRepository;

    @Autowired
    public ViewgiohangServiceImpl(ViewgiohangRepository viewgiohangRepository) {
        this.viewgiohangRepository = viewgiohangRepository;
    }

    @Override
    public List<Viewgiohang> getAllViewgiohang() {
        return viewgiohangRepository.findAll();
    }

    @Override
    public Viewgiohang getViewgiohangById(Integer id) {
        return viewgiohangRepository.findById(id).orElse(null);
    }

    @Override
    public Viewgiohang createViewgiohang(Viewgiohang viewgiohang) {
        return viewgiohangRepository.save(viewgiohang);
    }

    @Override
    public Viewgiohang updateViewgiohang(Integer id, Viewgiohang updatedViewgiohang) {
        Viewgiohang existingViewgiohang = viewgiohangRepository.findById(id).orElse(null);
        if (existingViewgiohang != null) {
            existingViewgiohang.setCount(updatedViewgiohang.getCount());
            existingViewgiohang.setDescription(updatedViewgiohang.getDescription());
            return viewgiohangRepository.save(existingViewgiohang);
        }
        return null;
    }

    @Override
    public void deleteViewgiohang(Integer id) {
        viewgiohangRepository.deleteById(id);
    }

    @Override
    public List<Viewgiohang> getViewgiohangByBillID(Integer billID) {
        return viewgiohangRepository.findByBillID(billID);
    }

    @Override
    public List<Viewgiohang> getViewgiohangByUsername(String username) {
        return viewgiohangRepository.findByUsername(username);
    }
}
