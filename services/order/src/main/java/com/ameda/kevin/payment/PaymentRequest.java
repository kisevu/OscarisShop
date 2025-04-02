package com.ameda.kevin.payment;

import com.ameda.kevin.customer.CustomerResponse;
import com.ameda.kevin.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
