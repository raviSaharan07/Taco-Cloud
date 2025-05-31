package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.TacoOrder;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends Repository<TacoOrder, UUID> {

}
