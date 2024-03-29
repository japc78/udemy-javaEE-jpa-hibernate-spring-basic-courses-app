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
	<form action="Controller?option=doUpdate&id=${requestScope.course.id}" method="post" class="form-horizontal" >
		<div class="form-group">
			<label class="control-label col-sm-2">Description:</label>
			<input  type="text" name="description" class="form-control" style="width:30%" value="${requestScope.course.description}"/>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Duration:</label>
			<input  type="text" name="duration" class="form-control" style="width:30%" value="${requestScope.course.duration}"/>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Price:</label>
			<input  type="text" name="price" class="form-control" style="width:30%" value="${requestScope.course.price}"/>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default" style="width:30%">Save</button>
			</div>
		</div>
	</form>
</div>
</body>
</html>