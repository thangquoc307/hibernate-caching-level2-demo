package org.example.controller;

import org.example.service.CustomerService;
import org.example.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);
    public static void mainMenu() {
        while (true) {
            menuTable();
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> customerService.createCustomer();
                case "2" -> customerService.displayCustomer();
                case "0" -> {return;}
                default -> System.err.println("option " + input + " is not exist");
            }

        }
    }
    private static void menuTable() {
        System.out.println("1. create customer");
        System.out.println("2. show all customer");
        System.out.println("0. exit");
        System.out.print("Please choose your option : ");
    }
}
