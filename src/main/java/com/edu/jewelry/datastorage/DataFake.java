package com.edu.jewelry.datastorage;

import com.edu.jewelry.model.*;
import com.edu.jewelry.repository.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {
    Logger logger = LogManager.getLogger(DataFake.class);


    @Autowired
    MaterialRepository materialRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;

    private List<Material> materials = new LinkedList<>(Arrays.asList(
            new Material("gold", 63.55),
            new Material( "silver", 0.78),
            new Material("platinum", 30.15)
    ));

    private List<Product> products = new LinkedList<>(Arrays.asList(
            new Product(materials.get(0).getId(), "ring", "new", 100.4, 154.00),
            new Product(materials.get(1).getId(), "earrings", "new", 215.75, 400.00),
            new Product( materials.get(2).getId(), "necklace", "new", 100.4, 500.00)
    ));

    private List<Order> orders = new LinkedList<>(Arrays.asList(
            new Order(products.get(0).getId(), "15.12.2019",
                    "Vasily", "Taburetkovych", "Pupkin"),
            new Order(products.get(1).getId(), "10.07.2020",
                    "Petr", "Portfelevych", "Kurochkin"),
            new Order(products.get(0).getId(), "05.01.2020",
                    "Zuzana", "Velosipedovna", "Smeshnyavkina")
    ));

    @PostConstruct
    private void init() {
        logger.info("Initializing fake data");

        materialRepository.deleteAll();
        materialRepository.saveAll(materials);

        productRepository.deleteAll();
        productRepository.saveAll(products);

        orderRepository.deleteAll();
        orderRepository.saveAll(orders);
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterial(List<Material> materials) {
        this.materials = materials;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrder(List<Order> orders) {
        this.orders = orders;
    }
}
