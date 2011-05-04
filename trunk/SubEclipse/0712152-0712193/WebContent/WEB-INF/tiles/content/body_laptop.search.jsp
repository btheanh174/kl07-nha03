<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<div class="center_title_bar">Tìm kiếm laptop</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="post" action="">
			<s:actionerror />
			<s:textfield name="tenSanPham" label="Tên sản phẩm"></s:textfield>
			<sj:select list="" label="Hãng sản xuất"></sj:select>
			
			<sj:select list="" label="Mainboard Chipset" name="mainboard"></sj:select>
			<!-- Màn hình -->
			<s:select list="" label="Độ lớn màn hình"></s:select>
			<s:select list="" label="Độ phân giải"></s:select>
			<!-- HDD -->
			<s:select list="" label="HDD (>)"></s:select>
			<s:select list="" label="Số vòng quay"></s:select>
			<!-- CPU -->
			<s:select list="" label="Loại CPU"></s:select>
			<s:select list="" label="Tốc độ (>)"></s:select>
			<!-- Memory -->
			<sj:select label="Loại"></sj:select>
			<sj:select label="RAM (>)"></sj:select>
			<!-- Network -->
			<s:select list="" label="Lan"></s:select>
			<s:select list="" label="Wifi"></s:select>
			<!-- Graphic -->
			<s:select list="" label="Chipset" name="chipset"></s:select>
			<s:select list="" label="Memory (>)" name="vga"></s:select>
			<!-- Khác -->
			<s:select list="" label="Hệ điều hành"></s:select>
			<s:select list="" label="Chuột"></s:select>
			<s:select list="" label="Trọng lượng"></s:select>
			<sj:select label="Pin (>)"></sj:select>
			<!-- Giá -->
			<s:textfield label="Giá từ"></s:textfield><s:text name="VNĐ"></s:text>
			<s:textfield label="Đến"></s:textfield><s:text name="VNĐ"></s:text>
			
			<s:submit value="Tìm kiếm"></s:submit>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
