<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta charset="UTF-8">
	<title></title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
		rel="stylesheet">
		<link
			href="${pageContext.request.contextPath}/css/bootstrap-reset.css"
			rel="stylesheet">

			<!--Animation css-->
			<link href="${pageContext.request.contextPath}/css/animate.css"
				rel="stylesheet">

				<!--Icon-fonts css-->
				<link
					href="${pageContext.request.contextPath}/assets/font-awesome/css/font-awesome.css"
					rel="stylesheet" />
				<link
					href="${pageContext.request.contextPath}/assets/ionicon/css/ionicons.min.css"
					rel="stylesheet" />

				<!-- Plugin Css-->
				<link rel="stylesheet"
					href="${pageContext.request.contextPath}/assets/css/magnific-popup/magnific-popup.css" />
				<link rel="stylesheet"
					href="${pageContext.request.contextPath}/assets/jquery-datatables-editable/datatables.css" />

				<!-- Custom styles for this template -->
				<link href="css/style.css" rel="stylesheet">
					<link
						href="${pageContext.request.contextPath}/css/assets/css/helper.css"
						rel="stylesheet">
</head>

<body>
	<div class="wraper container-fluid">
		<div class="page-title">
			<h3 class="title">Editable Table</h3>
		</div>


		<div class="panel">

			<div class="panel-body">
				<table class="table table-bordered table-striped"
					id="datatable-editable">
					<thead>
						<tr>
							<th>学&nbsp;&nbsp;&nbsp;院</th>
							<th>专业/年级/班级</th>
							<th>应到/上周实到</th>
							<th>操&nbsp;&nbsp;&nbsp;作</th>
						</tr>
					</thead>
					<tbody>
					<s:if test="#session.historyClass != null">
						<s:iterator value="#session.historyClass" var="h">
						<tr class="gradeX">
							<td><s:property value="#h.department"/></td>
							<td><s:property value="#h.major"/> /<s:property value="#h.grade"/>/<s:property value="#h.class_name"/></td>
							<td><s:property value="#h.number"/>/<s:property value="#h.last_week_nattend"/></td>
							<td class="actions"><a href="#"
								class="hidden on-editing save-row"><i class="fa fa-save"></i></a>
								<a href="#" class="hidden on-editing cancel-row"><i
									class="fa fa-times"></i></a> <a href="#"
								class="on-default edit-row"><i class="fa fa-pencil"></i></a> <a
								href="#" class="on-default remove-row"><i
									class="fa fa-trash-o"></i></a></td>
						</tr>
						</s:iterator>
						</s:if>
					</tbody>
				</table>
			</div>
			<!-- end: page -->

		</div>
		<!-- end Panel -->


	</div>

	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->


	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/pace.min.js"></script>
	<script src="js/modernizr.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/jquery.nicescroll.js" type="text/javascript"></script>


	<script src="js/jquery.app.js"></script>

	<!-- Examples -->
	<script src="assets/magnific-popup/magnific-popup.js"></script>
	<script src="assets/jquery-datatables-editable/jquery.dataTables.js"></script>
	<script src="assets/datatables/dataTables.bootstrap.js"></script>
	<script
		src="assets/jquery-datatables-editable/datatables.editable.init.js"></script>

</body>

</html>