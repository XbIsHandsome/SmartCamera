<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>智慧课堂</title>
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet" type="text/css" />
</head>

<body>
<script>
function checkForm() {
	if (form.user_name.value == "") {
		document.getElementById("span_username").innerHTML = "<font color='red'>用户名不能为空</font>";
		form.user_name.focus();
		return false;
	}
	if (form.user_name.value == "") {
		document.getElementById("span_password").innerHTML = "<font color='red'>密码不能为空</font>";
		form.user_name.focus();
		return false;
	}
}
</script>
	<div class="login_box">
		<div class="login_l_img">
			<img src="images/login-img.png" />
		</div>
		<div class="login">
			<div class="login_logo">
				<a href="#"><img src="images/login_logo.png" /></a>
			</div>
			<div class="login_name">
				<p>智慧课堂行为监测系统</p>
			</div>
			<form method="post"
				action="${pageContext.request.contextPath}/user_login.action">
				<input name="user_name" type="text" value="用户名"
					onfocus="this.value=''"
					onblur="if(this.value==''){this.value='用户名'}"/> <span
					id="password_text"
					onclick="this.style.display='none';document.getElementById('user_pass').style.display='block';document.getElementById('user_pass').focus().select();">密码</span>
					<input name="user_pass" type="password" id="user_pass"
					style="display:none;"
					onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};" />
					<input value="登录" style="width:100%;" type="submit" onclick="checkForm();"/>
			</form>
		</div>
		<div class="copyright">某某有限公司 版权所有©2016-2018 技术支持电话：000-00000000</div>
	</div>
</body>
</html>
