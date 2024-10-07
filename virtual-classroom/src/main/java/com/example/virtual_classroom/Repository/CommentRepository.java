package com.example.virtual_classroom.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtual_classroom.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
 