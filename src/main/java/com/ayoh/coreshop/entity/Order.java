package com.ayoh.coreshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders") //oder에 대한 내용입니다
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_no", nullable = false)
    private Long orderNumber;

    @Column(name = "order_status", nullable = false)
    private Long orderStatus;

    @Column(name = "order_at", nullable = false)
    private Long orderAt;
}
