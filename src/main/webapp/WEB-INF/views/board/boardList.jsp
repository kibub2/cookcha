<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="container-fluid" align="center" style="padding-bottom: 50px;margin-top: 20px;width: 95%;background-color: white;box-shadow: #D5D5D5 0 1px 5px;">
	<h2 style="margin-top: 50px;font-family: 나눔고딕;">자유게시판</h2>
	<table class="table" style="width: 55.5%; margin-top: 50px;">
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
	<form action="boardList.do" id="search_form" method="GET">
		<ul class="search" style="list-style: none;">
			<li style="display: inline;">
				<select name="keyfield" class="form-control" style="width: 80px;display: inline;">
					<option value="subject">제목</option>
					<option value="id">ID</option>
					<option value="content">내용</option>
					<option value="all">전체</option>
				</select>
			</li>
			<li style="display: inline;">
				<input type="text" size="16" name="keyword" class="form-control" style="width: 150px;display: inline;">
			</li>
			<li style="display: inline;">
				<input type="submit" value="찾기" class="btn btn-danger">
			</li>
		</ul>
	</form>
	<div>
		<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/board/boardWrite.do'">글 작성</button>
		<button type="button" class="btn btn-success" onclick="location.href='${pageContext.request.contextPath}/index.do'">홈으로</button>
	</div>
</div>