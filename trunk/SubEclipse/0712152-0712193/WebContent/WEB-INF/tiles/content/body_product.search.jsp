<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">Tìm nhanh sản phẩm</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<label>Tìm sản phẩm theo loại, tên và khoảng giá</label>
		<s:form action="SanPham_timNhanh" method="post">
			<s:select name="tieuChi.loaiSanPham" tooltip="Chọn loại sản phẩm cần tìm" list="#{'':'Tất cả','DIENTHOAI':'Điện thoại', 'LAPTOP':'Laptop'}" label="Loại sản phẩm"></s:select>
			<s:textfield name="tieuChi.tenSanPham" tooltip="Nhập tên sản phẩm cần tìm" label="Tên sản phẩm"></s:textfield>
			<s:textfield name="tieuChi.giaDuoi" label="Giá từ"></s:textfield>
			<s:textfield name="tieuChi.giaTren" label="Đến"></s:textfield>
			<s:submit value="Tìm kiếm"></s:submit>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>