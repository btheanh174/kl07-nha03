<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<s:form action="AdminStore_themNhomDanhMuc" method="post"
	theme="simple">
	<table border="1px">
		<tr>
			<td colspan="2">Nhập thông tin nhóm danh mục</td>
		</tr>
		<tr>
			<td>Tên nhóm</td>
			<td><s:textfield name="nhomDanhMuc.tenNhom" />
			</td>
		</tr>
		<tr>
			<td>Vị trí</td>
			<td><s:textfield name="nhomDanhMuc.thuTu"/>
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"><s:submit value="Đồng ý"></s:submit>
			</td>
		</tr>
	</table>

</s:form>