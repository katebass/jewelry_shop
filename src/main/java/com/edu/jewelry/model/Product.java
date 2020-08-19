package com.edu.jewelry.model;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Product {
    @Id
    private String id;
    private Material material;
    private String name;
    private String type;
    private Double weight;
    private Double price;
    private LocalDateTime createdAt, updatedAt;

    public Product() {
    }

    public Product(String id, Material material, String name, String type, Double weight,
                   Double price, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.material = material;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product(String id, Material material, String name, String type,
                   Double weight, Double price) {
        this.id = id;
        this.material = material;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public Product(Material material, String name, String type, Double weight, Double price) {
        this.material = material;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
