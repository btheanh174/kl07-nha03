<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<div class="center_title_bar">
	<s:property value="tenSanPham" />
</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">

		<div class="product_img_big">
			<a href="javascript:popImage('images/big_pic.jpg','Some Title')"
				title="header=[Zoom] body=[&nbsp;] fade=[on]"><img
				src="images/laptop.gif" alt="" title="" border="0" /> </a>
			<div class="thumbs">
				<a href="#" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a>
			</div>
		</div>
		<div class="details_big_box">
			<div class="product_title_big">
				<s:property value="tenSanPham" />
			</div>
			<div class="specifications">
				Cập nhật: <span class="blue">30/04/2011</span><br /> Bảo hành: <span
					class="blue">12 Tháng</span><br /> Số lượng: <span class="blue">1</span><br />
				Chất lượng: <span class="blue">Mới</span><br /> Phí vận chuyển: <span
					class="blue">Liên hệ</span><br /> Xuất xứ: <span class="blue">Chính
					hảng</span><br />
			</div>
			<div class="prod_price_big">
				<div class="prod_price_big">
					<span class="price"><s:property value="gia" /> VNĐ</span>
				</div>
			</div>

			<a href="#" class="addtocart">Thêm vào giỏ hàng</a> <a href="#"
				class="compare">So sánh</a>
		</div>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>


<div class="prod_box_big">
	<div class="center_prod_box_big">
		<sj:div cssClass="">
			<sj:tabbedpanel id="dienthoai" animate="true" collapsible="true">
				<sj:tab id="tabSoSanh" target="one" label="So sánh"></sj:tab>
				<sj:tab id="tabThongSo" target="two" label="Thông số kỹ thuật"></sj:tab>
				<sj:tab id="tabSanPhamLienQuan" target="three"
					label="Các sản phẩm liên quan"></sj:tab>
				<sj:tab id="tabHinhAnh" target="four" label="Hình ảnh"></sj:tab>
				<div id="one">So sánh</div>
				<div id="two">Thông số kỹ thuật</div>
				<div id="three">Các sản phẩm liên quan</div>
				<div id="four">Hình ảnh</div>
			</sj:tabbedpanel>
		</sj:div>
	</div>
</div>
