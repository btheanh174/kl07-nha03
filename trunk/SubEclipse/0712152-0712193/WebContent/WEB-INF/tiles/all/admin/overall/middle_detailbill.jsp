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

	<s:form action="Store_capNhat" method="post" theme="simple">

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
			</table>
		</fieldset>
	</s:form>



</div>
