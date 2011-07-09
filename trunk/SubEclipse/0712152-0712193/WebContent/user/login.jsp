<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>	
<%
// Kiem tra neu da dang nhap roi ma url dc chuyen den action dang nhap 
// thi cho chuyen ve trang index
// 
if(session.getAttribute("tk")!=null){
	response.sendRedirect("Index");
}
%>
<tiles:insertDefinition name="Login.tiles"></tiles:insertDefinition>