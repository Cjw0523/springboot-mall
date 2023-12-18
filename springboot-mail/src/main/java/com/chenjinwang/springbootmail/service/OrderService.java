package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.CreateOrderRequest;
import com.chenjinwang.springbootmail.dto.OrderQueryParams;
import com.chenjinwang.springbootmail.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
