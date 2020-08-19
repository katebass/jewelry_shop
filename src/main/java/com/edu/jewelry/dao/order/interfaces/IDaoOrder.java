package com.edu.jewelry.dao.order.interfaces;

import com.edu.jewelry.model.Order;

import java.util.List;

public interface IDaoOrder {
    Order create(Order order);
    Order get(String id);
    Order update(Order order);
    Order delete(String id);
    List<Order> getAll();
}
