<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<jsp:include page="header.jsp"></jsp:include>

	<section id="price-list" class="parallax-section-6">
	<div class="container">

		<div class="col-md-12 text-center">
			<h3 class="section-title white wow fadeInUp ">${sessionScope.usuario.nombre }
				${sessionScope.usuario.apellidos }</h3>
		</div>
		<div class="row wow fadeInUp">

			<div class="col-md-6 col-sm-6 text-center">
				<div class="price-box">
					<div class="price-table">
						<h3 class="label">Perfil Actual</h3>
						<c:choose>
							<c:when test="${sessionScope.usuario.imagen != null }">
								<img src="${sessionScope.usuario.imagen }"
									alt="${sessionScope.usuario.username}"
									data-bgposition="center top" data-bgfit="cover"
									data-bgrepeat="no-repeat">
							</c:when>
							<c:otherwise>
								<img src="/img/clients/client-1.png"
									alt="${sessionScope.usuario.username}"
									data-bgposition="center top" data-bgfit="cover"
									data-bgrepeat="no-repeat">
							</c:otherwise>
						</c:choose>
						<p class="features grey">
						<p class="feature">
							<span class="highlight">Nombre de usuario:</span>
							${sessionScope.usuario.username}
						</p>
						<p class="feature">
							<span class="highlight">Nombre:</span>
							${sessionScope.usuario.nombre}
						</p>
						<p class="feature">
							<span class="highlight">Apellidos:</span>
							${sessionScope.usuario.apellidos}
						</p>
						<p class="feature">
							<span class="highlight">E-mail:</span>
							${sessionScope.usuario.email}
						</p>
						<c:if test="${sessionScope.usuario.telefono != null }">
							<p class="feature">
								<span class="highlight">Telefono:</span>
								${sessionScope.usuario.telefono}
							</p>
						</c:if>
						<c:if test="${sessionScope.usuario.descripcion != null }">
							<p class="feature">
								<span class="highlight">Descripcion:</span>
								${sessionScope.usuario.descripcion}
							</p>
						</c:if>
						<c:if test="${sessionScope.usuario.intereses != null }">
							<p class="feature">
								<span class="highlight">Intereses:</span>
								${sessionScope.usuario.intereses}
							</p>
						</c:if>
						<span class="feature no-border"></span>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>

	<section id="editUser">
	<div class="container">
		<div class="row">

			<div class="col-md-12">
				<h2 class="section-title wow fadeInUp">EDITA TUS DATOS</h2>
			</div>

			<div class="col-md-6 col-md-offset-3 text-center wow fadeInUp">
				<div id="message"></div>
				<form method="post" action="" name="editUserform" id="editUserform">
					<fieldset>
						<input name="nombre" type="text" id="nombreEdit"
							value="${sessionScope.usuario.nombre }*" /> <input
							name="apellidos" type="text" id="apellidosEdit"
							value="${sessionScope.usuario.apellidos }*" /> <input
							name="username" type="text" id="usernameEdit"
							value="${sessionScope.usuario.username }*" /> <input name="email"
							type="email" id="emailEdit"
							value="${sessionScope.usuario.email }*" /> <input name="password"
							type="password" id="passwordEdit"
							value="${sessionScope.usuario.password }*" /> <input name="edad"
							type="number" id="edadEdit" placeholder="${sessionScope.usuario.edad }" />
						<input name="intereses" type="text" id="interesesEdit"
							value="${sessionScope.usuario.intereses }" /> <input
							name="descripcion" type="text" id="descripcionEdit"
							value="${sessionScope.usuario.descripcion }" />
					</fieldset>
					<fieldset>
						<label for="pagos">Permite el uso de sus datos para sus
							cobros</label> <input name="paypal" type="checkbox" id="paypalEdit">
					</fieldset>
					<input type="submit" class="submit" id="submitEdit"
						value="ACTUALIZAR DATOS" />
				</form>
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
