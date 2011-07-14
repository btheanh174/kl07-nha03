<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="technical_table" cellpadding="0" cellspacing="0">
			<tr class="text_title">
				<td colspan="2">Thông tin cơ bản</td>
			</tr>
			<tr>
				<td class="name">Hãng sản xuất:</td>
				<td class="value"><s:property value="hangSanXuat" /></td>
			</tr>

			<tr>
				<td class="name">HDD:</td>
				<td class="value"><s:property value="hdd" /></td>
			</tr>

			<tr>
				<td class="name">RAM:</td>
				<td class="value"><s:property value="ram" /></td>
			</tr>


			<tr>
				<td class="name">CPU:</td>
				<td class="value"><s:property value="cpu" /></td>
			</tr>

			<tr>
				<td class="name">VGA:</td>
				<td class="value"><s:property value="vga" /></td>
			</tr>



			<tr>
				<td class="name">LAN:</td>
				<td class="value"><s:property value="lan" /></td>
			</tr>

			<tr>
				<td class="name">WIFI:</td>
				<td class="value"><s:property value="wifi" /></td>
			</tr>


			<tr>
				<td class="name">Battery:</td>
				<td class="value"><s:property value="pin" /></td>
			</tr>


			<tr>
				<td class="name">Trọng lượng:</td>
				<td class="value"><s:property value="trongLuong" /></td>
			</tr>

			<tr>
				<td class="name">Độ phân giải:</td>
				<td class="value"><s:property value="doPhanGiai" /></td>
			</tr>
			<tr>
				<td class="name">Kích thước màn hình:</td>
				<td class="value"><s:property value="kichThuocManHinh" /></td>
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
				<td class="value"> <s:property value="tinhNangKhac" /></td>
			</tr>
		</table>