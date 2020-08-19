package com.edu.jewelry.service.product.interfaces;
/*
 * @author Kateryna Basova
 * @version 14.08.2020
 */

import com.edu.jewelry.model.Product;

import java.util.List;

public interface IProductBusinessInterface {
    Product findBestProduct();
    List<Product> sortByName(String name, String order);
}
