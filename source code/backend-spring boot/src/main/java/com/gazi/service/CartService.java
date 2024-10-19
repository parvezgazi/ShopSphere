package com.gazi.service;

import com.gazi.exception.ProductException;
import com.gazi.model.Cart;
import com.gazi.model.CartItem;
import com.gazi.model.Product;
import com.gazi.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
