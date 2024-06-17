package org.example.repository;

import org.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void createCustomer(Customer customer);
    List<Customer> getAllCustomer();
}
