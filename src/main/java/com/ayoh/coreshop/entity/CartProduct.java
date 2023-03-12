package com.ayoh.coreshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart_products")
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_product_no", nullable = false)
    private Long cartProductNumber;

    @Column(nullable = false)
    private Long count;
}
