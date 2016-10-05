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


						<div class="cols-md-4 cols-md-offset-4">
							<div>
								<div>
									<!-- 가게정보 출력시작 -->
									<!-- 가게이름, 카테고리 -->
									<div>
										<h3>${shop.name}</h3>
									</div>
									<!-- 가게 메인 이미지 -->
									<div>
										<img
											src="${pageContext.request.contextPath }/upload/${shop.back_picture}"
											style="width: 895px; max-height: 400px; margin: 0 auto;">
									</div>
									<!-- 평가점수, 평가자수 -->
									<div>rating(${shop.shop_rating})(rater${shop.rater })</div>
									<!-- 주소와 소개글 -->
									<div style="width: 895px; height: 400px;">
										<div>
											<h5>Location</h5>
										</div>
										<span style="font-size: 14px;"> ${shop.introduction } </span>
									</div>


								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<br>
<br>
<div align="center">${pagingHtml }</div>