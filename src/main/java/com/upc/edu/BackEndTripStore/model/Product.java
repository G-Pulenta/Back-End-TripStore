package com.upc.edu.BackEndTripStore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name", nullable = false, length = 50)
    private String productName;

    @Column(name = "product_description", nullable = false, length = 250)
    private String productDescription;

    @Column(name = "product_price", nullable = false, length = 10)
    private Double productPrice;

    @Column(name = "product_image", nullable = false, length = 250)
    private String productImage;

    @Column(name = "product_rating", nullable = false, length = 10)
    private Double productRating;
}
