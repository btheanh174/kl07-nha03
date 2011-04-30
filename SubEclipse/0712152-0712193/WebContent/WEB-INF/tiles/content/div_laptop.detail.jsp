<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="center_prod_box_big">

	<div class="product_img_big">
		<a href="javascript:popImage('images/big_pic.jpg','Some Title')"
			title="header=[Zoom] body=[&nbsp;] fade=[on]"><img
			src="images/laptop.gif" alt="" title="" border="0" />
		</a>
		<div class="thumbs">
			<a href="#" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
				src="images/thumb1.gif" alt="" title="" border="0" />
			</a> <a href="#" title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img
				src="images/thumb1.gif" alt="" title="" border="0" />
			</a> <a href="#" title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img
				src="images/thumb1.gif" alt="" title="" border="0" />
			</a>
		</div>
	</div>
	<div class="details_big_box">
		<div class="product_title_big"> <s:property value="tenSanPham"/> </div>
			<div class="specifications">
				<p>
				Cập nhật: <span class="blue">30/04/2011</span><br />
	            Số lượng: <span class="blue">1</span><br /> 
    	        Chất lượng: <span class="blue">Mới</span><br />
				Phí vận chuyển: <span class="blue">Liên hệ</span><br />
				Xuất xứ: <span class="blue">Chính hãng</span>
				</p>
			</div>
		<div class="prod_price_big">
			<span class="price"> <s:property value="gia"/> </span>
		</div>

		<a href="#" class="addtocart">Thêm vào giỏ hàng</a> <a href="#"
			class="compare">So sánh</a>
	</div>
</div>
