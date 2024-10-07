package com.example.virtual_classroom.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // e.g., ADMIN, INSTRUCTOR, STUDENT

    @OneToMany(mappedBy = "user")
    private Set<ClassEnrollment> enrollments;


    
}





