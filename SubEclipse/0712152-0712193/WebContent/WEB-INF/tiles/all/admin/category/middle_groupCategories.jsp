<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<div id="center-column">

	<div class="top-bar">
		<h1>Nhóm danh mục</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý danh mục</a> / <a href="">Nhóm danh mục</a>
		</div>
	</div>

	<br />

	<div class="select-bar">

		<label> <input type="text" name="textfield" /> </label> <label>

			<input type="submit" name="Submit" value="Search" /> </label>

	</div>

	<s:url id="addNhomDM" value="AdminStore_giaoDienThemNhomDanhMuc" />
	<sj:dialog id="dialogAdd" autoOpen="false" modal="true"
		showEffect="slide" title="Thêm nhóm danh mục mới" href="%{addNhomDM}">
	</sj:dialog>

	<div class="table"
		style="font-family: arial, sans-serif; font-size: 11px">
		<img src="all/images/admin/bg-th-left.gif" width="8" height="7" alt=""
			class="left" /> <img src="all/images/admin/bg-th-right.gif"
			width="7" height="7" alt="" class="right" />
		<div align="right">
			<sj:submit openDialog="dialogAdd" href="%{addURL}"
				onclick="clickXoa(%{getSanPham().maSanPham})" button="true"
				value="Thêm nhóm mới" />
		</div>
		<br /> <br />
		<table class="listing" cellpadding="0" cellspacing="0">

			<tr>

				<th class="first" width="107">STT</th>

				<th>Tên nhóm danh mục</th>

				<th>Sản phẩm</th>

				<th>Sửa</th>

				<th class="last">Xóa</th>

			</tr>
			<s:iterator value="dsNhomDanhMuc">
				<tr>

					<td class="first style1"><s:property value="thuTu" />
					</td>

					<td><s:property value="tenNhom" />
					</td>

					<td>5</td>

					<td><s:url id="editURL"
							value="xemThongSoGianHangSanPham.action">
							<s:param name="echo">
								<s:property value="getSanPham().maSanPham" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogEdit" type="image" href="%{editURL}"
							src="all/images/admin/spanner_48.png" cssStyle="width:35px" /></td>


					<td class="last"><s:url id="deleteURL"
							value="xacNhanXoaGianHangSanPham.action">
							<s:param name="echo">
								<s:property value="getSanPham().maSanPham" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogDelete" href="%{deleteURL}"
							onclick="clickXoa(%{getSanPham().maSanPham})" type="image"
							src="all/images/admin/cancel_48.png" cssStyle="width:35px" /></td>

				</tr>
			</s:iterator>
		</table>
		<br /> <br />

	</div>
</div>