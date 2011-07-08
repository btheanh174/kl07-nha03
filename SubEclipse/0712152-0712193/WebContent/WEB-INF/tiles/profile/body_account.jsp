<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String context = request.getContextPath();
%>

<sj:div>
<sj:tabbedpanel id="panelTaiKhoan">
	<sj:tab id="tab1" target="div1" label="Tổng quan tài khoản"></sj:tab>
	<sj:div id="div1">
		<img alt="" src="<%=context %><s:property value="%{#session['tk'].thanhVien.hinh}"/>" width="100" height="100">
		<br>
		<a href="<s:url action="Profile_capNhatThongTin"/>">chỉnh sửa hồ sơ &gt;&gt;</a>
		<br>
		<s:if test="%{#session['nhomNguoiDung']} == 2">
			<s:url id="store" action="store">
				<s:param name="maGianHang" value="#session['tk'].gianHang.maGianHang"></s:param>
			</s:url>
			<a href="${store }">Xem cửa hàng &gt;&gt;</a>
		</s:if>
		
	</sj:div>
</sj:tabbedpanel>
</sj:div>