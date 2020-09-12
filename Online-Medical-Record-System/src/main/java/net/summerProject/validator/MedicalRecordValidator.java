package net.summerProject.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.summerProject.model.MedicalRecord;

@Component
public class MedicalRecordValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MedicalRecord.class.equals(clazz);
	}
   @Override
	public void validate(Object target, Errors errors) {
		MedicalRecord medicalRecord = (MedicalRecord) target;
		
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "height", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryOfOrigin", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nextOfKinName", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nextOfKinRelationship", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nextOfKinNumber", "NotEmpty");
   
   }

}
