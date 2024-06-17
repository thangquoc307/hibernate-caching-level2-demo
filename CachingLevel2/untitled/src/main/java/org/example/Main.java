package org.example;

import org.example.controller.CustomerController;

public class Main {
    public static void main(String[] args) {
        try {
            CustomerController.mainMenu();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}