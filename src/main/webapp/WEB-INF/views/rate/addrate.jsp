<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="inner-page padd">
	<div class="shopping">
		<div class="container">
			<div class="row">
			<c:forEach var="shop" items="${shopList }">
					<div class="col-md-3 col-sm-6">
						<div class="shopping-item">
							<!-- Image -->
							<a href="#"><img class="img-responsive" src="upload/${shop.code }-1.jpg" alt="" /></a>
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
									<input type="radio" name="star" class="star-1" id="star-1">
									<label class="star-1" id="${shop.code }-star-1">1</label>
									<input type="radio" name="star" class="star-2" id="star-2">
									<label class="star-2" id="${shop.code }-star-2">2</label>
									<input type="radio" name="star" class="star-3" id="star-3">
									<label class="star-3" id="${shop.code }-star-3">3</label>
									<input type="radio" name="star" class="star-4" id="star-4">
									<label class="star-4" id="${shop.code }-star-4">4</label>
									<input type="radio" name="star" class="star-5" id="star-5">
									<label class="star-5" id="${shop.code }-star-5">5</label>
									<c:set var="shopCode" value="${shop.code }"></c:set>
									<c:forEach var="rate" items="${ratingList }">
									<c:set var="rateCode" value="${rate.shop_code }"></c:set>
									<c:if test="${shopCode == rateCode }">
										<span style="width:${rate.private_rate * 20}%"></span>
									</c:if>
									<c:if test="${shopCode != rateCode }">
										<span></span>
									</c:if>
									</c:forEach>
									
								</div>
							</form>
							</div>
							<!-- Hot tag -->
							<span class="hot-tag br-red">Hot</span>
						</div>
					</div>	
				</c:forEach>
			</div>
		</div>
	</div>
</div>