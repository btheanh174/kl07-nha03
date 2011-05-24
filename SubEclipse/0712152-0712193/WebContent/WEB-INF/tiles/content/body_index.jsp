<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%-- 
	<s:a action="show3_admin_product_search">Tìm nhanh</s:a><br>
	
	<s:a action="DienThoai_timKiem_populate">Tìm kiếm điện thoại</s:a>
	<s:a href="SanPham_timKiem.action?loaiSanPham=dienthoai">Tìm kiếm điện thoại</s:a>
	<br>
	
	<s:a href="SanPham_timKiem.action?loaiSanPham=laptop">Tìm kiếm laptop
	</s:a> --%>

<div class="center_title_bar_full">Máy tính Laptop</div>
<s:iterator var="dienthoai" value="(6).{#this}">
	<div class="prod_box">
		<div class="top_prod_box"></div>
		<div class="center_prod_box">
			<div class="product_title">
				<a href="details.html">Motorola 156 MX-VL</a>
			</div>
			<div class="product_img">
				<a href="details.html"><img src="images/product/7_01.jpg" alt=""
					title="" border="0" />
				</a>
			</div>
			<div class="prod_price">
				<span class="reduce">350$</span> <span class="price">270$</span>
			</div>
		</div>
		<div class="bottom_prod_box"></div>
		<div class="prod_details_tab">
			<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
				src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
			</a> <a href=" <s:url action="show_product_detail" />"
				title="header=[Chi tiết] body=[&nbsp;] fade=[on]"
				class="prod_details">Chi tiết</a>
		</div>
	</div>

</s:iterator>
<br>
<div class="center_title_bar_full">Điện thoại</div>
<s:iterator var="laptop" value="(6).{#this}">
	<div class="prod_box">
		<div class="top_prod_box"></div>
		<div class="center_prod_box">
			<div class="product_title">
				<a href="details.html">iPhone 4G 32 GB Black</a>
			</div>
			<div class="product_img">
				<a href="details.html"><img src="images/product/6_01.jpg" alt=""
					title="" border="0" />
				</a>
			</div>
			<div class="prod_price">
				<span class="reduce">350$</span> <span class="price">270$</span>
			</div>
		</div>
		<div class="bottom_prod_box"></div>
		<div class="prod_details_tab">
			<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
				src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
			</a> <a href=" <s:url action="show_product_detail" />"
				title="header=[Chi tiết] body=[&nbsp;] fade=[on]"
				class="prod_details">Chi tiết</a>
		</div>
	</div>
</s:iterator>
