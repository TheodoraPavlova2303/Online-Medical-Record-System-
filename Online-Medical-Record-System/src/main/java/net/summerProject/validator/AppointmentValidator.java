package net.summerProject.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.summerProject.model.Appointment;

@Component
public class AppointmentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Appointment.class.equals(clazz);
	}
	
	// this method validates the appointment details 
	// entered by the user (not implemented in final stage)
	
	@Override
	public void validate(Object target, Errors errors) {
		Appointment appoint = (Appointment) target;
		
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "date", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "time", "NotEmpty");		
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doctor", "NotEmpty");
			
	}

}
