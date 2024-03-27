package com.example.cardapio.Controller;

import com.example.cardapio.domain.Food;
import com.example.cardapio.repositories.FoodRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController     {
    private final FoodRepository repository;

    public FoodController(FoodRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public void getAll(){
        List<Food> foodList = repository.findAll();
    }
}
