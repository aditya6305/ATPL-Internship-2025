package com.example.spring_boot.Service;

import org.springframework.stereotype.Service;

import com.example.spring_boot.Model.Product;

import java.util.*;

@Service
public class ProductService {
    private Map<Integer, Product> products = new HashMap<>();

    public ProductService() {
        products.put(1, new Product(1, "Laptop", 50000));
        products.put(2, new Product(2, "Iphone", 25000));
        products.put(3, new Product(3, "Car", 1500000));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public Product getProductById(Integer id) {
        return products.get(id);
    }

    public Product saveProduct(Product product) {
        products.put(product.getId(), product);
        return product;
    }

    public Product updateProduct(Integer id, Product product) {
        if (products.containsKey(id)) {
            product.setId(id);
            products.put(id, product);
            return product;
        }
        return null;
    }

    public boolean deleteProduct(Integer id) {
        return products.remove(id) != null;
    }

    public boolean existsById(Integer id) {
        return products.containsKey(id);
    }
}