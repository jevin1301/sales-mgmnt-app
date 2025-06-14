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

@Controller("/customers")
public class CustomerController {

    private final Map<Integer, String> customers = new HashMap<>();

    @Get("/")      //get customer
    public Collection<String> getAllCustomers() {
        return customers.values();
    }

    @Get("/{id}")    //get specific customer
    public String getCustomer(int id) {
        return customers.getOrDefault(id, "Customer not found");
    }

    @Post("/")       //add customer
    public String addCustomer(@Body String name) {
        int id = customers.size() + 1;
        customers.put(id, name);
        return "Customer added with ID: " + id;
    }

    @Put("/{id}")     //update customer info
    public String updateCustomer(int id, @Body String name) {
        if (customers.containsKey(id)) {
            customers.put(id, name);
            return "Customer updated";
        }
        return "Customer not found";
    }

    @Delete("/{id}")     //delete customer
    public String deleteCustomer(int id) {
        if (customers.remove(id) != null) {
            return "Customer deleted";
        }
        return "Customer not found";
    }
}

