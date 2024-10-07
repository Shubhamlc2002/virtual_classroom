package com.example.virtual_classroom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtual_classroom.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
