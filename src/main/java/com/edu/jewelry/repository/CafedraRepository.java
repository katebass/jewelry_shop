package com.edu.jewelry.repository;

import com.edu.jewelry.model.Cafedra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra, String> {
    List<Cafedra> findAllByName(String name);
    List<Cafedra> findAllByNameAndDescription(String str);
    List<Cafedra> findAllByNameContains(String str);
}
