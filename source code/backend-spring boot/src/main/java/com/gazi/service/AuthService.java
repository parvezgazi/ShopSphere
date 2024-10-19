package com.gazi.service;

import com.gazi.exception.SellerException;
import com.gazi.exception.UserException;
import com.gazi.request.LoginRequest;
import com.gazi.request.SignupRequest;
import com.gazi.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
