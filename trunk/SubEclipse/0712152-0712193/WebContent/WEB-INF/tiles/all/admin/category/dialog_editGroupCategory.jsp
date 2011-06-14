<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<s:form action="AdminStore_capNhatNhomDanhMuc.action" method="post"
	theme="simple">
	<s:hidden name="echo" value="%{echo}"></s:hidden>
	<table border="1px">
		<tr>
			<td colspan="2">Thông tin nhóm danh mục</td>
		</tr>
		<tr>
			<td>Tên nhóm</td>
			<td><s:textfield name="nhomDanhMuc.tenNhom"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>Vị trí</td>
			<td><s:textfield name="nhomDanhMuc.thuTu"></s:textfield>
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"><s:submit value="Đồng ý"></s:submit>
			</td>
		</tr>
	</table>

</s:form>