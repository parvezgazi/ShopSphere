package com.gazi.ai.services;

import com.gazi.exception.ProductException;
import com.gazi.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
