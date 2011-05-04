<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<div class="center_title_bar">Tìm kiếm điện thoại</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="post" action="">
			<s:actionerror />

			<s:textfield name="tenSanPham" label="Tên sản phẩm"></s:textfield>
			<!-- Thông tin cơ bản -->
			<s:select list="" label="Hãng sản xuất"></s:select>
			<s:select list="" label="Mạng"></s:select>
			<s:select list="" label="Kiểu dáng"></s:select>
			<s:select list="" label="Trọng lượng"></s:select>
			<s:select list="" label="Kích thước"></s:select>
			<s:select list="" label="Loại màn hình"></s:select>
			<s:select list="" label="Độ phân giải"></s:select>
			<s:select list="" label="Kiểu chuông"></s:select>
			<s:select list="" label="Số sim"></s:select>
			<!-- Bộ nhớ -->
			<s:select list="" label="Sổ địa chỉ"></s:select>
			<s:select list="" label="Bộ nhớ trong (>)"></s:select>
			<s:select list="" label="Ram"></s:select>
			<s:select list="" label="Loại thẻ nhớ"></s:select>
			<!-- Dữ liệu -->
			<s:select list="" label="Hệ điều hành"></s:select>
			<s:select list="" label="Tin nhắn"></s:select>
			
			<!-- Tính năng nổi bật -->
			<s:select list="" label="Màu sắc"></s:select>
			<s:select list="" label="Camera"></s:select>
			<s:select list="" label="Tính năng cơ bản"></s:select>
			
			<!-- Pin -->
			<s:select list="" label="Pin"></s:select>
			<s:select list="" label="Thời gian đàm thoại"></s:select>
			<s:select list="" label="Thời gian chờ"></s:select>
			
			<!-- Giá -->
			<s:textfield label="Giá từ"></s:textfield><s:text name="VNĐ"></s:text>
			<s:textfield label="Đến"></s:textfield><s:text name="VNĐ"></s:text>
			
			<s:submit value="Tìm kiếm"></s:submit>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
