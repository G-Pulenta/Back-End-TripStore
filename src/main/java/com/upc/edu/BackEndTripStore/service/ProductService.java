package com.upc.edu.BackEndTripStore.service;

import com.upc.edu.BackEndTripStore.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product saveProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);

    Product getProductByProductName(String productName);
    Product getProductByCategory(String category);
    Product getProductByRating(Double rating);
}
