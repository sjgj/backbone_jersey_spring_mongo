<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Sample TMG</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.css" rel="stylesheet">
<!-- Free Template from startbootstrap.com -->
<link href="css/modern-business.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
				<a class="navbar-brand" href="index.html">BackBone.js + Jersey + Spring-Mongo</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#home">Home</a></li>
					<li><a href="#users">Users</a></li>
					<li><a href="#articles">Articles</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<div class="container" id="content"></div>
	<script src="libs/jquery-1.11.0.min.js"></script>
	<script src="libs/underscore-min.js"></script>
	<script src="libs/backbone-min.js"></script>

	<script src="js/utils.js"></script>
	<script src="js/models/usermodel.js"></script>
	<script src="js/models/articlemodel.js"></script>
	<script src="js/views/articledetails.js"></script>
	<script src="js/views/home.js"></script>
	<script src="js/views/userlist.js"></script>
	<script src="js/views/articlelist.js"></script>
	<script src="js/app.js"></script>
</body>
</html>