<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<s:form action="AdminStore_themDanhMucGianHang" method="post"
	theme="simple">
	<table border="1px">
		<tr>
			<td colspan="2">Nhập thông tin danh mục</td>
		</tr>
		<tr>
			<td>Tên danh mục</td>
			<td><s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
				<s:select name="maDanhMuc"
					list="#danhMucAction.dsDanhMucShow" listKey="maDanhMuc"
					listValue="tenDanhMuc"
					value="%{#danhMucAction.dsDanhMucShow.{maDanhMuc}}" /></td>
		</tr>
		<tr>
			<td>Nhóm danh mục</td>
			<td><s:select list="dsNhomDanhMuc" name="echo" listKey="maNhom"
					listValue="tenNhom" /></td>
		</tr>


		<tr align="center">
			<td colspan="2"><s:submit value="Đồng ý"></s:submit></td>
		</tr>
	</table>

</s:form>