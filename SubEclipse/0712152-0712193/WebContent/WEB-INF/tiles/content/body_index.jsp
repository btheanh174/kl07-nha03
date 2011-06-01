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

<div class="block_title"><span>Sản phẩm mới nhất</span></div>
<div class="break_line"></div>


<s:iterator value="dsLaptop" status="stat1">

	<s:url action="SanPham_chiTiet" var="productDetail">
		<s:param name="maSanPham" value="maSanPham"></s:param>
	</s:url>

	<div class="product_box jTip">
	<div class="product_image">
	<div class="product_image_holder"><a target="_blank" class="jTip"
		rel="" href=""> <img id="block_tip_1"
		alt="Điện thoại di động Apple iPhone 3GS" src="${hinhAnh }"> </a></div>
	</div>
	<div class="product_seller"><b>30</b> gian hàng bán</div>
	<div class="product_seller"><!-- Lay gia thap nhat trong tat ca cac gian hang -->
	Giá từ: <b>8.300.000 VNĐ</b></div>
	<div class="product_name"><a target="_blank"
		title='<s:property value="tenSanPham"/>' href=""> <s:property
		value="tenSanPham" /> </a></div>
	</div>

	<!--<div class="prod_box">
	<div class="top_prod_box"></div>
	<div class="center_prod_box">
	<div class="product_title"><a href="${productDetail}"><s:property
		value="tenSanPham" /> </a></div>

	<div class="product_img"><a href="${productDetail}"
		data-tooltip=""> <img src="${hinhAnh}" alt="" title="" border="0"
		width="120" height="120" /> </a></div>


	<div class="prod_price"><span class="reduce"></span> <span
		class="price"><s:property value="giaText" /> VNĐ</span></div>
	</div>
	<div class="bottom_prod_box"></div>
	<div class="prod_details_tab"><a href="#"
		title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
		src="images/cart.gif" alt="" title="" border="0" class="left_bt" /> </a><a
		href="${productDetail}" class="prod_details">Chi tiết</a></div>
	</div>-->
</s:iterator>


<s:iterator value="dsDienThoai" status="stat1">

	<s:url action="SanPham_chiTiet" var="productDetail">
		<s:param name="maSanPham" value="maSanPham"></s:param>
	</s:url>
	
	<div class="product_box jTip">
	<div class="product_image">
	<div class="product_image_holder"><a target="_blank" class="jTip"
		rel="" href=""> <img id="block_tip_1"
		alt="Điện thoại di động Apple iPhone 3GS" src="${hinhAnh }"> </a></div>
	</div>
	<div class="product_seller"><b>30</b> gian hàng bán</div>
	<div class="product_seller"><!-- Lay gia thap nhat trong tat ca cac gian hang -->
	Giá từ: <b>8.300.000 VNĐ</b></div>
	<div class="product_name"><a target="_blank"
		title='<s:property value="tenSanPham"/>' href=""> <s:property
		value="tenSanPham" /> </a></div>
	</div>

	<!--<div class="prod_box">
	<div class="top_prod_box"></div>
	<div class="center_prod_box">
	<div class="product_title"><a href="${productDetail}"><s:property
		value="tenSanPham" /> </a></div>

	<div class="product_img"><a href="${productDetail}"
		data-tooltip=""> <img src="${hinhAnh}" alt="" title="" border="0"
		width="120" height="120" /> </a></div>


	<div class="prod_price"><span class="reduce"></span> <span
		class="price"><s:property value="giaText" /> VNĐ</span></div>
	</div>
	<div class="bottom_prod_box"></div>
	<div class="prod_details_tab"><a href="#"
		title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
		src="images/cart.gif" alt="" title="" border="0" class="left_bt" /> </a><a
		href="${productDetail}" class="prod_details">Chi tiết</a></div>
	</div>-->
</s:iterator>


<div class="spacer"></div>
<div class="block_title"><span>Toàn bộ danh mục</span></div>
<div class="break_line"></div>
<div class="square_item_block"></div>