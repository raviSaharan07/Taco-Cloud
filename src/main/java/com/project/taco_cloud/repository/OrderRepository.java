package com.project.taco_cloud.repository;

import com.project.taco_cloud.model.TacoOrder;
import org.springframework.data.repository.Repository;

public interface OrderRepository extends Repository<TacoOrder,Long> {
}
