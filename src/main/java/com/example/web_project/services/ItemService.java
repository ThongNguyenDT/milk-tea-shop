package com.example.web_project.services;

import com.example.web_project.models.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    public List<Item> getAll() {
        return List.of(new Item(1L, "Item - 1"), new Item(2L, "Item - 2"));
    }
}
