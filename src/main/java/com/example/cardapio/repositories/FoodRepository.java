package com.example.cardapio.repositories;

import com.example.cardapio.domain.Food;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
