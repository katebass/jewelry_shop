package com.edu.jewelry.service.order.interfaces;

import com.edu.jewelry.model.Order;
import com.edu.jewelry.service.IGenericService;

import java.util.List;

public interface IOrderService extends IGenericService<Order> {
    List<Order> searchByName(String name);
    List<Order> searchByString(String str);
    List<Order> sortByName(String name, String order);
}
