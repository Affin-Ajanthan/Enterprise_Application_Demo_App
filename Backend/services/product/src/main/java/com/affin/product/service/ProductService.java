package com.affin.product.service;

import com.affin.product.models.Product;
import com.affin.product.record.ProductRequest;
import com.affin.product.record.ProductResponse;
import com.affin.product.record.ProductSaleRequest;
import com.affin.product.record.ProductSaleResponse;
import com.affin.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public String createProduct(ProductRequest request) {
        var product = mapper.toProduct(request);
        return productRepository.save(product).getId();
    }

    public List<ProductSaleResponse> sellProduct(List<ProductSaleRequest> request) {
        return null;
    }

    public ProductResponse findById(String productId) {
        return productRepository.findById(productId)
                .map(mapper::toProductResponse)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with the ID:: " + productId));
    }

    public List<ProductResponse> findAll() {
        return null;
    }
}
