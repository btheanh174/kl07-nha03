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
<s:iterator value="dsLaptop" status="stat1">

		<s:url action="SanPham_chiTiet" var="productDetail">
			<s:param name="maSanPham" value="maSanPham"></s:param>
		</s:url>

		<div class="prod_box">
			<div class="top_prod_box"></div>
			<div class="center_prod_box">
				<div class="product_title">
					<a href="${productDetail}"><s:property value="tenSanPham" /> </a>
				</div>


				<!-- Noi dung se duoc hien thi trong tooltip -->
<%-- 				<div id="mystickytooltip" class="stickytooltip">
					<div id="${maSanPham }" style="width: 200px;">
						<s:property value="toShortString()" />
						<img alt="" src="${hinhAnh}" width="150" height="150">
						<s:property value="toLongString()" />
					</div>
				</div>
 --%>				<!--  -->



				<div class="product_img">
					<a href="${productDetail}" data-tooltip=""> <img
						src="${hinhAnh}" alt="" title="" border="0" width="120"
						height="120" /> </a>
				</div>


				<div class="prod_price">
					<span class="reduce"></span> <span class="price"><s:property
							value="giaText" /> VNĐ</span>
				</div>
			</div>
			<div class="bottom_prod_box"></div>
			<div class="prod_details_tab">
				<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
					src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
				</a><a href="${productDetail}" class="prod_details">Chi tiết</a>
			</div>
		</div>
	</s:iterator>


	<div id="pagination">
		<s:if test="tongSoTrang1 > 1">
			<s:url id="prev" action="Index">
				<s:param name="trang1" value="trang1 - 1"></s:param>
			</s:url>
			<s:if test="trang1 > 1">
				<a href="${prev }" class="pn next">&lt;&lt;Trước</a>
			</s:if>
			<s:iterator value="soTrang1" status="stat">
				<s:url id="danhSach" action="Index">
					<s:param name="trang1" value="%{#stat.count}"></s:param>
				</s:url>
				<s:if test="trang1 == #stat.count">
					<span><s:property /> </span>
				</s:if>
				<s:else>
					<a href="${danhSach }"> <s:property /> </a>
				</s:else>
			</s:iterator>
			<s:url id="next" action="Index">
				<s:param name="trang1" value="trang1 + 1"></s:param>
			</s:url>

			<s:if test="trang1 < tongSoTrang1">
				<a href="${next }" class="pn next">Sau »</a>
			</s:if>
		</s:if>
	</div>

<br>

<div class="center_title_bar_full">Điện thoại</div>
<s:iterator value="dsDienThoai" status="stat1">

		<s:url action="SanPham_chiTiet" var="productDetail">
			<s:param name="maSanPham" value="maSanPham"></s:param>
		</s:url>

		<div class="prod_box">
			<div class="top_prod_box"></div>
			<div class="center_prod_box">
				<div class="product_title">
					<a href="${productDetail}"><s:property value="tenSanPham" /> </a>
				</div>


				<!-- Noi dung se duoc hien thi trong tooltip -->
<%-- 				<div id="mystickytooltip" class="stickytooltip">
					<div id="${maSanPham }" style="width: 200px;">
						<s:property value="toShortString()" />
						<img alt="" src="${hinhAnh}" width="150" height="150">
						<s:property value="toLongString()" />
					</div>
				</div>
 --%>				<!--  -->



				<div class="product_img">
					<a href="${productDetail}" data-tooltip=""> <img
						src="${hinhAnh}" alt="" title="" border="0" width="120"
						height="120" /> </a>
				</div>


				<div class="prod_price">
					<span class="reduce"></span> <span class="price"><s:property
							value="giaText" /> VNĐ</span>
				</div>
			</div>
			<div class="bottom_prod_box"></div>
			<div class="prod_details_tab">
				<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
					src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
				</a><a href="${productDetail}" class="prod_details">Chi tiết</a>
			</div>
		</div>
	</s:iterator>


	<div id="pagination">
		<s:if test="tongSoTrang2 > 1">
			<s:url id="prev" action="Index">
				<s:param name="trang2" value="trang2 - 1"></s:param>
			</s:url>
			<s:if test="trang2 > 1">
				<a href="${prev }" class="pn next">&lt;&lt;Trước</a>
			</s:if>
			<s:iterator value="soTrang2" status="stat">
				<s:url id="danhSach" action="Index">
					<s:param name="trang2" value="%{#stat.count}"></s:param>
				</s:url>
				<s:if test="trang2 == #stat.count">
					<span><s:property /> </span>
				</s:if>
				<s:else>
					<a href="${danhSach }"> <s:property /> </a>
				</s:else>
			</s:iterator>
			<s:url id="next" action="Index">
				<s:param name="trang2" value="trang2 + 1"></s:param>
			</s:url>

			<s:if test="trang2 < tongSoTrang2">
				<a href="${next }" class="pn next">Sau »</a>
			</s:if>
		</s:if>
	</div>
