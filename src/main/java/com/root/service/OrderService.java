package com.root.service;

import com.root.domain.OrderType;
import com.root.model.Coin;
import com.root.model.Order;
import com.root.model.OrderItem;
import com.root.model.User;

import java.util.List;

public interface OrderService {
    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrdersOfUser(Long userId, OrderType orderType, String assetSymbol);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;


}
