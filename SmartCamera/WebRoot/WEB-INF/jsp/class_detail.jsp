<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>班级详情页</title>
<!-- Bootstrap core CSS -->
		<meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="description" content=""/>
        <meta name="author" content=""/>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="${pageContext.request.contextPath}/css/bootstrap-reset.css" rel="stylesheet"/>

        <!--Animation css-->
        <link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet"/>

        <!--Icon-fonts css-->
        <link href="${pageContext.request.contextPath}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

        <!-- Plugins css -->
        <link href="${pageContext.request.contextPath}/assets/owl-carousel/owl.carousel.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/assets/magnific-popup/magnific-popup.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/table-style.css" rel="stylesheet"/>
        <link href="${pageContext.request.contextPath}/css/helper.css" rel="stylesheet"/>

</head>

<body>


    <div class="wraper container-fluid">
        <div class="panel">
			<div class="panel-body">
                <table class="table table-bordered" id="datatable-editable">
					<thead>
						<tr>
							<th>学号</th>
							<th>姓名</th>
							<th>电话号码</th>
							<th>时间</th>
							<th>上课地点</th>
							<th>上课状态</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="#session.class_datails" var="detail">
							<td><s:property value="#detail.studnetid"/></td>
							<td><s:property value="#detail.name"/></td>
							<td><s:property value="#detail.phone"/></td>
							<td><s:property value="#detail.time"/></td>
							<td><s:property value="#detail.place"/></td>
							<td class="actions">
								<s:if test="#detail.State == 1">
								<span class="text-success">
									正常到课
								</span>
								</s:if>
								<s:else>
									<span class="text-danger">
									旷&nbsp;&nbsp;课
								</span>
								</s:else>
							</td>
						</s:iterator>
                    </tbody>
				</table>
			</div>
		</div> 

        <!-- MODAL -->
        <div id="dialog" class="modal-block mfp-hide">
            <section class="panel panel-info panel-color">
                <header class="panel-heading">
                    <h2 class="panel-title">Are you sure?</h2>
                </header>
                <div class="panel-body">
                    <div class="modal-wrapper">
                        <div class="modal-text">
                            <p>Are you sure that you want to delete this row?</p>
                        </div>
                    </div>

                    <div class="row m-t-20">
                        <div class="col-md-12 text-right">
                            <button id="dialogConfirm" class="btn btn-primary">Confirm</button>
                            <button id="dialogCancel" class="btn btn-default">Cancel</button>
                        </div>
                    </div>
                </div>
                
            </section>
        </div>
	</div>
        



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
	
	<script src="assets/datatables/dataTables.bootstrap.js"></script>
	<script src="assets/jquery-datatables-editable/datatables.editable.init.js"></script>
    

</body>
 </html>
