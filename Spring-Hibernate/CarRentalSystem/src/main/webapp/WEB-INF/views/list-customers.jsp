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
	<div class="addButton">
		<a class="a" href="addCustomerForm"
			class="btn btn-primary btn-xs pull-right"><b>+</b> Add New
			Customer</a>
		<hr>

	</div>
	<div class="container fluid">
		<div class="row col-md-6 col-md-offset-2 custyle">
			<div>
				<table class="table table-striped custab">
					<thead>
						<tr>
							<th>S.No</th>
							<th>Customer ID</th>
							<th>Customer Name</th>
							<th>Contact</th>
							<th>Address</th>
							<th class="text-center">Action</th>
						</tr>
					</thead>

					<c:forEach varStatus="c" var="customer" items="${customers}">
						<c:url var="updateLink" value="showFormForUpdate">
							<c:param name="id" value="${customer.id}"></c:param>
						</c:url>
						<c:url var="deleteLink" value="delete">
							<c:param name="id" value="${customer.id}"></c:param>
						</c:url>
						<tbody>
							<tr>
								<td>${c.count}</td>
								<td>${customer.id}</td>
								<td>${customer.name}</td>
								<td>${customer.contact}</td>
								<td>${customer.address}</td>
								<td class="text-center"><a class='btn btn-info btn-xs'
									href="${updateLink}"><span class="glyphicon glyphicon-edit"></span>
										Update</a> <a href="${deleteLink}" class="btn btn-danger btn-xs"  onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false"><span
										class="glyphicon glyphicon-remove"></span> Delete</a></td> 
							</tr>
						</tbody>
					</c:forEach>

				</table>
			</div>

		</div>
	</div>
</body>
</html>