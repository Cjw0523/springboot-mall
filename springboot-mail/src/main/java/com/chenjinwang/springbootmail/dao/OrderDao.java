package com.chenjinwang.springbootmail.dao;

import com.chenjinwang.springbootmail.model.Order;
import com.chenjinwang.springbootmail.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
