<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Quản Lý Tuyến :.</title>
</head>
<body>
	<h2>TRANG QUẢN LÝ TUYẾN</h2>
	<hr>
		<s:form action="Tuyen_add">
			<s:textfield name="ten" label="Tên tuyến"></s:textfield>
			<s:textfield name="tramDi" label="Trạm đi"></s:textfield>
			<s:textfield name="tramDen" label="Trạm đến"></s:textfield>
			<s:submit value="Thêm Tuyến"></s:submit>
		</s:form>
		<br>
		<h3>DANH SÁCH TUYẾN XE</h3>
	<hr>
	<table border="1" cellpadding="5">
		<tr>
			<th>Tên tuyến</th>
			<th>Trạm đi</th>
			<th>Trạm đến</th>
			<th>Sửa</th>
			<th>Xóa</th>
		</tr>
		<s:iterator value="dsTuyen">
			<tr>
				<td> <s:property value="ten"/> </td>
				<td> <s:property value="tramDi"/> </td>
				<td> <s:property value="tramDen"/> </td>
				<s:url var="suaTuyen" action="Tuyen_edit">
					<s:param name="idTuyen" value="%{id}"></s:param>
				</s:url>
				<td> <s:a href="%{suaTuyen}">Sửa</s:a> </td>
				
				<s:url var="xoaTuyen" action="Tuyen_delete">
					<s:param name="idTuyen" value="%{id}"></s:param>
				</s:url>
				<td> <s:a href="%{xoaTuyen}" onclick="">Xóa</s:a> </td>
			</tr>
		</s:iterator>
	</table>
	<hr>
	<a href="/KL03/index.jsp">&lt;&lt;Trang Chủ</a>
</body>
</html>