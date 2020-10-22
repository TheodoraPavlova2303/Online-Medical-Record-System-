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
	
	// this method validates if the medical record's fields which are required are not empty
	
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
   
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "chronicIllnesses", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pastImmunisations", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "allergies", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "familyMembersIllnesses", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "disabilities", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pastMajorOperations", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "currentMedication", "NotEmpty");
   
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doYouSmoke", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doYouDrink", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doYouEatFattyFoods", "NotEmpty");
   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doYouExercise", "NotEmpty");
   
   }
}
