<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" type="text/css" href="css/switchdisplay.css" />

<div id="content">

	<div id="category_path">
		Bạn đang xem: <a href="<s:url action="Index"/>">Trang chủ</a>
		<s:iterator value="duongDan">
			<a href="#">&gt;&gt;<s:property /> </a>
		</s:iterator>
	</div>
	<div class="spacer"></div>

	<table class="big_table" id="pro_list_custom">
		<tbody>
			<tr>
				<td><img src="images/tron.gif"> Có <b
					style="color: #FF0000"> <s:property value="soSanPham" /> </b> sản
					phẩm</td>
				<td><a href="#" class="switch_thumb">Cách hiển thị</a></td>
				<td align="right"><select onchange="sortProduct(this.value)"
					name="inorder">
						<option value="">Chọn sắp xếp sản phẩm</option>
						<option value="new">Mới nhất trước</option>
						<option value="rank">Xếp hạng tốt nhất</option>
						<option value="sale">Nhiều gian hàng bán nhất</option>
				</select></td>
			</tr>
		</tbody>
	</table>

	<div class="spacer"></div>

	<s:if test="dsSanPham.size() > 0">
		<ul class="thumb_view">
			<s:iterator value="dsSanPham" status="statusSanPham">

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
							<b> <s:property value="dsGianHangSanPham.size()" /> </b> gian
							hàng bán
						</div>
						<div class="product_price">
							<!-- Lay gia thap nhat trong tat ca cac gian hang -->
							Giá: <b> <s:property value="giaText" /> VNĐ</b>
						</div>
						<div class="product_name">
							<a title='<s:property value="tenSanPham"/>'
								href="${productDetail }"> <s:property value="tenSanPham" />
							</a>
						</div>
						<div class="product_desc">
							<s:property value="toShortString()"/>
						</div>
					</div>
				</div>
				<!-- ket thuc -->
			</s:iterator>
		</ul>

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

	</s:if>
	<s:else>
	Không có sản phẩm nào!
</s:else>

</div>