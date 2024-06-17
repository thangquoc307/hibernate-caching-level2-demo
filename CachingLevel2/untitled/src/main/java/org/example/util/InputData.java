package org.example.util;

import java.util.Scanner;

public class InputData {
    private static Scanner scanner = new Scanner(System.in);
    public static String inputString(String field) {
        while (true) {
            System.out.println("Please enter the " + field);
            String input = scanner.nextLine();
            if (!input.isBlank()){
                return input;
            } else {
                System.err.println(field + " is required");
            }
        }
    }
}
