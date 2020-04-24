<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login V20</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" type="image/png" href="images/icons/favicon.ico" />

<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">

<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">

<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">

<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-b-160 p-t-50">
				<form class="login100-form validate-form" action="registerServlet" method="post">
					<span class="login100-form-title p-b-43"> User Register </span>
					<div class="wrap-input100 rs1 validate-input"
						data-validate="Username is required">
						<input class="input100" type="text" name="name" id="name"> <span
							class="label-input100">Name</span>
					</div>
					<div class="wrap-input100 rs2 validate-input"
						data-validate="Password is required">
						<input class="input100" type="text" name="surname" id="surname"> <span
							class="label-input100">Surname</span>
					</div>
					<div class="wrap-input100 rs3 validate-input"
						data-validate="Password is required">
						<input class="input100" type="text" name="username" id="username"> <span
							class="label-input100">UserName</span>
					</div>
					<div class="wrap-input100 rs4 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="password" id="password"> <span
							class="label-input100">Password</span>
					</div>
					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">Sign up</button>
					</div>
					<div class="text-center w-full p-t-23">
						<a href="login.jsp" class="txt1"> Sign in  </a>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="vendor/jquery/jquery-3.2.1.min.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="vendor/animsition/js/animsition.min.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="vendor/bootstrap/js/popper.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="vendor/select2/select2.min.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="vendor/daterangepicker/moment.min.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="vendor/countdowntime/countdowntime.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script src="js/main.js"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>

	<script async
		src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"
		type="7f8597afb4bfa1d0fba8dc78-text/javascript"></script>
	<script type="7f8597afb4bfa1d0fba8dc78-text/javascript">
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script>
	<script
		src="https://ajax.cloudflare.com/cdn-cgi/scripts/7089c43e/cloudflare-static/rocket-loader.min.js"
		data-cf-settings="7f8597afb4bfa1d0fba8dc78-|49" defer=""></script>
</body>
</html>