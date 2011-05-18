<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<%
	if ((session.getAttribute("tk") == null)
			&& ((Integer)session.getAttribute("nhomNguoiDung") != 4)) {
		response.sendRedirect("User_login.action");
	}
%>
<tiles:insertDefinition name="Admin.tiles"></tiles:insertDefinition>
