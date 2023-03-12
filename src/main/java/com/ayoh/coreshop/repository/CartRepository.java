package com.ayoh.coreshop.repository;

import com.ayoh.coreshop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
