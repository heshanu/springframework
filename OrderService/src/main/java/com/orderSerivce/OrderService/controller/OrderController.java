package com.orderSerivce.OrderService.controller;

import com.orderSerivce.OrderService.model.OrderRequest;
import com.orderSerivce.OrderService.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public void hello(){
        log.info("hello");
        System.out.println("hello");
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderRequest){
        long orderId=orderService.placeOrder(orderRequest);
        log.info("Order Id:{}",orderId);
        return  new ResponseEntity<>(orderId,HttpStatus.OK);
    }

}
