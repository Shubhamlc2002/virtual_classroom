package com.example.virtual_classroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.virtual_classroom.Repository.ClassRepository;
import com.example.virtual_classroom.model.Classs;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Classs> getAllClasses() {
        return classRepository.findAll();
    }

    public Optional<Classs> getClassById(Long id) {
        return classRepository.findById(id);
    }

    public Classs saveClass(Classs course) {
        return classRepository.save(course);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
