package com.gazi.repository;

import com.gazi.model.Cart;
import com.gazi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
