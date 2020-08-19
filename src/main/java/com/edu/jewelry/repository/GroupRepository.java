package com.edu.jewelry.repository;
/*
 * @author Kateryna Basova
 * @version 07.08.2020
 */

import com.edu.jewelry.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
