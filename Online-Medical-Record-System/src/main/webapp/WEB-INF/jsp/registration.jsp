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

    <title>Registration</title>
    <link href="${contextPath}/resources/css/registration.css" rel="stylesheet">
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

</head>


<body>
<div class="container">
    <div class="wrapper">
         <header>
            <nav>
               <div class="menu-icon">
                  <i class="fa fa-bars fa-2x"></i>
               </div>
               <div class="logo">
                  <img src="${contextPath}/resources/images/logo.png">
               </div>
               <div class="menu">
                  <ul>
                     <li><a href="#">Home</a></li>
                     <li><a href="${contextPath}/about">About</a></li>
                     <li><a href="#">Practices</a></li>
                     <li><a href="#">Contact</a></li>
                  </ul>
               </div>
            </nav>
         </header>
</div>

<div class="d-flex justify-content-right h-100">
		<div class="card">
			<div class="card-header">
			    <h2 class="form-signin-heading">Create your account</h2>
			</div>
		<div class="card-body">
		
    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="User Name"
                            autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>
        
         <spring:bind path="firstName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="firstName" class="form-control" placeholder="First Name"
                            autofocus="true"></form:input>
                <form:errors path="firstName"></form:errors>
            </div>
        </spring:bind>
        
        <spring:bind path="lastName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="lastName" class="form-control" placeholder="Last Name"
                            autofocus="true"></form:input>
                <form:errors path="lastName"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control"
                            placeholder="Confirm your password"></form:input>
                <form:errors path="passwordConfirm"></form:errors>
            </div>
        </spring:bind>
        
         <spring:bind path="email"> 
           <div class="form-group ${status.error ? 'has-error' : ''}">
               <form:input type="email" path="email" class="email" placeholder="E-mail address"></form:input>
               <form:errors path="email"></form:errors>
           </div>
        </spring:bind>
        
        <spring:bind path="dateofbirth"> 
           <div class="form-group ${status.error ? 'has-error' : ''}">
               <form:input type="DOB" path="dateofbirth" class="DOB" placeholder="DD/MM/YEAR"  autofocus="true"></form:input>
               <form:errors path="dateofbirth"></form:errors>
           </div>
        </spring:bind>
        
        <div class="card-footer">
      <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      
    </div>
    </form:form>
    </div>
    </div>
  </div>
  </div>
</body>
</html>