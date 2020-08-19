package com.edu.jewelry.model;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Material {
    @Id
    private String id;
    private String name;
    private Double pricePerGram;
    private LocalDateTime createdAt, updatedAt;

    public Material() {
    }

    public Material(String id, String name, Double pricePerGram, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Material(String name, Double pricePerGram) {
        this.name = name;
        this.pricePerGram = pricePerGram;
    }

    public Material(String id, String name, Double pricePerGram) {
        this.id = id;
        this.name = name;
        this.pricePerGram = pricePerGram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPricePerGram() {
        return pricePerGram;
    }

    public void setPricePerGram(Double pricePerGram) {
        this.pricePerGram = pricePerGram;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return id.equals(material.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pricePerGram=" + pricePerGram +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
