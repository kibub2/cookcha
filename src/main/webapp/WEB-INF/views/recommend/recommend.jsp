<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 배너 -->
<div class="banner padd">
	<div class="container">
		<!-- Heading -->
		<h2 class="white">맛집 추천</h2>
		<ol class="breadcrumb">
			<li><a href="index.html">Home</a></li>
			<li class="active">Shopping</li>
		</ol>
		<div class="clearfix"></div>
	</div>
</div>

<!-- 출력폼 -->
<div class="inner-page padd">
	<div class="shopping">
		<div class="container">
		
			<!-- 제목 / 설명 -->
			<div class="default-heading">
				<!-- Crown image -->
				<img class="img-responsive" src="${pageContext.request.contextPath }/resources/img/crown.png" alt="">
				<!-- Heading -->
				<h2>사용자 기반 맛집 추천</h2>
				<!-- Paragraph -->
				<p>회원님이 평가한 정보를 바탕으로 회원님과 가장 비슷한 사용자들을 찾아서, 예상 별점이 가장 높은 가게를 추천해 드립니다.</p>
				<!-- Border -->
				<div class="border"></div>
			</div>
			
			<div class="shopping-content">
					<!-- 맛집추천 목록폼 출력 -->
					<div class="row">
					<c:if test="${map.result == 'enough' }">
					<c:forEach var="shop" items="${shopList}">
							<div class="col-md-3 col-sm-6">
								<div class="shopping-item">
									<!-- Image -->
									<a href="#">
									<object class="img-responsive" data="${pageContext.request.contextPath}/upload/${shop.code }-1.jpg" type="image/jpg">
		    							<img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/noImage.jpg" />
		  							</object>
									<%-- <img class="img-responsive" src="${pageContext.request.contextPath}/upload/${shop.code }-1.jpg" alt="" /> --%></a>
									<!-- Shopping item name / Heading -->
									<h4 class="pull-left hideOverflow"><a href="#" >${shop.name }</a></h4>
									<span class="item-price pull-right">
									
										${shop.shop_rating }</span>
									<div class="clearfix"></div>
									<!-- Paragraph -->
									<p>${shop.address }</p>
									<!-- Buy now button -->
									<div class="visible-xs">
										<a class="btn btn-red btn-sm" href="#">
										
										 Buy Now
										</a>
									</div>
									<!-- Shopping item hover block & link -->
									<div class="item-hover br-red hidden-xs">
									<form id="ratingsForm">
										<div class="stars">
											<input type="radio" name="star" class="star-1" id="${shop.code }-star-1">
											<label class="star-1" id="${shop.code }-star-1">1</label>
											<input type="radio" name="star" class="star-2" id="${shop.code }-star-2">
											<label class="star-2" id="${shop.code }-star-2">2</label>
											<input type="radio" name="star" class="star-3" id="${shop.code }-star-3">
											<label class="star-3" id="${shop.code }-star-3">3</label>
											<input type="radio" name="star" class="star-4" id="${shop.code }-star-4">
											<label class="star-4" id="${shop.code }-star-4">4</label>
											<input type="radio" name="star" class="star-5" id="${shop.code }-star-5">
											<label class="star-5" id="${shop.code }-star-5">5</label>
											<%-- <c:set var="shopCode" value="${shop.code }"></c:set> --%>
											<c:forEach var="rate" items="${ratingList }">
											<%-- <c:set var="rateCode" value="${rate.shop_code }"></c:set> --%>
											<c:if test="${shop.code == rate.shop_code }">
												<span style="width:${rate.private_rate*20}%" class="ratedShop"></span>
											</c:if>
											</c:forEach>
											<span></span>
										</div>
									</form>
									</div>
									<!-- Hot tag -->
									<c:forEach var="rate" items="${ratingList }">
											<%-- <c:set var="rateCode" value="${rate.shop_code }"></c:set> --%>
											<c:if test="${shop.code == rate.shop_code }">
												<span class="hot-tag br-red">rated</span>
											</c:if>
									</c:forEach>
								</div>
							</div>	
						</c:forEach>
						</c:if>
						<c:if test="${map.result == 'notEnough' }">
							<a>평가 정보가 충분하지 않습니다. 추가평가 창에서 평가를 추가해주세요!</a>
						</c:if>
					</div>
				</div>
		</div>
	</div>
</div>

