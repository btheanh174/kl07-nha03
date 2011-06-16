<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<script>
	var myEcho = 0;
	
	function clickXoa(echo)
	{
		myEcho = echo;
	}

	 function okButton(){
	       location = "xoaGianHangDanhMuc.action" + "?echo=" + myEcho;
	 };
	 
	function cancelButton(){
	 $('#dialogDelete').dialog('close');
	};

</script>

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

	<s:url id="addDM" value="AdminStore_giaoDienThemDanhMucGianHang" />
	<sj:dialog id="dialogAdd" autoOpen="false" modal="true"
		showEffect="slide" title="Thêm danh mục mới" href="%{addDM}">
	</sj:dialog>

	<sj:dialog id="dialogDelete" showEffect="slide"
		buttons="{ 
    		'OK':function() { okButton(); },
    		'Cancel':function() { cancelButton(); } 
    		}"
		autoOpen="false" modal="true" title="Xóa danh mục">

	</sj:dialog>


	<sj:dialog id="dialogEdit" autoOpen="false" modal="true"
		showEffect="slide" title="Cập nhật danh mục" href="%{ajax}">Chưa rõ ý đồ
	</sj:dialog>

	<div class="table"
		style="font-family: arial, sans-serif; font-size: 11px">
		<img src="all/images/admin/bg-th-left.gif" width="8" height="7" alt=""
			class="left" /> <img src="all/images/admin/bg-th-right.gif"
			width="7" height="7" alt="" class="right" />
		<div align="right">
			<sj:submit openDialog="dialogAdd" href="%{addURL}"
				 button="true"
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
			<s:iterator value="dsDanhMucGianHang">
				<tr>

					<td class="first style1"><s:property
							value="danhMuc.tenDanhMuc" />
					</td>

					<td><s:property value="nhomDanhMuc.tenNhom" />
					</td>

					<td><s:property value="soSanPham" /></td>

					<td><s:url id="editURL"
							value="xemThongSoGianHangDanhMuc.action">
							<s:param name="echo">
								<s:property value="danhMuc.maDanhMuc" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogEdit" type="image"
							src="all/images/admin/spanner_48.png" cssStyle="width:35px" /></td>


					<td class="last"><s:url id="deleteURL"
							value="xacNhanXoaGianHangDanhMuc.action">
							<s:param name="echo">
								<s:property value="danhMuc.maDanhMuc" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogDelete" href="%{deleteURL}"
							onclick="clickXoa(%{danhMuc.maDanhMuc})" type="image"
							src="all/images/admin/cancel_48.png" cssStyle="width:35px" /></td>

				</tr>
			</s:iterator>
		</table>
		<br /> <br />

	</div>
</div>