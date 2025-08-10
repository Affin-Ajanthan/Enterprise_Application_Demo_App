package com.affin.product.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class ItemLevel {
    @Id
    private String id;
    private double quantity;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Product product;
}
