<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>智慧课堂-实时监控</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-reset.css" rel="stylesheet">

<!--Animation css-->
<link href="css/animate.css" rel="stylesheet">

<!--Icon-fonts css-->
<link href="${pageContext.request.contextPath}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

<!-- Plugins css -->
<link href="${pageContext.request.contextPath}/assets/owl-carousel/owl.carousel.css" rel="stylesheet" />


<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/helper.css" rel="stylesheet">
</head>

<body>
<div >&nbsp;</div>
	<div style="margin-top: 70px" wraper container-fluid">


		<!--Widget-1 -->
		<a href="${pageContext.request.contextPath}/course_detail.action"">
		<div class="row text-center">
			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">班长：许兵</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>
		</a>
			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-warning">20/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-danger">0/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

		</div>
		<!-- end row -->

		<!--Widget-1 -->
		<div class="row text-center">
			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-warning">20/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-danger">0/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

		</div>
		<!--Widget-1 -->
		<div class="row text-center">
			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-warning">20/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-danger">0/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
					<div class="text-right">
						<i class="fa fa-user fa-2x text-mute"></i>
					</div>
				</div>
			</div>

		</div>
		<!-- end row -->



	</div>
	<!-- END Wraper -->

</body>
<!-- js placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/pace.min.js"></script>
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.nicescroll.js" type="text/javascript"></script>

<!-- Counter-up -->
<script src="${pageContext.request.contextPath}/js/waypoints.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery.counterup.min.js" type="text/javascript"></script>

<!-- skycons -->
<script src="${pageContext.request.contextPath}/js/skycons.min.js" type="text/javascript"></script>

<!-- EASY PIE CHART JS -->
<script src="${pageContext.request.contextPath}/assets/easypie-chart/easypiechart.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/easypie-chart/jquery.easypiechart.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/easypie-chart/example.js"></script>

<!-- sparkline -->
<script src="${pageContext.request.contextPath}/assets/sparkline-chart/jquery.sparkline.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/sparkline-chart/chart-sparkline.js"
	type="text/javascript"></script>

<!-- KNOB JS -->
<!--[if IE]>
        <script type="text/javascript" src="assets/jquery-knob/excanvas.js"></script>
        <![endif]-->
<script src="${pageContext.request.contextPath}/assets/jquery-knob/jquery.knob.js"></script>

<!-- owl-carousel -->
<script src="${pageContext.request.contextPath}/assets/owl-carousel/owl.carousel.js"></script>


<!-- Custom Script -->
<script src="js/jquery.app.js"></script>
