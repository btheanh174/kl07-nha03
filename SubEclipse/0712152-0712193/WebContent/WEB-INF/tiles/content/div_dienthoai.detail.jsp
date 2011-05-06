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
				Bảo hành: <span class="blue">12 Tháng</span><br /> Số lượng: <span
					class="blue">1</span><br /> Chất lượng: <span class="blue">Mới</span><br />
				Phí vận chuyển: <span class="blue">Liên hệ</span><br /> Xuất xứ: <span
					class="blue">Chính hảng</span><br />
			</div>
			<div class="prod_price_big">
				<div class="prod_price_big">
					<span class="price"><s:property value="gia" /> VNĐ</span>
				</div>
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
							<td align="left">Samsung</td>
						</tr>
						<tr>
							<td align="right">Mạng:</td>
							<td align="left">
								<ul>
									<li>GSM850</li>
									<li>GSM1800</li>
									<li>GSM1900</li>
									<li>HSDPA 2100</li>
									<li>HSDPA 900</li>
									<li>HSDPA 1900</li>
								</ul></td>
						</tr>
						<tr>
							<td align="right">Kiểu dáng:</td>
							<td align="left">Thẳng</td>
						</tr>
						<tr>
							<td align="right">Màn hình:</td>
							<td align="left">16M Màu</td>
						</tr>
						<tr>
							<td align="right">Độ phân giải:</td>
							<td align="left">480 x 800 pixels</td>
						</tr>
						<tr>
							<td align="right">Hệ điều hành:</td>
							<td align="left">Android OS</td>
						</tr>
						<tr>
							<td align="right">Bộ nhớ trong:</td>
							<td align="left">8GB</td>
						</tr>
						<tr>
							<td align="right">Ram:</td>
							<td align="left">512MB</td>
						</tr>
						<tr>
							<td align="right">Tin nhắn:</td>
							<td align="left">
								<ul>
									<li>Email</li>
									<li>Instant Messaging</li>
									<li>MMS</li>
									<li>SMS</li>
								</ul></td>
						</tr>
						<tr>
							<td align="right">Trọng lượng:</td>
							<td align="left">118g</td>
						</tr>
						<tr>
							<td align="right">Kích thước:</td>
							<td align="left">122.2 x 64.2 x 9.9 mm</td>
						</tr>
						<tr>
							<td align="right">Kiểu chuông:</td>
							<td align="left">MP3, WAV, Nhạc chuông đa âm sắc</td>
						</tr>
						<tr>
							<td align="right">Camera:</td>
							<td align="left">5 Megapixel</td>
						</tr>
						<tr>
							<td align="right">Màu sắc:</td>
							<td align="left">Đen</td>
						</tr>
						<tr>
							<td align="right">Pin:</td>
							<td align="left">Li-po 1500mAh</td>
						</tr>
						<tr>
							<td align="right">Thời gian đàm thoại:</td>
							<td align="left">13.5 giờ</td>
						</tr>
						<tr>
							<td align="right">Thời gian chờ:</td>
							<td align="left">750 giờ</td>
						</tr>
						<tr>
							<td align="right">Số sim:</td>
							<td align="left">1 Sim</td>
						</tr>
						<tr>
							<td align="right">Loại thẻ nhớ tích hợp:</td>
							<td align="left">
								<ul>
									<li>MicroSD</li>
									<li>TransFlash</li>
									<li>EDGE</li>
									<li>GPRS</li>
								</ul></td>
						</tr>
						<tr>
							<td align="right">Tính năng:</td>
							<td align="left">
								<ul>
									<li>Nghe nhạc</li>
									<li>Cài đặt hình nền, nhạc chuông</li>
									<li>Chỉnh sửa ảnh</li>
									<li>3.5 mm audio output jack</li>
									<li>Kết nối GPS</li>
									<li>Ghi âm</li>
									<li>Loa ngoài</li>
									<li>Từ điển T9</li>
									<li>FM radio</li>
									<li>MP4</li>
									<li>Quay Video</li>
									<li>Công nghệ 3G</li>
								</ul></td>
						</tr>
						<tr>
							<td align="right">Tính năng khác:</td>
							<td align="left">
								<ul>
									<li>- Accelerometer sensor for auto-rotate</li>
									<li>- Proximity sensor for auto turn-off</li>
									<li>- Swype text input</li>
									<li>- Digital compass</li>
									<li>- Google Search, Maps, Gmail, YouTube, Calendar,
										Google Talk, Picasa integration</li>
									<li>- TouchWiz 3.0 UI</li>
									<li>- Multi-touch input method</li>
									<li>- Social networking integration</li>
									<li>- Image/video editor</li>
									<li>- Flash Lite v3.1</li>
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