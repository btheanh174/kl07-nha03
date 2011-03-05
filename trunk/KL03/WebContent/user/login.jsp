<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Đăng Nhập :.</title>
<style type="text/css">
	.errorMessage{color:red}
</style>
</head>
<body>
	<h2>Đăng Nhập</h2>
	<hr>
	
	<s:form action="doLogin">
		<s:textfield name="userName" label="Tên Đăng Nhập" maxlength="20"></s:textfield>
		<s:password name="password" label="Mật Khẩu" maxlength="20"></s:password>
		<s:submit value="Đăng Nhập"/>
	</s:form>
	<s:property value="message"/>
	<hr>
	<a href="/KL03/index.jsp">&lt;&lt; Trang Chủ</a>
</body>
</html>