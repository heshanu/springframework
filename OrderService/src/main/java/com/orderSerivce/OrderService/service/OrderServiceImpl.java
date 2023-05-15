package com.orderSerivce.OrderService.service;

import com.orderSerivce.OrderService.entity.OrderEntity;
import com.orderSerivce.OrderService.model.OrderRequest;
import com.orderSerivce.OrderService.repository.OrderRepository;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
@Builder
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public long placeOrder(OrderRequest orderRequest) {
        //order entity -save the data with status oder created
        //procuts service-block products (Reduce the Quantity)
        //payment service-payment-sucess completed else cancel

        log.info("placing order req:{}",orderRequest);
        OrderEntity order=OrderEntity.builder()
                .amount(orderRequest.getTotalAmount())
                .orderStatus("CREATED")
                .productId(orderRequest.getProductId())
                .orderDate(Instant.now())
                .quantity(orderRequest.getQuantity())
                .build();
        order=orderRepository.save(order);
        log.info("order placed succefully with id:",order.getId());

        return 0;
    }
}
