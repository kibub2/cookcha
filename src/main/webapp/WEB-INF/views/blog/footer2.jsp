<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="shopping">
	<div class="container">
		<h2>로그인중인 회원님과 유사한 경향을 가진 사람</h2>
	
		<!-- Shopping items content -->
		<div class="shopping-content">
			<div class="row">
				<div class="col-md-3 col-sm-6">
					<!-- Shopping items -->
					<div class="shopping-item">
						<!-- Image -->
						<a href="item-single.html"><img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/porori.jpg"
							alt="" /></a>
						<!-- Shopping item name / Heading -->
						<h4 class="pull-left">
							<a href="item-single.html">포로리</a>
						</h4>
						<span class="item-price pull-right">$49</span>
						<div class="clearfix"></div>
						<!-- Paragraph -->
						<p>Lorem ipsum dolor sit amet, conse ctetur adipis cicing
							elit.</p>
						<!-- Buy now button -->
						<div class="visible-xs">
							<a class="btn btn-danger btn-sm" href="#">Buy Now</a>
						</div>
						<!-- Shopping item hover block & link -->
						<div class="item-hover br-red hidden-xs"></div>
						<a class="link hidden-xs" href="#">Add to cart</a>
					</div>
				</div>
				
				<div class="col-md-3 col-sm-6">
					<!-- Shopping items -->
					<div class="shopping-item">
						<!-- Image -->
						<a href="item-single.html"><img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/neoburi.jpg"
							alt="" /></a>
						<!-- Shopping item name / Heading -->
						<h4 class="pull-left">
							<a href="item-single.html">너부리</a>
						</h4>
						<span class="item-price pull-right">$49</span>
						<div class="clearfix"></div>
						<!-- Paragraph -->
						<p>Lorem ipsum dolor sit amet, conse ctetur adipis cicing
							elit.</p>
						<!-- Buy now button -->
						<div class="visible-xs">
							<a class="btn btn-danger btn-sm" href="#">Buy Now</a>
						</div>
						<!-- Shopping item hover block & link -->
						<div class="item-hover br-red hidden-xs"></div>
						<a class="link hidden-xs" href="#">Add to cart</a>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<!-- Shopping items -->
					<div class="shopping-item">
						<!-- Image -->
						<a href="item-single.html"><img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/dongul.jpg"
							alt="" /></a>
						<!-- Shopping item name / Heading -->
						<h4 class="pull-left">
							<a href="item-single.html">동굴아저씨</a>
						</h4>
						<span class="item-price pull-right">$49</span>
						<div class="clearfix"></div>
						<!-- Paragraph -->
						<p>Lorem ipsum dolor sit amet, conse ctetur adipis cicing
							elit.</p>
						<!-- Buy now button -->
						<div class="visible-xs">
							<a class="btn btn-danger btn-sm" href="#">Buy Now</a>
						</div>
						<!-- Shopping item hover block & link -->
						<div class="item-hover br-red hidden-xs"></div>
						<a class="link hidden-xs" href="#">Add to cart</a>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<!-- Shopping items -->
					<div class="shopping-item">
						<!-- Image -->
						<a href="item-single.html"><img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/zingzing.jpg"
							alt="" /></a>
						<!-- Shopping item name / Heading -->
						<h4 class="pull-left">
							<a href="item-single.html">징징이</a>
						</h4>
						<span class="item-price pull-right">$49</span>
						<div class="clearfix"></div>
						<!-- Paragraph -->
						<p>징징이</p>
						<!-- Buy now button -->
						<div class="visible-xs">
							<a class="btn btn-danger btn-sm" href="#">Buy Now</a>
						</div>
						<!-- Shopping item hover block & link -->
						<div class="item-hover br-red hidden-xs"></div>
						<a class="link hidden-xs" href="#">Add to cart</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
