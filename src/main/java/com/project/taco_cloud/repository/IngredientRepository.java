package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.Ingredient;

import java.util.Iterator;
import java.util.Optional;

public interface IngredientRepository {

    Iterator<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
