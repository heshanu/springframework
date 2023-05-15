package com.orderSerivce.OrderService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="ORDER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name ="PRODUCT_ID")
    private long productId;

    @Column(name="QUANTITY")
    private long quantity;

    @Column(name="ORDER_DATE")
    private Instant orderDate;

    @Column(name="ORDER_STATUS")
    private String orderStatus;

    @Column(name="AMOUNT")
    private long amount;
}
