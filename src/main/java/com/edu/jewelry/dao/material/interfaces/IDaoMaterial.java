package com.edu.jewelry.dao.material.interfaces;

import com.edu.jewelry.model.Material;

import java.util.List;

public interface IDaoMaterial {
    Material create(Material cafedra);
    Material get(String id);
    Material update(Material cafedra);
    Material delete(String id);
    List<Material> getAll();
}
