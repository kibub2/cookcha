<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:getAsString name="title"/></title>

<!-- Vendor CSS -->
<link href="${pageContext.request.contextPath}/resources/admin/vendors/fullcalendar/fullcalendar.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/admin/vendors/animate-css/animate.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/admin/vendors/sweet-alert/sweet-alert.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/admin/vendors/material-icons/material-design-iconic-font.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/admin/vendors/socicon/socicon.min.css" rel="stylesheet">
    
<!-- CSS -->
<link href="${pageContext.request.contextPath}/resources/admin/css/app.min.1.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/admin/css/app.min.2.css" rel="stylesheet">

<!-- js -->
<script src="${pageContext.request.contextPath}/resources/admin/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/admin/vendors/flot/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/flot/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/flot/plugins/curvedLines.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/sparklines/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/easypiechart/jquery.easypiechart.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/admin/vendors/fullcalendar/lib/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/fullcalendar/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/simpleWeather/jquery.simpleWeather.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/auto-size/jquery.autosize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/nicescroll/jquery.nicescroll.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/waves/waves.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/vendors/sweet-alert/sweet-alert.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/admin/js/flot-charts/curved-line-chart.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/flot-charts/line-chart.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/charts.js"></script>

<script src="${pageContext.request.contextPath}/resources/admin/js/charts.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/functions.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/demo.js"></script>
</head>
<body>

<div class="wrapper">
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="menu"/>
	<tiles:insertAttribute name="body"/>
	
	
</div>

</body>
</html>