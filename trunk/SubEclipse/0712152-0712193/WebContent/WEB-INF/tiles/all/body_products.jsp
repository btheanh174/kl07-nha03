<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<div id="main" class="main section">
	<div id="Blog1" class="widget Blog">
		<h1 class="head">Sản phẩm mới nhất</h1>
		
		<!-- Hien thi danh sach san pham -->
		<ul class="display thumb_view clearfix">
			<s:property value="dsSanPham.size()"/>
			<s:iterator value="dsSanPham">

				<div style="display: block;" id="maSanPham">
					<li><a href="" class="product_thumb product_thumb_"> <img
							width="210" height="184" src="${hinhAnh }">
					</a>
						<div class="content">
							<h3>
								<a href=""><s:property value="tenSanPham"/></a>
							</h3>
							<p class="contentp">Thông tin sản phẩm: <s:property value="toShortString()"/>...</p>
							<p class="sale_price">
								<strong><span class="price"><b><s:property value="giaText" /></b> </span> VNĐ</strong>
							</p>
							<div class="b_viewdetails">
								<a href="#">View Details »</a>
							</div>
						</div></li>
				</div>

			</s:iterator>

		</ul>
		<!-- ket thuc hien thi danh sach san pham -->

	</div>
	<!-- end Blog1 -->
</div>
<!-- end main -->