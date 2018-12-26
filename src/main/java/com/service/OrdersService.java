package com.service;

import com.pojo.Orders;

import java.util.List;

public interface OrdersService {
    int addOrders(Orders orders);
    int delOrdersById(String id);
    int updateOrders(Orders orders);
    Orders queryById(String id);
    List<Orders> queryAllOrders();
}
