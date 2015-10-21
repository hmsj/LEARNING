<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="css/colors/green.css" id="color-skins"/> 
    </head>
    <body>
                <!--Start Header-->
        <header>
			<nav class="navbar navbar-default navbar-alt" role="navigation">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
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
                            <!-- <li class="to-section"><a href="#team">Team</a></li>
                            <li class="to-section"><a href="#portfolio">Portfolio</a></li>
 -->                            
                            <li class="dropdown">
                                <span class="dropdown-toggle" data-toggle="dropdown">Cursos <b class="caret"></b></span>
                                <ul class="dropdown-menu" role="menu">
                                    <li class="active"><a href="#">Home - Parallax</a></li>
                                    <li><a href="home-video.html">Home - Video Slider</a></li>
                                    <li><a href="home-fullwidth.html">Home - Fullwidth</a></li>
                                    <li><a href="home-landing-page.html">Home - Landing Page</a></li> 
                                    <li><a href="shortcodes.html">Shortcodes</a></li>
                                  
                                </ul>
                            </li> 
                            
                            <li class="to-section"><a href="signup.jsp">Registrarse</a></li>
                            <li><a class="social-icon" href="http://www.twitter.com"><i class="icon icon-social-twitter"></i></a></li>
                            <li><a class="social-icon" href="http://www.facebook.com"><i class="icon icon-social-facebook"></i></a></li>
                            <li><a class="social-icon" href="http://www.google.com"><i class="icon icon-support"></i></a></li>
                      </ul>
                    </div><!-- /.navbar-collapse -->
				</div><!-- /.container -->
			</nav>
		</header>
        <!--End Header-->
        
        <!-- Start Home Revolution Slider Parallax Section -->
        <section id="home-revolution-slider">
            <div class="hero">
                <div class="tp-banner-container">
                    <div class="tp-banner">
                        <ul>
                            <!-- SLIDE 1 -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="2000" data-thumb="img/backgrounds/bg-home-fullscreen.jpg" data-delay="10000"  data-saveperformance="on" data-title="">
                                <img src="img/backgrounds/startup-photos-medium.jpg" alt="slidebg1" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat"> 

                                    <!-- Home Heading -->
                                    <div class="tp-caption sft"
                                        data-x="center"  
                                        data-y="260"
                                        data-speed="1200"
                                        data-start="1100"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <h2 class="home-heading op-1">DokuLearning</h2>
                                    </div>
                                    <!-- Home Subheading -->
                                    <div class="tp-caption home-subheading sft fadeout"
                                        data-x="center" 
                                        data-y="360" 
                                        data-speed="1200"
                                        data-start="1350"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-1">2015 · TU PORTAL DE E-LEARNING</div>
                                    </div>
                                    <!-- Home Button -->
                                    <div class="tp-caption home-button sft fadeout"
                                        data-x="center" 
                                        data-y="400" 
                                        data-speed="1200"
                                        data-start="1550"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-1"><a href="#features" class="btn btn-primary btn-scroll">ACCEDER</a></div>
                                    </div>

                            </li>

                            <!-- SLIDE 2 -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="2000" data-thumb="img/backgrounds/bg-1.jpg" data-delay="10000"  data-saveperformance="on" data-title="Digital Agency">
                                <img src="img/backgrounds/bg-1.jpg" alt="slidebg1" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat"> 

                                    <!-- Home Heading -->
                                    <div class="tp-caption sft"
                                        data-x="center"  
                                        data-y="260"
                                        data-speed="1200"
                                        data-start="1100"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <h2 class="home-heading op-2">A Digital Design Agency</h2>
                                    </div>
                                    <!-- Home Subheading -->
                                    <div class="tp-caption home-subheading sft fadeout"
                                        data-x="center" 
                                        data-y="360" 
                                        data-speed="1200"
                                        data-start="1350"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-2">2015 · BRAND POSITIONING · IDENTITY DESIGN · VISUAL DESIGN</div>
                                    </div>
                                    <!-- Home Button -->
                                    <div class="tp-caption home-button sft fadeout"
                                        data-x="center" 
                                        data-y="400" 
                                        data-speed="1200"
                                        data-start="1550"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-2"><a href="#about" class="btn btn-primary btn-scroll">WHAT WE DO</a></div>
                                    </div>

                            </li>

                            <!-- SLIDE 3 -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="2000" data-thumb="img/backgrounds/bg-3.jpg" data-delay="10000"  data-saveperformance="on" data-title="Creative Coders">
                                <img src="img/backgrounds/bg-3.jpg" alt="slidebg1" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat"> 

                                    <!-- Home Heading -->
                                    <div class="tp-caption sft"
                                        data-x="center"  
                                        data-y="260"
                                        data-speed="1200"
                                        data-start="1100"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <h2 class="home-heading op-3">Creative Coders</h2>
                                    </div>
                                    <!-- Home Subheading -->
                                    <div class="tp-caption home-subheading sft fadeout"
                                        data-x="center" 
                                        data-y="360" 
                                        data-speed="1200"
                                        data-start="1350"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-3">2015 · BRAND POSITIONING · IDENTITY DESIGN · VISUAL DESIGN</div>
                                    </div>
                                    <!-- Home Button -->
                                    <div class="tp-caption home-button sft fadeout"
                                        data-x="center" 
                                        data-y="400" 
                                        data-speed="1200"
                                        data-start="1550"
                                        data-easing="Power3.easeInOut"
                                        data-splitin="none"
                                        data-splitout="none"
                                        data-elementdelay="0.1"
                                        data-endelementdelay="0.1"
                                        data-endspeed="300"
                                        style="z-index: 4; max-width: auto; max-height: auto; white-space: nowrap;">
                                        <div class="op-3"><a href="#team" class="btn btn-primary btn-scroll">MEET THE TEAM</a></div>
                                    </div>

                            </li>

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
        
         <!-- Start Portfolio Section -->
            <section id="portfolio" style="position: relative;"> 
                <div class="separator"></div>
                <div class="container">
                    
                    <div class="col-md-12 text-center">
                        <h3 class="section-title wow fadeInUp">Nuestros cursos</h3> 
                        <p class="subheading wow fadeInUp">Elige entre nuestra variedad de <span class="highlight">cursos</span>.</p>
                    </div>

                    <div id="filters-container-fullwidth" class="cbp-l-filters-alignCenter wow fadeInUp">
                        <div data-filter="*" class="cbp-filter-item-active cbp-filter-item">Todos<div class="cbp-filter-counter"></div></div>
                        <div data-filter=".identity" class="cbp-filter-item">Identity<div class="cbp-filter-counter"></div></div>
                        <div data-filter=".web-design" class="cbp-filter-item">Web Design<div class="cbp-filter-counter"></div></div>
                        <div data-filter=".graphic" class="cbp-filter-item">Graphic<div class="cbp-filter-counter"></div></div>
                        <div data-filter=".logo" class="cbp-filter-item">Logo<div class="cbp-filter-counter"></div></div>
                        <div data-filter=".motion" class="cbp-filter-item">Motion<div class="cbp-filter-counter"></div></div>
                    </div>

                    <div id="grid-container-fullwidth" class="cbp-l-grid-fullScreen">
                        <ul>   
                            
                            <li class="cbp-item effect effects identity logo">
                                <div class="img">
                                    <img src="img/portfolio/1.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Tu curso online</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/1.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-info"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project1.html" class="cbp-singlePage"><i class="icon-handbag"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li> 
                            
                            <li class="cbp-item effect effects identity logo">
                                <div class="img">
                                    <img src="img/portfolio/2.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Pro Bicycle</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/2.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project2.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects web-design">
                                <div class="img">
                                    <img src="img/portfolio/3.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Door Cover</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/3.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project3.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects motion identity">
                                <div class="img">
                                    <img src="img/portfolio/4.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Pro Close-up</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a class="cbp-lightbox" href="https://www.youtube.com/watch?v=3wbvpOIIBQA" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project4.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects identity">
                                <div class="img">
                                    <img src="img/portfolio/5.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Bohemian Coding</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/5.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project5.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects motion logo">
                                <div class="img">
                                    <img src="img/portfolio/6.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Poster Wall</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="https://www.youtube.com/watch?v=9No-FiEInLA" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project6.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects web-design">
                                <div class="img">
                                    <img src="img/portfolio/7.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Red Bridge</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/7.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project7.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects web-design">
                                <div class="img">
                                    <img src="img/portfolio/8.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">V8 M52 Engine</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/8.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project8.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects identity motion">
                                <div class="img">
                                    <img src="img/portfolio/9.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Ergonomic Pad</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="http://vimeo.com/16465813" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project9.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li> 
                            
                            <li class="cbp-item effect effects web-design graphic">
                                <div class="img">
                                    <img src="img/portfolio/10.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Cooling Tower</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/10.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project10.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects graphic logo">
                                <div class="img">
                                    <img src="img/portfolio/11.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Still Motion</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/11.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project11.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            
                            <li class="cbp-item effect effects graphic logo">
                                <div class="img">
                                    <img src="img/portfolio/12.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="cbp-l-caption-title">Print Design</li>
                                            <li class="cbp-l-caption-desc">by grupo 2</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/12.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project12.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li> 
                            
                        </ul>
                    </div>
                    
                    <div class="cbp-l-loadMore-button">
                        <a href="projects/loadMore.html" class="cbp-l-loadMore-button-link wow fadeInUp">VER MAS</a>
                        <!-- Portfolio AJAX load more button will be functional only on your server. Upload to your server when testing. -->
                    </div>
                    
                </div>
            </section>
            <!-- End Portfolio Section -->
            
             <!-- Start Testimonials Section -->   
            <section id="testimonials" class="parallax-section-7">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12 text-center">
                            <h3 class="section-title white wow fadeInUp">Cursos Destacados</h3>
                            <p class="subheading grey wow fadeInUp">Estos son nuestros cursos con mas exito <span class="highlight">4000 satisfied</span> customers say about us!</p>
                        </div>
                        
                        <div class="clients">
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-1-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-1-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-2-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-2-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-3-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-3-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-4-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-4-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-5-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-5-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-6-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-6-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-7-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-7-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-8-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-8-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-9-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-9-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-10-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-10-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-11-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-11-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                            <div class="col-md-2 col-sm-3 col-xs-6 client wow fadeInUp">
                                <a href="#">
                                    <div class="logo-dark">
                                        <img src="img/clients/logo-12-dark.png" class="img-responsive" alt="client">
                                    </div>
                                    <div class="logo-light">
                                        <img src="img/clients/logo-12-light.png" class="img-responsive" alt="client">
                                    </div>
                                </a>    
                            </div>
                            
                        </div>
                        
                    </div>
                </div>
            </section>
            <!-- End Testimonials Section -->

            <!-- Start Footer 1 -->
            <footer id="footer">
                
                
				<div class="footer-copyright">
					<div class="container">
						<div class="row">
								
							<div class="col-md-6 col-sm-12">
								<p>© 2015 TIW UC3M <a href="index.html" class="logo">Dokulearning</a> All Rights Reserved. </p>
							</div>
							<div class="col-md-6 col-sm-12">
				                <ul id="social-icons">
						            <li><a href="http://www.twitter.com"><i class="icon ion-social-twitter"></i></a></li> 	
                                    <li><a href="http://www.facebook.com"><i class="icon ion-social-facebook"></i></a></li> 
                                    <li><a href="http://www.youtube.com"><i class="icon ion-social-youtube"></i></a></li>
                                </ul>
							</div>
						</div>
					</div>
				</div><!-- End Footer Copyright -->
                
			</footer>
            <!-- End Footer 1 -->
            
            <!-- Start Back To Top -->
            <a id="back-to-top"><i class="icon ion-chevron-up"></i></a>
            <!-- End Back To Top -->
                      
        </div> <!-- End Site Wrapper --> 
        
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
