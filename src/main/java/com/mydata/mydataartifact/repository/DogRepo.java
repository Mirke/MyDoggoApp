package com.mydata.mydataartifact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.mydataartifact.Model.Dog;

/**
 * Repository is an interface that provides access to data in a database
 */
public interface DogRepo extends JpaRepository<Dog, Integer> {
}