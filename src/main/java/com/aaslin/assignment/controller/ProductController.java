package com.aaslin.assignment.controller;

import com.aaslin.assignment.model.Product;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private List<Product> products = new ArrayList<>();
    
    public ProductController() {
        products.add(new Product(1, "Laptop", 10000.00));
        products.add(new Product(2, "Phone", 5000.00));
        products.add(new Product(3, "Tablet", 1290.00));
    }
    // to retrive all the listed products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }
    //to retrieve products based on id of the product
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    
    // to add a product into the list 
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
    
    //to update a product based on id of the product.we need to provide the product id in the url and give the name and price parameters in json format in the body.
    
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                updatedProduct.setId(id);
                products.set(i, updatedProduct);
                return updatedProduct;
            }
        }
        return null;
    }
    // to delete a product based on product id.
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return "Product deleted";
            }
        }
        return "Product not found";
    }
}
