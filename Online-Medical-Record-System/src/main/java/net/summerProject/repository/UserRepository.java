package net.summerProject.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import net.summerProject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Optional<User> findById(Long id);
    User findByPassword(String password);
    User findByEmail(String email);
}
