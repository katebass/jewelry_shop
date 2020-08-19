package com.edu.jewelry.model;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Order {
    @Id
    private String id;
    private Product product;
    private String saleDate;
    private String customerName;
    private String customerPatronymic;
    private String customerSurname;
    private LocalDateTime createdAt, updatedAt;

    public Order() {
    }

    public Order(String id, Product product, String saleDate, String customerName,
                 String customerPatronymic, String customerSurname,
                 LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.product = product;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.customerPatronymic = customerPatronymic;
        this.customerSurname = customerSurname;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Order(String id, Product product, String saleDate, String customerName,
                 String customerPatronymic, String customerSurname) {
        this.id = id;
        this.product = product;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.customerPatronymic = customerPatronymic;
        this.customerSurname = customerSurname;
    }

    public Order(Product product, String saleDate, String customerName,
                 String customerPatronymic, String customerSurname) {
        this.product = product;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.customerPatronymic = customerPatronymic;
        this.customerSurname = customerSurname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
}