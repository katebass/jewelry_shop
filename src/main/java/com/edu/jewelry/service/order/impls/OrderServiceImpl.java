package com.edu.jewelry.service.order.impls;

import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Order;
import com.edu.jewelry.repository.OrderRepository;
import com.edu.jewelry.service.order.interfaces.IOrderBusinessInterface;
import com.edu.jewelry.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements IOrderService, IOrderBusinessInterface {

//    @Autowired
//    DaoOrderServiceImpl daoOrderService;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    DataFake dataFake;

    @Override
    public Order create(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());
        return orderRepository.save(order);
    }

    @Override
    public Order get(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order delete(String id) {
        Order order = this.get(id);
        orderRepository.deleteById(order.getId());
        return order;
    }

    @Override
    public Order update(Order order) {
        order.setUpdatedAt(LocalDateTime.now());
        return orderRepository.save(order);
    }


    @Override
    public List<Order> getAll() {
//        return daoOrderService.getAll();
        return orderRepository.findAll();
    }

    public void refresh() {
        orderRepository.deleteAll();
        orderRepository.saveAll(dataFake.getOrders());
    }

    @Override
    public List<Order> searchByName(String str) {
        // по-тупому
//        public List<Order> searchByName(String str) {
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().equals(str))
//                .collect(Collectors.toList());

        //по-умному
        return orderRepository.findAllByCustomerSurname(str);
//        return orderRepository.findAllByNameAndDescription(str);
    }

    @Override
    public List<Order> searchByString(String str) {
        // по-тупому
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().contains(str))
//                .collect(Collectors.toList());

        // по-умному
        return orderRepository.findAllByCustomerSurnameContains(str);
    }

    @Override
    public Order findBestOrder() {
        return null;
    }

    @Override
    public List<Order> sortByName(String name, String order) {
        return this.getAll().
                stream()
                .sorted(Comparator.comparing(Order::getCustomerSurname).reversed())
                .collect(Collectors.toList());
    }
}
