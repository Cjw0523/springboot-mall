package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
