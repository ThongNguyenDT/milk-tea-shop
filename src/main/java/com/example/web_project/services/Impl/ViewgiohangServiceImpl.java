package com.example.web_project.services.Impl;
import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.repository.AccountRepository;
import com.example.web_project.repository.ViewgiohangRepository;

import com.example.web_project.services.ViewgiohangService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@RequiredArgsConstructor
public class ViewgiohangServiceImpl implements ViewgiohangService {
    @Autowired
    private final ViewgiohangRepository viewgiohangRepository;
    @Autowired
    private final AccountRepository accountRepository;


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
            // Cập nhật thông tin của existingViewgiohang với thông tin từ updatedViewgiohang
            existingViewgiohang.setCount(updatedViewgiohang.getCount());
            existingViewgiohang.setDescription(updatedViewgiohang.getDescription());
            // Cập nhật các trường khác tương tự
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

    // Các phương thức truy vấn khác nếu cần
    @Override
    public List<Viewgiohang> getViewgiohangByUsername(String username) {
        AtomicInteger id = new AtomicInteger();
        accountRepository.findByUsername(username).ifPresent(account -> id.set(account.getId()));
        return viewgiohangRepository.findByIdAccount(id.get());
    }
}
