package com.affin.product.service;

import com.affin.product.models.ItemLevel;
import com.affin.product.models.Product;
import com.affin.product.models.ProductCategory;
import com.affin.product.models.ProductPrice;
import com.affin.product.record.ProductRequest;
import com.affin.product.record.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
        return Product.builder()
                .id(request.id())
                .name(request.name())
                .description(request.description())
                .productPrice(ProductPrice.builder()
                        .price(request.price())
                        .build())
                .productCategory(ProductCategory.builder()
                        .id(request.categoryId())
                        .build())
                .itemLevel(ItemLevel.builder()
                        .quantity(request.availableQuantity())
                        .build())
                .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getProductPrice().getPrice(),
                product.getProductCategory().getId(),
                product.getItemLevel().getQuantity()
        );
    }
}
