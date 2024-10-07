package com.example.virtual_classroom.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.virtual_classroom.Repository.LectureRepository;
import com.example.virtual_classroom.model.Lecture;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }

    public Lecture getLectureById(Long id) {
        return lectureRepository.findById(id).orElse(null);
    }

    public Lecture saveLecture(Lecture lecture) {
        return lectureRepository.save(lecture);
    }
}
