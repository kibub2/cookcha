<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Your description">
<meta name="keywords" content="Your,Keywords">
<meta name="author" content="ResponsiveWebInc">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Styles -->
<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- FlexSlider Css -->
<link rel="stylesheet" href="css/flexslider.css" media="screen" />
<!-- Portfolio CSS -->
<link href="css/prettyPhoto.css" rel="stylesheet">
<!-- Font awesome CSS -->
<link href="css/font-awesome.min.css" rel="stylesheet">
<!-- Custom Less -->
<link href="css/less-style.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/style.css" rel="stylesheet">
<!--[if IE]><link rel="stylesheet" href="css/ie-style.css"><![endif]-->

<!-- Favicon -->
<link rel="shortcut icon" href="#">
<title>상세예약</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
</head>
<body>
	<!-- 예약 정보 -->
	<div class="col-md-4">
		<!-- Booking form area -->
		<div class="booking-form">
			<!-- Heading -->
			<h3>예약</h3>

			<!-- Booking form -->
			<form:form role="form" action="bookModal.do"
				commandName="bookCommand">
				<input type="hidden" name="code" id="code" value="${param.code}" />
				<label>예약ID</label>
				<div class="form-group">
					<!-- Form input -->
					<form:input path="id" readonly="true" />
					<form:errors path="id" class="error-color" />
				</div>

				<label>예약자</label>
				<div class="form-group">
					<!-- Form input -->
					<form:input path="name" />
					<form:errors path="name" class="error-color" />
				</div>

				<label>예약일</label>
				<div class="form-group">
					<!-- Form drop down -->
					<form:input class="form-control" path="book_date" />
					<form:errors path="book_date" class="error-color" />
				</div>

				<label>예약시간</label>
				<div class="form-group">
					<!-- Form drop down -->
					<script type="text/javascript">
											
										</script>
					<form:input path="book_time" />
					<%-- <form:select class="form-control" path="book_time">
						<option value="${param.code}">점심(12:00~15:00)</option>
						<option value="저녁(18:00~21:00)">저녁(18:00~21:00)</option>
					</form:select> --%>
					<form:errors path="book_time" class="error-color" />
				</div> 

				<label>전화번호</label>
				<div class="form-group">
					<!-- Form input -->
					<form:input path="phone" />
					<form:errors path="phone" class="error-color" />
				</div>

				<label>테이블</label>
				<div class="form-group">

					<!-- Form drop down -->
					<c:if test="${!empty remainSeat1 }">
						<form:select class="form-control" path="seat" name="seat">
							<c:forEach var="i" begin="1" end="${remainSeat1 }">
								<option value="${i}">${i}</option>

							</c:forEach>
						</form:select>
					</c:if>
					<input type="hidden" value="${remainSeat2 }">
					<c:if test="${!empty remainSeat2 }">
						<form:select class="form-control" path="seat" name="seat">
							<c:forEach var="i" begin="1" end="${remainSeat2 }">
								<option value="${i}">${i}</option>

							</c:forEach>
						</form:select>
					</c:if>
				</div>

				<label>메시지</label>
				<div class="form-group">
					<!-- Form text area -->
					<form:textarea class="form-control" rows="3" placeholder="내용입력"
						path="content"></form:textarea>
				</div>
				<!-- Form button -->
				<button class="btn btn-danger btn-sm" type="submit">예약확인</button>
				<!-- 	&nbsp;
									<button class="btn btn-default btn-sm" type="reset">예약취소</button> -->
			</form:form>
		</div>
	</div>
	<!-- Javascript files -->
	<!-- jQuery -->
	<script src="js/jquery.js"></script>
	<!-- Bootstrap JS -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Pretty Photo JS -->
	<script src="js/jquery.prettyPhoto.js"></script>
	<!-- Respond JS for IE8 -->
	<script src="js/respond.min.js"></script>
	<!-- HTML5 Support for IE -->
	<script src="js/html5shiv.js"></script>
	<!-- Custom JS -->
	<script src="js/custom.js"></script>
	<!-- JS code for this page -->
	<script>
		</script>
	<!-- 예약 정보 -->
</body>
</html>