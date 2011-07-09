<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>	

<div id="header" class="clearfix">
	<div class="header_left">
		<div id="logo">
				<a href=""> <img src='<%=context %><s:property value="%{gianHang.logo}"/>' class="logo">
				</a>
		</div>
	</div>
	<div class="header_right">
		<div id="banner">
				<img alt="" src='<%=context %><s:property value="%{gianHang.banner}"/>'>
		</div>
	</div>
	<div class="clearfix"></div>
</div>