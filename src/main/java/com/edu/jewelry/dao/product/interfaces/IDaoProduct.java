package com.edu.jewelry.dao.product.interfaces;

import com.edu.jewelry.model.Product;

import java.util.List;

public interface IDaoProduct {
    Product create(Product product);
    Product get(String id);
    Product update(Product product);
    Product delete(String id);
    List<Product> getAll();
}
