package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.CreateOrderRequest;
import com.chenjinwang.springbootmail.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
