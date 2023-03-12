package com.ayoh.coreshop.entity;

import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Products")
@Entity
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Long stockNumber;

    @Column(nullable = false)
    private String details;

    @Enumerated(EnumType.STRING)
    @Column(name = "sell_status", nullable = false)
    private ProductSellStatus sellStatus;

    @Column(name = "registered_at", nullable = false)
    private LocalDateTime registeredDate;

    @Column(name = "updated_at")
    private LocalDateTime updatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Long getStockNumber() {
        return this.stockNumber;
    }

    public String getDetails() {
        return this.details;
    }

    public ProductSellStatus getSellStatus() {
        return this.sellStatus;
    }

    public LocalDateTime getRegisteredDate() {
        return this.registeredDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }
}
