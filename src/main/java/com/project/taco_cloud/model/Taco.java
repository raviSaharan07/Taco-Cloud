package com.project.taco_cloud.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Id
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 1 , message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
