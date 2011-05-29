<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="big_table" id="pro_list_custom">
	<tbody>
		<tr>
			<td><img src="/includes/images/tron.gif"> Có <b
				style="color: #FF0000">3059</b> sản phẩm</td>
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

<div class="product_box jTip">
	<div class="product_image">
		<div class="product_image_holder">
			<a target="_blank" id="tip_1" class="jTip"
				rel="/sanpham/product_tip_dt.php?id=1&amp;t=1dt_6&amp;width=380"
				href="/dt1/apple-iphone-3gs.html"><img id="block_tip_1"
				alt="Điện thoại di động Apple iPhone 3GS"
				src="http://img.denthan.info/prodt/120_1dt_6.jpg">
			</a>
		</div>
	</div>
	<div class="product_seller">
		<b>30</b> gian hàng bán
	</div>
	<div class="product_seller">
		Giá từ: <b>8.300.000 Đ</b>
	</div>
	<div class="product_name">
		<a target="_blank" title="Điện thoại di động Apple iPhone 3GS"
			href="/dt1/apple-iphone-3gs.html">Apple iPhone 3GS</a>
	</div>
</div>