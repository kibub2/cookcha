<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="inner-page padd">
	<div class="shopping">
		<div class="container">
			<div class="shopping-content">
				<div class="row">
				<c:forEach var="shop" items="${shopList }">
						<div class="col-md-3 col-sm-6">
							<div class="shopping-item">
								<!-- Image -->
								<a href="#">
									<object class="img-responsive" data="${pageContext.request.contextPath}/upload/${shop.code }-1.jpg" type="image/jpg">
	    							<img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/noImage.jpg" />
	  							</object>
								</a>
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
				</div>
				<div class="align-center" id="pagingHtml" style="text-align:center">
				${pagingHtml }
				</div>
				
			</div>
		</div>
	</div>
</div>