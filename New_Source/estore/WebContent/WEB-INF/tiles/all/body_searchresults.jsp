<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="text/javascript">
<!--
	$(document).ready(function() {
		$("a.switch_thumb").toggle(function() {
			$(this).addClass("swap");
			$("ul.display").fadeOut("fast", function() {
				$(this).fadeIn("fast").addClass("thumb_view");
			});
		}, function() {
			$(this).removeClass("swap");
			$("ul.display").fadeOut("fast", function() {
				$(this).fadeIn("fast").removeClass("thumb_view");
			});
		});
	});
//-->
</script>

<div id="main" class="main section">
	<div class="widget">
		<div class="title_left"><h1 class="head">Kết quả tìm kiếm</h1></div>
		<div class="title_right"><a href="#" class="switch_thumb">Cách hiển thị</a></div>
		<div class="breadcrumb"></div>
	
		<!-- Hien thi danh sach san pham -->
		<ul class="display">

			<s:iterator value="dsSanPham">
				<li><s:url id="chitiet" action="store">
						<s:param name="maGianHang" value="maGianHang"></s:param>
						<s:param name="maSanPham" value="maSanPham"></s:param>
					</s:url> <!-- <div style="display: block;" id="maSanPham"> --> <a
					href="${chitiet }" class="product_thumb"> <img
						src="${hinhAnh }"> </a>
					<div class="content">
						<h3>
							<a href="${chitiet }"><s:property value="tenSanPham" /> </a>
						</h3>
						<p class="contentp">
							<s:property value="toShortString()" />
						</p>
						<p class="sale_price">
							<strong><span class="price"><b><s:property
											value="giaText" /> </b> </span> VNĐ</strong>
						</p>
					</div> <!-- </div> -->
				</li>
			</s:iterator>

		</ul>
	</div>
</div>