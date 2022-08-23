package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> Customers;

    public List<Customer> getCustomers(){
        return Customers;

    }
    public getCustomerByID(String ID){
        return Customer;
    }
}
