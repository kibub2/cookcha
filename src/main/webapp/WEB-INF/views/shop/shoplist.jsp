<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
									<a href="${pageContext.request.contextPath }/shop/detail.do?code=${shop.code}"> <!-- 클릭시 모달 출력 -->
										<img class="img-responsive"
										src="${pageContext.request.contextPath }/upload/${shop.main_picture}"
										alt="" />
									</a>


									<!-- Shopping item name / Heading -->
									<h4 class="pull-left" style="overflow: hidden;">
										<a href="bookDetail.do?code=${shop.code}">${shop.name }</a>
									</h4>
									<!-- 
						<span class="item-price pull-right">$49</span>
						 -->
									<div class="clearfix"></div>
									<!-- Paragraph -->
									<p style="overflow: hidden; height: 185px;">${shop.introduction }</p>
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
<br><br>
<div align="center">${pagingHtml }</div>

