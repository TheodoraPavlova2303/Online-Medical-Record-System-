package net.summerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerProject.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
