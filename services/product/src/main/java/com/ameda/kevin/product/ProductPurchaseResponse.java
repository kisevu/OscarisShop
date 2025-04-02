package com.ameda.kevin.product;

import java.math.BigDecimal;

public record ProductPurchaseResponse(
        Integer productId,
        String name,
        String description,
        double quantity,
        BigDecimal price
) {
}
