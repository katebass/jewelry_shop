package com.edu.jewelry.service.material.impls;

import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Material;
import com.edu.jewelry.repository.MaterialRepository;
import com.edu.jewelry.service.material.interfaces.IMaterialBusinessInterface;
import com.edu.jewelry.service.material.interfaces.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialServiceImpl implements IMaterialService, IMaterialBusinessInterface {

//    @Autowired
//    DaoMaterialServiceImpl daoMaterialService;
    @Autowired
    MaterialRepository materialRepository;
    @Autowired
    DataFake dataFake;

    @Override
    public Material create(Material material) {
        material.setCreatedAt(LocalDateTime.now());
        material.setUpdatedAt(LocalDateTime.now());
        return materialRepository.save(material);
    }

    @Override
    public Material get(String id) {
        return materialRepository.findById(id).orElse(null);
    }

    @Override
    public Material delete(String id) {
        Material material = this.get(id);
        materialRepository.deleteById(material.getId());
        return material;
    }

    @Override
    public Material update(Material material) {
        material.setUpdatedAt(LocalDateTime.now());
        return materialRepository.save(material);
    }


    @Override
    public List<Material> getAll() {
//        return daoMaterialService.getAll();
        return materialRepository.findAll();
    }

    public void refresh() {
        materialRepository.deleteAll();
        materialRepository.saveAll(dataFake.getMaterials());
    }

    @Override
    public List<Material> searchByName(String str) {
        // по-тупому
//        public List<Material> searchByName(String str) {
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().equals(str))
//                .collect(Collectors.toList());

        //по-умному
        return materialRepository.findAllByName(str);
//        return materialRepository.findAllByNameAndDescription(str);
    }

    @Override
    public List<Material> searchByString(String str) {
        // по-тупому
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().contains(str))
//                .collect(Collectors.toList());

        // по-умному
        return materialRepository.findAllByNameContains(str);
    }

    @Override
    public Material findBestMaterial() {
        return null;
    }

    @Override
    public List<Material> sortByName(String name, String order) {
        return this.getAll().
                stream()
                .sorted(Comparator.comparing(Material::getName).reversed())
                .collect(Collectors.toList());
    }
}
