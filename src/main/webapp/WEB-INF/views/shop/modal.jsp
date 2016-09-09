<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
<div class="row">
<div class="shopping">
	<div class="container">
		<!-- Shopping items content -->
		<div class="shopping-content">
			<div class="row">

				<h3 align="center">Test Page</h3>
				
				<c:forEach var="shop" items="${shop }">
				<div class="col-md-3 col-sm-6" id="item-${shop.code}">
					<!-- Shopping items -->
					<div class="shopping-item">
						<!-- Image -->
						<a data-toggle="modal" data-target=".bs-example-modal-lg-${shop.code}"><img
							class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/shopping/shop1.jpg"
							alt="" /></a>
						<!-- 모달에 띄울 내용 -->
						<div class="modal fade bs-example-modal-lg-${shop.code}" tabindex="-1"
							role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<!-- 가게정보 출력시작 -->
									<!-- 가게이름, 카테고리 -->
									<div><h3>${shop.name }  <span class="item-price pull-right">(Classify(${shop.classify })</span></h3></div>
									<!-- 가게 메인 이미지 -->
									<div><img src="${pageContext.request.contextPath }/resources/img/shopping/shop1.jpg" style="width:895px; max-height:400px; margin:0 auto;"></div>
									<!-- 평가점수, 평가자수 -->
									<div>rating(${shop.shop_rating})(rater${shop.rater })</div>
									<!-- 주소와 소개글 -->
									<div style="width:895px; height:400px;">
										<div><h5>Location</h5></div>
										<span style="font-size:14px;">
										${shop.introduction }
										</span>
									
									</div>
									<!-- 코멘트 시작 -->
									<div class="comments">
										<div class="title"><h5>2 Comments</h5></div>
										<ul class="comment-list">
											<li class="comment">
												<a class="pull-left" href="#">
													<img class="avatar" style="max-width: 50px; margin-right: 10px;"src="${pageContext.request.contextPath }/resources/img/user.jpg" alt="">
												</a>
												<div class="comment-author"><a href="#">Uiousve Rsionsha</a></div>
												<div class="cmeta">Commented on 26/1/2014</div>
												<p>Nulla facilisi. Sed justo dui, scelerisque ut consectetur vel, eleifend id erat. Phasellus condimentum rutrum aliquet. Quisque eu consectetur erat.</p>
												<div class="clearfix"></div>
											</li>
										</ul>
										<div class="clearfix"></div>
									</div>								
								</div>

							</div>
						</div>
						<!-- 모달 끝 -->
						<!-- Shopping item name / Heading -->
						<h4 class="pull-left">
							<a href="item-single.html">${shop.name }</a>
						</h4>
						<span class="item-price pull-right">$49</span>
						<div class="clearfix"></div>
						<!-- Paragraph -->
						<p>${shop.introduction }</p>
						<!-- Buy now button -->
						<div class="visible-xs">
							<a class="btn btn-danger btn-sm" href="#">Buy Now</a>
						</div>
						<!-- Shopping item hover block & link -->
						<div class="item-hover br-red hidden-xs"></div>
						<a class="link hidden-xs" href="#">Add to cart</a>
					</div>
				</div>
				
				</c:forEach>
			</div>
		</div>
	</div>
</div>
</div>
</div>