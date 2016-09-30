<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container-fluid">
	<div class="col-md-6 col-md-offset-3">
		<div class="text-center">
			<h2 style="font-family: 나눔고딕;">공지사항</h2>
		</div>
		<!-- form start -->
		<form:form action="boardWrite2.do" commandName="command">
			<div class="form-group">
				<label for="subject">제목</label>
				<form:input path="subject" class="form-control"/>
				<form:errors path="subject"/>
			</div>
			<div class="form-group">
				<label for="id">아이디</label>
				<form:input path="id" class="form-control" value="${command.id}" readonly="true"/>
				<form:errors path="id"/>
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<form:textarea path="content" class="form-control" rows="15"/>
				<form:errors path="content"/>
			</div>
			<form:hidden path="code" value="2"/>
			<div class="form-group text-center">
				<button type="submit" class="btn btn-primary">작성</button>
				<button type="button" class="btn btn-success" onclick="location.href='${pageContext.request.contextPath}/board2/boardList2.do'">목록으로</button>
			</div>
		</form:form>
	</div>
</div>