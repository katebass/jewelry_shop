package com.edu.jewelry.repository;

import com.edu.jewelry.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findAllByName(String name);
    List<Product> findAllByNameContains(String str);
}
