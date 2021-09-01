<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
</head>
<body>
<div class="container">
	<h1>Course details</h1>
	<br/>
	<form  class="form-horizontal" >
		<div class="form-group">
			<label class="control-label col-sm-2">Description: ${requestScope.course.description}</label>
			
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Duration: ${requestScope.course.duration}</label>
			
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Price: ${requestScope.course.price}</label>
			
		</div>
		<a href="Controller?option=toHome">back</a>
	</form>
</div>
</body>
</html>