package com.example.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "Hello World !!";
    }

    public String getGreetingMessage(String fName, String lName) {
        return "Hello " + fName + " " + lName;
    }

    public String postGreetingMessage(String fName, String lName) {
        return "Hello " + fName + " " + lName;
    }
}
