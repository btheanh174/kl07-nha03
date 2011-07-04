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
		<td>HDD:</td>
		<td><s:property value="sanPham.hdd" /></td>
	</tr>
	<tr>
		<td>RAM:</td>
		<td><s:property value="sanPham.ram" /></td>
	</tr>
	<tr>
		<td>CPU:</td>
		<td><s:property value="sanPham.cpu" /></td>
	</tr>
	<tr>
		<td>VGA:</td>
		<td><s:property value="sanPham.vga" /></td>
	</tr>
	<tr>
		<td>LAN:</td>
		<td><s:property value="sanPham.lan" /></td>
	</tr>
	<tr>
		<td>WIFI:</td>
		<td><s:property value="sanPham.wifi" /></td>
	</tr>
	<tr>
		<td>Battery:</td>
		<td><s:property value="sanPham.pin" /></td>
	</tr>
	<tr>
		<td>Trọng lượng:</td>
		<td><s:property value="sanPham.trongLuong" /></td>
	</tr>
	<tr>
		<td>Độ phân giải:</td>
		<td><s:property value="sanPham.doPhanGiai" /></td>
	</tr>
	<tr>
		<td>Kích thước màn hình:</td>
		<td><s:property value="sanPham.kichThuocManHinh" /></td>
	</tr>
	<tr>
		<td colspan="2">Thông số khác</td>
	</tr>
	<tr>
		<td>OS:</td>
		<td><s:property value="sanPham.heDieuHanh" /></td>
	</tr>
	<tr>
		<td>Chuột:</td>
		<td><s:property value="sanPham.chuot" /></td>
	</tr>
	<tr>
		<td>Cổng USB:</td>
		<td><s:property value="sanPham.usb" /></td>
	</tr>
	<tr>
		<td>Tính năng khác:</td>
		<td>
			<ul>
				<li>HDMI</li>
				<li>Camera</li>
				<li>Microphone</li>
				<li>Headphone</li>
				<li>Bluetooth</li>
				<li>RJ-11 Modem</li>
			</ul> <s:property value="tinhNangKhac" /></td>
	</tr>
</table>