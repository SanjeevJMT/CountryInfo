<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body bgcolor="#ccfff9">
	<div class="container-fluid header">
		<header>
			<c:import url="header.jsp" />
		</header>
	</div>
	<hr class="colorgraph">
	<c:import url="menu.jsp" />
<fieldset ><fieldset>
<div align="center" >
		<h1 >Employee List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEmployee?id=${employee.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
	
	<div align="center">
	<form  action="AddCountry" method="get">
		<fieldset >
			<h2>Add Country Info</h2>

			<td>Country:</td>
			<input type="text" name="country" placeholder="Country Name"
				required="required"> <br /><td>Capital:&nbsp&nbsp&nbsp</td><input type="text" name="capital"
				placeholder="capital" required="required"> <br /> 
			<tr>
				<td>Language:</td>
				<td><select name="language">
						<option>Hindi</option>
						<option>English</option>
						<option>Urdu</option>
				</select></td>
			</tr>
			<br />	
			
				<td valign="top">Sports:</td>                 
				<input type="checkbox" name="sports" value="cricket">Cricket</input>
				<input type="checkbox" name="sports" value="hockey">Hockey</input>                    
				<input type="checkbox" name="sports" value="kabaddi">Kabaddi</input>
				               
			

			<input type="submit" value="Add">
			
			<h1>  <a href="CountryInfo">Country Info List</a>
			
		</fieldset>
	</form>
	
	
	
	</div>
	
	
	
	
	
	
	<h2 align="center">    hh             </h2>
	<h2 align="center">ff ${ requestScope.valuebean }</h2>
	<h2 align="center">    hh             </h2>
	<h2 align="center">ff ${ requestScope.valuebean }</h2>
	<h2 align="center">    hh             </h2>
	<h2 align="center">ff ${ requestScope.valuebean }</h2>
	<h2 align="center">    hh             </h2>
	</fieldset>
</fieldset>
	<hr class="colorgraph">

	<div class="row">
		<div class="col-xs-3 col-sm-3 col-md-3"></div>
		<div class="col-xs-6 col-sm-6 col-md-6">
			<a href="../admin_home.jsp" class="btn btn-lg btn-primary btn-block">Return to Home Page</a>
		</div>
	</div>

	<footer>
		<c:import url="footer.jsp" />
	</footer>

</body>
</html>