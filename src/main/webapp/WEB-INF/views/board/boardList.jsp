<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="container-fluid" align="center" style="padding-bottom: 50px;margin-top: 20px;width: 900px;background-color: white;box-shadow: #D5D5D5 0 1px 5px;">
	<h2 style="margin-top: 50px;font-family: 나눔고딕;">자유게시판</h2>
	<table class="table" style="width: 800px; margin-top: 50px;">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
				<!-- <th>조회수</th> -->
			</tr>
		</thead>
		<tbody>
			<c:if test="${count == 0}">
				<div class="align-center">등록된 게시물이 없습니다.</div>
			</c:if>
			<c:if test="${count > 0}">
				<c:forEach var="article" items="${list}">
				<tr>
					<td>${article.seq}</td>
					<td><a href="boardDetail.do?seq=${article.seq}">${article.subject}</a></td>
					<td>${article.id}</td>
					<td>${article.reg_date}</td>
					<%-- <td>${article.hit}</td> --%>
				</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div class="align-center">${pagingHtml}</div>
	<br>
	<div>
		<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/board/boardWrite.do'">글 작성</button>
		<button type="button" class="btn btn-success" onclick="location.href='${pageContext.request.contextPath}/index.do'">홈으로</button>
	</div>
</div>