package net.summerProject.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.summerProject.model.Doctor;

@Component
public class DoctorValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Doctor.class.equals(clazz);
	}

	// this method validates the details of a new doctor 
	// added by the user (not implemented in the final stage)
	
	@Override
	public void validate(Object target, Errors errors) {
		Doctor doctor = (Doctor) target; 
		
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "speciality", "NotEmpty");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "NotEmpty");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "practice", "NotEmpty");
		
	}
}
