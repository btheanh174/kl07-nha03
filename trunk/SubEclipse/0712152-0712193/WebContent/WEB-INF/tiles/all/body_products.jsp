<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<script type="text/javascript">
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
</script>

<div id="main" class="main section">
<div class="widget">
<div class="title_left">
<h1 class="head">Sản phẩm mới nhất</h1>
</div>
<div class="title_right"><a href="#" class="switch_thumb">Cách
hiển thị</a></div>
<div class="breadcrumb"></div>
<s:if test="dsGianHangSanPham.size() < 1">
	Chưa có sản phẩm nào.
</s:if>
<s:else>
<!-- Hien thi danh sach san pham -->
<ul class="display">
	<s:iterator value="dsGianHangSanPham">
		<li><s:url id="chitiet" action="store">
			<s:param name="maGianHang" value="maGianHang"></s:param>
			<s:param name="maSanPham" value="sanPham.maSanPham"></s:param>
		</s:url> <a href="${chitiet }" class="product_thumb"> <img
			src="${sanPham.hinhAnh }"> </a>
		<div class="content">
		<h3><a href="${chitiet }"><s:property
			value="sanPham.tenSanPham" /> </a></h3>
		<p class="contentp"><s:property value="sanPham.toShortString()" />
		</p>
		<p class="sale_price"><strong> <s:if
			test="(giaRieng != 0)">
			<span class="price"> <b><s:property value="giaRieng" /> </b>
			</span> VNĐ
											</s:if> <s:else>Liên hệ</s:else> </strong></p>
		</div>
		</li>
	</s:iterator>

</ul>
<!-- ket thuc hien thi danh sach san pham -->
</s:else>
</div>

</div>
<!-- end main -->