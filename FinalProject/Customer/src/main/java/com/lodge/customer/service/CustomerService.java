package com.lodge.customer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lodge.customer.entity.Customer;
import com.lodge.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	  private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository;

    public Customer registerCustomer(Customer customer)
    {
    	System.out.println("Running");
    	 logger.info("Registering customer: {}", customer.getUserName());
        return customerRepository.save(customer);
    }
    public Customer getCustomerByEmail(String email)
    {
    	  logger.info("Finding customer by email: {}", email);
        return customerRepository.findByEmail(email);
    }
}
