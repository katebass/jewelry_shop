package com.edu.jewelry.service.product.interfaces;

import com.edu.jewelry.model.Product;
import com.edu.jewelry.service.IGenericService;

import java.util.List;

public interface IProductService extends IGenericService<Product> {
    List<Product> searchByName(String name);
    List<Product> searchByString(String str);
    List<Product> sortByName(String name, String order);
}
