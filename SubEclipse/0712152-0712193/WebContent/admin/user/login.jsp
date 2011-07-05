<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>eStore Admin Login</title>

<link rel="stylesheet" href="css/screen.css" type="text/css"
	media="screen" title="default" />
<!--  jquery core -->
<script src="js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

<!-- Custom jquery scripts -->
<script src="js/jquery/custom_jquery.js" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).pngFix();
	});
</script>
</head>

<body id="login-bg">

<!-- Start: login-holder -->
<div id="login-holder"><!-- start logo -->
<div id="logo-login"><a href=""></a></div>
<!-- end logo -->

<div class="clear"></div>

<!--  start loginbox ................................................................................. -->
<div id="loginbox"><!--  start login-inner -->
<div id="login-inner">

<s:form action="doLogin" method="POST">
	<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Tên truy cập</th>
			<td><input type="text" name="tenTruyCap" class="login-inp" /></td>
		</tr>
		<tr>
			<th>Mật khẩu</th>
			<td><input type="password" name="matKhau" value="************"
				onfocus="this.value=''" class="login-inp" /></td>
		</tr>
		<tr>
			<th></th>
			<td><input type="submit" class="submit-login" value="Đăng nhập" /></td>
		</tr>
	</table>
</s:form>

</div>
<!--  end login-inner -->
<div class="clear"></div>
</div>
</div>
<!-- End: login-holder -->
</body>
</html>