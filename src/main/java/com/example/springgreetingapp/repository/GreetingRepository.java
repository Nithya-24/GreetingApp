package com.example.springgreetingapp.repository;

import com.example.springgreetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// We have created this interface that extends the Jpa Repository to use the methods of the Hibernate ORM.
@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}