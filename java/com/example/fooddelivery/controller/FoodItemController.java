package com.example.fooddelivery.controller;

import com.example.fooddelivery.model.FoodItem;
import com.example.fooddelivery.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fooditems")
@CrossOrigin(origins = "*")
public class FoodItemController {

    @Autowired
    private FoodItemService service;

    @GetMapping
    public List<FoodItem> getAll() {
        return service.getAll();
    }

    @PostMapping
    public FoodItem create(@RequestBody FoodItem item) {
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
