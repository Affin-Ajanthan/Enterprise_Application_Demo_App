package com.affin.product.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class ProductCategory {
    @Id
    private String id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
