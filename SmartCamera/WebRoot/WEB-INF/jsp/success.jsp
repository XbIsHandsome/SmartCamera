<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/amazeui.min.css" />
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/admin.css" />
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/css/app.css" />
<style>
.admin-main {
	padding-top: 0px;
}
</style>
</head>
<body>
	<div class="am-cf admin-main">
		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				<div class="am-g">
					<form class="am-form am-form-horizontal" method="post"
						style="padding-top:30px;" data-am-validator
						action="${pageContext.request.contextPath}/user_updatePwd.action">
						<div class="am-form-group">
							<label for="user-name" class="am-u-sm-3 am-form-label">
								</label>
							<div class="am-u-sm-9">
								 <strong>修改成功</strong>
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-name" class="am-u-sm-3 am-form-label">
								</label>
							<div class="am-u-sm-9">
								
							</div>
						</div>
						<div class="am-form-group">
							<div class="am-u-sm-9 am-u-sm-push-3">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="assets/js/libs/jquery-1.10.2.min.js">
		
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/myplugs/js/plugs.js">
		
	</script>
</body>
</html>
