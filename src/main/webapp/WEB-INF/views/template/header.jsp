<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
<!-- Header top area content -->
<div class="header-top">
	<div class="row">
		<div class="col-md-4 col-sm-4">
			<!-- Header top left content contact -->
			<div class="header-contact">
				<!-- Contact number -->
				<span><i class="fa fa-phone red"></i>010-5882-5882</span>
			</div>
		</div>
		<div class="col-md-4 col-sm-4">
			<!-- Header top right content search box -->	
			<div class=" header-search">
				<form class="form" role="form">
					<div class="input-group">
					  <input type="text" class="form-control" placeholder="Search...">
					  <span class="input-group-btn">
						<button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
					  </span>
					</div>
				</form>
			</div>
		</div>
		<div class="col-md-4 col-sm-4">
			<!-- 로그인 버튼 시작 ▼ -->
			<c:if test="${empty userId}">
			<div class="btn-login-md">
<<<<<<< HEAD
				<a class="login-link" href="${pageContext.request.contextPath}/member/login.do">
					<!-- Image -->
					<img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/login_icon_black.png" alt="" />
=======

				<!-- Image -->
				<a href="#"><img class="img-responsive loginIcon" src="${pageContext.request.contextPath}/resources/img/login_icon_black.png" alt="" /></a>
				<a class="login-link" href="${pageContext.request.contextPath}/member/login.do">

>>>>>>> 2f64b0acf6cbaa2e848ea8aaaaa3e7b0bbab6ce2
					<!-- Heading -->
					<h4>Cookcha Login</h4>
					<span>로그인</span>
					<div class="clearfix"></div>
				</a>
				<!-- 드롭다운 시작 -->
				<!--
				<ul class="login-dropdown" role="menu">
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav1.jpg" alt="" />
							<span class="login-title"><a href="#">Exception Reins Evocative</a></span>
							<span class="cart-price pull-right red">$200/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav2.jpg" alt="" />
							<span class="login-title"><a href="#">Taut Mayoress Alias Appendicitis</a></span>
							<span class="cart-price pull-right red">$190/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav3.jpg" alt="" />
							<span class="login-title"><a href="#">Sinter et Molests Perfectionist</a></span>
							<span class="cart-price pull-right red">$99/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a class="btn btn-danger" data-toggle="modal" href="#shoppingcart1">Checkout</a>
						</div>
					</li>
				</ul>
				-->
				<!-- 드롭다운 끝 -->
				<div class="clearfix"></div>
			</div>
			</c:if>
			<!-- 로그인 버튼 끝 ▲ -->
			<!-- 로그아웃 버튼 시작 ▼ -->
			<c:if test="${!empty userId}">
			<div class="btn-login-md">
				<!-- Image -->
				<a href="#"><img class="img-responsive loginIcon" src="${pageContext.request.contextPath}/resources/img/login_icon_black.png" alt="" /></a>
				<a class="login-link" href="${pageContext.request.contextPath}/member/logout.do">
					<!-- Heading -->
					<h4 style="color: #FF9436;">${userId}님 환영합니다.</h4>
					<span>로그아웃</span>
					<div class="clearfix"></div>
				</a>
				<!-- 드롭다운 시작 -->
				<!--
				<ul class="login-dropdown" role="menu">
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav1.jpg" alt="" />
							<span class="login-title"><a href="#">Exception Reins Evocative</a></span>
							<span class="cart-price pull-right red">$200/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav2.jpg" alt="" />
							<span class="login-title"><a href="#">Taut Mayoress Alias Appendicitis</a></span>
							<span class="cart-price pull-right red">$190/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a href="#"><i class="fa fa-times"></i></a>
							<img class="img-responsive img-rounded" src="resources/img/nav-menu/nav3.jpg" alt="" />
							<span class="login-title"><a href="#">Sinter et Molests Perfectionist</a></span>
							<span class="cart-price pull-right red">$99/-</span>
							<div class="clearfix"></div>
						</div>
					</li>
					<li>
						<div class="login-item">
							<a class="btn btn-danger" data-toggle="modal" href="#shoppingcart1">Checkout</a>
						</div>
					</li>
				</ul>
				-->
				<!-- 드롭다운 끝 -->
				<div class="clearfix"></div>
			</div>
			</c:if>
			<!-- 로그아웃 버튼 끝 ▲ -->
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-md-4 col-sm-5">
		<!-- Link -->
<<<<<<< HEAD
		<a href="${pageContext.request.contextPath}/index.html">
=======

		<a href="${pageContext.request.contextPath}/index.do">

