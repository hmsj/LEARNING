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
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<!-- Start Home Revolution Slider Parallax Section -->
	<section id="home-revolution-slider">
	<div class="hero">
		<div class="tp-banner-container">
			<div class="tp-banner">
				<ul>
					<!-- SLIDE 1 -->
					<li data-transition="fade" data-slotamount="7"
						data-masterspeed="2000"
						data-thumb="img/backgrounds/bg-home-fullscreen.jpg"
						data-delay="10000" data-saveperformance="on"
						data-title="We Are Vossen"><img
						src="${sessionScope.curso.imagen }" alt="slidebg1"
						data-bgposition="center top" data-bgfit="cover"
						data-bgrepeat="no-repeat"> <!-- Home Heading -->
						<div class="tp-caption sft" data-x="center" data-y="260"
							data-speed="1200" data-start="1100"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
							<h2 class="home-heading op-1">${sessionScope.curso.titulo }</h2>
						</div> <!-- Home Subheading -->
						<div class="tp-caption home-subheading sft fadeout"
							data-x="center" data-y="360" data-speed="1200" data-start="1350"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
							<div class="op-1">${sessionScope.curso.profesor_titular.nombre }</div>
						</div> <!-- Home Button -->
						<div class="tp-caption home-button sft fadeout" data-x="center"
							data-y="400" data-speed="1200" data-start="1550"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
							<c:choose>
								<c:when test="${sessionScope.usuario != null }">

									<c:choose>
										<c:when test="${not empty mensaje1 }">
											<div class="op-1">
												<a href="#features" class="btn btn-primary btn-scroll">ENTRAR</a>
											</div>
										</c:when>
										<c:when test="${not empty mensaje2 }">
											<div class="op-1">
												<a href="#features" class="btn btn-primary btn-scroll">VER
													DATOS</a>
											</div>
										</c:when>
										<c:when test="${not empty mensaje3 }">
											<div class="op-1">
												<a href="#features" class="btn btn-primary btn-scroll">MATRICULATE</a>
											</div>
										</c:when>
										<c:otherwise>
											<div class="op-1">
												<a href="#features" class="btn btn-primary btn-scroll">MATRICULATE</a>
											</div>
										</c:otherwise>
									</c:choose>

								</c:when>
								<c:otherwise>
									<div class="op-1">
										<a href="login" class="btn btn-primary btn-scroll">ACCEDER</a>
									</div>
								</c:otherwise>
							</c:choose>
						</div></li>
				</ul>
				<div class="tp-bannertimer"></div>
			</div>

			<div class="home-bottom">
				<div class="container text-center">
					<div class="move bounce">
						<a href="#features" class="ion-ios-arrow-down btn-scroll"></a>
					</div>
				</div>
			</div>

		</div>
	</div>
	</section>
	<!-- End Home Revolution Slider Parallax Section -->

	<div class="site-wrapper content">

		<section id="services">
		<div class="container">

			<div class="col-md-12 text-center">
				<h3 class="section-title wow fadeInUp">Descricpcion del curso</h3>
				<p class="subheading wow fadeInUp">
					<span class="highlight">${sessionScope.curso.titulo }</span>
				</p>
			</div>
			<div class="row text-center wow fadeInUp">
				<div class="service">
					<span class="icon-eyeglasses size-6x"></span>
					<div class="service-info">
						<p class="service-description">${sessionScope.curso.descripcion }</p>
					</div>
				</div>
			</div>
		</div>
		</section>



		<!-- Start Price List -->
		<section id="price-list" class="parallax-section-6">
		<div class="container">
			<div class="col-md-12 text-center">
				<h3 class="section-title white wow fadeInUp">Temario del curso</h3>
			</div>
			<div class="row wow fadeInUp">
				<c:choose>
					<c:when test="${not empty secciones }">
						<c:forEach items="${secciones }" var="seccion">
							<c:if test="${seccion.curso.idcurso == $sessionScope.curso.idcurso }">
							<div class="col-md-3 col-sm-6 price-list-box">
								<div class="price-box">
									<div class="price-table">
										<h3 class="label">${seccion.titulo }</h3>
										<p class="price grey">
											<sup class="currency">$</sup> <span class="pricing">99
												<span style="display: in">Hola</span>
											</span> <span class="time-period">Per Month</span>
										</p>
										<p class="features grey">
											<span class="feature">24/7 Free Support</span> <span
												class="feature">100GB Storage</span> <span class="feature">1GB
												Bandwidth</span> <span class="feature"></span> <span
												class="feature no-border"></span> <span
												class="feature option-button no-border"> <a href="#"
												class="btn-effect">SIGN UP NOW!</a>
											</span>

										</p>
									</div>
								</div>
							</div>
							</c:if>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<p>HOLA</p>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		</section>
		<!-- End Price List -->

		<!-- Start Footer 1 -->
		<footer id="footer">
		<div class="footer-copyright">
			<div class="container">
				<div class="row">

					<div class="col-md-6 col-sm-12">
						<p>
							© 2015 Vossen Theme by <a href="inicio" class="logo">Vossen
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
