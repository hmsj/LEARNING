<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <a class="navbar-brand to-top" rel="home" href="#">
                        	<img src="img/assets/logo-white.png" alt="Dokulearning" class="logo-big">
                            <img src="img/assets/logo-dark.png" alt="Dokulearning" class="logo-small">
                        </a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="main-nav">
                        <ul class="nav navbar-nav  navbar-right">
                            
                            <li><a class="to-top">Home</a></li>
                            <li class="to-section"><a href="login.jsp">Login</a></li>
                            <!-- <li class="to-section"><a href="#team">Team</a></li>
                            <li class="to-section"><a href="#portfolio">Portfolio</a></li>
                            
                            <li class="dropdown">
                                <span class="dropdown-toggle" data-toggle="dropdown">Cursos <b class="caret"></b></span>
                                <ul class="dropdown-menu" role="menu">
                                    <li class="active"><a href="#">Home - Parallax</a></li>
                                    <li><a href="home-video.html">Home - Video Slider</a></li>
                                    <li><a href="home-fullwidth.html">Home - Fullwidth</a></li>
                                    <li><a href="home-landing-page.html">Home - Landing Page</a></li> 
                                    <li><a href="shortcodes.html">Shortcodes</a></li>
                                    <li><a href="http://themeforest.net/user/VossenDesign/portfolio" id="btn-buy"><span class="btn-buy">Buy Now</span></a></li>
                                </ul>
                            </li> 
                            
                            <li class="to-section"><a href="#contact">Contact</a></li> -->
                            <li><a class="social-icon" href="#"><i class="icon icon-social-twitter"></i></a></li>
                            <li><a class="social-icon" href="#"><i class="icon icon-social-facebook"></i></a></li>
                            <li><a class="social-icon" href="#"><i class="icon icon-support"></i></a></li>
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
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="2000" data-thumb="img/backgrounds/bg-home-fullscreen.jpg" data-delay="10000"  data-saveperformance="on" data-title="We Are Vossen">
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
            
            <!-- Start Features Section -->
            <section id="features">
                <div class="container">                      
                    <div class="row features-row wow fadeInUp">
                        
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-eyeglasses size-2x highlight"></i>
                                <i class="icon-eyeglasses back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Parallax Design</h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-lock-open size-2x highlight"></i>
                                <i class="icon-lock-open back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Fully Responsive</h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-energy size-2x highlight"></i>
                                <i class="icon-energy back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Fast & Smooth</h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                                
                    </div>   
                    
                    <div class="row wow fadeInUp">
                        
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-settings size-2x highlight"></i>
                                <i class="icon-settings back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Seo Optimized </h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-book-open size-2x highlight"></i>
                                <i class="icon-book-open back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Clean Code</h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-12 feature-column">
                            <div class="feature-icon">
                                <i class="icon-support size-2x highlight"></i>
                                <i class="icon-support back-icon"></i>
                            </div>
                            <div class="feature-info">
                                <h4>Free 24/7 Support</h4>
                                <p class="feature-description">Vivamus molestie phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa.</p>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </section>
            <!--End Features Section -->
            
            <!-- Start About Section --> 
            <section id="about" class="parallax-section-1"> 
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-6 text-left about-text">
                            <h2 class="content-title white wow fadeInUp">About us.</h2>          
                            <p class="grey wow fadeInUp">Fusce faucibus tincidunt nulla, tincidunt sagittis magna venenatis quis. Proin commodo eu ipsum eu suscipit. In dapibus arcu sit amet imperdiet posuere. Praesent condimentum nulla at mauris ornare, eget consequat felis euismod. Praesent condimentum nulla at mauris ornare.</p> 
				            <p class="grey wow fadeInUp">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis viverra purus tristique. Integer lobortis erat in placerat fermentum. Sed luctus varius leo ac posuere. Integer eget est vitae dolor. Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis viverra purus tristique. Integer lobortis erat in placerat fermentum. Sed luctus varius leo ac posuere. Integer eget est vitae dolor.</p>
                        </div>
                        
                        <div class="col-md-6 wow fadeInUp">
                            <div class="video-container">
                                <iframe src="http://player.vimeo.com/video/115919099?title=0&amp;byline=0&amp;portrait=0&amp;color=fff" allowfullscreen></iframe>
                            </div>
                        </div>

                	</div>
                </div>
            </section>
        	<!-- End About Section -->
            
            <!-- Start Team Section -->
            <section id="team">
                <div class="container"> 
                    
                    <div class="col-md-12 text-center wow fadeInUp">
                        <h3 class="section-title">Meet the Crew.</h3> 
                        <p class="subheading">Interdisciplinary team with <span class="highlight">big ideas</span> and challenges.</p>
                    </div>
                    
                    <div class="row">
                            
                        <div class="col-md-4 col-sm-4 team-member">
                            <div class="effect effects wow fadeInUp">
                                <div class="img">
                                    <img src="img/team-1.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-facebook"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-twitter"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-youtube"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-dribbble"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class=" icon-envelope-open"></i></a></li>
                                        </ul>
                                        <a class="close-overlay hidden">x</a>
                                    </div>
                                </div>
                            </div>
                            <div class="member-info wow fadeInUp">
                                <h4>John Vossen</h4>
                                <h5 class="highlight">CEO / Founder</h5>
                                <p>Vivamus motestues phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa. Quisqueeas sed mi nec.</p>
                            </div>
                        </div>            
                                
                        <div class="col-md-4 col-sm-4 team-member">
                            <div class="effect effects wow fadeInUp">
                                <div class="img">
                                    <img src="img/team-2.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-facebook"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-twitter"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-youtube"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-dribbble"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class=" icon-envelope-open"></i></a></li>
                                        </ul>
                                        <a class="close-overlay hidden">x</a>
                                    </div>
                                </div>
                            </div>
                            <div class="member-info wow fadeInUp">
                                <h4>Jane Wunder</h4>
                                <h5 class="highlight">PR Manager</h5>
                                <p>Vivamus motestues phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa. Quisqueeas sed mi nec.</p>
                            </div>
                        </div> 
                        
                        <div class="col-md-4 col-sm-4 team-member">
                            <div class="effect effects wow fadeInUp">
                                <div class="img">
                                    <img src="img/team-3.jpg" class="img-responsive" alt="" />
                                    <div class="overlay">
                                        <ul class="expand">
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-facebook"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-twitter"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-youtube"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class="icon-social-dribbble"></i></a></li>
                                            <li class="social-icon"><a href="#" onClick="return false;"><i class=" icon-envelope-open"></i></a></li>
                                        </ul>
                                        <a class="close-overlay hidden">x</a>
                                    </div>
                                </div>
                            </div>
                            <div class="member-info wow fadeInUp">
                                <h4>Mike Nicecode</h4>
                                <h5 class="highlight">Web Developer</h5>
                                <p>Vivamus motestues phasellus enim sed orci eu pharetra. Donec posuere nunc vitae tortor sagittis feugiat in non massa. Quisqueeas sed mi nec.</p>
                            </div>
                        </div>                        
                        
                    </div>
                </div>
            </section>
            <!-- End Team Section -->
            
            <!-- Start Skills Section -->
            <section id="skills" class="parallax-section-2"> 
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 col-sm-12 skills-row">
                            <h4 class="content-title white wow fadeInUp">Our Skills.</h4>         
                            <p class="p-info grey wow fadeInUp">Proin commodo eu ipsum eu suscipit. In dapibus arcu sit amet imperdiet posuere. Praesent condimentum nulla at mauris ornare, eget consequat felis euismod.</p> 
                            <p class="p-info grey wow fadeInUp">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis viverra purus tristique. Integer lobortis erat in placerat fermentum. Sed luctus varius leo ac posuere. Integer eget est vitae dolor. Duis vulputate nibh sit amet augue vehicula, mattis viverra purus tristique. Proin commodo eu ipsum eu suscipit. </p>   
                        </div>
                        
                        <div class="col-md-8 col-sm-12 wow fadeInUp">
                            <div class="progress-bars">
								<p>Branding</p>
								<div class="progress" data-percent="85%">
									<div class="progress-bar">
										<span class="progress-bar-tooltip">85%</span>
									</div>
								</div>
								<p>User Experience</p>
								<div class="progress" data-percent="100%">
									<div class="progress-bar progress-bar-primary">
										<span class="progress-bar-tooltip">100%</span>
									</div>
								</div>
								<p>Web Design</p>
								<div class="progress" data-percent="70%">
									<div class="progress-bar progress-bar-primary">
										<span class="progress-bar-tooltip">70%</span>
									</div>
								</div>
								<p>Fun</p>
								<div class="progress" data-percent="82%">
									<div class="progress-bar progress-bar-primary">
										<span class="progress-bar-tooltip">82%</span>
									</div>
								</div>
                                <p>Visual Design</p>
								<div class="progress" data-percent="94%">
									<div class="progress-bar progress-bar-primary">
										<span class="progress-bar-tooltip">94%</span>
									</div>
								</div>
							</div>
                        </div>
                    
                    </div>
                </div>
            </section>
            <!-- End Skills Section -->
            
            <!-- Start Fun Facts Section -->
            <section id="fun-facts">
            	<div class="container">
                    
                	<div class="counter-row row text-center wow fadeInUp">
                    	<div class="col-md-3 col-sm-6 fact-container">
                        	<div class="fact">
                            	<span class="counter highlight">1840</span> 
                                <h4>Happy Customers</h4>
                                <p>Sibh <span class="highlight">vulputate</span> vivamus</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6 fact-container">
                        	<div class="fact">
                            	<span class="counter highlight">385</span>
                                <h4>Finished Projects</h4>
                                <p>Duis vulputate <span class="highlight">nibh</span> sit</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6 fact-container">
                        	<div class="fact">
                            	<h2 class="highlight">Million</h2>
                                <h4>Lines of codes written</h4>
                                <p>Vivamus a <span class="highlight">placerat</span> ante eget</p>
                            </div>
                        </div> 
                        <div class="col-md-3 col-sm-6 fact-container">
                        	<div class="fact">
                            	<span class="counter highlight">25</span>
                                <h4>Winning Awards</h4>
                                <p>Fusce <span class="highlight">tincidunt</span> nulla</p>
                            </div>
                        </div>
                    </div> 
                        
                </div>
            </section>
            <!-- End Fun Facts Section --> 
            
            <!-- Start Quote Section -->    
            <section id="quote" class="parallax-section-3">
                <div class="container">
                    <div class="row wow fadeInUp">
                        
                        <div class="col-lg-12 wow fadeInUp" style="z-index:3">
                            <div id="quote-slider" class="owl-carousel">
                                <div>
                                    <blockquote>
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span>  
                                                The Difference between ordinary and extraordinary<br>is just that little extra!
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </blockquote>
                                    <h4 class="quote-author highlight">Vossen Team</h4>
                                </div>
                                <div>
                                    <blockquote>
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span> 
                                                A Perfect Design is made with Passion, Dedication,<br> and a lots of Coffee!
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </blockquote>
                                    <h4 class="quote-author highlight">Vossen Team</h4>
                                </div>
                                <div>
                                    <blockquote>
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span>
                                                What separates design from art is that design is<br>meant to be... functional.
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </blockquote>
                                    <h4 class="quote-author highlight">Vossen Team</h4>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </section>
            <!-- End Quote Section -->
            
            <!-- Start Portfolio Section -->
            <section id="portfolio" style="position: relative;"> 
                <div class="separator"></div>
                <div class="container">
                    
                    <div class="col-md-12 text-center">
                        <h3 class="section-title wow fadeInUp">Nuestros cursos</h3> 
                        <p class="subheading wow fadeInUp">Creating products and services that <span class="highlight">transform brands</span>.</p>
                    </div>

                    <div id="filters-container-fullwidth" class="cbp-l-filters-alignCenter wow fadeInUp">
                        <div data-filter="*" class="cbp-filter-item-active cbp-filter-item">All<div class="cbp-filter-counter"></div></div>
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
                                            <li class="cbp-l-caption-title">Future Trend</li>
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/1.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project1.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
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
                                            <li class="cbp-l-caption-desc">by Vossen Design</li>
                                            <li class="cbp-l-icon"><a href="img/portfolio/fullsize/12.jpg" class="cbp-lightbox" data-title="Dashboard<br>by Wunderwelt"><i class="icon-magnifier"></i></a></li>
                                            <li class="cbp-l-icon"><a href="projects/project12.html" class="cbp-singlePage"><i class="icon-link"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li> 
                            
                        </ul>
                    </div>
                    
                    <div class="cbp-l-loadMore-button">
                        <a href="projects/loadMore.html" class="cbp-l-loadMore-button-link wow fadeInUp">SHOW ME MORE</a>
                        <!-- Portfolio AJAX load more button will be functional only on your server. Upload to your server when testing. -->
                    </div>
                    
                </div>
            </section>
            <!-- End Portfolio Section -->            
            
            <!-- Start Get Connected -->
            <section id="get-connected" class="parallax-section-4">
                <div class="container"> 
                	
                    <div class="col-md-12 text-center">
                        <h3 class="section-title white wow fadeInUp">Get Connected.</h3> 
                        <p class="subheading grey wow fadeInUp">Stay connected with us through <span class="highlight">social</span> networks!</p>
                    </div>
                    
                    <div class="row text-center wow fadeInUp">
                    	<ul class="connected-icons text-center">
                            
 							<li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon icon-social-facebook size-6x"></span>
                                    <h4 class="white">Facebook</h4>
                                    <span class="grey">Be Our Friend</span>
                                </a>
                            </li>
                            
                            <li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon icon-social-twitter size-6x"></span>
                                    <h4 class="white">Twitter</h4>
                                    <span class="grey">Follow Us</span>
                                </a>
                            </li>
                            
                            <li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon icon-social-youtube size-6x"></span>
                                    <h4 class="white">Youtube</h4>
                                    <span class="grey">Our New Videos</span>
                                </a>
                            </li>
                            
                            <li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon ion-social-instagram-outline size-6x"></span>
                                    <h4 class="white">Instagram</h4>
                                    <span class="grey">See Our Images</span>
                                </a>
                            </li>
                            
                            <li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon ion-social-pinterest-outline size-6x"></span>
                                    <h4 class="white">Linkedin</h4>
                                    <span class="grey">Check Our Identity</span>
                                </a>
                            </li>
                            
                            <li class="connected-icon">
                                <a target="_blank" href="#">
                                    <span class="icon ion-social-linkedin-outline size-6x"></span>
                                    <h4 class="white">Pinterest</h4>
                                    <span class="grey">Our Visual Discovery</span>
                                </a>
                            </li>
                            
                    	</ul>        
                	</div>  
                    
                </div>
            </section>
            <!-- End Get Connected -->                
            
            <!-- Start Services Section -->
            <section id="services">
                <div class="container">  
                    
                    <div class="col-md-12 text-center">
                        <h3 class="section-title wow fadeInUp">What we do.</h3>
                        <p class="subheading wow fadeInUp">We use <span class="highlight">our expertise</span> to extend your brand.</p>
                    </div>
                    
                    <div class="row text-center wow fadeInUp">
                        
                        <div class="col-md-3 col-sm-6 service">
                            <span class="icon-eyeglasses size-6x"></span>
                            <div class="service-info">
                                <h4>Building Shiny Brands</h4>
                                <p class="service-description">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis<br> viverra purus tristique.</p>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 service">
                            <span class="icon-lock-open size-6x"></span>
                            <div class="service-info">
                                <h4>Creating Experiences</h4>
                                <p class="service-description">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis<br> viverra purus tristique.</p>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 service">
                            <span class="icon-diamond size-6x"></span>
                            <div class="service-info">
                                <h4>Digital Products</h4>
                                <p class="service-description">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis<br> viverra purus tristique.</p>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 service">
                            <span class="icon-support size-6x"></span>
                            <div class="service-info">
                                <h4>Delivering Platforms</h4>
                                <p class="service-description">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis<br> viverra purus tristique.</p>
                            </div>
                        </div>
                             
                    </div>
                    
                </div>
            </section>
            <!-- End Services Section --> 
            
            <!-- Start Call to Action 1 -->
            <section id="call-to-action-1" class="parallax-section-5">
                <div class="container">
                    <div class="row">
                    
                        <div class="col-md-12 text-center">
                            <h3 class="wow fadeInUp">FEEL LIKE WORKING WITH US?</h3>
                            <p class="wow fadeInUp">Vivamus a placerat ante. Duis vulputate nibh sit amet augue vehicula, mattis ni<br>viverra purus tristique. Proin commodo eu ipsum. </p>
                            <a href="#contact" class="btn btn-primary btn-scroll">Get in Touch</a>
                        </div>
                    
                    </div>
                </div>
            </section>
            <!-- End Call to Action 1 -->
            
            <!-- Start Price List -->
            <section id="price-list" class="parallax-section-6">
                <div class="container">
                    <div class="row wow fadeInUp">
                        	 
                        <div class="col-md-3 col-sm-6 price-list-box">
                            <div class="price-box">
                                <div class="price-table">
                                    <h3 class="label">Basic</h3>
                                    <p class="price grey">
                                        <sup class="currency">$</sup>
                                        <span class="pricing">99</span>
                                        <span class="time-period">Per Month</span>
                                    </p>
                                    <p class="features grey">
                                        <span class="feature">24/7 Free Support</span>
                                        <span class="feature">100GB Storage</span>
                                        <span class="feature">1GB Bandwidth</span>
                                        <span class="feature"></span>
                                        <span class="feature no-border"></span>
                                        <span class="feature option-button no-border">
                                            <a href="#" class="btn-effect">SIGN UP NOW!</a>
                                        </span>
                                        
                                    </p>
                                </div>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 featured price-list-box">
                            <div class="price-box">
                                <div class="price-table">
                                    <h3 class="label">Advanced<span>Best Choice</span></h3>
                                    <p class="price grey">
                                        <sup class="currency">$</sup>
                                        <span class="pricing">199</span>
                                        <span class="time-period">Per Month</span>
                                    </p>
                                    <p class="features grey">
                                        <span class="feature">24/7 Free Support</span>
                                        <span class="feature">900GB Storage</span>
                                        <span class="feature">10GB Bandwidth</span>
                                        <span class="feature">Free Upgrades</span>
                                        <span class="feature">Unlimited Power</span>
                                        <span class="feature option-button no-border">
                                            <a href="#" class="btn-effect">SIGN UP NOW!</a>
                                        </span>
                                    </p>
                                </div>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 price-list-box">
                            <div class="price-box">
                                <div class="price-table">
                                    <h3 class="label">Standard</h3>
                                    <p class="price grey">
                                        <sup class="currency">$</sup>
                                        <span class="pricing">125</span>
                                        <span class="time-period">Per Month</span>
                                    </p>
                                    <p class="features grey">
                                        <span class="feature">24/7 Free Support</span>
                                        <span class="feature">200GB Storage</span>
                                        <span class="feature">2GB Bandwidth</span>
                                        <span class="feature">Free Upgrades</span>
                                        <span class="feature"></span>
                                        <span class="feature option-button no-border">
                                            <a href="#" class="btn-effect">SIGN UP NOW!</a>
                                        </span>
                                    </p>
                                </div>
                            </div>
                        </div>
                        
                        <div class="col-md-3 col-sm-6 price-list-box">
                            <div class="price-box">
                                <div class="price-table">
                                    <h3 class="label">Premium</h3>
                                    <p class="price grey">
                                        <sup class="currency">$</sup>
                                        <span class="pricing">150</span>
                                        <span class="time-period">Per Month</span>
                                    </p>
                                    <p class="features grey">
                                        <span class="feature">24/7 Free Support</span>
                                        <span class="feature">500GB Storage</span>
                                        <span class="feature">5GB Bandwidth</span>
                                        <span class="feature">Free Upgrades</span>
                                        <span class="feature">Unlimited Users</span>
                                        <span class="feature option-button no-border">
                                            <a href="#" class="btn-effect">SIGN UP NOW!</a>
                                        </span>
                                    </p>
                                </div>
                            </div>
                        </div>
                                
                	</div>
            	</div>
            </section>        
            <!-- End Price List --> 
            
            <!-- Start Clients Section -->   
            <section id="clients">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12 text-center">
                            <h3 class="section-title wow fadeInUp">Recent Clients.</h3>
                            <p class="subheading wow fadeInUp">Meet our clients, some of the most well known companies.</p>
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
            <!-- End Clients Section -->        
            
            <!-- Start Testimonials Section -->   
            <section id="testimonials" class="parallax-section-7">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12 text-center">
                            <h3 class="section-title white wow fadeInUp">What clients say.</h3>
                            <p class="subheading grey wow fadeInUp">Hear what over <span class="highlight">4000 satisfied</span> customers say about us!</p>
                        </div>
                        
                        <div class="col-md-12 text-center wow fadeInUp">
                            <div id="owl-testimonials" class="owl-carousel">
                                
                                <div>
                                    <div class="testimonial">
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span> 
                                                This guys are amazing! They were so quick to respond and let me tell you... they are all knowing!<br>I highly recommend their themes! They are all about making their clients happy.
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </div>
                                    <div class="testimonial-name">
                                        <img src="img/clients/client-1.png" alt="client">
                                        <h4 class="white">Jane Wanderful</h4>
                                        <a href="#">www.wanderful.com</a>
                                    </div>
                                </div>
                                
                                <div>
                                    <div class="testimonial">
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span>
                                                This one is undoubtedly the best template I ever bought! Easy to edit, nicely coded and I highly recommend it.<br>It's wonderful design and also very fast and excelent support.
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </div>
                                    <div class="testimonial-name">
                                        <img src="img/clients/client-2.png" alt="client">
                                        <h4 class="white">Jack Smith</h4>
                                        <a href="#">www.jsmith.com</a>
                                    </div>
                                </div>
                                
                                <div>
                                    <div class="testimonial">
                                        <i class="icon-left ion-quote ion-2x highlight"></i>
                                            <span>
                                                Vossen is well documented and well coded, but the best of all is the friendly and quick support behind it.<br>Vossen Design did a great and dedicated job. Thank you for this awesome theme!
                                            </span>
                                        <i class="icon-right ion-quote ion-2x highlight"></i>
                                    </div>
                                    <div class="testimonial-name">
                                        <img src="img/clients/client-3.png" alt="client">
                                        <h4 class="white">Joana Wunder</h4>
                                        <a href="#">www.wunder.com</a>
                                    </div>
                                </div>
                                
                            </div>
                        </div> 
                        
                    </div>
                </div>
            </section>
            <!-- End Testimonials Section -->
            
            <!-- Start Contact Form Section -->    
            <section id="contact">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12">
                            <h2 class="section-title wow fadeInUp">LET’S WORK TOGETHER.</h2> 
                        </div>
                        
                        <div class="col-md-6 col-md-offset-3 text-center wow fadeInUp">
                            <div id="message"></div>
                            <!-- Contact Form will be functional only on your server. Upload to your server when testing. -->
                            <form method="post" action="php/contact-form.php" name="contactform" id="contactform">
                                <fieldset>
                                        <input name="name" type="text" id="name" placeholder="Name"/> 
                                        <input name="email" type="text" id="email" placeholder="Email"/>  
                                        <input name="subject" type="text" id="subject" placeholder="Subject"/> 
                                </fieldset>
                                <fieldset> 
                                        <textarea name="comments" cols="40" rows="3" id="comments" placeholder="Message"></textarea>
                                </fieldset>
                                <input type="submit" class="submit" id="submit" value="Send Message" />
                            </form>
                        </div>  
                        
                        <div class="col-md-12 text-center wow fadeInUp" style="margin-top:20px;">
                            <p>We would love to hear from you so let's get in touch!</p>
                            <h4>CONTACT US TODAY!</h4>
                            <p>259 West 95th Street<br>New York, NY 10025<br>(555) 121-0199</p>
                        </div>
                                                 
                    </div>
                </div>
            </section>
            <!-- End Contact Form Section -->
            
            <!-- Start Google Map Section -->
            <div id="map"></div>
            <!-- End Google Map Section -->
            
            <!-- Start Video Section -->     
            <section id="video-section" class="parallax-section-8">
                <div class="container">
                    <div class="row text-center">
                             
                            <div class="col-md-12 text-center">
                                <h3 class="white wow fadeInUp">Watch our Reel.</h3>
                                <p class="subheading grey wow fadeInUp">We build designs that will build your business</p>
                            </div>
                            
                            <div id="video-lightbox" class="col-md-12 text-center">
                                <ul>
                                    <li class="cbp-item">
                                        <a class="cbp-lightbox" href="https://www.youtube.com/watch?v=9No-FiEInLA"><span class="play play-video wow fadeInUp">Play Video</span></a>
                                    </li>
                                </ul>
                            </div>
                        
                    </div>
                </div>
            </section>
            <!-- End Video Section -->
            
            <!-- Start Footer 1 -->
            <footer id="footer">
                <div class="footer-widgets">
                    <div class="container"> 
                            
                            <div class="col-md-3 col-sm-6 col-twitter">
                                <h4>Latest Tweet</h4>
                                <div class="tweet"></div> 
                            </div>
                            
                            <div class="col-md-3 col-sm-6 col-footer">
                                <div class="subscription">
                                    <h4>Newsletter</h4>
                                    <p>Subscribe to receive new ideas, inspiration and our weekly news!</p> 
                                    
                                    <form action="php/subscribe-mailchimp.php" method="post" id="subscribe-form" role="form">
                                        <div class="form-validation alert"></div>
                                        <div class="form-group subscribe-form-input">
                                            <input type="email" name="email" id="subscribe-form-email" class="footer-subscribe-input" placeholder="Your Email Address" autocomplete="off" />      
                                            <button class="subscribe-form-submit btn-primary-full" data-loading-text="Loading...">Subscribe</button>
                                        </div>
                                    </form>
                                    
                                </div>
                            </div> 
                            
                            <div class="col-md-3 col-sm-6 col-footer">
                                <div class="contact">
                                    <h4>Visit us Today!</h4>
                                    <ul class="contact-details">
                                        <li><p><i class="icon ion-ios-location-outline highlight"></i> 259 W 95th St, New York, United States</p></li>
                                        <li><p><i class="icon ion-ios-telephone highlight"></i> (123) 456-7891</p></li>
                                        <li><p><i class="icon ion-android-mail highlight"></i> <a href="vossendesign@gmail.com">vossendesign@gmail.com</a></p></li>
                                    </ul>
                                </div>
                            </div>
                            
                            <div class="col-md-3 col-sm-6 col-footer">
                                <h4>About Vossen</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed in euismod nisi.</p>
                                <p>Cras at ultrices erat, sed vulputate eros. Nunc at augue gravida est fermentum vulputate. Pellentesque et ipsum in dui malesuada tempus. Donec pellentesque.</p>
                            </div>
                             
                    </div>
                </div><!-- End Footer Widgets -->
                
				<div class="footer-copyright">
					<div class="container">
						<div class="row">
								
							<div class="col-md-6 col-sm-12">
								<p>© 2015 Vossen Theme by <a href="index.html" class="logo">Vossen Design.</a> All Rights Reserved. </p>
							</div>
							<div class="col-md-6 col-sm-12">
				                <ul id="social-icons">
						            <li><a href="#"><i class="icon ion-social-twitter"></i></a></li> 	
                                    <li><a href="#"><i class="icon ion-social-facebook"></i></a></li> 
                                    <li><a href="#"><i class="icon ion-social-googleplus"></i></a></li> 
                                    <li><a href="#"><i class="icon ion-social-instagram-outline"></i></a></li> 
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