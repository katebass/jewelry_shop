package com.edu.jewelry.controller.rest;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import com.edu.jewelry.model.Order;
import com.edu.jewelry.service.order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/order")
@RestController
public class OrderRestController {

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/hello")
    String getHello() {
        return "Hello from order rest controller";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Order> getOrdersList() {
        return orderService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Order getOrder(@PathVariable("id") String id) {
        return orderService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Order deleteOrder(@PathVariable("id") String id){
        return orderService.delete(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Order createOrder(@RequestBody Order order){
        return orderService.create(order);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    Order updateOrder(@RequestBody Order order){
        return orderService.update(order);
    }
}
