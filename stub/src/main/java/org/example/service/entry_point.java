package org.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class entry_point {

    public static void main(String[] args) {

        System.out.println("JAVA ARGS::: -->");
        System.out.println();

        for(String arg:args) {
            System.out.println(arg);
        }

        System.out.println();
        System.out.println("<-- :::JAVA ARGS");


        SpringApplication.run(entry_point.class, args);
    }
}