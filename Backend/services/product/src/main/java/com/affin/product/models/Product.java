package com.affin.product.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    @OneToOne(mappedBy = "product", cascade = CascadeType.REMOVE)
    private ProductPrice productPrice;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;
    @OneToOne(mappedBy = "product", cascade = CascadeType.REMOVE)
    private ItemLevel itemLevel;
}
