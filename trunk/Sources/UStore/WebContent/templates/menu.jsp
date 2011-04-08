<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="vertical-align: top;">
<h3 style="text-align: center; color: blue;">Menu</h3>
<ul>
	<li><s:url var="home" action="Show_Home"></s:url> <s:a
		href="%{home}">Trang chủ</s:a></li>
	<li><s:url var="register" action="Show_Register"></s:url> <s:a
		href="%{register}">Đăng ký</s:a></li>
	<li><s:url var="login" action="Show_Login"></s:url> <s:a
		href="%{login}">Đăng nhập</s:a></li>
</ul>
</div>