package net.summerProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.summerProject.model.MedicalRecord;
import net.summerProject.model.User;
import net.summerProject.repository.MedicalRecordRepository;
import net.summerProject.repository.UserRepository;

@Service
public class MRServiceImpl {
	@Autowired
	private MedicalRecordRepository medRecordRepository; 

	
	public void save(MedicalRecord medRecord, User user) {
		medRecord.setGender(medRecord.getGender());
		medRecord.setAge(medRecord.getAge());
		medRecord.setHeight(medRecord.getHeight());
		medRecord.setWeight(medRecord.getWeight());
		medRecord.setAddress(medRecord.getAddress());
		medRecord.setPhoneNumber(medRecord.getPhoneNumber());
		medRecord.setCountryOfOrigin(medRecord.getCountryOfOrigin());
		medRecord.setOccupation(medRecord.getOccupation());
		medRecord.setMaritalStatus(medRecord.getMaritalStatus());
		medRecord.setNextOfKinName(medRecord.getNextOfKinName());
		medRecord.setNextOfKinRelationship(medRecord.getNextOfKinRelationship());
		medRecord.setNextOfKinNumber(medRecord.getNextOfKinNumber());
		
		medRecord.setBloodType(medRecord.getBloodType());
		medRecord.setChronicIllnesses(medRecord.getChronicIllnesses());
		medRecord.setPastImmunisations(medRecord.getPastImmunisations());
		medRecord.setAllergies(medRecord.getAllergies());
		medRecord.setFamilyMembersIllnesses(medRecord.getFamilyMembersIllnesses());
		medRecord.setPastAccidents(medRecord.getPastAccidents());
		medRecord.setDisabilities(medRecord.getDisabilities());
		medRecord.setPastMajorOperations(medRecord.getPastMajorOperations());
		medRecord.setCurrentMedication(medRecord.getCurrentMedication());
		
		medRecord.setNameOfPreviousGP(medRecord.getNameOfPreviousGP());
		medRecord.setNameOfPreviousMedicalPractice(medRecord.getNameOfPreviousMedicalPractice());
		
		medRecord.setDoYouSmoke(medRecord.getDoYouSmoke());
		medRecord.setHowManyCigarettesPerDay(medRecord.getHowManyCigarettesPerDay());
		medRecord.setDoYouDrink(medRecord.getDoYouDrink());
		medRecord.setHowManyUnitsPerWeekDoYouDrink(medRecord.getHowManyUnitsPerWeekDoYouDrink());
		medRecord.setDoYouEatFattyFoods(medRecord.getDoYouEatFattyFoods());
		medRecord.setDoYouExercise(medRecord.getDoYouExercise());
		medRecord.setHowManyTimesAWeekDoYouExercise(medRecord.getHowManyTimesAWeekDoYouExercise());
		
	    // medRecord.setUser(user.getId());
		// medRecord.getUser().setMedicalId(medRecord);
		medRecordRepository.save(medRecord);
	}
}
