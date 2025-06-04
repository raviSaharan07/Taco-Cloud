package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

}
