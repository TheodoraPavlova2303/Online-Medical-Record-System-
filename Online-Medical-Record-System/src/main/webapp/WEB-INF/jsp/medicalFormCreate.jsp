<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>
    <link href="${contextPath}/resources/css/medicalFormCreate.css" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

</head>
   
   
<body>

<div class="mrf">
 
 <form:form method="post" action="${contextPath}/medicalFormCreate" modelAttribute="medicalForm" class="mdform">
 
  <spring:bind path="gender">
    <div class="form-group">
      <label for="gender">Select your gender:</label><br>
         <label for="male">Male</label>
           <form:radiobutton path="gender" id="male" name="gender" value="male"></form:radiobutton>
        <label for="female">Female</label>
           <form:radiobutton path="gender" id="female" name="gender" value="female"></form:radiobutton>
            <form:errors path="gender"></form:errors><br>
   </div>
 </spring:bind>
    
   <spring:bind path="age">
      <div class="form-group">
        <label for="age">What is your age</label><br>
            <form:input type="number" id="age" path="age" name="age"></form:input>
              <form:errors path="age"></form:errors><br>
      </div>
  </spring:bind>
    
  <spring:bind path="height">
      <div class="form-group">
        <label for="height">What is your height?</label><br>
           <form:input type="text" path="height" id="height" name="height"></form:input>
              <form:errors path="height"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="weight">
      <div class="form-group">
        <label for="weight">What is your weight?</label><br>
           <form:input type="text" path="weight" id="weight" name="weight"></form:input>
              <form:errors path="weight"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="address">
      <div class="form-group">
        <label for="address">What is your address?</label><br>
        
  <form:input type="street" 
         path="address"
         class="form-control" 
         id="autocomplete" 
         placeholder="Street"></form:input>
  
  <form:input type="street" 
         path="address"
         class="form-control" 
         id="autocomplete" ></form:input>
  
  <form:input type="city" 
         path="address"
         class="form-control" 
         id="inputCity" 
         placeholder="City"></form:input>
  
  <form:input type="postcode" 
         path="address"
         class="form-control" 
         id="inputpostcode" 
         placeholder="Postcode"></form:input>
  
  <form:input type="county" 
         path="address"
         class="form-control" 
         id="inputCounty" 
         placeholder="County"></form:input>
           
  <form:errors path="address"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="phoneNumber">
      <div class="form-group">
        <label for="phoneNumber">What is your phone number?</label><br>
           <form:input type="text" path="phoneNumber" id="phoneNumber" name="phoneNumber"></form:input>
              <form:errors path="phoneNumber"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="countryOfOrigin">
      <div class="form-group">
        <label for="countryOfOrigin">What is your country of origin?</label><br>
           <form:input type="text" path="countryOfOrigin" id="countryOfOrigin" name="countryOfOrigin"></form:input>
              <form:errors path="countryOfOrigin"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="occupation">
      <div class="form-group">
        <label for="occupation">What is your occupation?</label><br>
           <form:input type="text" path="occupation" id="occupation" name="occupation"></form:input>
              <form:errors path="occupation"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="maritalStatus">
      <div class="form-group">
        <label for="maritalStatus">What is your maritial status?</label><br>
           <form:select path="maritalStatus" id="maritialStatus" name="maritalStatus">
           <option value="Single">Single</option>
            <option value="In a relationship">In a relationship</option>
           <option value="Married">Married</option>
           <option value="Separated">Separated</option>
           <option value="Divorced">Divorced</option>
           <option value="Widowed">Widowed</option>
           <option value="Prefer not to say">Prefer not to say</option>
           </form:select>
              <form:errors path="maritalStatus"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="nextOfKinName">
      <div class="form-group">
        <label for="nextOfKinName">Next of kin name?</label><br>
           <form:input type="text" path="nextOfKinName" id="nextOfKinName" name="nextOfKinName"></form:input>
              <form:errors path="nextOfKinName"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="nextOfKinRelationship">
      <div class="form-group">
        <label for="nextOfKinRelationship">Relationship with the above next of kin?</label><br>
           <form:input type="text" path="nextOfKinRelationship" id="nextOfKinRelationship" name="nextOfKinRelationship"></form:input>
              <form:errors path="nextOfKinRelationship"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="nextOfKinNumber">
      <div class="form-group">
        <label for="phoneNumber">Next of kin number?</label><br>
           <form:input type="text" path="nextOfKinNumber" id="nextOfKinNumber" name="nextOfKinNumber"></form:input>
              <form:errors path="nextOfKinNumber"></form:errors><br>
    </div>
  </spring:bind>
  
                
  
     <spring:bind path="bloodType">
      <div class="form-group">
        <label for="bloodType">What is your blood type?</label><br>
         <label for="A">A+</label>
           <form:radiobutton path="bloodType" id="A" name="A" value="A+"></form:radiobutton>
        <label for="A-">A-</label>
           <form:radiobutton path="bloodType" id="AA" name="AA" value="A-"></form:radiobutton><br>
            <label for="B">B+</label>
           <form:radiobutton path="bloodType" id="B" name="B" value="B+"></form:radiobutton>
        <label for="BB">B-</label>
           <form:radiobutton path="bloodType" id="BB" name="BB" value="B-"></form:radiobutton><br>
            <label for="A">AB+</label>
           <form:radiobutton path="bloodType" id="A" name="A" value="AB+"></form:radiobutton>
        <label for="A-">AB-</label>
           <form:radiobutton path="bloodType" id="AA" name="AA" value="AB-"></form:radiobutton><br>
            <label for="B">0+</label>
           <form:radiobutton path="bloodType" id="B" name="B" value="0+"></form:radiobutton>
        <label for="BB">0-</label>
           <form:radiobutton path="bloodType" id="BB" name="BB" value="0-"></form:radiobutton><br>
            
              <form:errors path="bloodType"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="chronicIllnesses">
      <div class="form-group">
        <label for="chronicIllnesses">List any chronic illnesses?</label><br>
           <form:input type="text" path="chronicIllnesses" id="chronicIllnesses" name="chronicIllnesses"></form:input>
              <form:errors path="chronicIllnesses"></form:errors><br>
    </div>
  </spring:bind>
  
     <spring:bind path="pastImmunisations">
      <div class="form-group">
        <label for="pastImmunisations">What past immunisations have you had?</label><br>
           <form:input type="text" path="pastImmunisations" id="pastImmunisations" name="pastImmunisations"></form:input>
              <form:errors path="pastImmunisations"></form:errors><br>
    </div>
  </spring:bind>

  
     <spring:bind path="allergies">
      <div class="form-group">
        <label for="allergies">List any known allergies you have?</label><br>
           <form:input type="text" path="allergies" id="allergies" name="allergies"></form:input>
              <form:errors path="allergies"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="familyMembersIllnesses">
      <div class="form-group">
        <label for="familyMembersIllnesses">List any illnesses of you family members?</label><br>
           <form:input type="text" path="familyMembersIllnesses" id="familyMembersIllnesses" name="familyMembersIllnesses"></form:input>
              <form:errors path="familyMembersIllnesses"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="pastAccidents">
      <div class="form-group">
        <label for="pastAccidents">Have you had any past accidents?</label><br>
           <form:input type="text" path="pastAccidents" id="pastAccidents" name="pastAccidents"></form:input>
              <form:errors path="pastAccidents"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="disabilities">
      <div class="form-group">
        <label for="disabilities">Do you have any disabilities?</label><br>
           <form:input type="text" path="disabilities" id="disabilities" name="disabilities"></form:input>
              <form:errors path="disabilities"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="pastMajorOperations">
      <div class="form-group">
        <label for="pastMajorOperations">List any past major operations?</label><br>
           <form:input type="text" path="pastMajorOperations" id="pastMajorOperations" name="pastMajorOperations"></form:input>
              <form:errors path="pastMajorOperations"></form:errors><br>
    </div>
  </spring:bind>
  
      <spring:bind path="currentMedication">
      <div class="form-group">
        <label for="currentMedication">What medications are you currently taking?</label><br>
           <form:input type="text" path="currentMedication" id="currentMedication" name="currentMedication"></form:input>
              <form:errors path="currentMedication"></form:errors><br>
    </div>
  </spring:bind>
    
    
                                 
      <spring:bind path="nameOfPreviousMedicalPractice">
      <div class="form-group">
        <label for="nameOfPreviousMedicalPractice">Name of your previous medical practice?</label><br>
           <form:input type="text" path="nameOfPreviousMedicalPractice" id="nameOfPreviousMedicalPractice" name="nameOfPreviousMedicalPractice"></form:input>
              <form:errors path="nameOfPreviousMedicalPractice"></form:errors><br>
    </div>
  </spring:bind>
  
        <spring:bind path="nameOfPreviousGP">
      <div class="form-group">
        <label for="nameOfPreviousGP">Name of your previous GP?</label><br>
           <form:input type="text" path="nameOfPreviousGP" id="nameOfPreviousGP" name="nameOfPreviousGP"></form:input>
              <form:errors path="nameOfPreviousGP"></form:errors><br>
    </div>
  </spring:bind>
  
                            
  
       <spring:bind path="doYouSmoke">
      <div class="form-group">
        <label for="doYouSmoke">Do you smoke?</label><br>
           <form:select path="doYouSmoke" id="doYouSmoke" name="doYouSmoke">
           <option value="Yes">Yes</option>
           <option value="No">No</option>
           </form:select>
              <form:errors path="doYouSmoke"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="howManyCigarettesPerDay">
      <div class="form-group">
        <label for="howManyCigarettesPerDay">If yes, how many cigarettes per day do you smoke ?</label><br>
           <form:input type="text" path="howManyCigarettesPerDay" id="howManyCigarettesPerDay" name="howManyCigarettesPerDay"></form:input>
              <form:errors path="howManyCigarettesPerDay"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="doYouDrink">
      <div class="form-group">
        <label for="doYouDrink">Do you drink alcohol?</label><br>
           <form:select path="doYouDrink" id="doYouDrink" name="doYouDrink">
           <option value="Yes">Yes</option>
           <option value="No">No</option>
           </form:select>
              <form:errors path="doYouDrink"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="howManyUnitsPerWeekDoYouDrink">
      <div class="form-group">
        <label for="howManyUnitsPerWeekDoYouDrink">If yes, how many alcohol units per week do you drink?</label><br>
           <form:input type="text" path="howManyUnitsPerWeekDoYouDrink" id="howMuchPerWeek" name="howMuchPerWeek"></form:input>
              <form:errors path="howManyUnitsPerWeekDoYouDrink"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="doYouEatFattyFoods">
      <div class="form-group">
        <label for="doYouEatFattyFoods">Do you eat fatty foods?</label><br>
           <form:select path="doYouEatFattyFoods" id="doYouEatFattyFoods" name="doYouEatFattyFoods">
           <option value="Yes">Yes</option>
           <option value="No">No</option>
           </form:select>
              <form:errors path="doYouEatFattyFoods"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="doYouExercise">
      <div class="form-group">
        <label for="doYouExercise">Do you exercise?</label><br>
           <form:select path="doYouExercise" id="doYouExercise" name="doYouExercise">
           <option value="Yes">Yes</option>
           <option value="No">No</option>
           </form:select>
              <form:errors path="doYouExercise"></form:errors><br>
    </div>
  </spring:bind>
  
       <spring:bind path="howManyTimesAWeekDoYouExercise">
      <div class="form-group">
        <label for="howManyTimesAWeekDoYouExercise">How many days times a week do you exercise?</label><br>
           <form:select path="howManyTimesAWeekDoYouExercise" id="howManyTimesAWeekDoYouExercise" name="howManyTimesAWeekDoYouExercise">
            <option value="0">0</option>
           <option value="1">1</option>
           <option value="2">2</option>
           <option value="3">3</option>
           <option value="4">4</option>
           <option value="5">5</option>
           <option value="6">6</option>
           <option value="7">7</option>
           <option value="7+">7+</option>
           </form:select>
              <form:errors path="howManyTimesAWeekDoYouExercise"></form:errors><br>
    </div>
  </spring:bind>
  
  
  
  
  <form:button class="btn btn-lg btn-primary btn-block" type="submit">Submit</form:button>
     <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
</form:form>

</div>
</body>
</html>