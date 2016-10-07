<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"/></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/settings.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/flexslider.css" media="screen">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/less-style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">


<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.themepunch.plugins.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.themepunch.revolution.min.js"></script>
<script defer src="${pageContext.request.contextPath}/resources/js/jquery.flexslider-min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.prettyPhoto.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/html5shiv.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/addRating.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
<!-- 지도 구현에 필요한 js -->
<script src="http://d3js.org/d3.v3.min.js"></script>
<script src="http://d3js.org/topojson.v0.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/mapSearch.js"></script>
</head>
<body>
<div class="modal fade" id="shoppingcart1" tabindex="-1" role="dialog" aria-hidden="true">
<tiles:insertAttribute name="modal"/></div>
<div class="wrapper">
	<div class="header"><tiles:insertAttribute name="header"/></div>
	<tiles:insertAttribute name="recommend"/>
	<tiles:insertAttribute name="body"/>
	
		
	
	<!-- Footer Start -->
	
	<div class="footer padd"><tiles:insertAttribute name="footer"/></div>
	
	<!-- Footer End -->
	
</div><!-- / Wrapper End -->
<span class="totop"><a href="#"><i class="fa fa-angle-up"></i></a></span>
</body>
</html>