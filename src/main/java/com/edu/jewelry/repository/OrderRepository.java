package com.edu.jewelry.repository;

import com.edu.jewelry.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findAllByCustomerSurname(String name);
    List<Order> findAllByCustomerSurnameContains(String str);
}
