<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- 맛집 지도 시작(철현) -->
<!-- 참고 사이트 : http://bootsnipp.com/ -->
<div class="container">
	<div id="mapSearch-div">
		<!-- Search Shop Start -->
		<div id="findShop" class="col-sm-5 col-md-5 visible-md visible-lg"></div>
		<!-- Accordion ShopList Start-->
		<div id="findShop-result" class="col-sm-7 col-md-7 visible-md visible-lg">
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
								<button type="button" id="collapseOneOfB" class="btn btn-default btn-xs likeButton" value="0">
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
<div class="container" style="background-color: navy;">
	<table class="popular-shop">
		<tr>
			<td><div style="background-image:url(../resources/img/menu/menu1.jpg); height: 400px;"><div style="width: 100%; height: 200px; background-color:yellow; position: relative; top: 200px;"></div></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu2.jpg); height: 400px;"><div style="width: 100%; height: 200px; background-color:yellow; position: relative; top: 200px;"></div></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu3.jpg); height: 400px;"><div style="width: 100%; height: 200px; background-color:yellow; position: relative; top: 200px;"></div></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu4.jpg); height: 400px;"><div style="width: 100%; height: 200px; background-color:yellow; position: relative; top: 200px;"></div></div></td>
		</tr>
		<!-- <tr>
			<td><div style="background-image:url(../resources/img/menu/menu1.jpg); height: 400px;"></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu2.jpg); height: 400px;"></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu3.jpg); height: 400px;"></div></td>
			<td><div style="background-image:url(../resources/img/menu/menu4.jpg); height: 400px;"></div></td>
		</tr> -->
	</table>
</div>



