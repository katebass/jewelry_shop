package com.edu.jewelry.dao.product.impls;

import com.edu.jewelry.dao.product.interfaces.IDaoProduct;
import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoProductServiceImpl implements IDaoProduct {

    @Autowired
    DataFake dataFake;

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public Product get(String id) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product delete(String id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return dataFake.getProducts();
    }
}