>>>>>>> 2f64b0acf6cbaa2e848ea8aaaaa3e7b0bbab6ce2
			<!-- Logo area -->
			<div class="logo">
				<img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/logo.png" alt="" />
				<!-- Heading -->
				<h1>Cookcha</h1>
				<!-- Paragraph -->
				<p>Delicious Food</p>
			</div>
		</a>
	</div>
	<div class="col-md-8 col-sm-7">
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-right" role="navigation">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
<<<<<<< HEAD
						<li><a href="${pageContext.request.contextPath}/index.html"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav1.jpg" class="img-responsive" alt="" /> Home</a></li>
=======
						<li><a href="index.html"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav1.jpg" class="img-responsive" alt="" /> Home</a></li>
>>>>>>> 2f64b0acf6cbaa2e848ea8aaaaa3e7b0bbab6ce2
						<li class="dropdown hidden-xs">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav2.jpg" class="img-responsive" alt="" /> Menu <b class="caret"></b></a>
							<ul class="dropdown-menu dropdown-md">
								<li>
									<div class="row">
										<div class="col-md-4 col-sm-6">
											<!-- Menu Item -->
											<div class="menu-item">
												<!-- Heading -->
												<h3>Vegetarian</h3>
												<!-- Image -->
												<img src="${pageContext.request.contextPath}/resources/img/dish/dish1.jpg" class="img-responsive" alt="" />
												<!-- Paragraph -->
												<p>Sea nut perspicacity under omni piste natures mirror of there with consequent.</p>
												<!-- Button -->
												<a href="${pageContext.request.contextPath}/menu.html" class="btn btn-danger btn-xs">View Menu</a>
											</div>
										</div>
										<div class="col-md-4 col-sm-6">
											<!-- Menu Item -->
											<div class="menu-item">
												<!-- Heading -->
												<h3>Non-Vegetarian</h3>
												<!-- Image -->
												<img src="${pageContext.request.contextPath}/resources/img/dish/dish2.jpg" class="img-responsive" alt="" />
												<!-- Paragraph -->
												<p>Sea nut perspicacity under omni piste natures mirror as precode consequent.</p>
												<!-- Button -->
												<a href="menu.html" class="btn btn-danger btn-xs">View Menu</a>
											</div>
										</div>
										<div class="col-md-4">
											<!-- Menu Item -->
											<div class="menu-item">
												<!-- Heading -->
												<h3>Special Menu</h3>
												<!-- Image -->
												<img src="${pageContext.request.contextPath}/resources/img/dish/dish3.jpg" class="img-responsive" alt="" />
												<!-- Paragraph -->
												<p>Sea nut perspicacity under omni piste natures mirror consequent.</p>
												<!-- Button -->
												<a href="menu.html" class="btn btn-danger btn-xs">View Menu</a>
											</div>
										</div>
									</div>
								</li>
							</ul>
						</li>
						
						<li class="dropdown visible-xs">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"> Menu <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="${pageContext.request.contextPath}/menu.html">Vegetarian</a></li>
								<li><a href="${pageContext.request.contextPath}/menu.html">Non Vegetarian</a></li>
								<li><a href="${pageContext.request.contextPath}/menu.html">Special Menu</a></li>
							</ul>
<<<<<<< HEAD
						</li>
						
						<li><a href="${pageContext.request.contextPath}/member/searchShop.do"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav3.jpg" class="img-responsive" alt="" />맛집찾기</a></li>
						
=======
						</li>		
						<li><a href="${pageContext.request.contextPath}/member/searchShop.do"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav3.jpg" class="img-responsive" alt="" />맛집찾기</a></li>
>>>>>>> 2f64b0acf6cbaa2e848ea8aaaaa3e7b0bbab6ce2
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav4.jpg" class="img-responsive" alt="" /> Shop <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="${pageContext.request.contextPath}/recommend.do">맞춤추천</a></li>
								<li><a href="${pageContext.request.contextPath}/rate.do">추가평가</a></li>
								<li><a href="checkout.html">Checkout</a></li>
								<li><a href="reserve-seats.html">Reservation</a></li>
								<li><a href="contact.html">Contact Us</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav5.jpg" class="img-responsive" alt="" /> Pages <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="recipe.html">Recipes</a></li>
							</ul>
						</li>
<<<<<<< HEAD
						<li><a href="aboutus.html"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav6.jpg" class="img-responsive" alt="" /> About</a></li>
=======
						<!-- 게시판, 공지사항 ▼ -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav4.jpg" class="img-responsive" alt="" />게시판/공지사항<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">공지사항</a></li>
								<li><a href="${pageContext.request.contextPath}/board/boardList.do">자유게시판</a></li>
							</ul>
						</li>
						<!-- 게시판, 공지사항 ▲ -->
>>>>>>> 2f64b0acf6cbaa2e848ea8aaaaa3e7b0bbab6ce2
					</ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
			</nav>
		</div>
	</div>
</div> <!-- / .container -->
