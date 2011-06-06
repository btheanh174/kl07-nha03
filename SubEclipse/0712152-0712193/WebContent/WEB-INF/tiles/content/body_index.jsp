<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="css/switchdisplay.css" />

<script type="text/javascript">
<!--
$(document).ready(function() {
	$("a.switch_thumb").toggle(function() {
		$(this).addClass("swap");
		$("ul.display").fadeOut("fast", function() {
			$(this).fadeIn("fast").addClass("thumb_view");
			$(this).removeClass("display");
		});
	}, function() {
		$(this).removeClass("swap");
		$("ul.thumb_view").fadeOut("fast", function() {
			$(this).fadeIn("fast").addClass("display");
			$(this).removeClass("thumb_view");
		});
	});
});

//-->
</script>

<%-- 
	<s:a action="show3_admin_product_search">Tìm nhanh</s:a><br>
	
	<s:a action="DienThoai_timKiem_populate">Tìm kiếm điện thoại</s:a>
	<s:a href="SanPham_timKiem.action?loaiSanPham=dienthoai">Tìm kiếm điện thoại</s:a>
	<br>
	
	<s:a href="SanPham_timKiem.action?loaiSanPham=laptop">Tìm kiếm laptop
	</s:a> --%>

<div class="block_title">
	<span>Sản phẩm mới nhất</span>
	<div style="float: right;">
		<a href="#" class="switch_thumb">Cách hiển thị</a>
	</div>
</div>
<div class="break_line"></div>

<ul class="thumb_view">
	<s:iterator value="dsLaptop" status="stat1">

		<s:url action="SanPham_chiTiet" var="productDetail">
			<s:param name="maSanPham" value="maSanPham"></s:param>
		</s:url>

		<!-- Hien thi -->
		<div class="product_box">

			<div class="product_image">
				<div class="product_image_holder">
					<a class="jTip" rel="" href="${productDetail }"> <img
						id="block_tip_1" alt="Điện thoại di động Apple iPhone 3GS"
						src="${hinhAnh }"> </a>
				</div>
			</div>

			<div class="content_block">
				<div class="product_seller">
					<b> <s:property value="dsGianHangSanPham.size()" /> </b> gian hàng
					bán
				</div>
				<div class="product_price">
					<!-- Lay gia thap nhat trong tat ca cac gian hang -->
					Giá: <b> <s:property value="giaText" /> VNĐ</b>
				</div>
				<div class="product_name">
					<a title='<s:property value="tenSanPham"/>'
						href="${productDetail }"> <s:property value="tenSanPham" /> </a>
				</div>
				<div class="product_desc">
					<s:property value="toShortString()" />
				</div>
			</div>
		</div>
		<!-- ket thuc -->
	</s:iterator>
</ul>

<ul class="thumb_view">
<s:iterator value="dsDienThoai" status="stat1">
	
		<s:url action="SanPham_chiTiet" var="productDetail">
			<s:param name="maSanPham" value="maSanPham"></s:param>
		</s:url>

		<!-- Hien thi -->
		<div class="product_box">

			<div class="product_image">
				<div class="product_image_holder">
					<a class="jTip" rel="" href="${productDetail }"> <img
						id="block_tip_1" alt="Điện thoại di động Apple iPhone 3GS"
						src="${hinhAnh }"> </a>
				</div>
			</div>

			<div class="content_block">
				<div class="product_seller">
					<b> <s:property value="dsGianHangSanPham.size()" /> </b> gian hàng
					bán
				</div>
				<div class="product_price">
					<!-- Lay gia thap nhat trong tat ca cac gian hang -->
					Giá: <b> <s:property value="giaText" /> VNĐ</b>
				</div>
				<div class="product_name">
					<a title='<s:property value="tenSanPham"/>'
						href="${productDetail }"> <s:property value="tenSanPham" /> </a>
				</div>
				<div class="product_desc">
					<s:property value="toShortString()" />
				</div>
			</div>
		</div>
</s:iterator>
</ul>

<div class="spacer"></div>
<%-- <div class="block_title">
	<span>Toàn bộ danh mục</span>
</div>
<div class="break_line"></div>
<div class="square_item_block"></div> --%>