<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget Password</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/stylelogin.css">

<link rel="icon" type="image/x-icon" href="img/favicon.png">
</head>
<body>
	<!-- loading page -->
	<jsp:include page="PageLoader.jsp"/>
	
	<section class="ftco-section hero-section set-bg" style="background-color: pink; height: 100vh;">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-12 col-lg-10">
					<div class="wrap d-md-flex">
						<div class="text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last">
							<div class="text w-100">
								<h2>Welcome to Forget Password</h2>
								<p>Remember your Password?</p>
								<a href="login.jsp" class="btn btn-white btn-outline-white">Log In</a>
							</div>
						</div>
						<div class="login-wrap p-4 p-lg-5">
							<div class="d-flex">
								<div class="w-100">
									<h3 class="mb-4">Forget Password</h3>
								</div>
								<div class="w-100">
									<p class="social-media d-flex justify-content-end">
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-facebook"></span></a>
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-twitter"></span></a>
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-github"></span></a>
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-google"></span></a>
									</p>
								</div>
							</div>
							<form action="ForgetPasswordM" class="signin-form" method="post">
								<div class="form-group mb-3">
									<label class="label" for="name">Email</label>
									<input type="text" class="form-control" placeholder="Username" name="email_f">
								</div>
								
								<div class="form-group">
									<button type="submit" class="form-control btn btn-primary submit px-3">Forget Password</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	
	<!--script tag add  -->
	<jsp:include page="TagScript.jsp"/>
</body>
</html>