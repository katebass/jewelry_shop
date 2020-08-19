package com.edu.jewelry.dao.material.impls;

import com.edu.jewelry.dao.material.interfaces.IDaoMaterial;
import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoMaterialServiceImpl implements IDaoMaterial {

    @Autowired
    DataFake dataFake;

    @Override
    public Material create(Material material) {
        return null;
    }

    @Override
    public Material get(String id) {
        return null;
    }

    @Override
    public Material update(Material material) {
        return null;
    }

    @Override
    public Material delete(String id) {
        return null;
    }

    @Override
    public List<Material> getAll() {
        return dataFake.getMaterials();
    }
}
