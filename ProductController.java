package com.myproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

@Controller("/products")
public class ProductController {

    private final Map<Integer, String> products = new HashMap<>();

    @Get("/")   //get product
    public Collection<String> getAllProducts() {
        return products.values();
    }

    @Get("/{id}")    //get specific product
    public String getProduct(int id) {
        return products.getOrDefault(id, "Product not found");
    }

    @Post("/")     //add product
    public String addProduct(@Body String name) {
        int id = products.size() + 1;
        products.put(id, name);
        return "Product added with ID: " + id;
    }

    @Put("/{id}")    //update product
    public String updateProduct(int id, @Body String name) {
        if (products.containsKey(id)) {
            products.put(id, name);
            return "Product updated";
        }
        return "Product not found";
    }

    @Delete("/{id}")     //delete product
    public String deleteProduct(int id) {
        if (products.remove(id) != null) {
            return "Product deleted";
        }
        return "Product not found";
    }
}
