<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>



<h4>Cập nhật danh mục</h4>
<s:form action="DanhMuc_capNhatDanhMuc.action" method="post"
	validate="false" theme="simple">
	<s:hidden id="idIdCatalogueCapNhat" name="danhMuc.maDanhMuc" value="0" />

	<table border="0" width="60%" cellpadding="0" cellspacing="0">
		<tr style="height: 30px">
			<th width="180px">Tên danh mục:</th>
			<td><s:textfield name="danhMuc.tenDanhMuc"
					id="idTenDanhMucCapNhat" />
			</td>
			<td></td>
		</tr>
		<tr style="height: 30px">
			<th>Danh mục cha:</th>
			<td><s:select name="idCatalogue" id="slDanhMuc"
					list="dsDanhMucShow" listKey="maDanhMuc"
					listValue="tenDanhMuc"
					value="%{dsDanhMucShow.{1}}" />
			</td>
			<td></td>
		</tr>
		<tr style="height: 30px">
			<th></th>

			<td><s:submit method="capNhatDanhMuc" key="     Cập nhật      " />
			</td>
			<td></td>
		</tr>
	</table>

</s:form>


