package com.affin.product.record;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        String id,
        @NotNull(message = "Product name is required")
        String name,
        String description,
        @NotNull(message = "Product price is required")
        @Positive(message = "Product price should be positive")
        BigDecimal price,
        @NotNull(message = "Product category is required")
        String categoryId,
        @Positive(message = "Available quantity should be positive")
        double availableQuantity
) {
}
