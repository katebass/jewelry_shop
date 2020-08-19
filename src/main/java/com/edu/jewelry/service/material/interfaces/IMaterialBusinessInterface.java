package com.edu.jewelry.service.material.interfaces;
/*
 * @author Kateryna Basova
 * @version 14.08.2020
 */

import com.edu.jewelry.model.Material;

import java.util.List;

public interface IMaterialBusinessInterface {
    Material findBestMaterial();
    List<Material> sortByName(String name, String order);
}
