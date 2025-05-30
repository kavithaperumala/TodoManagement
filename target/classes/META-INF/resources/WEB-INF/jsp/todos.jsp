<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<link href= "/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Todos Page</title>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<hr>
			<table class = "table">
				<thead>
					<tr>
						<th>Description</th>
						<th>End Date</th>
						<th> </th>
						<th> </th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items = "${todo}" var = "todos">
						<tr>
							<td>${todos.description}</td>
							<td>${todos.date}</td>
							<td><a href = "update-todo?id=${todos.id}" class = "btn btn-success">UPDATE</a></td>
							<td><a href = "delete?id=${todos.id}" class = "btn btn-warning">DELETE</a></td>
						</tr>
					</c:forEach>
					
				</tbody>
			</table>
			
			<a href ="add-todo" class="btn btn-success">Add Todo</a>
			
			<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
			<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>


		