<!DOCTYPE html>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
.custab {
	border: 1px solid #ccc;
	padding: 5px;
	margin: 5% 0;
	box-shadow: 3px 3px 2px #ccc;
	transition: 0.5s;
}

.custab:hover {
	box-shadow: 3px 3px 0px transparent;
	transition: 0.5s;
}

.main {
	margin-top: 100px;
}

.header {
	height: 80px;
	width: 50%;
	background-color: #f4511e;
	color: #ffffff;
	margin-left: 300px;
	margin-top: 50px;
	padding-top: 5px;
	padding-left: 20px;
}

.hr {
	background-color: #f4511e;
	height: 10px;
}

.a {
	background-color: #f4511e; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
	font-size: 20px;
}

.addButton {
	padding-left: 800px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>crs</title>
</head>
<body>
	<div class="header">
		<h1>Car Rental System</h1>
	</div>
	<hr class="hr">
	<div class="addButton">
		<a class="a" href="addCustomerForm"
			class="btn btn-primary btn-xs pull-right"><b>+</b> Add New
			Customer</a>
		<hr>

	</div>
	<div class="container main">
		<div class="row col-md-6 col-md-offset-2 custyle">
			<div>
				<form:form>

					<table class="table table-striped custab">
						<tbody>
							<tr>
								<th>Customer Name:</th>
								<td><form:input path="name"
										value="${customer.name}" /></td>
							</tr>
							<tr>
								<th>Contact:</th>
								<td><form:input path="contact"
										value="${customer.contact}" /></td>
							</tr>
							<tr>
								<th>Address</th>
								<td><form:input path="address" 
										value="${customer.address}" /></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="Save & Update"></td>
							</tr>
						</tbody>
					</table>
				</form:form>
			</div>

		</div>
	</div>
</body>
</html>