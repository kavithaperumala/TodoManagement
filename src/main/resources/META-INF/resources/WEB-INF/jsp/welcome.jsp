<html>
<head>
	<link href= "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome Page</title>
</head>
<body>
	<h1>Welcome</h1>
	<hr>
	<nav class = "navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
		<a class = "navbar-brand m-1" href = "https://www.google.com/"> Google </a>
		<div class = "collapse navbar-collapse">
			<ul class = "navbar-nav">
				<li class = "nav-item"><a class = "nav-link" href = "/forms"> Home </a> </li>
				<li class = "nav-item"><a class = "nav-link" href = "/todos"> Todos </a> </li>
			</ul>
		</div>
		<ul class = "navbar-nav">
			<li class = "nav-item"><a class = "nav-link" href = "/logout">Logout</a></li>
		</ul>
	</nav>
	<h3>Hey ${name} !</h3>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
		