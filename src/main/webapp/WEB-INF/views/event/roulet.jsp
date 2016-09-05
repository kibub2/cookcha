<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jQueryRotate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/roulet.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/roulet.css">

<div align="center" class="roulet-space">
<img src="${pageContext.request.contextPath}/resources/img/roulette.png" id="ro_image">
<img src="${pageContext.request.contextPath}/resources/img/niddle.png" id="ro_n_id">
<br /><br>
<div id="result_id"></div>
<div id="result_id2"></div>
<div id="result_id3"></div>
<input type='button' value='시작' id='start_btn'></input>

</div>