package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobService {
    List<Object> getAllPosition();
    Object getPositionById(String id);
}
