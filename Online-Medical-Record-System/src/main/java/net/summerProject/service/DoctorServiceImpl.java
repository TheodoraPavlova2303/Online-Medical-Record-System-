package net.summerProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.summerProject.model.Doctor;
import net.summerProject.repository.DoctorRepository;

@Service
public class DoctorServiceImpl {
	@Autowired
	private DoctorRepository doctorRepository;
	
	//this method saves the doctor's information 
	//when adding a new doctor (not implemented in final stage)
	
	public void save(Doctor doc) {
		doc.setFirstName(doc.getFirstName());
		doc.setLastName(doc.getLastName());
		doc.setSpecialty(doc.getSpecialty());
		doc.setDescription(doc.getDescription());
		doc.setPhoneNumber(doc.getPhoneNumber());
		doc.setPractice(doc.getPractice());
		doc.setAppointments(doc.getAppointments());
		doc.setUser(doc.getUser());
		
		doctorRepository.save(doc);
	}
	

}
