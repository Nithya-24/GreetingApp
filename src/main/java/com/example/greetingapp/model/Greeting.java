package com.example.greetingapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Setter
@Getter

public class Greeting {

    private String message;
    private long id;

}