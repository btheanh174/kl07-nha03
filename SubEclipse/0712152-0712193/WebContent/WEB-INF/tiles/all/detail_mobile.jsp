<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div id="one">
<table class="technical_table" cellpadding="0" cellspacing="0">
	<tr class="text_title">
		<td colspan="2">Thông tin cơ bản</td>
	</tr>
	<tr>
		<td class="name">Hãng sản xuất:</td>
		<td class="value"><s:property value="sanPham.hangSanXuat" /></td>
	</tr>
	<tr>
		<td class="name">Mạng:</td>
		<td class="value"><s:property value="sanPham.mang" /></td>
	</tr>
	<tr>
		<td class="name">Kiểu dáng:</td>
		<td class="value"><s:property value="sanPham.kieuDang" /></td>
	</tr>
	<tr>
		<td class="name">Màn hình:</td>
		<td class="value"><s:property value="sanPham.manHinh" /></td>
	</tr>
	<tr>
		<td class="name">Độ phân giải:</td>
		<td class="value"><s:property value="sanPham.doPhanGiai" /></td>
	</tr>
	<tr>
		<td class="name">Hệ điều hành:</td>
		<td class="value"><s:property value="sanPham.heDieuHanh" /></td>
	</tr>
	<tr>
		<td class="name">Bộ nhớ trong:</td>
		<td class="value"><s:property value="sanPham.boNhoTrong" /></td>
	</tr>
	<tr>
		<td class="name">Ram:</td>
		<td class="value"><s:property value="sanPham.ram" /></td>
	</tr>
	<tr>
		<td class="name">Tin nhắn:</td>
		<td class="value"><s:property value="sanPham.tinNhan" /></td>
	</tr>
	<tr>
		<td class="name">Trọng lượng:</td>
		<td class="value"><s:property value="sanPham.trongLuong" /></td>
	</tr>
	<tr>
		<td class="name">Kích thước:</td>
		<td class="value"><s:property value="sanPham.kichThuoc" /></td>
	</tr>
	<tr>
		<td class="name">Kiểu chuông:</td>
		<td class="value"><s:property value="sanPham.kieuChuong" /></td>
	</tr>
	<tr>
		<td class="name">Camera:</td>
		<td class="value"><s:property value="sanPham.camera" /></td>
	</tr>
	<tr>
		<td class="name">Màu sắc:</td>
		<td class="value"><s:property value="sanPham.mauSac" /></td>
	</tr>
	<tr>
		<td class="name">Pin:</td>
		<td class="value"><s:property value="sanPham.pin" /></td>
	</tr>
	<tr>
		<td class="name">Thời gian đàm thoại:</td>
		<td class="value"><s:property value="sanPham.thoiGianDamThoai" /></td>
	</tr>
	<tr>
		<td class="name">Thời gian chờ:</td>
		<td class="value"><s:property value="sanPham.thoiGianCho" /></td>
	</tr>
	<tr>
		<td class="name">Số sim:</td>
		<td class="value"><s:property value="sanPham.sim" /></td>
	</tr>
	<tr>
		<td class="name">Loại thẻ nhớ tích hợp:</td>
		<td class="value"><s:property value="sanPham.theNho" /></td>
	</tr>

	<tr class="text_title">
		<td colspan="2">Thông số khác</td>
	</tr>
	<tr>
		<td class="name">Tính năng:</td>
		<td class="value"><s:property value="sanPham.tinhNang" /></td>
	</tr>
	<tr>
		<td class="name">Tính năng khác:</td>
		<td class="value"><s:property value="sanPham.tinhNangKhac" /></td>
	</tr>
</table>
</div>
