<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Refresh" content="5;url=Index">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<style>
#logoutDiv{
width:600px;
left:50%;
position:absolute;
margin-left:-300px;
}
</style>
<title>Đăng xuất</title>
</head>
<body>
<div id="logoutDiv">
	<div align="center" style="position: absolute;">
	<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	Bạn đã đăng xuất khỏi hệ thống!
	Nhấn <a href="<s:url action="Index"/>">vào đây</a> để quay lại trang chủ. Hoặc hệ thống sẽ tự động chuyển tới trang chủ trong vòng 5s.
	</div>
	<div class="bottom_prod_box_big"></div>
	</div>
	</div>
</div>
</body>
</html>