package com.edu.jewelry.service.material.interfaces;

import com.edu.jewelry.model.Material;
import com.edu.jewelry.service.IGenericService;

import java.util.List;

public interface IMaterialService extends IGenericService<Material> {
    List<Material> searchByName(String name);
    List<Material> searchByString(String str);
    List<Material> sortByName(String name, String order);
}
