<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<table border="1px">
	<tr>
		<td colspan="2">Thông tin cơ bản</td>
	</tr>
	<tr>
		<td>Hãng sản xuất:</td>
		<td><s:property value="sanPham.hangSanXuat" /></td>
	</tr>
	<tr>
		<td>Mạng:</td>
		<td><s:property value="sanPham.mang" /></td>
	</tr>
	<tr>
		<td>Kiểu dáng:</td>
		<td><s:property value="sanPham.kieuDang" /></td>
	</tr>
	<tr>
		<td>Màn hình:</td>
		<td><s:property value="sanPham.manHinh" /></td>
	</tr>
	<tr>
		<td>Độ phân giải:</td>
		<td><s:property value="sanPham.doPhanGiai" /></td>
	</tr>
	<tr>
		<td>Hệ điều hành:</td>
		<td><s:property value="sanPham.heDieuHanh" /></td>
	</tr>
	<tr>
		<td>Bộ nhớ trong:</td>
		<td><s:property value="sanPham.boNhoTrong" /></td>
	</tr>
	<tr>
		<td >Ram:</td>
		<td ><s:property value="sanPham.ram" /></td>
	</tr>
	<tr>
		<td >Tin nhắn:</td>
		<td ><s:property value="sanPham.tinNhan" /></td>
	</tr>
	<tr>
		<td >Trọng lượng:</td>
		<td ><s:property value="sanPham.trongLuong" /></td>
	</tr>
	<tr>
		<td >Kích thước:</td>
		<td ><s:property value="sanPham.kichThuoc" /></td>
	</tr>
	<tr>
		<td >Kiểu chuông:</td>
		<td ><s:property value="sanPham.kieuChuong" /></td>
	</tr>
	<tr>
		<td >Camera:</td>
		<td ><s:property value="sanPham.camera" /></td>
	</tr>
	<tr>
		<td >Màu sắc:</td>
		<td ><s:property value="sanPham.mauSac" /></td>
	</tr>
	<tr>
		<td >Pin:</td>
		<td ><s:property value="sanPham.pin" /></td>
	</tr>
	<tr>
		<td >Thời gian đàm thoại:</td>
		<td ><s:property value="sanPham.thoiGianDamThoai" /></td>
	</tr>
	<tr>
		<td >Thời gian chờ:</td>
		<td ><s:property value="sanPham.thoiGianCho" /></td>
	</tr>
	<tr>
		<td >Số sim:</td>
		<td ><s:property value="sanPham.sim" /></td>
	</tr>
	<tr>
		<td >Loại thẻ nhớ tích hợp:</td>
		<td ><s:property value="sanPham.theNho" /></td>
	</tr>

	<tr class="text_title">
		<td colspan="2">Thông số khác</td>
	</tr>
	<tr>
		<td >Tính năng:</td>
		<td ><s:property value="sanPham.tinhNang" /></td>
	</tr>
	<tr>
		<td >Tính năng khác:</td>
		<td ><s:property value="sanPham.tinhNangKhac" /></td>
	</tr>
</table>