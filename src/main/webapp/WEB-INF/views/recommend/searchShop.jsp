<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- 맛집 지도 시작(철현) -->
<!-- 참고 사이트 : http://bootsnipp.com/ -->

<div class="container">
	<div id="mapSearch-div">
		<!-- Search Shop Start -->
		<div id="findShop" class="col-sm-5 col-md-5 visible-md visible-lg"></div>
		<!-- Accordion ShopList Start-->
		<div id="findShop-result" class="col-sm-7 col-md-7">
			<div class="panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"><span>
                            <img src="${pageContext.request.contextPath}/resources/img/icon/numbers 1.png"></span>맥도날드
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse">
                    	<div class="panel-body shopList">
							<div class="col-sm-4 col-md-4 photoZone"></div>
							<div class="col-sm-8 col-md-8 shop-introduction">
							<p> (가게 이름)
							<button type="button" id="collapseOneOfB" class="btn btn-default btn-xs">
  								<span><img src="${pageContext.request.contextPath}/resources/img/icon/heart-empty.png" class="hertIcon"></span>좋아요
  							</button><hr>
							<p> (음식 종류) | (주소) (시구동)
							<hr>
							<p> (가게 평점) | (참여자수)
							<hr>
							<p> 음식점 소개
							</div>
						</div>
					</div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><span>
                            <img src="${pageContext.request.contextPath}/resources/img/icon/numbers 2.png"></span>버거킹
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse">
                    	<div class="panel-body shopList">
							<div class="col-sm-4 col-md-4 photoZone"></div>
							<div class="col-sm-8 col-md-8 shop-introduction"></div>>
							<div class="col-sm-8 col-md-8 shop-introduction">
								<p> (가게 이름)
								<button type="button" id="collapseTwoOfB" class="btn btn-default btn-xs likeButton">
	  								<span><img src="${pageContext.request.contextPath}/resources/img/icon/heart-empty.png" class="hertIcon"></span>좋아요
	  							</button><hr>
								<p> (음식 종류) | (주소) (시구동)
								<hr>
								<p> (가게 평점) | (참여자수)
								<hr>
								<p> 음식점 소개
							</div>
						</div>
					</div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree"><span>
                            <img src="${pageContext.request.contextPath}/resources/img/icon/numbers 3.png"></span>롯데리아
                            </a>
                        </h4>
                    </div>
                    <div id="collapseThree" class="panel-collapse collapse">
                    	<div class="panel-body shopList">
							<div class="col-sm-4 col-md-4 photoZone"></div>
							<div class="col-sm-8 col-md-8 shop-introduction"></div>
							<div class="col-sm-8 col-md-8 shop-introduction">
								<p> (가게 이름)
								<button type="button" id="#collapseThreeOfB" class="btn btn-default btn-xs likeButton">
	  								<span><img src="${pageContext.request.contextPath}/resources/img/icon/heart-empty.png" class="hertIcon"></span>좋아요
	  							</button><hr>
								<p> (음식 종류) | (주소) (시구동)
								<hr>
								<p> (가게 평점) | (참여자수)
								<hr>
								<p> 음식점 소개
							</div>
						</div>
					</div>
                </div>        
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><span>
                            <img src="${pageContext.request.contextPath}/resources/img/icon/numbers 4.png"></span>맘스터치
                            </a>
                        </h4>
                    </div>
                    <div id="collapseFour" class="panel-collapse collapse">
                    	<div class="panel-body shopList">
							<div class="col-sm-4 col-md-4 photoZone"></div>
							<div class="col-sm-8 col-md-8 shop-introduction"></div>
							<div class="col-sm-8 col-md-8 shop-introduction">
								<p> (가게 이름)
								<button type="button" id="collapseFourOfB" class="btn btn-default btn-xs likeButton">
	  								<span><img src="${pageContext.request.contextPath}/resources/img/icon/heart-empty.png" class="hertIcon"></span>좋아요
	  							</button><hr>
								<p> (음식 종류) | (주소) (시구동)
								<hr>
								<p> (가게 평점) | (참여자수)
								<hr>
								<p> 음식점 소개
							</div>
						</div>
					</div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseFive"><span>
                            <img src="${pageContext.request.contextPath}/resources/img/icon/numbers 5.png"></span>KFC
                            </a>
                        </h4>
                    </div>
                    <div id="collapseFive" class="panel-collapse collapse">
                    	<div class="panel-body shopList">
							<div class="col-sm-4 col-md-4 photoZone"></div>
							<div class="col-sm-8 col-md-8 shop-introduction"></div>
							<div class="col-sm-8 col-md-8 shop-introduction">
								<p> (가게 이름)
								<button type="button" id="collapseFiveOfB" class="btn btn-default btn-xs likeButton">
	  								<span><img src="${pageContext.request.contextPath}/resources/img/icon/heart-empty.png" class="hertIcon"></span>좋아요
	  							</button><hr>
								<p> (음식 종류) | (주소) (시구동)
								<hr>
								<p> (가게 평점) | (참여자수)
								<hr>
								<p> 음식점 소개
							</div>
						</div>
					</div>
                </div>
            </div>
		</div>
	</div>
</div>
<!-- 맛집 지도 끝(철현) -->

<!-- 맛집 사용자 추천폼 시작(기법) -->
<%-- <div class="inner-page padd">
	<div class="shopping">
		<div class="container">
			<div class="row">
			<c:forEach var="shop" items="${shopList }">
					<div class="col-md-3 col-sm-6">
						<div class="shopping-item">
							<!-- Image -->
							<a href="#"><img class="img-responsive" src="${pageContext.request.contextPath}/upload/${shop.code }-1.jpg" alt="" /></a>
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
									<c:set var="shopCode" value="${shop.code }"></c:set>
									<c:forEach var="rate" items="${ratingList }">
									<c:set var="rateCode" value="${rate.shop_code }"></c:set>
									<c:if test="${shop.code == rate.shop_code }">
										<span style="width:${rate.private_rate*20}%" class="ratedShop"></span>
									</c:if>
									</c:forEach>
									<span></span>
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
</div> --%>
<!-- 맛집 사용자 추천폼 끝(기법) -->