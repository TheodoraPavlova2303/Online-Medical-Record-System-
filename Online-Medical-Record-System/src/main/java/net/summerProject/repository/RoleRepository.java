package net.summerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerProject.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
