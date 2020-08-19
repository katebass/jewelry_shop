package com.edu.jewelry.model;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document
public class Order {
    @Id
    private String id;
    private String product_id;
    private String saleDate;
    private String customerName;
    private String customerPatronymic;
    private String customerSurname;
    private LocalDateTime createdAt, updatedAt;

    public Order() {
    }

    public Order(String product_id, String saleDate, String customerName, String customerPatronymic, String customerSurname) {
        this.id = UUID.randomUUID().toString();
        this.product_id = product_id;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.customerPatronymic = customerPatronymic;
        this.customerSurname = customerSurname;
        this.updatedAt = LocalDateTime.now();
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPatronymic() {
        return customerPatronymic;
    }

    public void setCustomerPatronymic(String customerPatronymic) {
        this.customerPatronymic = customerPatronymic;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
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

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
}
