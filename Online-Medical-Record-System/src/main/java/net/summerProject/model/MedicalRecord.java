package net.summerProject.model;

import javax.persistence.*;

@Entity
@Table(name = "medicalRecord")
public class MedicalRecord  {

	@Id 
	@Column(name = "id")
	private Long id;
    
	
    //personal information 
    
    private String gender; //special 
    private int age;
	private double height; 
	private double weight;
	private String address; //special 
	private String phoneNumber;
	private String countryOfOrigin; //special 
	private String occupation;
	private String maritalStatus;   //special 
	private String nextOfKinName; 
	private String nextOfKinRelationship; 
	private String nextOfKinNumber; 
	
	
	// further medical information 
	private String bloodType; 
	private String chronicIllnesses;
	private String pastImmunisations;
    private String allergies; 
    private String familyMembersIllnesses;
	private String pastAccidents; 
    private String disabilities; 
    private String pastMajorOperations; 
    private String currentMedication; 
    
    // previous medical history if any
	
	private String nameOfPreviousGP; 
	private String nameOfPreviousMedicalPractice;
	
	
    //smoke/alcohol/diet/exercise habits 
    
    private String doYouSmoke; //special
    private int howManyCigarettesPerDay; //optional
    private String doYouDrink; 
    private int howManyUnitsPerWeekDoYouDrink;
    private String doYouEatFattyFoods;
    private String doYouExercise; 
    private int howManyTimesAWeekDoYouExercise; 
    
    
    @OneToOne
    @MapsId
    private User user; 
   
	
 // getters and setters
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNextOfKinName() {
		return nextOfKinName;
	}

	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}

	public String getNextOfKinRelationship() {
		return nextOfKinRelationship;
	}

	public void setNextOfKinRelationship(String nextOfKinRelationship) {
		this.nextOfKinRelationship = nextOfKinRelationship;
	}

	public String getNextOfKinNumber() {
		return nextOfKinNumber;
	}

	public void setNextOfKinNumber(String nextOfKinNumber) {
		this.nextOfKinNumber = nextOfKinNumber;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getChronicIllnesses() {
		return chronicIllnesses;
	}

	public void setChronicIllnesses(String chronicIllnesses) {
		this.chronicIllnesses = chronicIllnesses;
	}

	public String getPastImmunisations() {
		return pastImmunisations;
	}

	public void setPastImmunisations(String pastImmunisations) {
		this.pastImmunisations = pastImmunisations;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getPastAccidents() {
		return pastAccidents;
	}

	public void setPastAccidents(String pastAccidents) {
		this.pastAccidents = pastAccidents;
	}

	public String getDisabilities() {
		return disabilities;
	}

	public void setDisabilities(String disabilities) {
		this.disabilities = disabilities;
	}

	public String getPastMajorOperations() {
		return pastMajorOperations;
	}

	public void setPastMajorOperations(String pastMajorOperations) {
		this.pastMajorOperations = pastMajorOperations;
	}

	public String getCurrentMedication() {
		return currentMedication;
	}

	public void setCurrentMedication(String currentMedication) {
		this.currentMedication = currentMedication;
	}

	public String getNameOfPreviousMedicalPractice() {
		return nameOfPreviousMedicalPractice;
	}

	public void setNameOfPreviousMedicalPractice(String nameOfPreviousMedicalPractice) {
		this.nameOfPreviousMedicalPractice = nameOfPreviousMedicalPractice;
	}

	public String getDoYouSmoke() {
		return doYouSmoke;
	}

	public void setDoYouSmoke(String doYouSmoke) {
		this.doYouSmoke = doYouSmoke;
	}

	public int getHowManyCigarettesPerDay() {
		return howManyCigarettesPerDay;
	}

	public void setHowManyCigarettesPerDay(int howManyCigarettesPerDay) {
		this.howManyCigarettesPerDay = howManyCigarettesPerDay;
	}

	public String getDoYouDrink() {
		return doYouDrink;
	}

	public void setDoYouDrink(String doYouDrink) {
		this.doYouDrink = doYouDrink;
	}

	public int getHowManyUnitsPerWeekDoYouDrink() {
		return howManyUnitsPerWeekDoYouDrink;
	}

	public void setHowManyUnitsPerWeekDoYouDrink(int howManyUnitsPerWeekDoYouDrink) {
		this.howManyUnitsPerWeekDoYouDrink = howManyUnitsPerWeekDoYouDrink;
	}

	public String getDoYouEatFattyFoods() {
		return doYouEatFattyFoods;
	}

	public void setDoYouEatFattyFoods(String doYouEatFattyFoods) {
		this.doYouEatFattyFoods = doYouEatFattyFoods;
	}


	public String getDoYouExercise() {
		return doYouExercise;
	}

	public void setDoYouExercise(String doYouExercise) {
		this.doYouExercise = doYouExercise;
	}

	public int getHowManyTimesAWeekDoYouExercise() {
		return howManyTimesAWeekDoYouExercise;
	}

	public void setHowManyTimesAWeekDoYouExercise(int howManyTimesAWeekDoYouExercise) {
		this.howManyTimesAWeekDoYouExercise = howManyTimesAWeekDoYouExercise;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFamilyMembersIllnesses() {
		return familyMembersIllnesses;
	}

	public void setFamilyMembersIllnesses(String familyMembersIllnesses) {
		this.familyMembersIllnesses = familyMembersIllnesses;
	}

	public String getNameOfPreviousGP() {
		return nameOfPreviousGP;
	}

	public void setNameOfPreviousGP(String nameOfPreviousGP) {
		this.nameOfPreviousGP = nameOfPreviousGP;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}