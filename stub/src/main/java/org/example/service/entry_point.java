package org.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;


import java.time.Duration;

@SpringBootApplication
public class entry_point {



    public static void main(String[] args) {

        System.out.println("JAVA ARGS:::");

        for(String arg:args) {
            System.out.println(arg);
        }

        System.out.println(":::JAVA ARGS");


        SpringApplication.run(entry_point.class, args);
    }
}