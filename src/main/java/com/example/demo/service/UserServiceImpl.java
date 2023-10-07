package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public String validateUser(String username, String password) {
        String message = "";
        User user = userRepository.findByUsername(username);
        if (user != null) {
            if(!BCrypt.checkpw(password, user.getPassword())){
                message = "Password invalid!";
            } else {
                message = "Login success!";
            }
        } else {
            message = "Please register first!";
        }
        return message;
    }
}
