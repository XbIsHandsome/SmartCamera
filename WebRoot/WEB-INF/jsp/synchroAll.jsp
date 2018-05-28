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
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

<!-- Plugins css -->
<link href="assets/owl-carousel/owl.carousel.css" rel="stylesheet" />


<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/helper.css" rel="stylesheet">
</head>

<body>
<div >&nbsp;</div>
	<div style="margin-top: 70px" wraper container-fluid">


		<!--Widget-1 -->
		<div class="row text-center">
			<a href="${pageContext.request.contextPath}/synchro_showDetail.action""><div class="col-sm-6 col-md-3">
				<div class="panel">
					<div class="h2 text-top-blue">计科一班</div>
					<span class="text-success">30/30</span>
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
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/pace.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>

<!-- Counter-up -->
<script src="js/waypoints.min.js" type="text/javascript"></script>
<script src="js/jquery.counterup.min.js" type="text/javascript"></script>

<!-- skycons -->
<script src="js/skycons.min.js" type="text/javascript"></script>

<!-- EASY PIE CHART JS -->
<script src="assets/easypie-chart/easypiechart.min.js"></script>
<script src="assets/easypie-chart/jquery.easypiechart.min.js"></script>
<script src="assets/easypie-chart/example.js"></script>

<!-- sparkline -->
<script src="assets/sparkline-chart/jquery.sparkline.min.js"
	type="text/javascript"></script>
<script src="assets/sparkline-chart/chart-sparkline.js"
	type="text/javascript"></script>

<!-- KNOB JS -->
<!--[if IE]>
        <script type="text/javascript" src="assets/jquery-knob/excanvas.js"></script>
        <![endif]-->
<script src="assets/jquery-knob/jquery.knob.js"></script>

<!-- owl-carousel -->
<script src="assets/owl-carousel/owl.carousel.js"></script>


<!-- Custom Script -->
<script src="js/jquery.app.js"></script>

<script type="text/javascript">
            jQuery(document).ready(function($) {
                /* Counter Up */
                $('.counter').counterUp({
                    delay: 100,
                    time: 1200
                });

                //owl carousel
                $("#velonic-slider,#velonic-slider-2").owlCarousel({
                    navigation : true,
                    slideSpeed : 300,
                    paginationSpeed : 400,
                    singleItem : true,
                    autoPlay:true
                });
            });
            /* BEGIN SVG WEATHER ICON */
            if (typeof Skycons !== 'undefined'){
            var icons = new Skycons(
                {"color": "#fff"},
                {"resizeClear": true}
                ),
                    list  = [
                        "clear-day", "clear-night", "partly-cloudy-day",
                        "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
                        "fog"
                    ],
                    i;

                for(i = list.length; i--; )
                icons.set(list[i], list[i]);
                icons.play();
            };
        </script>