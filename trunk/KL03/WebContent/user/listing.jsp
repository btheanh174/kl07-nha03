<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Danh Sách Người Dùng :.</title>
<script type="text/javascript">
<!-- 
	function create(){
		var rs = comfirm('Bạn có chắc?');
		if(rs){
			bCancel = false;
			set("create");
			return true;
			}else{
				return false;
				}
	}
//-->
</script>
</head>
<body>
	<h2>Danh Sách Người Dùng</h2>
	<hr>
		<table border="1" cellpadding="5">
			<tr>
				<th>Tên Đăng Nhập</th>
				<th>Giới Tính</th>
				<th>Thông Tin</th>
				<th>Địa Chỉ</th>
				<th>Sửa</th>
				<th>Xóa</th>
			</tr>
			<s:iterator value="users">
				<tr>
					<td> <s:property value="userName"/> </td>
					<td> <s:property value="gender"/> </td>
					<td> <s:property value="about"/> </td>
					<td> Đường: <s:property value="address.street"/> - quận: <s:property value="address.district"/> </td>
					<s:url var="editURL" action="User_edit">
						<s:param name="id" value="%{id}"></s:param>
					</s:url>
					<td> <s:a href="%{editURL}">Sửa</s:a> </td>
					<s:url var="deleteURL" action="User_delete">
						<s:param name="id" value="%{id}"></s:param>
					</s:url>
					<td> <s:a href="%{deleteURL}" onclick="create()">Xóa</s:a> </td>
				</tr>
			</s:iterator>
		</table>
	<hr>
	<a href="/KL03/index.jsp">&lt;&lt;Trang Chủ</a>
</body>
</html>