<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="main" class="main section">
<div class="widget">
<h1 class="head"><s:property value="sanPham.tenSanPham" /></h1>
<div class="breadcrumb clearfix"></div>

<div class="product_info">
<div class="product_detail">
<div class="fl">
<div class="picture_fullzie"><img
	src='<s:property value="%{sanPham.hinhAnh}"/>' alt=""
	class="chitiet_mobile">

<div class="picture_thumb_list">
<table cellpadding="0" cellspacing="3" align="center">
	<tbody>
		<tr align="center">
			<s:iterator value="sanPham.dsHinhAnh">
				<td
					style="border: 1px solid #CCCCCC; text-align: center; cursor: pointer;"><a><img
					alt="" height="50px" width="50px"
					src='<s:property value="urlHinhAnh"/>'> </a></td>
			</s:iterator>
		</tr>
	</tbody>
</table>
<div class="clear"></div>
</div>

</div>
</div>
<div class="fr">
<div class="product_sell">
<table>
	<tbody>
		<tr>
			<td class="item_info">Mã sản phẩm</td>
			<td>: <b> <s:property value="maSanPham" /> </b></td>
		</tr>
		<tr>
			<td class="item_info">Bảo hành</td>
			<td>:</td>
		</tr>
		<tr>
			<td class="item_info">Giá bán</td>
			<td>: <span class="price">14.700.000 Đ </span></td>
		</tr>
		<tr>
			<td class="item_info">Số lượng</td>
			<td>:</td>
		</tr>
		<tr>
			<td class="item_info">Được cập nhật lúc</td>
			<td>:</td>
		</tr>
	</tbody>
</table>

<s:form action="GioHang_them" method="post">
	<s:hidden name="maGianHang" value="%{maGianHang}"></s:hidden>
	<s:hidden name="maSanPham" value="%{maSanPham}"></s:hidden>
	<input type="hidden" name="soLuong" value="1">
	<s:submit type="image" src="images/datmua.gif"></s:submit>
</s:form></div>
</div>
<div class="clear"></div>
</div>
<div style="clear: both;"><s:if
	test="'DIENTHOAI'.equals(sanPham.loaiSanPham)">
	<s:include value="/WEB-INF/tiles/all/detail_mobile.jsp"></s:include>
</s:if> <s:else>
	<s:include value="/WEB-INF/tiles/all/detail_laptop.jsp"></s:include>
</s:else></div>
</div>
<div class="fix"></div>
</div>
<div class="fix"></div>
<!-- Danh sach nhung san pham lien quan -->

<div class="realated_product_section clearfix">
<h3>Sản phẩm cùng loại</h3>
<div class="breadcrumb clearfix"></div>
<ul class="realated_products">
	<s:iterator value="dsSanPhamCungLoai" id="relate">
		<s:url id="chitiet" action="store">
			<s:param name="maGianHang" value="maGianHang"></s:param>
			<s:param name="maSanPham" value="#relate.maSanPham"></s:param>
		</s:url>
		<li><a title="<s:property value="tenSanPham"/>"
			href="${chitiet }" class="product_thumb"> <img
			src='<s:property value="hinhAnh"/>' alt="" class="danhsach"> </a><a
			title="<s:property value="tenSanPham"/>" href="${chitiet }"> <s:property
			value="tenSanPham" /> </a></li>
	</s:iterator>
</ul>
<div class="clear"></div>
</div>
</div>
<!-- end main -->