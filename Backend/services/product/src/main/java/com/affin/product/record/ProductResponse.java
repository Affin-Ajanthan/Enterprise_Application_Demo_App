package com.affin.product.record;

import com.affin.product.models.ItemLevel;
import com.affin.product.models.ProductCategory;
import com.affin.product.models.ProductPrice;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductResponse(
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
