package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.repository.ICustomerRepository;
import org.example.util.InputData;

import java.util.List;

public class CustomerService implements ICustomerService{
    private static ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void createCustomer() {
        String name = InputData.inputString("Name");
        customerRepository.createCustomer(new Customer(name));
    }

    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.getAllCustomer();
        System.out.println("----------------------------------");
        customerList.stream().forEach(customer -> {
            System.out.println("id : " + customer.getId() + " : " + customer.getName());
        });
        System.out.println("----------------------------------");
    }
}
