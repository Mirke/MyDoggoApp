package com.mydata.mydataartifact.Model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An entity class represents a table in a relational database
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "dog")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}