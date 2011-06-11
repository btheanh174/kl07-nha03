<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<div id="center-column">

	<div class="top-bar">
		<h1>Danh mục</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Danh mục</a>
		</div>
	</div>

	<br />

	<div class="select-bar">

		<label> <input type="text" name="textfield" /> </label> <label>

			<input type="submit" name="Submit" value="Search" /> </label>

	</div>
	<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
	<div class="table">
		<table class="listing" cellpadding="0" cellspacing="0">
			<tr>
				<th class="first" width="177">Danh mục hệ thống</th>
				<th>Thao tác</th>
				<th class="last">Danh mục cửa hàng</th>
			</tr>
			<tr>
				<td><sjt:tree id="treeDynamicAjax" jstreetheme="default" cssStyle=""
						rootNode="#danhMucAction.danhMucGoc" childCollectionProperty="dsDanhMucCon"
						nodeTitleProperty="tenDanhMuc" nodeIdProperty="maDanhMuc"
						onClickTopics="treeClicked" /></td>
				<td><img src="all/images/admin/add-icon.gif" width="16"
					height="16" alt="" /> <br />
				<br /> <img src="all/images/admin/hr.gif" width="16" height="16"
					alt="" /></td>
				<td></td>
			</tr>
		</table>
	</div>

</div>