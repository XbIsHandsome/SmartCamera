<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>班级课表查看</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-reset.css" rel="stylesheet">

<!--Animation css-->
<link href="css/animate.css" rel="stylesheet">

<!--Icon-fonts css-->
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

<!-- Plugin Css-->
<link rel="stylesheet" href="assets/magnific-popup/magnific-popup.css" />
<link rel="stylesheet"
	href="assets/jquery-datatables-editable/datatables.css" />

<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/helper.css" rel="stylesheet">

</head>
<body>


	<table class="table table-bordered table-striped"
		id="datatable-editable">
		<tr>
			<td colspan=2 align="center">时间</td>
			<td align="center">星期一</td>
			<td align="center">星期二</td>
			<td align="center">星期三</td>
			<td align="center">星期四</td>
			<td align="center">星期五</td>
			<td align="center">星期六</td>
			<td align="center">星期日</td>
		</tr>

		<tr>
			<td rowspan=4 align=center>上午</td>
			<td><br>01<br></td>
			<td rowspan=2 align=center>WEB应用开发技术<br>(1-16周) <br>熊俊涛<br>致远楼1202
			</td>
			<td rowspan=2 align=center>线性代数<br>(1-8周)<br>赵立新<br>3202
			</td>
			<td rowspan=2 align=center>Internet与Intranet技术<br>周三第1,2节{1-12周}<br>张建桃<br>3401
			</td>
			<td rowspan=2 align=center>管理统计学<br>周四第1,2节{第1-16周}<br>张建桃(张建桃)<br>3301
			</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><br>02<br></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><br>03<br></td>
			<td rowspan=2 align=center>WEB应用开发技术<br>周一第3,4节{第9-16周} <br>熊俊涛(熊俊涛)
			</td>
			<td rowspan=2 align=center>职业素养提升与就业指导<br>周二第3,4节{第2-15周}<br>刘月秀<br>3312
			</td>
			<td rowspan=2 align=center>太极拳与乒乓球<br>周三第3,4节{第1-16周}<br>王常青<br>公寓8栋乒
			</td>
			<td rowspan=2 align=center>线性代数</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><br>04<br></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td rowspan=4 align=center>下午</td>
			<td><br>05<br></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<td><br>06<br></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
		<td><br>07<br></td>
		<td rowspan=2 align=center>马克思主义基本原理<br>周一第7,8节{第1-18周}<br>陈雷<br>3402
		</td>
		<td rowspan=2 align=center>企业网组网实验<br>周二第7,8节{第1-16周}<br>韩方珍/张建桃
		</td>
		<td rowspan=2 align=center>企业管理<br>周三第7,8节{第3-18周} <br>刘伟章<br>3405
		</td>
		<td rowspan=2 align=center>大学英语<br>周四第7,8节{第1-15周}<br>陈琳慧<br>DS523
		</td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
		<tr>
			<td><br>08<br></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>


		<tr>
			<td rowspan=2 align=center>晚上</td>
			<td><br>09<br></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>

		</tr>
		</table>
</body>
<!-- js placed at the end of the document so the pages load faster -->
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
</html>

