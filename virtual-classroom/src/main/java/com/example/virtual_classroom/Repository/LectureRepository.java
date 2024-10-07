package com.example.virtual_classroom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtual_classroom.model.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
