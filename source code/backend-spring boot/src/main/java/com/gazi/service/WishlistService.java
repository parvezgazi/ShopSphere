package com.gazi.service;


import com.gazi.exception.WishlistNotFoundException;
import com.gazi.model.Product;
import com.gazi.model.User;
import com.gazi.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

