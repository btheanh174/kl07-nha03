<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>	

<%
if(session.getAttribute("tk") == null){
	response.sendRedirect("show_user_login.action");
}
%>
<tiles:insertDefinition name="Profile.tiles"></tiles:insertDefinition>