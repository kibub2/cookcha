<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<style type="text/css">
	.error-color {
		color: red;
	}
</style>
</head>
<body>
	<div class="container-fluid">
		<form:form action="write.do" commandName="command">
		<form:errors element="div" class="error-color"/>
			<div class="col-md-4 col-md-offset-4">
				<div class="text-center" style="margin: 50px 0 50px 0;">
					<h2>Cookcha 회원가입</h2>
				</div>
				<div class="form-group">
					<label for="id">아이디</label>
					<form:input path="id" class="form-control" placeholder="userId@email.com"/>
					<form:errors path="id" class="error-color"/>
				</div>
				<div class="form-group">
					<label for="name">이름</label>
					<form:input path="name" class="form-control" placeholder="이름"/>
					<form:errors path="name" class="error-color"/>
				</div>
				<div class="form-group">
					<label for="passwd">비밀번호</label>
					<form:password path="passwd" class="form-control" placeholder="비밀번호"/>
					<form:errors path="passwd" class="error-color"/>
				</div>
				<div class="form-group">
					<label for="birth">생년월일</label>
					<form:input path="birth" class="form-control" maxlength="6" style="IME-MODE:disabled;" placeholder="예) 900502"/>
					<form:errors path="birth" class="error-color"/>
				</div>
				<div class="form-group">
					<label for="sex">성별</label>
					<form:select path="sex" class="form-control">
						<form:option value="성별을 선택하세요">성별을 선택하세요</form:option>
						<form:option value="남">남</form:option>
						<form:option value="여">여</form:option>
					</form:select>
					<form:errors path="sex" class="error-color"/> <!-- 남/여 선택하지 않을경우 에러로 처리해야함. -->
				</div>
				<div class="form-group">
					<label for="phone">휴대폰번호</label>
					<form:input path="phone" class="form-control" placeholder="예) 010-1234-5678"/>
					<form:errors path="phone" class="error-color"/>
				</div>
				<div class="form-group text-center">
					<button type="submit" class="btn btn-info">회원가입</button>
					<button type="button" class="btn btn-warning" onclick="location.href='../index.do'">홈으로</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>