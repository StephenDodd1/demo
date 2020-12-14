package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    static void myFunc() {
        String j;

        {
            j = "5";
        };

        System.out.println("The number of the day is " + j);
    };
    public static void main(String[] args) {
        myFunc();
    }
};
