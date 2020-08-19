package com.edu.jewelry.service.order.interfaces;
/*
 * @author Kateryna Basova
 * @version 14.08.2020
 */

import com.edu.jewelry.model.Order;

import java.util.List;

public interface IOrderBusinessInterface {
    Order findBestOrder();
    List<Order> sortByName(String name, String order);
}
