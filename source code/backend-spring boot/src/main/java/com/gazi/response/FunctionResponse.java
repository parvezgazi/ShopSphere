package com.gazi.response;

import com.gazi.dto.OrderHistory;
import com.gazi.model.Cart;
import com.gazi.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
