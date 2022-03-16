<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibernate Exam</title>
</head>
<body>
	<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Search</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</head>
<body style="background:#CCCCFF">

	<div style="text-align:center">
	<h1>Language Details</h1>
	<hr>
	</div>
	<%--  Language div --%>
		<div align="center">
		<div class="col-md-5" style="margin: 5px; border: 2px solid black"; align="center">
			<br>
			<div style='background-color: black'>
				<h3 style='color: white; text-align: center'>Language</h3>
				<div>

					<table class="table table-bordered table-hover table-dark"
						style="margin: 2px; margin-bottom: 10px">
						<thead>
							<tr>
								<th>Language Id</th>
								<th>Language Name</th>

							</tr>
						</thead>

						<tbody>		
							<tr>
								<td>1</td>
								<td>English</td>
							</tr>
							<tr>
								<td>2</td>
								<td>Arabic</td>
							</tr>
							<tr>
								<td>3</td>
								<td>Chinese</td>
							</tr>
							<tr>
								<td>4</td>
								<td>French</td>
							</tr>
							<tr>
								<td>5</td>
								<td>Marathi</td>
							</tr>
						</tbody>

					</table>

				</div>
			</div>
			<hr>
			<form action='lang'>
				<table>

					<tr>
						<th>Language Id :</th>
						<td><input type="number" name="langid"
							placeholder="Enter language id" required="required"></td>
					</tr>

				</table>
				<br> <br> <input style="margin-bottom: 5px"
					class="btn btn-success" type="submit" value="Submit"><br>
			</form>
		</div>

		<div class="col-md-1"></div>
		</div>
	
</body>
</html>
</body>
</html>