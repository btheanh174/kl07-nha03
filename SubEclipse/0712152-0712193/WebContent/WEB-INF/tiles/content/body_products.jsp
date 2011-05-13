<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="center_title_bar">
	<s:property value="tenDanhMuc" />
</div>
<s:if test="listSanPham.size() > 0">
	<s:iterator value="listSanPham" status="statusSanPham">

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
				<div id="mystickytooltip" class="stickytooltip">
					<div id="sticky1" style="width: 200px;">
					<s:property value="toShortString()"/>
					<img alt="" src="images/product/6_01.jpg">
					<s:property value="toLongString()"/>
					</div>
				</div>
				<!--  -->
				
				<div class="product_img">
					<a href="${productDetail}" data-tooltip="sticky1"> <img
						src="images/product/6_01.jpg" alt=""
						title="" border="0" /> </a>
				</div>
				
				
				
				<div class="prod_price">
					<span class="reduce">350$</span> <span class="price"><s:property
							value="gia" /> </span>
				</div>
			</div>
			<div class="bottom_prod_box"></div>
			<div class="prod_details_tab">
				<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
					src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
				</a> <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
					src="images/favs.gif" alt="" title="" border="0" class="left_bt" />
				</a> <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
					src="images/favorites.gif" alt="" title="" border="0"
					class="left_bt" /> </a> <a href="${productDetail}"
					class="prod_details">Chi tiết</a>
			</div>
		</div>
	</s:iterator>
</s:if>
<s:else>
	Không có sản phẩm nào!
</s:else>
