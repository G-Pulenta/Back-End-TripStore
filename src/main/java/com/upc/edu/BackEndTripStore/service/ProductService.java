package com.upc.edu.BackEndTripStore.service;

import com.upc.edu.BackEndTripStore.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product saveProduct(Product product);
    void deleteProduct(int id);
    Double getProductRatingById(int id);
}
