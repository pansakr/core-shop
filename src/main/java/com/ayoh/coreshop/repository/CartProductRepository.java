package com.ayoh.coreshop.repository;

import com.ayoh.coreshop.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
}
