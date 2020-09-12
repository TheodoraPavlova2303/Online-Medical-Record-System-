<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
   <head>
      <body>
         <div>
         <h1>Link list</h1>
             <ul>
               <li><a href="${contextPath}/medicalFormCreate">Create your medical form</a></li>
               <li><a href="${contextPath}/medicalFormView">View your medical record</a></li>  
               <li><a href="${contextPath}/appointmentBooking">Book an appointment with a doctor</a></li>  
            </ul>
         </div>
      </body>
   </head>
</html>

