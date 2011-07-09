<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>

<sj:div>
<sj:tabbedpanel id="panelGioiThieu">
	<sj:tab id="tab1" target="div1" label="Giới thiệu sơ lược về công ty"></sj:tab>
	<sj:div id="div1">
		<s:form action="Store_capNhat_intro" method="POST">
			<h4>Hãy nhập thông tin giới thiệu về cửa hàng, sau đó nhấn nút Lưu</h4>
			<sjr:ckeditor id="richtextEditor" width="500" value="%{#session['tk'].gianHang.gioiThieu}"
									name="gianHang.gioiThieu" rows="10" cols="80">
								</sjr:ckeditor>
			<s:submit value="Lưu"></s:submit>
		</s:form>
	</sj:div>
</sj:tabbedpanel>
</sj:div>