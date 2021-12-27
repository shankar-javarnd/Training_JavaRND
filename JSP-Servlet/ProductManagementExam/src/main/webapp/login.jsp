<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<hr>
	<div class="container">
		<form action="login">
		    <div class="form-group">
		    	Login Name : <input type="text" class="form-control" id="email" placeholder="Enter Login Name" name="loginName">
		    </div>
		    <div class="form-group">
		    	Password :   <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
		    </div> 
		    <button type="submit" class="btn btn-default" style='margin-right: 20px'>Login</button>
			<a href="registration.jsp">Sign Up </a>
		</form>
	</div>

</body>
</html>
