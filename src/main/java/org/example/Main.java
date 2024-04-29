package org.example;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Load properties file
        Properties properties = new Properties();
        try (InputStream inputStream = Main.class.getResourceAsStream("/config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Access and print the value of the s3key property
        String s3key = properties.getProperty("s3key");
        System.out.println("s3key value: " + s3key);

        // Your existing code
        System.out.println("Hello world!");
    }
}
