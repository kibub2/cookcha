<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="col-md-3 col-sm-3 col-md-offset-1" style="height: 1000px;">
	<!-- Nutrition Item -->
	<div class="nutrition-item">
		<!-- Heading -->
		<br> <br> <br> <br> <br>
		<!-- Image -->
		<img class="img-responsive img-thumbnail"
			src="${pageContext.request.contextPath }/resources/img/bono.jpg"
			alt="">
		<h4>보노보노님의 담벼락 (20대,남)</h4>
		<!-- 프로필글 -->
		<p>잘먹고 죽은 귀신이 떼깔도 곱다</p>
		<br> <br>
		<div style="height:250px;"></div>
		<!-- 회원관련 정보 -->
			<!-- 평가한 맛집 수 -->
			
			
			<!-- 그래프시작 -->
			<script type="text/javascript">
				window.onload = function () {
					var chart = new CanvasJS.Chart("chartContainer",
				{
					title:{
						text: "보노보노님이 자주평가하는 맛집카테고리"
					},
                animationEnabled: false,
				theme: "theme2",
				data: [
					{        
					type: "pie",       
					indexLabelFontFamily: "Garamond",       
					indexLabelFontSize: 20,
					indexLabel: "{label}",
					startAngle:-20,      
					showInLegend: true,
					toolTipContent:"{legendText} {y}%",
					dataPoints: [
        			      //y:퍼센트
						{  y: 83.24, legendText:"한식", label: "한식" },
						{  y: 8.16, legendText:"일식", label: "일식" },
						{  y: 4.67, legendText:"양식", label: "양식" },
						{  y: 1.67, legendText:"기타" , label: "기타"},       
				
					]
					}
				]
				});
				chart.render();
				}
			</script>
			<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/canvasjs.min.js"></script>
			<div id="chartContainer" style="height: 300px; width: 100%;"></div>
			<!-- 그래프끝 -->
			
	</div>
	<!--/ Nutrition info end  -->
</div>
