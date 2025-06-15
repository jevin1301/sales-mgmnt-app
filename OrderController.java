package com.myproject;

import io.micronaut.http.annotation.*;
import java.util.*;

@Controller("/orders")
public class OrderController {

    private final Map<Integer, String> orders = new HashMap<>();

    @Get("/")
    public Collection<String> getAllOrders() {
        return orders.values();
    }

    @Get("/{id}")
    public String getOrder(int id) {
        return orders.getOrDefault(id, "Order not found");
    }

    @Post("/")
    public String createOrder(@Body String orderDetails) {
        int id = orders.size() + 1;
        orders.put(id, orderDetails);
        return "Order placed with ID: " + id;
    }

    @Delete("/{id}")
    public String deleteOrder(int id) {
        if (orders.remove(id) != null) {
            return "Order deleted";
        }
        return "Order not found";
    }
}

