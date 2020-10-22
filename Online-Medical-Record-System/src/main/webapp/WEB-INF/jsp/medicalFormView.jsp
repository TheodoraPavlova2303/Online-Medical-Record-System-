<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!-- H2 Database connection imports and parameters-->
<!-- The template for the creating of the database connection comes from this website
 https://www.roseindia.net/jsp/how-to-retrieve-data-from-database-in-jsp.shtml -->

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("mrId");
String driverName = "org.h2.Driver";
String connectionUrl = "jdbc:h2:~/medical-record-database;DB_CLOSE_DELAY=-1";
String dbName = "medical-record-database";
String userId = "sa";
String password = "";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Medical record data of ${pageContext.request.userPrincipal.name}</strong></font></h2>

<!-- The table which holds all attributes and the values of the Medical Record -->
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#4197F0">

<td><b>Date of birth</b></td>
<td><b>Gender</b></td>
<td><b>Age</b></td>
<td><b>Height</b></td>
<td><b>Weight</b></td>
<td><b>Address</b></td>
<td><b>Phone Number</b></td>
<td><b>Country of origin</b></td>
<td><b>Occupation</b></td>
<td><b>Marital Status</b></td>
<td><b>Next of kin name</b></td>
<td><b>Next of kin relationship</b></td>
<td><b>Next of kin number</b></td>
<h3>Further medical information</h3>
<td><b>Blood type</b></td>
<td><b>Chronic Illnesses</b></td>
<td><b>Past Immunisations</b></td>
<td><b>Allergies</b></td>
<td><b>Family members' illnesses</b></td>
<td><b>Past accidents</b></td>
<td><b>Disabilities</b></td>
<td><b>Past Major Operations</b></td>
<td><b>Current medication</b></td>
<h3>Past GP information</h3>
<td><b>Name of previous GP</b></td>
<td><b>Name of previous medical Practice</b></td>
<h3>Life style information</h3>
<td><b>Do you smoke?</b></td>
<td><b>Cigarettes smoked per day</b></td>
<td><b>Do you drink alcohol?</b></td>
<td><b>Consumed units of alcohol per week</b></td>
<td><b>Do you eat fatty foods?</b></td>
<td><b>Do you exercise?</b></td>
<td><b>Exercise per week</b></td>
</tr>

<!-- The reference for the css page -->
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password); // establishing connection with H2 Database
statement=connection.createStatement();
// SQL statement which retrieves data from User and Medical Record entities 
String sql ="SELECT u.dateofbirth, m.gender, m.age, m.height, m.weight, m.address FROM medical_record as m, user_profile as u WHERE u.id = m.user_id AND u.username = request.getPrincipal";
resultSet = statement.executeQuery(sql); // the retrieves values of the SQL quesry are put into a ResultSet

while(resultSet.next()){ //iterates on the REesultSet values and prints them on the jsp page 
%>
<tr bgcolor="#4197F0">

<td><%=resultSet.getString("dateofbirth") %></td>
<td><%=resultSet.getString("gender") %></td>
<td><%=resultSet.getString("age") %></td>
<td><%=resultSet.getString("height") %></td>
<td><%=resultSet.getString("weight") %></td>
<td><%=resultSet.getString("address") %></td>


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the medical form page! </title>
</head>
<body>

</body>
</html>