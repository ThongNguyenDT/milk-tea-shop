package com.example.web_project.services;
import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.repository.ViewgiohangRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewgiohangService {

    private final ViewgiohangRepository viewgiohangRepository;

    @Autowired
    public ViewgiohangService(ViewgiohangRepository viewgiohangRepository) {
        this.viewgiohangRepository = viewgiohangRepository;
    }

    public List<Viewgiohang> getAllViewgiohang() {
        return viewgiohangRepository.findAll();
    }

    public Viewgiohang getViewgiohangById(Integer id) {
        return viewgiohangRepository.findById(id).orElse(null);
    }

    public Viewgiohang createViewgiohang(Viewgiohang viewgiohang) {
        return viewgiohangRepository.save(viewgiohang);
    }

    public Viewgiohang updateViewgiohang(Integer id, Viewgiohang updatedViewgiohang) {
        Viewgiohang existingViewgiohang = viewgiohangRepository.findById(id).orElse(null);
        if (existingViewgiohang != null) {
            // Cập nhật thông tin của existingViewgiohang với thông tin từ updatedViewgiohang
            existingViewgiohang.setCount(updatedViewgiohang.getCount());
            existingViewgiohang.setDescription(updatedViewgiohang.getDescription());
            // Cập nhật các trường khác tương tự
            return viewgiohangRepository.save(existingViewgiohang);
        }
        return null;
    }

    public void deleteViewgiohang(Integer id) {
        viewgiohangRepository.deleteById(id);
    }

    public List<Viewgiohang> getViewgiohangByBillID(Integer billID) {
        return viewgiohangRepository.findByBillID(billID);
    }

    // Các phương thức truy vấn khác nếu cần
}