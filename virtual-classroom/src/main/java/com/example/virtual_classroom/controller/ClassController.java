package com.example.virtual_classroom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.virtual_classroom.model.Classs;
import com.example.virtual_classroom.service.ClassService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Classs> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Optional<Classs> getClassById(@PathVariable Long id) {
        return classService.getClassById(id);
    }

    @PostMapping
    public Classs addClass(@RequestBody Classs course) {
        return classService.saveClass(course);
    }

    @PutMapping("/{id}")
    public Classs updateClass(@PathVariable Long id, @RequestBody Classs course) {
        course.setId(id);
        return classService.saveClass(course);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
    }
}

