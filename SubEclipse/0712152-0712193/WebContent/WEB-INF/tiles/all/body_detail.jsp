<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="main" class="main section">
	<div class="widget">
		<h1 class="head">
			<s:property value="sanPham.tenSanPham" />
		</h1>
		<div class="breadcrumb clearfix"></div>

		<div class="product_info">
			<div class="product_detail">
				<div class="fl">
					<div class="picture_fullzie">
						<img src='<s:property value="%{sanPham.hinhAnh}"/>' alt=""
							class="chitiet_mobile">
					</div>
					<div class="picture_thumb_list">
						<table>
							<tbody>
								<tr>
									<td
										style="border: 1px solid #CCCCCC; text-align: center; cursor: pointer;">
										<a><img height="50px" width="50px"
											src='<s:property value="%{sanPham.hinhAnh}"/>' alt="">
									</a>
									</td>
									<s:iterator value="dsHinhAnh">
										<td><a><img alt=""
												src='<s:property value="urlHinhAnh"/>'> </a>
										</td>
									</s:iterator>
								</tr>
							</tbody>
						</table>
						<div class="clear"></div>
					</div>
				</div>
				<div class="fr">
					<div class="product_sell">
						<table>
							<tbody>
								<tr>
									<td class="item_info">Mã sản phẩm</td>
									<td>: <b> <s:property value="maSanPham"/> </b>
									</td>
								</tr>
								<tr>
									<td class="item_info">Bảo hành</td>
									<td>: </td>
								</tr>
								<tr>
									<td class="item_info">Giá bán</td>
									<td>: <span class="price">14.700.000 Đ
									</span></td>
								</tr>
								<tr>
									<td class="item_info">Số lượng</td>
									<td>: </td>
								</tr>
								<tr>
									<td class="item_info">Được cập nhật lúc</td>
									<td>: </td>
								</tr>
							</tbody>
						</table>
						
						<s:form action="GioHang_them" method="post">
							<s:hidden name="maGianHang" value="maGianHang"></s:hidden>
							<s:hidden name="maSanPham" value="%{top.maSanPham}"></s:hidden>
							<s:hidden name="soLuong" value="%(1)"></s:hidden>
							<s:submit type="image" src="images/datmua.gif"></s:submit>
						</s:form>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div style="clear: both;">
				<br> <br> <br> <br> PRODUCT INFORMATION:<br>
				<br> UNLOCKED NOKIA N86 IS A CAMERAPHONE THAT EXCELS<br> <br>
				<br> <br> Many phones can function with a cool camera but
				only the N86 functions as a camera phone that performs in all areas<br>
				<br> <br> <br> Stunning beauty is only the first
				aspect of this unlocked cell phone that sticks out. With its curved
				edges and simple key layout, this GSM phone will be a reliable
				product to have by your side. By utilizing the latest technology
				such as Xenon flash, Carl Zeiss optics and a 5 Megapixel Camera this
				is a cell phone for the photographer that everyone yearns to be.<br>
				<br> <br> <br> FEATURES IN A SNAP<br> <br>
				<br> <br> The 3.5mm audio jack allows you to plug in a
				pair of headphones and simply listen to music. The internal memory
				has a huge capacity that lets you store dozens of movies for
				entertainment on the go. EDGE connectivity allows you to download
				multimedia on the go. The unlocked cell phone is also a dedicated
				MP3 player with Bluetooth technology so you can listen to music
				through the wireless headphones.<br> <br> <br> <br>
				KEY FEATURES OF NOKIA N86:<br> <br> <br> <br> -
				2G Quad-Band Connectivity<br> <br> - 3G Tri-Band
				Connectivity<br> <br> - 5 Megapixel Camera<br> <br>
				- Lightweight<br> <br> - AMOLED display<br> <br>
				- 2.6-Inch screen<br> <br> - 8GB internal memory<br>
				<br> - 3.5mm audio jack<br> <br> - GPRS<br> <br>
				- EDGE<br> <br> - USB<br> <br> <br> <br>
				The unlocked Nokia N86, cell phones accessories and unlocked cell
				phones are available on Cellhut’s website &ndash; www.cellhut.com,
				where You Choose Your Phone, Not Your Service. Cellhut, Your Key To
				Unlocking Wireless Freedom.<br> PACKAGE CONTENTS:<br> <br>
				* Nokia N86 (Unlocked)<br> * User Manual<br> * Travel
				Charger<br> * Battery<br> <br> <br>
			</div>
		</div>
		<div class="fix"></div>
	</div>
	<div class="fix"></div>
	<!-- Danh sach nhung san pham lien quan -->

	<div class="realated_product_section clearfix">
		<h3>Sản phẩm cùng loại</h3>
		<ul class="realated_products">
			<s:iterator>
				<li><a title="Nokia N8 16GB Grey (Unlocked Quadba..." href=""
					class="product_thumb"><img src="" width="400" height="400"
						border="0"> </a><a
					title="Nokia N8 16GB Grey (Unlocked Quadba..." href="">Nokia N8
						16GB Grey (Unlocked Quadba...</a></li>
			</s:iterator>
		</ul>
		<div class="clear"></div>
	</div>
</div>
<!-- end main -->