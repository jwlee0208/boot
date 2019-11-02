<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js?${serverTime}"></script>

<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css?${serverTime}">
<script src="/resources/bootstrap/js/bootstrap.min.js?${serverTime}"></script>
</head>
<body>
	<div class="container">
	
		<div class="jumbotron">
		  <h1 class="display-4">Hello, world!</h1>
		  <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
		  <hr class="my-4">
		  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
		  <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
		</div>
	
		<div class="row">
		    <div class="col-sm">
		      hello
		    </div>
		    <div class="col-sm">
		      world
		    </div>
		    <div class="col-sm">
		      !!! (${mode})
		    </div>
		</div>
	</div>	
</body>
</html>