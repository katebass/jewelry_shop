package com.edu.jewelry.repository;

import com.edu.jewelry.model.Material;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends MongoRepository<Material, String> {
    List<Material> findAllByName(String name);
    List<Material> findAllByNameContains(String str);
}
