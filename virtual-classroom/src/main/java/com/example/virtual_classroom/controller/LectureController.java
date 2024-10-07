package com.example.virtual_classroom.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.virtual_classroom.model.Lecture;
import com.example.virtual_classroom.service.LectureService;

import java.util.List;

@RestController
@RequestMapping("/lectures")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @GetMapping
    public List<Lecture> getAllLectures() {
        return lectureService.getAllLectures();
    }

    @GetMapping("/{id}")
    public Lecture getLectureById(@PathVariable Long id) {
        return lectureService.getLectureById(id);
    }

    @PostMapping
    public Lecture addLecture(@RequestBody Lecture lecture) {
        return lectureService.saveLecture(lecture);
    }
}
