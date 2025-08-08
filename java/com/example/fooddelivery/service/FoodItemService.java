package com.example.fooddelivery.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.repository.FoodItemRepository;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository repo;

    public List<FoodItem> getAll() {
        return repo.findAll();
    }

    public FoodItem save(FoodItem item) {
        return repo.save(item);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
