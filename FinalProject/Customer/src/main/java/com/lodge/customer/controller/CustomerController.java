package com.lodge.customer.controller;

import com.lodge.customer.entity.Customer;
import com.lodge.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/customers")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer)
    {
    	 logger.info("Request to register customer: {}", customer.getUserName());
    	
        return ResponseEntity.ok(customerService.registerCustomer(customer));
    }
    @GetMapping("/find")
    public ResponseEntity<Customer> getCustomerByEmail(@RequestParam String email)
    {
    	logger.info("Request to get customer by email: {}", email);
        return ResponseEntity.ok(customerService.getCustomerByEmail(email));
    }
}
