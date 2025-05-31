package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {

}
