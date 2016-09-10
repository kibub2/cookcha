<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div align="center" class="container-fluid" style="margin-top: 20px;padding-bottom: 50px;width: 900px;background-color: white;box-shadow: #D5D5D5 0 1px 5px;">
	<h2 style="margin-top: 50px;font-family: 나눔고딕;">${board.subject}</h2>
	<div style="width: 700px; margin-top: 50px;">
		<table>
			<tbody>
				<tr>
					<td style="text-align: left;width: 400px;">
						${board.subject}
					</td>
					<td style="text-align: right;">
						<c:forEach var="i" begin="1" end="34">
							&nbsp;
						</c:forEach>
						${board.reg_date}
					</td>
				</tr>
				<tr>
					<td>
						<i class="fa fa-user" aria-hidden="true"></i>&nbsp;${board.id}
					</td>
				</tr>
			</tbody>

			<tfoot>
			</tfoot>
		</table>
		<hr>
		<div align="left">
			${board.content}
		</div>
		<div>
			<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/board/boardUpdate.do'">수정</button>
			<button type="button" class="btn btn-success" onclick="location.href='${pageContext.request.contextPath}/index.do'">홈으로</button>
		</div>
	</div>
</div>