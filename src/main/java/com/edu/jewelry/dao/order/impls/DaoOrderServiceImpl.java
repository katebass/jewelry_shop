package com.edu.jewelry.dao.order.impls;

import com.edu.jewelry.dao.order.interfaces.IDaoOrder;
import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoOrderServiceImpl implements IDaoOrder {

    @Autowired
    DataFake dataFake;

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Order get(String id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order delete(String id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return dataFake.getOrders();
    }
}
