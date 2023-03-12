package com.ayoh.coreshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_products")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_no", nullable = false)
    private Long orderProductNumber;

    @Column(name = "order_price", nullable = false)
    private Long orderPrice;

    @Column(nullable = false)
    private Long count;
}
