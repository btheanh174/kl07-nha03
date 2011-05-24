<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="center_title_bar_full">
	<s:property value="tenDanhMuc" />
</div>
<s:if test="dsSanPham.size() > 0">
	<s:iterator value="dsSanPham" status="statusSanPham">

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
					<div id="${maSanPham }" style="width: 200px;">
						<s:property value="toShortString()" />
						<img alt="" src="${hinhAnh}" width="150" height="150">
						<s:property value="toLongString()" />
					</div>
				</div>
				<!--  -->



				<div class="product_img">
					<a href="${productDetail}" data-tooltip="${maSanPham }"> <img
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

	</div>
</s:if>
<s:else>
	Không có sản phẩm nào!
</s:else>
