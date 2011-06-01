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
				src="${hinhAnh}" alt="" title="" border="0" class="chitiet_laptop" />
			</a>
			<div class="thumbs">
				<!--<a href="#" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb2] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a> <a href="#"
					title="header=[Thumb3] body=[&nbsp;] fade=[on]"><img
					src="images/thumb1.gif" alt="" title="" border="0" /> </a>
			-->
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
				<strong><span class="price"><b><s:property
								value="giaText" /> </b> </span> VNĐ</strong>
			</div>


			<s:form action="GioHang_them" method="post">
				<s:hidden name="maGianHang" value="1"></s:hidden>
				<s:hidden name="maSanPham" value="%{top.maSanPham}"></s:hidden>
				<s:textfield label="Số lượng" name="soLuong" size="4" value="1"></s:textfield>
				<s:submit value="Chọn mua"></s:submit>
			</s:form>
		</div>

	</div>
	<div class="bottom_prod_box_big"></div>
</div>

<div class="prod_box_big_full">
	<div class="center_prod_box_big_full">
		<sj:div>
			<sj:tabbedpanel id="laptop" animate="true" collapsible="true"
				selectedTab="0">

				<sj:tab id="tabThongSo" target="one" label="Thông số kỹ thuật"></sj:tab>
				<sj:tab id="tabSanPhamLienQuan" target="two"
					label="Các sản phẩm liên quan"></sj:tab>
				<sj:tab id="tabGianHangBanSanPham" target="three"
					label="Gian hàng bán sản phẩm"></sj:tab>
				<sj:tab id="tabHinhAnh" target="four" label="Hình ảnh"></sj:tab>

				<div id="one">
					<table class="technical_table" cellpadding="0" cellspacing="0">
						<tr class="text_title">
						<td colspan="2">Thông tin cơ bản</td>
						</tr>
						<tr>
							<td class="name">Hãng sản xuất:</td>
							<td class="value"><s:property value="hangSanXuat" />
							</td>
						</tr>
						
						<tr>
							<td class="name">HDD:</td>
							<td class="value"><s:property value="hdd" /></td>
						</tr>
						
						<tr>
							<td class="name">RAM:</td>
							<td class="value"><s:property value="ram" /></td>
						</tr>
						
						
						<tr>
							<td class="name">CPU:</td>
							<td class="value"><s:property value="cpu" /></td>
						</tr>
						
						<tr>
							<td class="name">VGA:</td>
							<td class="value"><s:property value="vga" /></td>
						</tr>
						
						
						
						<tr>
							<td class="name">LAN:</td>
							<td class="value"><s:property value="lan" /></td>
						</tr>
						
						<tr>
							<td class="name">WIFI:</td>
							<td class="value"><s:property value="wifi" /></td>
						</tr>
						
						
						<tr>
							<td class="name">Battery:</td>
							<td class="value"><s:property value="pin" /></td>
						</tr>
						
						
						<tr>
							<td class="name">Trọng lượng:</td>
							<td class="value"><s:property value="trongLuong" /></td>
						</tr>
						
						<tr>
							<td class="name">Độ phân giải:</td>
							<td class="value"><s:property value="doPhanGiai" /></td>
						</tr>
						<tr>
							<td class="name">Kích thước màn hình:</td>
							<td class="value"><s:property value="kichThuocManHinh" /></td>
						</tr>
						<tr class="text_title">
						<td colspan="2">Thông số khác</td>
						</tr>
						<tr>
							<td class="name">OS:</td>
							<td class="value"><s:property value="heDieuHanh" /></td>
						</tr>
						<tr>
							<td class="name">Chuột:</td>
							<td class="value"><s:property value="chuot" /></td>
						</tr>
						<tr>
							<td class="name">Cổng USB:</td>
							<td class="value"><s:property value="usb" /></td>
						</tr>
						<tr>
							<td class="name">Tính năng khác:</td>
							<td class="value">
								<!-- <ul>
									<li>HDMI</li>
									<li>Camera</li>
									<li>Microphone</li>
									<li>Headphone</li>
									<li>Bluetooth</li>
									<li>RJ-11 Modem</li>
								</ul> --> <s:property value="tinhNangKhac" />
							</td>
						</tr>
					</table>
				</div>
				<div id="two">
					<s:iterator value="dsSanPhamCungLoai">
						<s:url action="SanPham_chiTiet" var="productDetail">
							<s:param name="maSanPham" value="maSanPham"></s:param>
						</s:url>

						<div class="prod_box">
							<div class="top_prod_box"></div>
							<div class="center_prod_box">
								<div class="product_title">
									<a href="${productDetail}"><s:property value="tenSanPham" />
									</a>
								</div>


								<!-- Noi dung se duoc hien thi trong tooltip -->
								<div id="mystickytooltip" class="stickytooltip">
									<div id="${maSanPham }" style="width: 200px;">
										<s:property value="toShortString()" />
										<img alt="" src="${hinhAnh}" class="hinhtooltip">
										<s:property value="toLongString()" />
									</div>
								</div>
								<!--  -->

								<div class="product_img">
									<a href="${productDetail}" data-tooltip="${maSanPham }"> <img
										src="${hinhAnh}" alt="" title="" border="0" class="danhsach" />
									</a>
								</div>

								<div class="prod_price">
									<span class="reduce"></span> <span class="price"><s:property
											value="giaText" /> VNĐ</span>
								</div>
							</div>
							<div class="bottom_prod_box"></div>
							<div class="prod_details_tab">
								<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
									src="images/cart.gif" alt="" title="" border="0"
									class="left_bt" /> </a><a href="${productDetail}"
									class="prod_details">Chi tiết</a>
							</div>
						</div>
					</s:iterator>
					
				</div>
				<div id="three">
					<div>
						<s:form>
							<table class="shop_table" cellpadding="0" cellspacing="0">
								<tbody>
									<tr class="tr text_title">
										<td class="col_1" align="center"><b></b></td>
										<td class="col_2" align="center"><b>Logo</b></td>
										<td class="col_3" align="center"><b>Thông tin cửa
												hàng</b>
										</td>
										<td class="col_4" align="center"><b>Liên hệ</b></td>
									</tr>
									<s:iterator value="dsGianHangSanPham" status="status">
										<tr class="tr">
											<s:url action="store" id="store">
												<s:param name="maGianHang" value="getGianHang().maGianHang"></s:param>
											</s:url>
											<td class="col_1"><div class="No">
													<s:property value="#status.count" />
												</div></td>
											<td class="col_2">
												<div class="picture_small">
													<a href="${store }" class="tooltip"><img
														src="<s:property value="getGianHang().logo"/>" width="80"
														height="60" alt=""> </a>
												</div>
											</td>
											<td class="col_3">
												<div class="company_name">
													<a href="${store }" class="text_link" target="_blank"><s:property
															value="getGianHang().tenGianHang" /> </a>
												</div>
												<div class="address">
													<s:property value="getGianHang().diaChi" />
													<b>(<s:property
															value="getGianHang().tinhThanhPho.tenTinhThanhPho" />)</b>
												</div>
												<div class="clear"></div></td>
											<td class="col_4">
												<div class="phone">

													<script type="text/javascript"
														src="http://download.skype.com/share/skypebuttons/js/skypeCheck.js"></script>
													<a
														href="skype:<s:property value="getGianHang().dienThoai" />?call">
														<img
														src="http://download.skype.com/share/skypebuttons/buttons/call_blue_white_124x52.png"
														style="border: none;" width="124" height="52"
														alt="Skype Me™!" /> </a>

												</div>
												<div class="fax">
													Fax:
													<s:property value="getGianHang().fax" />
												</div>
												<div class="yahoo">
													<a
														href="ymsgr:sendim?<s:property value="getGianHang().yahoo"/>"
														title="Hỗ trợ trực tuyến"> <img
														src="http://opi.yahoo.com/online?u=<s:property value="getGianHang().yahoo"/>&m=g&t=1">
													</a>
												</div></td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
							<br>
						</s:form>
					</div>
				</div>
				<div id="four">
					<s:iterator value="dsHinhAnh">
						<div>
							<img alt="" src="${urlHinhAnh}">
						</div>
					</s:iterator>
				</div>
			</sj:tabbedpanel>
		</sj:div>
	</div>
</div>
