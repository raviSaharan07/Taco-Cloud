package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.Ingredient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcIngredientRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterator<Ingredient> findAll() {
        return jdbcTemplate.query(
                "select id,name,type form Ingredient",
                this::mapRowToIngredient
        );
    }

    @Override
    public Optional<Ingredient> findById(String id) {
        List<Ingredient> results = jdbcTemplate.query(
                "select id,name,type form Ingredient where id ?",
                this::mapRowToIngredient,
                id
        );

        return results.size()==0?
                Optional.empty() :
                Optional.of(results.get(0));
    }

    private Ingredient mapRowToIngredient(ResultSet row,int rowNum)  throws SQLException {
            return new Ingredient(
                    row.getString("id"),
                    row.getString("name"),
                    Ingredient.Type.valueOf(row.getString("type"))
            );
        }

    @Override
    public Ingredient save(Ingredient ingredient) {

    }
}
