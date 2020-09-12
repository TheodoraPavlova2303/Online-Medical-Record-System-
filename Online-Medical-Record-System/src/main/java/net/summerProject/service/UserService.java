package net.summerProject.service;

import net.summerProject.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
