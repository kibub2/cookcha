<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
</head>
<body>
	<div class="container-fluid">
		<form:form action="login.do" commandName="command">
			<div class="col-md-4 col-md-offset-4">
				<div class="text-center" style="margin: 50px 0 50px 0;">
					<h2>Cookcha 로그인</h2>
				</div>
				<div class="form-group">
					<label for="id">아이디</label>
					<form:input path="id" class="form-control" placeholder="userId@email.com"/>
					<form:errors path="id"/>
				</div>
				<div class="form-group">
					<label for="passwd">비밀번호</label>
					<form:password path="passwd" class="form-control" placeholder="비밀번호"/>
					<form:errors path="passwd"/>
				</div>
				<div class="form-group text-center">
				    <div align="center"><form:errors/></div>
    		    	<button type="submit" class="btn btn-info">로그인</button>
    		    	<button type="button" class="btn btn-warning" onclick="location.href='write.do'">회원가입</button>
    		    	<button type="button" class="btn btn-default" onclick="location.href='../index.do'" >홈으로</button>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-primary btn-block"><i class="fa fa-facebook" aria-hidden="true"></i>&nbsp;&nbsp;페이스북 로그인</button>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-success btn-block">N&nbsp;&nbsp;네이버 로그인</button>
				</div>
				<div class="form-group text-center">
					<button type="button" class="btn btn-danger btn-block"><i class="fa fa-google-plus" aria-hidden="true"></i>&nbsp;&nbsp;구글 로그인</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>