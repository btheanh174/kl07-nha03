<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: KL03 - MyWebsite :.</title>
<s:head/>
</head>
<body>
	<h2>Chào Mừng...</h2>
	<hr>
	<menu>
		<li><a href="./index.jsp">Trang Chủ</a></li>
		<s:url var="listingUser" action="User_list"></s:url>
		<li> <s:a href="%{listingUser}">Danh Sách Người Dùng</s:a> </li>
		<li><a href="./user/register.jsp">Đăng Ký</a></li>
		<li><a href="./user/login.jsp">Đăng Nhập</a></li>
		<s:url var="tuyenUrl" action="Tuyen_list"></s:url>
		<li><s:a href="%{tuyenUrl}">Quản Lý Tuyến</s:a></li>
		
		<s:url var="chuyenUrl" action="Chuyen_list"></s:url>
		<li><s:a href="%{chuyenUrl}">Quản Lý Chuyến</s:a></li>
	</menu>
	<hr>
	<s:label>... </s:label>
	
	
</body>
</html>