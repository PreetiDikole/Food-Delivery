package com.example.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fooddelivery.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {}
