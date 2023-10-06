package com.example.demo.service;

import com.example.demo.model.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService {
    AppUser findByUsername(String userName);
}
