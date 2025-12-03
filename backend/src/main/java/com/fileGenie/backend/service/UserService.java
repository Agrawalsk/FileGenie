package com.fileGenie.backend.service;


import com.fileGenie.backend.entity.User;
import com.fileGenie.backend.repositary.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public User register(String username, String rawPassword) {
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already taken");
        }
        String hashed = passwordEncoder.encode(rawPassword);
        User user = new User(username, hashed, "USER");
        return userRepository.save(user);
    }
}
