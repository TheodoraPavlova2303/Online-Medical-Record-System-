package net.summerProject.service;

import java.util.Optional;

import net.summerProject.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
    Optional<User> findById(Long id);
    User findByPassword(String password);
} 