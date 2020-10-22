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
   
    <title>Welcome to your account</title>
    
    <!-- The reference for the css page -->
    <link href="${contextPath}/resources/css/welcome.css" rel="stylesheet">
    
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
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                       <form id="logoutForm" method="POST" action="${contextPath}/login">
                          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                       </form>
                           <h3>Welcome ${pageContext.request.userPrincipal.name}</h3>
                    </c:if>
             
               <div class="menu">
                  <ul>
                     <li><a href="${contextPath}/login">Logout</a></li>
                  </ul>
               </div>
            </nav>
         </header>
    </div>

        <!-- Buttons redirecting to create Medical Record and view Medical Record pages  -->
         <div class ="main-buttons">
               <a href="${contextPath}/medicalFormCreate" class="button">Create your medical form</a>
               <a href="${contextPath}/medicalFormView" class="button">View your medical record</a>   
         </div>
       </div>
    </body>
</html>

