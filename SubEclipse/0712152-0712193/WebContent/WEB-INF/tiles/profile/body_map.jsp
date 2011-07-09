<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>

<sj:div>
<sj:tabbedpanel id="panelBanDo">
	<sj:tab id="tab1" target="div1" label="Thiết lập bản đồ chỉ dẫn"></sj:tab>
	<sj:div id="div1">
		
	</sj:div>
</sj:tabbedpanel>
</sj:div>