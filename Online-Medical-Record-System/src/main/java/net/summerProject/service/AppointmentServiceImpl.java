package net.summerProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.summerProject.model.Appointment;
import net.summerProject.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl {
	@Autowired
	private AppointmentRepository appointRepository; 
	
	public void save(Appointment appoint) {
		appoint.setDate(appoint.getDate());
		appoint.setTime(appoint.getTime());
		appoint.setDescription(appoint.getDescription());;
		appoint.setDoctor(appoint.getDoctor());
		appoint.setUser(appoint.getUser());
		
		appointRepository.save(appoint);
	}

}
