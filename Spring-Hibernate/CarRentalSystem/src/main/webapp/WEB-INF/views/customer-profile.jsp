<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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
	<div>
		<h3>Customer Profile</h3>
	</div>
	<hr class="hr">
	<div class="container fluid">
		<div class="row col-md-6 col-md-offset-2 custyle">
			<div>
				<table class="table table-striped custab">
				
					
						<c:url var="profileLink" value="customerProfile">
							<c:param name="id" value="${customer.id}"></c:param>
						</c:url>
					<tr>
							<th>Customer ID : </th>
							<td>${customer.id}</td>
					</tr>
					<tr>
							<th>Customer Name : </th>
							<td>${customer.name}</td>
					</tr>
					<tr>
							<th>Customer Contact : </th>
							<td>${customer.contact}</td>
					</tr>
					<tr>
							<th>Customer Address : </th>
							<td>${customer.address}</td>
					</tr>
					
				</table>
			</div>

		</div>
	</div>
</body>
</html>