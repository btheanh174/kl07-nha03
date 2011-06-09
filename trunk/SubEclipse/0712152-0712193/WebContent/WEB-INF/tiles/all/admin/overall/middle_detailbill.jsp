<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<div id="center-column" style="font-family: tahoma, arial, sans-serif;">

	<div class="top-bar">
		<h1>Chi tiết hóa đơn</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Chi tiết hóa đơn</a>
		</div>
	</div>

	<br />

	<div class="select-bar">

		<label> <input type="text" name="textfield" /> </label> <label>

			<input type="submit" name="Submit" value="Search" /> </label>

	</div>

	<s:form action="AdminStore_batDauGiaoHang" method="post" theme="simple">

		<fieldset>
			<legend align="left">Chi tiết hóa đơn: </legend>
			<table class="listing" cellpadding="0" cellspacing="0">
				<tr>
					<th class="first" width="120">Sản phẩm</th>
					<th>Số lượng</th>
					<th class="last" width="80">Đơn giá</th>
				</tr>

				<s:iterator value="hoaDon.dsChiTietHoaDon" status="stat">
					<tr align="left">
						<td><s:property value="%{sanPham.tenSanPham}" />
						</td>
						<td><s:property value="%{soLuong}" />
						</td>
						<td><s:property value="%{donGia}" />
						</td>
					</tr>
				</s:iterator>
				<tr>
					<td></td>
					<td>Tổng tiền:</td>
					<td><span><s:property value="hoaDon.tongTienVND()" />
					</span> <b>VNĐ</b> (<span><s:property value="hoaDon.tongTienUSD()" />
					</span> <b>$</b>)</td>
				</tr>
			</table>


		</fieldset>

		<fieldset>
			<legend>Thông tin người mua hàng</legend>
			<table cellpadding="0" cellspacing="10px" width="400px">
				<tr align="left">
					<td width="200px">Tên người mua:</td>
					<td><s:property value="hoaDon.thanhVien.hoTen" /></td>
				</tr>
				<tr align="left">
					<td>Địa chỉ:</td>
					<td><s:property value="hoadon.thanhVien.diaChi" /></td>
				</tr>
				<tr align="left">
					<td>Email:</td>
					<td><s:property value="hoaDon.thanhVien.email" /></td>
				</tr>
				<tr align="left">
					<td>Điện thoại:</td>
					<td><s:property value="hoaDon.thanhVien.dienThoai" /></td>
				</tr>
			</table>
		</fieldset>

		<fieldset>
			<legend>Thông tin người nhận hàng</legend>
			<table cellpadding="0" cellspacing="10px" width="400px">
				<tr align="left">
					<td width="200px">Tên người nhận:</td>
					<td><s:property value="hoaDon.nguoiNhan.tenNguoiNhan" /></td>
				</tr>
				<tr align="left">
					<td>Địa chỉ:</td>
					<td><s:property value="hoaDon.nguoiNhan.diaChi" /></td>
				</tr>
				<tr align="left">
					<td>Email:</td>
					<td><s:property value="hoaDon.nguoiNhan.email" /></td>
				</tr>
				<tr align="left">
					<td>Ghi chú:</td>
					<td><s:property value="hoaDon.nguoiNhan.ghiChu" /></td>
				</tr>
			</table>
		</fieldset>
		<div align="center">
			<br />
			<s:if test="hoaDon.getTinhTrang().getMaTinhTrang() != 5">
				<s:submit value="Xác nhận hàng đã được chuyển"></s:submit>
			</s:if>
			<br />
		</div>
	</s:form>

	<br /> <br />


</div>
