<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="" type="image/x-icon">
<title>DokuLearning Grupo2</title>

<!-- Stlylesheet -->
<link href="css/style.css" rel="stylesheet" type="text/css" />

<!-- Skin Color -->
<link rel="stylesheet" href="css/colors/green.css" id="color-skins" />
</head>
<body>
	<!--Start Header-->
	<header> <nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#main-nav">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!--  <a class="navbar-brand to-top" rel="home" href="#">
                        	<img src="img/assets/logo-dark.png" alt="Dokulearning" class="logo-big">
                            <img src="img/assets/logo-dark.png" alt="Dokulearning" class="logo-small">
                        </a>-->
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="main-nav">
			<ul class="nav navbar-nav  navbar-right">

				<li><a class="to-section" href="index.jsp">Home</a></li>
				<li class="to-section"><a href="login.jsp">Login</a></li>
				<!--<li class="to-section"><a href="#team">Team</a></li>
                            <li class="to-section"><a href="#portfolio">Portfolio</a></li>-->

				<li class="to-section"><a href="#contact">Contact</a></li>
				<li><a class="social-icon" href="http://www.twitter.com"><i
						class="icon icon-social-twitter"></i></a></li>
				<li><a class="social-icon" href="http://www.twitter.com"><i
						class="icon icon-social-facebook"></i></a></li>
				<li><a class="social-icon" href="http://www.google.com"><i
						class="icon icon-support"></i></a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav> </header>
	<!--End Header-->
	<section id="price-list" class="parallax-section-6">
	<div class="container">
	
				<div class="col-md-12 text-center">
				<h3 class="section-title white wow fadeInUp ">Edite su perfil</h3>
			</div>
		<div class="row wow fadeInUp">

			<div class="col-md-6 col-sm-6 text-center">
				<div class="price-box">
					<div class="price-table">
						<h3 class="label">Perfil Actual</h3>
						<p class="price grey">
							**********/////////////FOTOGRAFIA****************************
						</p>
						<p class="features grey">
							<span class="feature">${sessionScope.usuario.username}</span> <span
								class="feature">${sessionScope.usuario.password}</span> <span 
								class="feature">${sessionScope.usuario.telefono}</span> <span 
								class="feature">${sessionScope.usuario.email}</span> <span
								class="feature no-border"></span>
							</span>

						</p>
					</div>
				</div>
			</div>		
			<div class="col-md-6 col-sm-6 text-center wow fadeInUp">
				<div class="price-box">
					<div class="price-table">
						<h3 class="label">Editar perfil</h3>
							<form method="post" action="editar" name="editform" id="editform">
					<fieldset>
						<p class="features" >
							<span class="feature"><input name="username" type="text" id="username"
									placeholder="Nombre de usuario*" /></span> 
							<span class="feature"><input name="password" type="password" id="password" 
									placeholder="Contraseña*"/></span> 
							<span class="feature"><input name="telefono" type="telefono" id="telefono" 
									placeholder="Telefono*"/></span> 
							<span class="feature"><input name="email" type="email" id="email"
									 placeholder="Email*"/></span> 
									 <span class="feature no-border"></span>
							</span>
						</p>
					</fieldset>
					<input type="submit" class="submit" id="submit" value="CAMBIAR" />
				</form>
					</div>
				</div>
			</div>

		</div>
	</div>
	</section>


	<!-- jQuery -->
	<script src="js/plugins/jquery.min.js"></script>
	<script src="js/plugins/smoothscroll.min.js"></script>
	<script src="js/plugins/revslider.min.js"></script>
	<script src="js/plugins/bootstrap.min.js"></script>
	<script src="js/plugins/waypoints.min.js"></script>
	<script src="js/plugins/parallax.min.js"></script>
	<script src="js/plugins/easign1.3.min.js"></script>
	<script src="js/plugins/moderniz.min.js"></script>
	<script src="js/plugins/cubeportfolio.min.js"></script>
	<script src="js/plugins/owlcarousel.min.js"></script>
	<script src="js/plugins/tweetie.min.js"></script>
	<script src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script src="js/plugins/gmap3.min.js"></script>
	<script src="js/plugins/wow.min.js"></script>
	<script src="js/plugins/counterup.min.js"></script>
	<script src="js/scripts.js"></script>

</body>
</html>
