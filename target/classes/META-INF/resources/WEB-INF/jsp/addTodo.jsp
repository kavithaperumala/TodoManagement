<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
	<head>
		<link href= "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

		<title>Add Todo</title>
	</head>
	<body>
		<h1>Add Todo</h1>
		<hr>
		<div class = "container">
			<form:form method = "post" modelAttribute = "todo">
				<fieldset class = "mb-3">
					<form:label path = "description">Description</form:label>
					<form:input type = "text" path = "description" required = "required"/>
					<form:errors path = "description" cssClass = "warning"/>
				</fieldset>
			
				<fieldset class = "mb-3">
					<form:label path = "date">Date</form:label>
					<form:input type = "date" path = "date" required = "required"/>
					<form:errors path = "date" cssClass = "warning"/>
				</fieldset>
				
				<form:input type = "hidden" path = "id"/>
				<form:input type = "hidden" path = "activity"/>
				<input type= "submit" class = "btn btn-success" />
			</form:form>
		</div>
			
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>


		
	</body>
</html>

