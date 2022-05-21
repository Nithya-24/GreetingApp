package com.example.springgreetingapp.service;

import com.example.springgreetingapp.entity.Greeting;
import com.example.springgreetingapp.entity.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);

    List<Greeting> getAll();

    Greeting getGreetingById(long id);

    Greeting updateGreeting(Greeting greeting);
}