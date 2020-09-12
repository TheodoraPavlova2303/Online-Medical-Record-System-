package net.summerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerProject.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
