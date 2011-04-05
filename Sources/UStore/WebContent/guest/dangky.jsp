<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="background-color: gray; text-align: center;color: white; height: 100%">
<h3 align="center" style="color: blue;">Đăng ký tài khoản người dùng</h3>
<s:form action="User_register">
	<s:textfield  name="userName" label="Tên truy cập"></s:textfield>
	<s:password  name="password" label="Mật khẩu"></s:password>
	<s:password  name="repassword" label="Xác nhận mật khẩu" />
	<s:textfield  name="name" label="Họ và tên"></s:textfield>
	<s:textfield  name="email" label="Email"></s:textfield>
	<s:select list="city" key="city.id" value="city.name" label="Tỉnh/Thành phố"></s:select>
	<s:submit align="center" value="Đăng ký" />
</s:form></div>