<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
<title>DokuLearning Grupo2</title>

<!-- Stlylesheet -->
<link href="css/style.css" rel="stylesheet" type="text/css" />

<!-- Skin Color -->
<link rel="stylesheet" href="css/colors/green.css" id="color-skins" />
<style type="text/css">
.boton {
	-webkit-border-radius: 4;
	-moz-border-radius: 4;
	border-radius: 4px;
	font-family: Montserrat, sans-serif;
	color: #7E7B7B;
	font-size: 14px;
	background: #F6F7F7;
	padding: 10px 20px 10px 20px;
	text-decoration: none;
	font-weight: 700;
	line-height: 1.6;
	margin: 0 5px 0 5px;
	padding: 10px 22px;
	text-align: center;
}

.boton:hover {
	background: #B2CC02;
	text-decoration: none;
}
</style>
</head>
<body>
	<!--Start Header-->
	<header>  
		<nav class ="navbar navbar-default " role="navigation">

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

				<li><a class="to-section" href="principal.jsp">Home</a></li>

				<c:choose>
					<c:when test="${sessionScope.usuario != null }">
						<li class="dropdown"><span class="dropdown-toggle"
							data-toggle="dropdown">Mi cuenta <b class="caret"></b></span>
							<ul class="dropdown-menu" role="menu">
								<li class="active"><a
									href="usuarios?username=${sessionScope.usuario.username }">Mi
										perfil</a></li>
								<%-- <c:if
									test="${sessionScope.usuario.tipoUsuario.idtipoUsuario == 2 || sessionScope.usuario.tipoUsuario.idtipoUsuario == 3}">
									<li><a href="nuevoCurso">Añadir curso</a></li>
								</c:if> --%>
								<li><a href="login?accion=salir">Logout</a></li>
							</ul></li>
					</c:when>
					<c:otherwise>
						<li class="to-section"><a href="login">Login</a></li>
						<li class="to-section"><a href="registro">Registrarse</a></li>
					</c:otherwise>
				</c:choose>

				<li><a class="social-icon" href="http://www.twitter.com"><i
						class="icon icon-social-twitter"></i></a></li>
				<li><a class="social-icon" href="http://www.facebook.com"><i
						class="icon icon-social-facebook"></i></a></li>
				<li><a class="social-icon" href="http://www.google.com"><i
						class="icon icon-support"></i></a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
	</header>
	<!--End Header-->
	<!-- End Home Revolution Slider Parallax Section -->

	<div class="site-wrapper content">

		<section id="services">
		<div class="container">

			<div class="col-md-12 text-center">
				<h3 class="section-title wow fadeInUp">${sessionScope.seccion.titulo }</h3>
			</div>
			<div class="row text-center wow fadeInUp">
				<div class="service">
					<span class="icon-filing size-6x"></span>
					<div class="service-info">
						<p class="service-description">${sessionScope.curso.titulo }</p>
					</div>
				</div>
			</div>
		</div>
		</section>
		<section id="price-list" class="parallax-section-6">
		<div class="container">
			<div class="col-md-12 text-center">
				<h3 class="section-title white wow fadeInUp">Material de la seccion</h3>
			</div>
			<div class="row wow fadeInUp">
				<c:choose>
					<c:when test="${not empty secciones }">
						<c:forEach items="${secciones }" var="seccion">
							<c:if
								test="${seccion.curso.idcurso == sessionScope.curso.idcurso }">
								<div class="col-md-3 col-sm-6 price-list-box">
									<div class="price-box">
										<div class="price-table">
											<h3 class="label">${seccion.titulo }</h3>
											<c:if test="${not empty lecciones }">
												<c:forEach items="${lecciones }" var="leccion">
													<c:if
														test="${leccion.seccion.idseccion == seccion.idseccion }">
														<p class="price grey">
															<span class="pricing">${leccion.titulo }
														</p>
														<c:if test="${not empty sessionScope.usuario }">
															<c:forEach items="${alumnos }" var="alumno">
																<c:if
																	test="${sessionScope.usuario.username == alumno.username.username && sessionScope.curso.idcurso == alumno.curso_actual.idcurso }">
																	<c:if test="${not empty materiales }">
																		<c:forEach items="${materiales }" var="material">
																			<p class="features grey">
																				<a class="feature" href="${material.archivo }">${material.titulo }</a>
																			</p>
																		</c:forEach>
																	</c:if>
																</c:if>
															</c:forEach>
														</c:if>
													</c:if>
												</c:forEach>
											</c:if>
										</div>
									</div>
								</div>
							</c:if>
						</c:forEach>
					</c:when>
				</c:choose>
			</div>
		</div>
		</section>
		<section id="contact">
	<div class="container">
		<div class="row">

			<div class="col-md-12">
				<h3 class="col-md-12 text-center">AÑADE UNA LECCION</h3>
			</div>

			<div class="col-md-6 col-md-offset-3 text-center wow fadeInUp">
				<c:if test="${not empty mensaje }">
					<div id="message">
						<p class="error_message">${mensaje }</p>
					</div>
				</c:if>
				<form method="post" action="nuevaLeccion" name="leccionForm"
					id="leccionForm">

					<fieldset>
						<input name="tituloLeccion" type="text" id="tituloLeccion"
							placeholder="Titulo de la leccion*" />
					</fieldset>
					<input type="submit" class="submit" id="submit"
						value="CREAR LECCION" />
				</form>
			</div>

		</div>
	</div>
	</section>

		<!-- Start Footer 1 -->
		<footer id="footer">
		<div class="footer-copyright">
			<div class="container">
				<div class="row">

					<div class="col-md-6 col-sm-12">
						<p>
							© 2015 Theme by <a href="inicio" class="logo">TIW
								Design.</a> All Rights Reserved.
						</p>
					</div>
					<div class="col-md-6 col-sm-12">
						<ul id="social-icons">
							<li><a href="#"><i class="icon ion-social-twitter"></i></a></li>
							<li><a href="#"><i class="icon ion-social-facebook"></i></a></li>
							<li><a href="#"><i class="icon ion-social-googleplus"></i></a></li>
							<li><a href="#"><i
									class="icon ion-social-instagram-outline"></i></a></li>
							<li><a href="#"><i class="icon ion-social-pinterest"></i></a></li>
							<li><a href="#"><i class="icon ion-social-skype"></i></a></li>
							<li><a href="#"><i class="icon ion-social-linkedin"></i></a></li>
							<li><a href="#"><i class="icon ion-social-dropbox"></i></a></li>
							<li><a href="#"><i class="icon ion-social-vimeo"></i></a></li>
							<li><a href="#"><i class="icon ion-social-youtube"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End Footer Copyright --> </footer>
		<!-- End Footer 1 -->

		<!-- Start Back To Top -->
		<a id="back-to-top"><i class="icon ion-chevron-up"></i></a>
		<!-- End Back To Top -->

	</div>
	<!-- End Site Wrapper -->

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
