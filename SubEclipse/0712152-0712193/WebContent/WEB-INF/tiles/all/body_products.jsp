<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<div id="main" class="main section">
	<div class="widget">
		<h1 class="head">Sản phẩm mới nhất</h1>
		<div class="breadcrumb clearfix"></div>
		<!-- Hien thi danh sach san pham -->
		<ul class="display thumb_view clearfix">

			<s:iterator value="dsSanPham">
				<li>
				<s:url id="chitiet" action="store">
					<s:param name="maGianHang" value="maGianHang"></s:param>
					<s:param name="maSanPham" value="maSanPham"></s:param>
				</s:url>
					<div style="display: block;" id="maSanPham">
						<a href="${chitiet }" class="product_thumb product_thumb_"> <img
							class="danhsach" src="${hinhAnh }"> </a>
						<div class="content">
							<h3>
								<a href="${chitiet }"><s:property value="tenSanPham" /> </a>
							</h3>
							<p class="contentp">
								Thông tin sản phẩm:
								<s:property value="toShortString()" />
								...
							</p>
							<p class="sale_price">
								<strong><span class="price"><b><s:property
												value="giaText" /> </b> </span> VNĐ</strong>
							</p>
							<div class="b_viewdetails">
								<a href="${chitiet }">Xem chi tiết »</a>
							</div>
						</div>
					</div>
				</li>
			</s:iterator>

		</ul>
		<!-- ket thuc hien thi danh sach san pham -->

	</div>
</div>
<!-- end main -->