<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h4>Xóa danh mục</h4>
<s:form action="DanhMuc_xoaDanhMuc.action" method="post"
	validate="false" theme="simple">
	<s:hidden id="idIdCatalogueXoa" name="idCatalogue" value="0" />
	<table border="0" width="60%" cellpadding="0" cellspacing="0">
		<tr style="height: 30px">
			<th width="180px">Danh mục cần xóa:</th>
			<td><s:label id="labelXoa"></s:label></td>
			<td></td>
		</tr>
		<tr style="height: 30px">
			<th></th>
			<td><s:submit method="xoaDanhMuc" key="     Xóa      " /></td>
			<td></td>
		</tr>
	</table>
</s:form>