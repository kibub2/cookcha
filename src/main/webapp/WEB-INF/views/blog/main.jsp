<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
$(function() {	
		$("#btn-wish").click(function() {
			//$("#btn-wish").attr("disabled","disabled");
			$("#btn-wish").attr("value","좋아요 해제");
			$("#btn-wish").attr("id","btn-unlike");
		});
		
		$("#btn-unlike").click(function() {
			//$("#btn-wish").attr("disabled","disabled");
			$("#btn-unlike").attr("value","좋아요");
			$("#btn-unlike").attr("id","btn-wish");
		});

});

</script>


<br> <br> <br>
<!-- Inner Content -->
<div class="col-md-8">
	<!-- The new post done by user's all in the post block -->
	<div class="blog-post">
		<hr>
		<!-- Entry is the one post for each user -->
		<div class="entry">
			<!-- Post Images -->
			<div class="blog-img pull-left">
				<img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/shopping/shop1.jpg"
							alt="" width="262"/>
			</div>
			<!-- Meta for this block -->
			<div class="meta">
				<i class="fa fa-calendar"></i>&nbsp; 방문일 <span
					class="pull-right">카테고리</span>
			</div>
			<!-- Heading of the  post -->
			<h3>
				<a href="blog-single.html">방문한 가게명</a>
			</h3>
			<div>
			별점이 여기로 옵니다.
			</div>
			<hr>
			<!-- Horizontal line -->
			<!-- Paragraph -->
			<p style="font-size:18px;">
				후기가 여기로 옵니다.
			</p>
			<div class="clearfix"></div>
			<!-- 버튼 -->
			<div>
				<input type="button" value="좋아요" class="btn btn-default btn-lg pull-right" id="btn-wish">
			</div>
		</div>
		<br><br>
		<hr>
		<!-- Entry is the one post for each user -->
		<div class="entry">
			<!-- Post Images -->
			<div class="blog-img pull-left">
				<img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/shopping/shop1.jpg"
							alt="" width="262"/>
			</div>
			<!-- Meta for this block -->
			<div class="meta">
				<i class="fa fa-calendar"></i>&nbsp; 방문일 <span
					class="pull-right">카테고리</span>
			</div>
			<!-- Heading of the  post -->
			<h3>
				<a href="blog-single.html">방문한 가게명</a>
			</h3>
			<div>
			별점이 여기로 옵니다.
			</div>
			<hr>
			<!-- Horizontal line -->
			<!-- Paragraph -->
			<p style="font-size:18px;">
				후기가 여기로 옵니다.
			</p>
			<div class="clearfix"></div>
			<!-- 버튼 -->
			<div>
				<input type="button" value="좋아요" class="btn btn-default btn-lg pull-right">
			</div>
		</div>
		<br><br>
		<hr><!-- Entry is the one post for each user -->
		<div class="entry">
			<!-- Post Images -->
			<div class="blog-img pull-left">
				<img class="img-responsive"
							src="${pageContext.request.contextPath }/resources/img/shopping/shop1.jpg"
							alt="" width="262"/>
			</div>
			<!-- Meta for this block -->
			<div class="meta">
				<i class="fa fa-calendar"></i>&nbsp; 방문일 <span
					class="pull-right">카테고리</span>
			</div>
			<!-- Heading of the  post -->
			<h3>
				<a href="blog-single.html">방문한 가게명</a>
			</h3>
			<div>
			별점이 여기로 옵니다.
			</div>
			<hr>
			<!-- Horizontal line -->
			<!-- Paragraph -->
			<p style="font-size:18px;">
				후기가 여기로 옵니다.
				호호호홍
				하하하항
			</p>
			<div class="clearfix"></div>
			<!-- 버튼 -->
			<div>
				<input type="button" value="좋아요" class="btn btn-default btn-lg pull-right">
			</div>
		</div>
		<br><br>
		<!-- 아이템 엔드 -->
		<hr>
		<!-- Pagination -->
		<ul class="pagination">
			<li class="disabled"><a href="#">«</a></li>
			<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">»</a></li>
		</ul>
		<!-- Pagination end-->
	</div>
</div>
