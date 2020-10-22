<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!-- The template used for the navbar is from: 
https://bootsnipp.com/snippets/kl8Q3 -->

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
    
    <!-- The reference for the css page -->
    <link href="${contextPath}/resources/css/login.css" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

</head>

<body>
   <div class="container">
     <div class="wrapper">
         <header>
         <!-- The navigation bar settings -->
         <!-- The template used for the navbar is from: 
               https://bootsnipp.com/snippets/kl8Q3 -->
            <nav>
               <div class="menu-icon">
                  <i class="fa fa-bars fa-2x"></i>
               </div>
               <div class="logo">
                  <img src="${contextPath}/resources/images/logo.png">
               </div>
               <div class="menu">
                  <ul>
                     <li><a href="${contextPath}/login">Home</a></li>
                  </ul>
               </div>
            </nav>
         </header>
     </div>
         
         
   <!-- Source of login card is: https://bootsnipp.com/snippets/vl4R7 -->
   
	<div class="d-flex justify-content-right h-100">
		<div class="card">
			<div class="card-header">
				<h3>Log In</h3>
			</div>
			<div class="card-body">
			
	<!-- The login POST form -->
			
    <form method="POST" action="${contextPath}/login" class="form-signin">
		   
        <div class="input-group form-group ${error != null ? 'has-error' : ''}"> <!-- Validation checking for error -->
            <div class="input-group-prepend"> 
            <span class="input-group-text"><i class="fas fa-user"></i>${message}</span>
            </div>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
        </div> 
        
         <div class="input-group form-group">
            <div class="input-group-prepend">
               <span class="input-group-text"><i class="fas fa-key"></i>${error}</span>
           </div>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
           </div>
           
           <div class="row align-items-center remember">
				<input type="checkbox">Remember Me
		   </div>
		   <div class="form-group">
            <button class="btn float-right login_btn" type="submit">Log In</button>
       </div>
    </form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="${contextPath}/registration">Create an account</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
