package org.example;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Your existing code
        if (args.length > 0) {
            // Print all command-line arguments
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
        System.out.println("Hello world!");
    }
}
