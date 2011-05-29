<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div id="one">
	<table width="500" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<tr>
			<td align="right">Hãng sản xuất:</td>
			<td align="left"><s:property value="sanPham.hangSanXuat" /></td>
		</tr>
		<tr>
			<td align="right">HDD:</td>
			<td align="left"><s:property value="sanPham.hdd" />
			</td>
		</tr>
		<tr>
			<td align="right">RAM:</td>
			<td align="left"><s:property value="sanPham.ram" />
			</td>
		</tr>
		<tr>
			<td align="right">CPU:</td>
			<td align="left"><s:property value="sanPham.cpu" />
			</td>
		</tr>
		<tr>
			<td align="right">VGA:</td>
			<td align="left"><s:property value="sanPham.vga" />
			</td>
		</tr>
		<tr>
			<td align="right">OS:</td>
			<td align="left"><s:property value="sanPham.heDieuHanh" />
			</td>
		</tr>
		<tr>
			<td align="right">Chuột:</td>
			<td align="left"><s:property value="sanPham.chuot" />
			</td>
		</tr>
		<tr>
			<td align="right">Cổng USB:</td>
			<td align="left"><s:property value="sanPham.usb" />
			</td>
		</tr>
		<tr>
			<td align="right">LAN:</td>
			<td align="left"><s:property value="sanPham.lan" />
			</td>
		</tr>
		<tr>
			<td align="right">WIFI:</td>
			<td align="left"><s:property value="sanPham.wifi" />
			</td>
		</tr>
		<tr>
			<td align="right">Pin:</td>
			<td align="left"><s:property value="sanPham.pin" />
			</td>
		</tr>
		<tr>
			<td align="right">Trọng lượng:</td>
			<td align="left"><s:property value="sanPham.trongLuong" />
			</td>
		</tr>
		<tr>
			<td align="right">Độ phân giải:</td>
			<td align="left"><s:property value="sanPham.doPhanGiai" />
			</td>
		</tr>
		<tr>
			<td align="right">Kích thước màn hình:</td>
			<td align="left"><s:property value="sanPham.kichThuocManHinh" />
			</td>
		</tr>
		<tr>
			<td align="right">Tính năng khác:</td>
			<td align="left">
				<!-- <ul>
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
