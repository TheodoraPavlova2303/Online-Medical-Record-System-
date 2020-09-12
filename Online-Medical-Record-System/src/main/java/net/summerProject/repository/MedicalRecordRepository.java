package net.summerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerProject.model.MedicalRecord;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

}
