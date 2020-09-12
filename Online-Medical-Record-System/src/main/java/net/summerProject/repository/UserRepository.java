package net.summerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerProject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
