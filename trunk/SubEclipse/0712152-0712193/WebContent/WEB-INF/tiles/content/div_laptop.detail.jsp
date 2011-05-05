<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">
	<s:property value="tenSanPham" />
</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<div class="product_img_big">
			<a href="javascript:popImage('images/big_pic.jpg','Some Title')"
				title="header=[Zoom] body=[&nbsp;] fade=[on]"><img
				src="images/laptop.gif" alt="" title="" border="0" /> </a>
			<div class="thumbs">
				<a href="#" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a>
			</div>
		</div>
		<div class="details_big_box">
			<div class="product_title_big">
				<s:property value="tenSanPham" />
			</div>
			<div class="specifications">
				<p>
					Số lượng: <span class="blue">1</span><br /> Chất lượng: <span
						class="blue">Mới</span><br /> Phí vận chuyển: <span class="blue">Liên
						hệ</span><br /> Xuất xứ: <span class="blue">Chính hãng</span>
				</p>
			</div>
			<div class="prod_price_big">
				<span class="price"> <s:property value="gia" /> </span>
			</div>

			<a href="#" class="addtocart">Thêm vào giỏ hàng</a> <a href="#"
				class="compare">So sánh</a>
		</div>

	</div>
	<div class="bottom_prod_box_big"></div>
</div>

<div class="prod_box_big">
	<div class="center_prod_box_big">

		<sj:div cssClass="">
			<sj:tabbedpanel id="dienthoai" animate="true" collapsible="true" selectedTab="1">
				<sj:tab id="tabSoSanh" target="one" label="So sánh"></sj:tab>
				<sj:tab id="tabThongSo" target="two" label="Thông số kỹ thuật"></sj:tab>
				<sj:tab id="tabSanPhamLienQuan" target="three"
					label="Các sản phẩm liên quan"></sj:tab>
				<sj:tab id="tabHinhAnh" target="four" label="Hình ảnh"></sj:tab>
				<div id="one">So sánh</div>
				<div id="two">
					<table width="500" border="1" align="center" cellpadding="5"
						cellspacing="0">
						<tr>
							<td align="right">Hãng sản xuất:</td>
							<td align="left">Sony Vaio 8 Series</td>
						</tr>
						<tr>
							<td align="right">HDD:</td>
							<td align="left">500 GB, 7200rpm</td>
						</tr>
						<tr>
							<td align="right">RAM:</td>
							<td align="left">DDR3, 4GB</td>
						</tr>
						<tr>
							<td align="right">CPU:</td>
							<td align="left">Intel core i7, 2.5 GH</td>
						</tr>
						<tr>
							<td align="right">VGA:</td>
							<td align="left">NVIDIA GeForce G 310M</td>
						</tr>
						<tr>
							<td align="right">OS:</td>
							<td align="left">Window 7 Home premium</td>
						</tr>
						<tr>
							<td align="right">Chuột:</td>
							<td align="left">Touchpad</td>
						</tr>
						<tr>
							<td align="right">Cổng USB:</td>
							<td align="left">3 x USB 2.0 port</td>
						</tr>
						<tr>
							<td align="right">LAN:</td>
							<td align="left">10/100/1000 Mbps</td>
						</tr>
						<tr>
							<td align="right">WIFI:</td>
							<td align="left">IEEE 802.1 a/b/g/n</td>
						</tr>
						<tr>
							<td align="right">Pin:</td>
							<td align="left">6 cells</td>
						</tr>
						<tr>
							<td align="right">Trọng lượng:</td>
							<td align="left">2.5 kg</td>
						</tr>
						<tr>
							<td align="right">Độ phân giải:</td>
							<td align="left">1366 x 768</td>
						</tr>
						<tr>
							<td align="right">Kích thước màn hình:</td>
							<td align="left">13.3 inch</td>
						</tr>
						<tr>
							<td align="right">Tính năng khác:</td>
							<td align="left">
								<ul>
									<li>HDMI</li>
									<li>Camera</li>
									<li>Microphone</li>
									<li>Headphone</li>
									<li>Bluetooth</li>
									<li>RJ-11 Modem</li>
								</ul></td>
						</tr>
					</table>
				</div>
				<div id="three">Các sản phẩm liên quan</div>
				<div id="four">Hình ảnh</div>
			</sj:tabbedpanel>
		</sj:div>
	</div>
</div>
