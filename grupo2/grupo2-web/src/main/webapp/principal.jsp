<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
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
<style type="text/css">
.ok_message {
    top: -10px;
    margin-left: auto;
    margin-right: auto;
    line-height: 22px;
    text-align: center;
    padding: 15px 15px 15px 15px;
    color: #f4f4f4;
    -webkit-border-radius: 3px;
    background-color: #90ee90;
    /*background-image: url(../img/error.gif);*/
    background-position: 10px center;
    background-repeat: no-repeat;
}
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

	<jsp:include page="header.jsp"></jsp:include>
	
		<c:if test="${not empty mensaje }">
			<c:choose>
			<c:when test="${acceso == 'ok' }">
				<p class="ok_message">${mensaje }</p>
			</c:when>
			<c:otherwise>
				<p class="error_message">${mensaje }</p>
			</c:otherwise>
			</c:choose>
		</c:if>

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
						data-delay="10000" data-saveperformance="on" data-title=""><img
						src="img/backgrounds/startup-photos-medium.jpg" alt="slidebg1"
						data-bgposition="center top" data-bgfit="cover"
						data-bgrepeat="no-repeat"> <!-- Home Heading -->
						<div class="tp-caption sft" data-x="center" data-y="260"
							data-speed="1200" data-start="1100"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
							<h2 class="home-heading op-1">DokuLearning</h2>
						</div> <!-- Home Subheading -->
						<div class="tp-caption home-subheading sft fadeout"
							data-x="center" data-y="360" data-speed="1200" data-start="1350"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
							<div class="op-1">2015 · TU PORTAL DE E-LEARNING</div>
						</div> <!-- Home Button -->
						<div class="tp-caption home-button sft fadeout" data-x="center"
							data-y="400" data-speed="1200" data-start="1550"
							data-easing="Power3.easeInOut" data-splitin="none"
							data-splitout="none" data-elementdelay="0.1"
							data-endelementdelay="0.1" data-endspeed="300"
							style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
						</div></li>
				</ul>
				<div class="tp-bannertimer"></div>
			</div>

			<div class="home-bottom">
				<div class="container text-center">
					<div class="move bounce">
						<a href="#portfolio" class="ion-ios-arrow-down btn-scroll"></a>
					</div>
				</div>
			</div>

		</div>
	</div>
	</section>
	<!-- End Home Revolution Slider Parallax Section -->

	<div class="site-wrapper content">

		<!-- Start Testimonials Section -->
		<section id="testimonials" class="parallax-section-7">
		<div class="container">
			<div class="row">

				<div class="col-md-12 text-center">
					<h3 class="section-title white wow fadeInUp">Cursos Destacados</h3>
					<p class="subheading grey wow fadeInUp">
						Estos son nuestros cursos con mas <span class="highlight">exito</span>
					</p>
				</div>

				<div class="clients">
					<c:if test="${not empty cursos }">
						<c:forEach items="${cursos }" var="curso">
							<c:if test="${curso.validado == 1 }">
								<c:if test="${curso.destacado == 1 }">
									<div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
										<c:choose>
											<c:when test="${not empty curso.imagen }">
												<a href="cursos?idcurso=${curso.idcurso }">
													<div class="logo-dark">
														<img src="${curso.imagen }" class="img-responsive"
															alt="client">
													</div>
													<div class="logo-light">
														<p class="text-center">${curso.titulo }</p>
														<p class="text-center">Precio inicial:
															${curso.precio_inicial } €</p>
														<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 1}">
															<p class="text-center">Descuento:
																${curso.oferta.valor} €</p>
														</c:if>
														<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 2}">
															<p class="text-center">Descuento:
																${curso.oferta.valor} %</p>
														</c:if>
														<p class="text-center">Precio final:
															${curso.precio_final } €</p>
													</div>
												</a>
											</c:when>
											<c:otherwise>
												<a href="cursos?idcurso=${curso.idcurso }">
													<div class="logo-dark">
														<img src="img/portfolio/1.jpg" class="img-responsive"
															alt="client">
													</div>
													<div class="logo-light">
														<p class="text-center">${curso.titulo }</p>
														<p class="text-center">Precio inicial:
															${curso.precio_inicial } €</p>
														<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 1}">
															<p class="text-center">Descuento:
																${curso.oferta.valor} €</p>
														</c:if>
														<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 2}">
															<p class="text-center">Descuento:
																${curso.oferta.valor} %</p>
														</c:if>
														<p class="text-center">Precio final:
															${curso.precio_final } €</p>
													</div>
												</a>
											</c:otherwise>
										</c:choose>
									</div>
								</c:if>
							</c:if>
						</c:forEach>
					</c:if>
				</div>
		</section>
		<!-- End Testimonials Section -->

		<!-- Start Portfolio Section -->
		<section id="portfolio" style="position: relative;">
		<div class="separator"></div>
		<div class="container">

			<div class="col-md-12 text-center">
				<h3 class="section-title wow fadeInUp">Nuestros cursos</h3>
				<p class="subheading wow fadeInUp">
					Elige entre nuestra variedad de <span class="highlight">cursos</span>.
				</p>
			</div>

			<div id="filters-container-fullwidth"
				class="cbp-l-filters-alignCenter wow fadeInUp">
				<c:choose>
					<c:when test="${not empty categorias }">
						<div data-filter="*"
							class="cbp-filter-item-active cbp-filter-item">
							Todos
							<div class="cbp-filter-counter"></div>
						</div>
						<c:forEach items="${categorias }" var="categoria">
							<div data-filter=".${categoria.descripcion_categoria }"
								class="cbp-filter-item">${categoria.descripcion_categoria }<div
									class="cbp-filter-counter"></div>
							</div>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<div data-filter="*"
							class="cbp-filter-item-active cbp-filter-item">
							Todos
							<div class="cbp-filter-counter"></div>
						</div>
					</c:otherwise>
				</c:choose>
			</div>

			<div id="grid-container-fullwidth" class="cbp-l-grid-fullScreen">
				<ul>
					<c:if test="${not empty cursos }">
						<c:forEach items="${cursos }" begin="0" end="2" var="curso">
							<c:choose>
								<c:when test="${curso.validado ==  1}">
									<li
										class="cbp-item effect effects ${curso.categoria.descripcion_categoria }">
										<c:choose>
											<c:when test="${not empty curso.imagen }">
												<div class="img">
													<img src="${curso.imagen }" class="img-responsive" alt=""
														style="width: 100%; height: 100%;" />
													<div class="overlay">
														<ul class="expand">
															<li class="cbp-l-caption-title">${curso.titulo }</li>
															<li class="cbp-l-caption-desc">by
																${curso.profesor_titular }</li>
															<li class="cbp-l-icon"><a
																href="cursos?idcurso=${curso.idcurso }"><i
																	class="icon-info"></i></a></li>
															<li class="cbp-l-caption-desc">Precio inicial:
																${curso.precio_inicial } €</li>
															<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 1}">
																<li class="cbp-l-caption-desc">Descuento:
																	${curso.oferta.valor} €</li>
															</c:if>
															<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 2}">
																<li class="cbp-l-caption-desc">Descuento:
																	${curso.oferta.valor} %</li>
															</c:if>
															<li class="cbp-l-caption-desc">Precio final:
																${curso.precio_final } €</li>

														</ul>
													</div>
												</div>
											</c:when>
											<c:otherwise>
												<div class="img">
													<img src="img/portfolio/1.jpg" class="img-responsive"
														alt="" style="width: 100%; height: 100%;" />
													<div class="overlay">
														<ul class="expand">
															<li class="cbp-l-caption-title">${curso.titulo }</li>
															<li class="cbp-l-caption-desc">by
																${curso.profesor_titular }</li>
															<li class="cbp-l-icon"><a
																href="cursos?idcurso=${curso.idcurso }"><i
																	class="icon-info"></i></a></li>
															<li class="cbp-l-caption-desc">Precio inicial:
																${curso.precio_inicial } €</li>
															<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 1}">
																<li class="cbp-l-caption-desc">Descuento:
																	${curso.oferta.valor} €</li>
															</c:if>
															<c:if test="${curso.oferta.tipoOferta.idtipoOferta == 2}">
																<li class="cbp-l-caption-desc">Descuento:
																	${curso.oferta.valor} %</li>
															</c:if>
															<li class="cbp-l-caption-desc">Precio final:
																${curso.precio_final } €</li>

														</ul>
													</div>
												</div>
											</c:otherwise>
										</c:choose>
									</li>
								</c:when>
							</c:choose>
						</c:forEach>
					</c:if>
				</ul>
			</div>
			<div style="margin-top: 30px; margin-left: 45%;">
				<a href="cursos" class="boton">VER MAS</a>
			</div>

		</div>
		</section>
		<!-- End Portfolio Section -->

		<!-- Start Footer 1 -->
		<footer id="footer">
		<div class="footer-copyright">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-sm-12">
						<p>
							© 2015 TIW UC3M <a href="inicio" class="logo">Dokulearning</a>
							All Rights Reserved.
						</p>
					</div>
					<div class="col-md-6 col-sm-12">
						<ul id="social-icons">
							<li><a href="http://www.twitter.com"><i
									class="icon ion-social-twitter"></i></a></li>
							<li><a href="http://www.facebook.com"><i
									class="icon ion-social-facebook"></i></a></li>
							<li><a href="http://www.youtube.com"><i
									class="icon ion-social-youtube"></i></a></li>
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
