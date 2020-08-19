package com.edu.jewelry.service.product.impls;

import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Product;
import com.edu.jewelry.repository.ProductRepository;
import com.edu.jewelry.service.product.interfaces.IProductBusinessInterface;
import com.edu.jewelry.service.product.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService, IProductBusinessInterface {

//    @Autowired
//    DaoProductServiceImpl daoProductService;
    @Autowired
    ProductRepository materialRepository;
    @Autowired
    DataFake dataFake;

    @Override
    public Product create(Product material) {
        material.setCreatedAt(LocalDateTime.now());
        material.setUpdatedAt(LocalDateTime.now());
        return materialRepository.save(material);
    }

    @Override
    public Product get(String id) {
        return materialRepository.findById(id).orElse(null);
    }

    @Override
    public Product delete(String id) {
        Product material = this.get(id);
        materialRepository.deleteById(material.getId());
        return material;
    }

    @Override
    public Product update(Product material) {
        material.setUpdatedAt(LocalDateTime.now());
        return materialRepository.save(material);
    }


    @Override
    public List<Product> getAll() {
//        return daoProductService.getAll();
        return materialRepository.findAll();
    }

    public void refresh() {
        materialRepository.deleteAll();
        materialRepository.saveAll(dataFake.getProducts());
    }

    @Override
    public List<Product> searchByName(String str) {
        // по-тупому
//        public List<Product> searchByName(String str) {
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().equals(str))
//                .collect(Collectors.toList());

        //по-умному
        return materialRepository.findAllByName(str);
//        return materialRepository.findAllByNameAndDescription(str);
    }

    @Override
    public List<Product> searchByString(String str) {
        // по-тупому
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().contains(str))
//                .collect(Collectors.toList());

        // по-умному
        return materialRepository.findAllByNameContains(str);
    }

    @Override
    public Product findBestProduct() {
        return null;
    }

    @Override
    public List<Product> sortByName(String name, String order) {
        return this.getAll().
                stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                .collect(Collectors.toList());
    }
}
