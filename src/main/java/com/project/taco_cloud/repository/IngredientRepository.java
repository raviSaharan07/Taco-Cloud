package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.Ingredient;
import org.springframework.data.repository.Repository;

import java.util.Iterator;
import java.util.Optional;

public interface IngredientRepository extends Repository<Ingredient,String> {

}
