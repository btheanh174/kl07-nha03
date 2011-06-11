<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<script>

	var myEcho = 0;
	function changePage()
	{
		location = "xemDanhSachSanPhamGianHang.action" + "?trangHienTai=" + document.getElementById('idPage').value;
		//this.options[this.selectedIndex].value;
	}
	
	
	function xemChitiet(id)
	{
		window.open("xemChiTietSanPhamGianHang?echo=" + id,'mywindow','top=50,left=250,width=750,height=620');
	}
	
	function clickXoa(echo)
	{
		myEcho = echo;
	}
	
	
	 function okButton(){
	       location = "xoaGianHangSanPham.action" + "?echo=" + myEcho;
     };
    function cancelButton(){
     $('#dialogDelete').dialog('close');
    };
    
	
</script>

<div id="center-column">

	<div class="top-bar">
		<h1>Danh sách sản phẩm</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý sản phẩm</a> / <a href="">Danh sách</a>
		</div>
	</div>

	<br />

	<div class="select-bar">

		<label> <input type="text" name="textfield" /> </label> <label>

			<input type="submit" name="Submit" value="Search" /> </label>

	</div>




	<sj:dialog id="dialogDelete" showEffect="slide"
		buttons="{ 
    		'OK':function() { okButton(); },
    		'Cancel':function() { cancelButton(); } 
    		}"
		autoOpen="false" modal="true" title="Xóa sản phẩm">

	</sj:dialog>


	<sj:dialog id="dialogEdit" autoOpen="false" modal="true"
		showEffect="slide" title="Cập nhật tình trạng sản phẩm" href="%{ajax}">
	</sj:dialog>


	<div class="table"
		style="font-family: arial, sans-serif; font-size: 11px">
		<img src="all/images/admin/bg-th-left.gif" width="8" height="7" alt=""
			class="left" /> <img src="all/images/admin/bg-th-right.gif"
			width="7" height="7" alt="" class="right" />

		<table class="listing" cellpadding="0" cellspacing="0">

			<tr>

				<th class="first" width="107">Ảnh</th>

				<th>Tên sản phẩm</th>

				<th>Giá bán</th>

				<th>Số lượng</th>

				<th>Bảo hành</th>

				<th>Chi tiết</th>

				<th>Danh mục</th>

				<th>Sửa</th>

				<th class="last">Xóa</th>

			</tr>
			<s:iterator value="dsGHSanPhamShow">
				<tr>

					<td class="first style1"><img alt=""
						style="width: 80px; height: 80px;"
						src="<s:property value= "getSanPham().getDsHinhAnh().get(0).getUrlHinhAnh()"/> ">
					</td>

					<td><s:property value="getSanPham().tenSanPham" /></td>

					<td><s:property value="giaRieng" /></td>

					<td><s:property value="soLuong" />
					<td><s:property value="baoHanh" /></td>

					<td><a style="color: blue;" href=""
						onclick="xemChitiet(<s:property value="getSanPham().maSanPham" />)">Chi
							tiết...</a></td>

					<td>Danh mục</td>


					<td><s:url id="editURL"
							value="xemThongSoGianHangSanPham.action">
							<s:param name="echo">
								<s:property value="getSanPham().maSanPham" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogEdit" type="image" href="%{editURL}"
							src="all/images/admin/edit-icon.gif" /></td>


					<td class="last"><s:url id="deleteURL"
							value="xacNhanXoaGianHangSanPham.action">
							<s:param name="echo">
								<s:property value="getSanPham().maSanPham" />
							</s:param>
						</s:url> <sj:submit openDialog="dialogDelete" href="%{deleteURL}"
						onclick="clickXoa(%{getSanPham().maSanPham})"
							type="image" src="all/images/admin/hr.gif" /></td>

				</tr>
			</s:iterator>
		</table>
		<br /> <br />
		<div class="select">
			<strong>Other Pages: </strong> <select id="idPage"
				onchange="changePage()">
				<s:iterator status="stat" value="tongSoTrang.{ #this }">
					<option>
						<s:property value="#stat.count" />
					</option>

				</s:iterator>
			</select>

		</div>
	</div>

</div>