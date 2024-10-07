package com.example.virtual_classroom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.virtual_classroom.model.Session;
import com.example.virtual_classroom.service.SessionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public Optional<Session> getSessionById(@PathVariable Long id) {
        return sessionService.getSessionById(id);
    }

    @PostMapping
    public Session addSession(@RequestBody Session session) {
        return sessionService.saveSession(session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Long id) {
        sessionService.deleteSession(id);
    }
}
