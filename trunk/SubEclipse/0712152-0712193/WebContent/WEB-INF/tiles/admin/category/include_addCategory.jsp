<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<h4>Thêm danh mục</h4>
<br />
<s:form action="DanhMuc_themDanhMuc.action" method="post"
	validate="true" theme="simple">
	<s:hidden id="idIdCatalogue" name="idCatalogue" value="0" />
	<table border="0" width="60%" cellpadding="0" cellspacing="0">
		<tr style="height: 30px">
			<th width="180px">Tên danh mục:</th>
			<td><s:textfield name="danhMuc.tenDanhMuc" size="20"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr style="height: 30px">
			<th>Danh mục cha:</th>
			<td><s:label id="labelThem" style="margin-top:20px;"></s:label>
			</td>
			<td></td>
		</tr>
		<tr style="height: 30px">
			<th></th>

			<td><s:submit key="  Thêm   " method="themDanhMuc" /></td>
			<td></td>
		</tr>
	</table>
</s:form>
