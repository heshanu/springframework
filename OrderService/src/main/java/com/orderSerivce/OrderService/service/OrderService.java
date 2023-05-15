package com.orderSerivce.OrderService.service;

import com.orderSerivce.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
