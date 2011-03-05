<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Đăng Ký :.</title>
<style type="text/css">
	.errorMessage{color: red}
</style>
</head>
<body>
	<h2>Đăng Ký Thành Viên</h2>
	<hr>
	<s:actionerror/>
	
	<s:form action="doRegister" method="post">
		<s:textfield name="userName" label="Tên Đăng Nhập"></s:textfield>
		<s:password name="password" label="Mật Khẩu"></s:password>
		<s:radio list="{'Nam', 'Nữ'}" label="Giới Tính" name="gender"></s:radio>
		<s:textarea name="about" label="Thông Tin"></s:textarea>
		<s:textfield name="street" label="Đường"></s:textfield>
		<s:textfield name="district" label="Quận"></s:textfield>
		<s:submit value="Đăng Ký" align="center"></s:submit>
	</s:form>
	<hr>
	
	<s:url var="list" action="User_list"></s:url>
	<s:a href="%{list}">&lt;&lt;Danh sách người dùng </s:a><br>
	<a href="/KL03/index.jsp"> &lt;&lt; Trang Chủ</a>
</body>
</html>