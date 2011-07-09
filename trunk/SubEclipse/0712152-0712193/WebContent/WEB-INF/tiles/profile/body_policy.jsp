<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>

<sj:div>
<sj:tabbedpanel id="panelChinhSach">
	<sj:tab id="tab1" target="div1" label="Chính sách bán hàng của công ty"></sj:tab>
	<sj:div id="div1">
		<s:form action="Store_capNhat_policy" method="POST">
			<h4>Hãy nhập những quy định về chính sách bán hàng của công ty, sau đó nhấn nút Lưu</h4>
			<sjr:ckeditor id="richtextEditor" width="500" value="%{#session['tk'].gianHang.chinhSach}"
									name="gianHang.chinhSach" rows="10" cols="80">
								</sjr:ckeditor>
			<s:submit value="Lưu"></s:submit>
		</s:form>
	</sj:div>
</sj:tabbedpanel>
</sj:div>