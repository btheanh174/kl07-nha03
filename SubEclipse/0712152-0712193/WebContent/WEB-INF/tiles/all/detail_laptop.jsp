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
		<td class="name">HDD:</td>
		<td class="value"><s:property value="sanPham.hdd" /></td>
	</tr>

	<tr>
		<td class="name">RAM:</td>
		<td class="value"><s:property value="sanPham.ram" /></td>
	</tr>


	<tr>
		<td class="name">CPU:</td>
		<td class="value"><s:property value="sanPham.cpu" /></td>
	</tr>

	<tr>
		<td class="name">VGA:</td>
		<td class="value"><s:property value="sanPham.vga" /></td>
	</tr>



	<tr>
		<td class="name">LAN:</td>
		<td class="value"><s:property value="sanPham.lan" /></td>
	</tr>

	<tr>
		<td class="name">WIFI:</td>
		<td class="value"><s:property value="sanPham.wifi" /></td>
	</tr>


	<tr>
		<td class="name">Battery:</td>
		<td class="value"><s:property value="sanPham.pin" /></td>
	</tr>


	<tr>
		<td class="name">Trọng lượng:</td>
		<td class="value"><s:property value="sanPham.trongLuong" /></td>
	</tr>

	<tr>
		<td class="name">Độ phân giải:</td>
		<td class="value"><s:property value="sanPham.doPhanGiai" /></td>
	</tr>
	<tr>
		<td class="name">Kích thước màn hình:</td>
		<td class="value"><s:property value="sanPham.kichThuocManHinh" /></td>
	</tr>
	<tr class="text_title">
		<td colspan="2">Thông số khác</td>
	</tr>
	<tr>
		<td class="name">OS:</td>
		<td class="value"><s:property value="heDieuHanh" /></td>
	</tr>
	<tr>
		<td class="name">Chuột:</td>
		<td class="value"><s:property value="chuot" /></td>
	</tr>
	<tr>
		<td class="name">Cổng USB:</td>
		<td class="value"><s:property value="usb" /></td>
	</tr>
	<tr>
		<td class="name">Tính năng khác:</td>
		<td class="value"><!-- <ul>
									<li>HDMI</li>
									<li>Camera</li>
									<li>Microphone</li>
									<li>Headphone</li>
									<li>Bluetooth</li>
									<li>RJ-11 Modem</li>
								</ul> --> <s:property value="sanPham.tinhNangKhac" /></td>
	</tr>
</table>
</div>
