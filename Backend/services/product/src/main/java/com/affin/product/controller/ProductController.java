package com.affin.product.controller;

import com.affin.product.models.Product;
import com.affin.product.record.ProductRequest;
import com.affin.product.record.ProductResponse;
import com.affin.product.record.ProductSaleRequest;
import com.affin.product.record.ProductSaleResponse;
import com.affin.product.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public ResponseEntity<String> createProduct(
            @RequestBody @Valid ProductRequest request
    ) {
        return ResponseEntity.ok(service.createProduct(request));
    }

    @PostMapping("/sale")
    public ResponseEntity<List<ProductSaleResponse>> sellProduct(
            @RequestBody List<ProductSaleRequest> request
    ) {
        return ResponseEntity.ok(service.sellProduct(request));
    }

    @GetMapping("productId")
    public ResponseEntity<ProductResponse> findById(
            @PathVariable("productId") String productId
    ) {
        return ResponseEntity.ok(service.findById(productId));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
