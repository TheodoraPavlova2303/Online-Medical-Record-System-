<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add doctor</title>
</head>
<body>
<h1>Add a doctor 
</h1>
<div class="addingDoctor">
<form:form method="post" action="${contextPath}/addDoctor" modelAttribute="medicalForm" class="addDoctor">
 
    
   <spring:bind path="firstName">
      <div class="form-group">
        <label for="firstName">Doctor's first name:</label><br>
            <form:input type="text" id="firstName" path="firstName" name="firstNameDoctor"></form:input>
              <form:errors path="firstName"></form:errors><br>
      </div>
  </spring:bind>
  
     <spring:bind path="lastName">
      <div class="form-group">
        <label for="lastName">Doctor's last name:</label><br>
            <form:input type="text" id="lastName" path="lastName" name="lastNameDoctor"></form:input>
              <form:errors path="lastName"></form:errors><br>
      </div>
  </spring:bind>
    
  <spring:bind path="specialty">
      <div class="form-group">
        <label for="specialty">Doctor's speciality: </label><br>
           <form:input type="text" path="specialty" id="specialty" name="specialtyDoctor"></form:input>
              <form:errors path="specialty"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="description">
      <div class="form-group">
        <label for="description">Description of the doctor's expertise?</label><br>
           <form:input type="text" path="description" id="description" name="description"></form:input>
              <form:errors path="description"></form:errors><br>
    </div>
  </spring:bind>
  
    <spring:bind path="phoneNumber">
      <div class="form-group">
        <label for="phoneNumber">Doctor's phone number?</label><br>
           <form:input type="text" path="phoneNumber" id="phoneNumber" name="phoneNumberDoctor"></form:input>
              <form:errors path="phoneNumber"></form:errors><br>
    </div>
  </spring:bind>
  
        <spring:bind path="practice">
      <div class="form-group">
        <label for="practice">What is your phone number?</label><br>
           <form:input type="text" path="practice" id="practice" name="doctorsPractice"></form:input>
              <form:errors path="practice"></form:errors><br>
    </div>
  </spring:bind>
  
  
   <form:button class="btn btn-lg btn-primary btn-block" type="submit">Add doctor to list</form:button>
     <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
  
  </form:form>
  
  
</div>

</body>
</html>