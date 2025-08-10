package com.affin.product.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class ProductPrice {
    @Id
    private String id;
    private BigDecimal price;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Product product;
}
