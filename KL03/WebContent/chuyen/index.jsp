<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Quản lý chuyến :.</title>
</head>
<body>
	<h2>TRANG QUẢN LÝ CHUYẾN</h2>
	<hr>
	<s:form action="Chuyen_add">
		
		<s:select name="idTuyen" list="dsTuyen" listKey="id" listValue="ten" headerKey="0"  label="Chọn tuyến" ></s:select>
		<s:textfield name="ten" label="Tên chuyến"></s:textfield>
		<s:textfield name="gioKhoiHanh" label="Giờ khởi hành"/>
		<s:textfield name="gioDenNoi" label="Giờ đến nơi"/>
		<s:submit value="Thêm"></s:submit>
	</s:form>
	<br>
	DANH SÁCH CHUYẾN XE
	<hr>
	<table border="1" cellpadding="5">
		<tr>
			<th>Tên chuyến</th>
			<th>Tuyến</th>
			<th>Giờ khởi hành</th>
			<th>Giờ đến nơi</th>
		</tr>
		<s:iterator value="dsChuyen">
			<tr>
				<td> <s:property value="ten"/> </td>
				<td> <s:property value=""/> </td>
				<td> <s:property value="gioKhoiHanh"/> </td>
				<td> <s:property value="gioDenNoi"/> </td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>