<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>상세예약</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
</head>
<body>
	
	<div class="wrapper">
	<div class="inner-page padd">
	<div class="booking">
	<div class="showcase">
	<div class="container">
	<div class="row">

						<div class="col-md-7">
							<!-- Heading -->
							<h3>${shop.name}</h3>
							<!-- Image -->
							<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<img src="${pageContext.request.contextPath }/upload/${shop.main_picture}" width="655" height="500"/>
							</div>
							<h2>가게설명</h2>
							<p><b>${shop.introduction}</b></p>
						</div>
						
						<!-- 상세예약 -->
						<div class="col-md-5">
						<!-- Booking form area -->
						<div class="booking-form">
							<!-- Heading -->
							<h3>예약</h3>
				
							<!-- Booking form -->
							<form:form role="form" action="bookModal.do"
								commandName="bookCommand" >
								<input type="hidden" name="code" id="code" value="${param.code}" />
								<label>예약ID</label>
								<div class="form-group">
									<!-- Form input -->
									<form:input path="id" class="form-control" readonly="true" />
									<form:errors path="id" class="error-color" />
								</div>
				
								<label>예약자</label>
								<div class="form-group">
									<!-- Form input -->
									<form:input path="name" class="form-control" />
									<form:errors path="name" class="error-color" />
								</div>
				
								<label>예약일</label>
								<div class="form-group">
									<!-- Form drop down -->
									<form:input class="form-control" path="book_date" readonly="true" />
									<form:errors path="book_date" class="error-color" />
								</div>
				
								<label>예약시간</label>
								<div class="form-group">
									<!-- Form drop down -->
									<form:input path="book_time" class="form-control" readonly="true" />
									<%-- <form:select class="form-control" path="book_time">
										<option value="${param.code}">점심(12:00~15:00)</option>
										<option value="저녁(18:00~21:00)">저녁(18:00~21:00)</option>
									</form:select> --%>
									<form:errors path="book_time" class="error-color" />
								</div>
				
								<label>전화번호</label>
								<div class="form-group">
									<!-- Form input -->
									<form:input path="phone" class="form-control" />
									<form:errors path="phone" class="error-color" />
								</div>
				
								<c:if test="${book_time == '점심(12:00~15:00)' }">
									<label>테이블 점심</label>
									<div class="form-group">
										<!-- Form drop down -->
										<c:if test="${!empty remainSeat1 }">
											<form:select class="form-control" path="seat" name="seat">
												<c:forEach var="i" begin="1" end="${remainSeat1 }">
													<option value="${i}">${i}</option>
												</c:forEach>
											</form:select>
										</c:if>
									</div>
								</c:if>
								<c:if test="${book_time == '저녁(18:00~21:00)' }">
									<label>테이블 저녁</label>
									<div class="form-group">
										<input type="hidden" value="${remainSeat2 }">
										<c:if test="${!empty remainSeat2 }">
											<form:select class="form-control" path="seat" name="seat">
												<c:forEach var="i" begin="1" end="${remainSeat2 }">
													<option value="${i}">${i}</option>
												</c:forEach>
											</form:select>
										</c:if>
									</div>
								</c:if>
				
						<label>메시지</label>
						<div class="form-group">
							<!-- Form text area -->
							<form:textarea class="form-control" rows="3" placeholder="내용입력"
								path="content"></form:textarea>
						</div>
						<!-- Form button -->
						<div align="right">
							<button class="btn btn-primary btn-sm" type="submit" >예약확인</button>
							<button class="btn btn-danger btn-sm" type="button" onclick="location.href='${pageContext.request.contextPath}/shop/test.do'">예약취소</button>
						</div>
						</form:form>
						</div>
					</div>
		</div></div></div></div></div></div>
	<!-- 상세예약 -->
</body>
</html>