<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>	

<div id="header" class="clearfix">
	<div class="header_left">
		<div id="logo" class="section">
			<div id="HTML23" class="widget HTML">
				<a href=""> <img src='<%=context %><s:property value="%{gianHang.logo}"/>' class="logo">
				</a>
			</div>
		</div>
	</div>
	<div class="h_right">
		<!-- <div id="page" class="section">
			<div id="PageList1" class="widget PageList">
				
			</div>
		</div> -->
		<div id="banner" class="section">
			<div>
				<img alt="" src='<%=context %><s:property value="%{gianHang.banner}"/>'>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
</div>