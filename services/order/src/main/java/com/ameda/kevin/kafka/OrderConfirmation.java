package com.ameda.kevin.kafka;

import com.ameda.kevin.customer.CustomerResponse;
import com.ameda.kevin.order.PaymentMethod;
import com.ameda.kevin.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
