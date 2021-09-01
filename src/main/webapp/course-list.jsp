<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h1>Course List</h1>
	<div >
			<table border="1" class="table table-striped table-bordered" >
				<thead><tr><th>Name</th><th>Price</th><th>Duration</th></tr></thead>
				<tbody>
				<c:forEach var="c" items="${requestScope.courses}">
					<tr>
						<td>${c.description}</td>
						<td>${c.price}</td>
						<td>${c.duration}</td>					
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<br/>
		<a href="toBack">Back</a>
</div>
</body>
</html>