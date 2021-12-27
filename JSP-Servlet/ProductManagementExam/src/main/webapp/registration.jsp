<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> 
</head>
<body>
	<jsp:include page="heading.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<h3>Registration Form!</h3>
			<hr>
			<form action="reg">
				<table>
					<tr>
						<th>Name :</th>
						<td><input type="text" name="name"/></td>
					</tr>
					<tr>
						<th>Contact :</th>
						<td><input type="text" name="mobile"/></td>
					</tr>
					<tr>
						<th>Email :</th>
						<td><input type="text" name="email"/></td>
					</tr>
					<tr>
						<th>User Name :</th>
						<td><input type="text" name="userName"/></td>
					</tr>
					<tr>
						<th>Password :</th>
						<td><input type="password" name="password"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit"/></td>
					</tr>
				</table>
			</form>
		</div>
</body>
</html>