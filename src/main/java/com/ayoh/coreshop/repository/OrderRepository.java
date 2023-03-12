package com.ayoh.coreshop.repository;

import com.ayoh.coreshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
