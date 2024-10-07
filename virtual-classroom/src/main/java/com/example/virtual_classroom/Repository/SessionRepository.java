package com.example.virtual_classroom.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtual_classroom.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
