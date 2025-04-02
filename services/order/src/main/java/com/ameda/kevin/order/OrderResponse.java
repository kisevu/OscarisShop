package com.ameda.kevin.order;

import java.math.BigDecimal;

public record OrderResponse(
    Integer orderId,
    String reference,
    BigDecimal totalAmount,
    PaymentMethod paymentMethod,
    String customerId
) {
}
