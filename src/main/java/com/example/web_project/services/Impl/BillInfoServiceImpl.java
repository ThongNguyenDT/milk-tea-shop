package com.example.web_project.services.Impl;

import com.example.web_project.repository.BillInfoRepository;
import com.example.web_project.services.BillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BillInfoServiceImpl implements BillInfoService {
    private final BillInfoRepository billInfoRepository;

    @Autowired
    public BillInfoServiceImpl(BillInfoRepository billInfoRepository) {
        this.billInfoRepository = billInfoRepository;
    }

    @Override
    @Transactional
    public void deleteById (Integer id) {
        billInfoRepository.deleteById(id);
    }
}