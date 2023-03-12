package com.ayoh.coreshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_no", nullable = false)
    private Long cartNumber;
}
