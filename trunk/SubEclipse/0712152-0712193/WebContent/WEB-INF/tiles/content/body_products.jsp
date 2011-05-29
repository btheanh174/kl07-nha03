<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div id="category_path">
	Bạn đang xem: <a href="/">Trang chủ</a> &gt;&gt; <a
		href="">Điện thoại</a>
</div>
<div class="spacer"></div>
<%-- <div class="center_title_bar_full">
	<s:property value="tenDanhMuc" />
</div>
 --%>
<table class="big_table" id="pro_list_custom">
	<tbody>
		<tr>
			<td><img src="images/tron.gif"> Có <b
				style="color: #FF0000">3059</b> sản phẩm</td>
			<td align="right"><select onchange="sortProduct(this.value)"
				name="inorder">
					<option value="">Chọn sắp xếp sản phẩm</option>
					<option value="new">Mới nhất trước</option>
					<option value="rank">Xếp hạng tốt nhất</option>
					<option value="sale">Nhiều gian hàng bán nhất</option>
			</select>
			</td>
		</tr>
	</tbody>
</table>

<div class="spacer"></div>

<s:if test="dsSanPham.size() > 0">
	<s:iterator value="dsSanPham" status="statusSanPham">

		<s:url action="SanPham_chiTiet" var="productDetail">
			<s:param name="maSanPham" value="maSanPham"></s:param>
		</s:url>

		<!-- Hien thi thu -->
		<div class="product_box jTip">
			<div class="product_image">
				<div class="product_image_holder">
					<a target="_blank" class="jTip" rel="" href=""> <img
						id="block_tip_1" alt="Điện thoại di động Apple iPhone 3GS"
						src="${hinhAnh }"> </a>
				</div>
			</div>
			<div class="product_seller">
				<b>30</b> gian hàng bán
			</div>
			<div class="product_seller">
				<!-- Lay gia thap nhat trong tat ca cac gian hang -->
				Giá từ: <b>8.300.000 VNĐ</b>
			</div>
			<div class="product_name">
				<a target="_blank" title='<s:property value="tenSanPham"/>' href="">
					<s:property value="tenSanPham" /> </a>
			</div>
		</div>
		<!-- ket thuc -->

		<%-- 	<div class="prod_box">
			<div class="top_prod_box"></div>
			<div class="center_prod_box">
				<div class="product_title">
					<a href="${productDetail}"><s:property value="tenSanPham" /> </a>
				</div>


				<!-- Noi dung se duoc hien thi trong tooltip -->
				<div id="mystickytooltip" class="stickytooltip">
					<div id="${maSanPham }" style="width: 200px;">
						<s:property value="toShortString()" />
						<img alt="" src="${hinhAnh}" class="hinhtooltip">
						<s:property value="toLongString()" />
					</div>
				</div>
				<!--  -->



				<div class="product_img">
					<a href="${productDetail}" data-tooltip="${maSanPham }"> <img
						src="${hinhAnh}" alt="" title="" border="0" class="danhsach" /> </a>
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
 --%>
	</s:iterator>


	<div id="pagination">
		<s:if test="tongSoTrang > 1">
			<s:url id="prev" action="SanPham_danhSach">
				<s:param name="trang" value="trang - 1"></s:param>
			</s:url>
			<s:if test="trang > 1">
				<a href="${prev }" class="pn next">&lt;&lt;Trước</a>
			</s:if>
			<s:iterator value="soTrang" status="stat">
				<s:url id="danhSach" action="SanPham_danhSach">
					<s:param name="trang" value="%{#stat.count}"></s:param>
				</s:url>
				<s:if test="trang == #stat.count">
					<span><s:property /> </span>
				</s:if>
				<s:else>
					<a href="${danhSach }"> <s:property /> </a>
				</s:else>
			</s:iterator>
			<s:url id="next" action="SanPham_danhSach">
				<s:param name="trang" value="trang + 1"></s:param>
			</s:url>

			<s:if test="trang < tongSoTrang">
				<a href="${next }" class="pn next">Sau »</a>
			</s:if>
		</s:if>
	</div>


	<!-- product slider -->
	<div id="wrap">
		<div class="jcarousel-skin-tango">
			<div class="jcarousel-container jcarousel-container-horizontal"
				id="products" style="position: relative; display: block;">
				<div class="jcarousel-clip jcarousel-clip-horizontal"
					style="overflow: hidden; position: relative;">
					<ul class="jcarousel-list jcarousel-list-horizontal"
						style="overflow: hidden; position: relative; top: 0px; margin: 0px; padding: 0px; left: 0px; width: 1270px;">
						<s:iterator value="dsSanPham" status="stat">
							<li
								class="jcarousel-item jcarousel-item-horizontal jcarousel-item-2 jcarousel-item-2-horizontal"
								style="float: left; list-style: none outside none;"
								jcarouselindex="#stat.count"><a id="image2" href="#"> <img
									width="120" height="100" border="0" alt="" src="${hinhAnh }">
							</a><br> <s:property value="tenSanPham" /><br> <b><s:property
										value="giaText" /> </b></li>
						</s:iterator>
					</ul>
				</div>
				<div
					class="jcarousel-prev jcarousel-prev-disabled jcarousel-prev-horizontal jcarousel-prev-disabled-horizontal"
					disabled="true" style="display: block;"></div>
				<div class="jcarousel-next jcarousel-next-horizontal"
					style="display: block;" disabled="false"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		jQuery(document).ready(function() {

			jQuery('#products').jcarousel({
				start : 1
			});
		});
	</script>
	<!-- end product slider -->
</s:if>
<s:else>
	Không có sản phẩm nào!
</s:else>

