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
				
				<a href="#"><img class="loginIcon" src="${pageContext.request.contextPath}/resources/img/login_icon.png" alt="" /></a>
				<a class="login-link" href="${pageContext.request.contextPath}/member/login.do">

					<!-- Heading -->
					<h4>Cookcha Login</h4>
					<span>로그인</span>
					<div class="clearfix"></div>
				</a>
				<div class="clearfix"></div>
			</div>
			</c:if>
			<!-- 로그인 버튼 끝 ▲ -->
			<!-- 로그아웃 버튼 시작 ▼ -->
			<c:if test="${!empty userId}">
			<div class="btn-login-md">
				<!-- Image -->
				<a href="#"><img class="img-responsive loginIcon" src="${pageContext.request.contextPath}/resources/img/login_icon.png" alt="" /></a>
				<a class="login-link" href="${pageContext.request.contextPath}/member/logout.do">
					<!-- Heading -->
					<h4 style="color: #FF9436;">${userId}님 환영합니다.</h4>
					<span>로그아웃</span>
					<div class="clearfix"></div>
				</a>
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
		<a href="${pageContext.request.contextPath}/index.do">
			<!-- Logo area -->
			<div class="logo">
				<img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/logo.png" alt="" />
				<!-- Heading -->
				<h1>쿡챠</h1>
				<!-- Paragraph -->
				<p>솔직한 평가들이 모여 만들어진 쿡챠♥</p>
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
						<!-- 홈 -->
						<li><a href="${pageContext.request.contextPath}/index.html"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav1.png" class="img-responsive" alt="" /> 홈</a></li>
				
						<!-- 맛집찾기 -->
						<li><a href="${pageContext.request.contextPath}/member/searchShop.do"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav2.png" class="img-responsive" alt="" /> 맛집찾기</a></li>

						<!-- 샵 -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav3.png" class="img-responsive" alt="" /> 샵<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="${pageContext.request.contextPath}/recommend.do">맞춤추천</a></li>
								<li><a href="${pageContext.request.contextPath}/rate.do">추가평가</a></li>
							</ul>
						</li>
						<!-- 이벤트 -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav4.png" class="img-responsive" alt="" /> 이벤트<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="recipe.html">Recipes</a></li>
							</ul>
						</li>

						<!-- 게시판, 공지사항  -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="${pageContext.request.contextPath}/resources/img/nav-menu/nav5.png" class="img-responsive" alt="" /> 커뮤니티<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">공지사항</a></li>
								<li><a href="${pageContext.request.contextPath}/board/boardList.do">자유게시판</a></li>
							</ul>
						</li>
					</ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
			</nav>
		</div>
	</div>
</div> <!-- / .container -->
