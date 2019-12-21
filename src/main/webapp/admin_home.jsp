<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
			
			<h1>  <a href="CountryInfo">Country Info List</a> </h1>
			
		</fieldset>
	</form>

</body>
</html>