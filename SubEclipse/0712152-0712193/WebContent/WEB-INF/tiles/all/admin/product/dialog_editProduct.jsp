<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<s:form action="capNhatThongTinGianHangSanPham.action" method="post"
	theme="simple">
	<s:hidden name="echo" value="%{echo}"></s:hidden>
	<table border="1px">
		<tr>
			<td colspan="2">Thông tin sản phẩm gian hàng</td>
		</tr>
		<tr>
			<td>Tên sản phẩm</td>
			<td><s:property value="ghSanPham.getSanPham().tenSanPham" />
			</td>
		</tr>
		<tr>
			<td>Giá bán</td>
			<td><s:textfield name="ghSanPham.giaRieng"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>Số lượng</td>
			<td><s:textfield name="ghSanPham.soLuong"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>Bảo hành</td>
			<td><s:textfield name="ghSanPham.baoHanh"></s:textfield>
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"><s:submit value="Đồng ý"></s:submit>
			</td>
		</tr>
	</table>

</s:form>