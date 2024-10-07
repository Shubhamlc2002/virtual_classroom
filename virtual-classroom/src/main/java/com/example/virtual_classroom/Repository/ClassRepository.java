package com.example.virtual_classroom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtual_classroom.model.Classs;

public interface ClassRepository extends JpaRepository<Classs, Long> {
}
