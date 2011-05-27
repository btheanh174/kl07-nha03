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
				src="${hinhAnh}" alt="" title="" border="0" /> </a>
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

<div class="prod_box_big">
	<div class="center_prod_box_big">
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
					<table width="500" border="1" align="center" cellpadding="5"
						cellspacing="0">
						<tr>
							<td align="right">Hãng sản xuất:</td>
							<td align="left"><s:property value="hangSanXuat" /></td>
						</tr>
						<tr>
							<td align="right">HDD:</td>
							<td align="left"><s:property value="hdd" />
							</td>
						</tr>
						<tr>
							<td align="right">RAM:</td>
							<td align="left"><s:property value="ram" />
							</td>
						</tr>
						<tr>
							<td align="right">CPU:</td>
							<td align="left"><s:property value="cpu" />
							</td>
						</tr>
						<tr>
							<td align="right">VGA:</td>
							<td align="left"><s:property value="vga" />
							</td>
						</tr>
						<tr>
							<td align="right">OS:</td>
							<td align="left"><s:property value="heDieuHanh" />
							</td>
						</tr>
						<tr>
							<td align="right">Chuột:</td>
							<td align="left"><s:property value="chuot" />
							</td>
						</tr>
						<tr>
							<td align="right">Cổng USB:</td>
							<td align="left"><s:property value="usb" />
							</td>
						</tr>
						<tr>
							<td align="right">LAN:</td>
							<td align="left"><s:property value="lan" />
							</td>
						</tr>
						<tr>
							<td align="right">WIFI:</td>
							<td align="left"><s:property value="wifi" />
							</td>
						</tr>
						<tr>
							<td align="right">Pin:</td>
							<td align="left"><s:property value="pin" />
							</td>
						</tr>
						<tr>
							<td align="right">Trọng lượng:</td>
							<td align="left"><s:property value="trongLuong" />
							</td>
						</tr>
						<tr>
							<td align="right">Độ phân giải:</td>
							<td align="left"><s:property value="doPhanGiai" />
							</td>
						</tr>
						<tr>
							<td align="right">Kích thước màn hình:</td>
							<td align="left"><s:property value="kichThuocManHinh" />
							</td>
						</tr>
						<tr>
							<td align="right">Tính năng khác:</td>
							<td align="left">
								<!-- <ul>
									<li>HDMI</li>
									<li>Camera</li>
									<li>Microphone</li>
									<li>Headphone</li>
									<li>Bluetooth</li>
									<li>RJ-11 Modem</li>
								</ul> --> <s:property value="tinhNangKhac" /></td>
						</tr>
					</table>
				</div>
				<div id="two">Các sản phẩm liên quan</div>
				<div id="three">
					<div>
						<s:form>
							<table class="shop_table" cellpadding="0" cellspacing="0">
								<tbody>
									<tr class="tr text_title">
										<td class="col_1" align="center"><b></b>
										</td>
										<td class="col_2" align="center"><b>Logo</b>
										</td>
										<td class="col_3" align="center"><b>Thông tin cửa
												hàng</b></td>
										<td class="col_4" align="center"><b>Liên hệ</b>
										</td>
									</tr>
									<s:iterator value="dsGianHang" status="status">
										<tr class="tr">
											<s:url action="store" id="store">
												<s:param name="maGianHang" value="maGianHang"></s:param>
											</s:url>
											<td class="col_1"><div class="No">
													<s:property value="#status.count" />
												</div>
											</td>
											<td class="col_2">
												<div class="picture_small">
													<a href="${store }" class="tooltip"><img src="${logo }"
														width="80" height="60" alt=""> </a>
												</div></td>
											<td class="col_3">
												<div class="company_name">
													<a href="${store }" class="text_link" target="_blank"><s:property
															value="tenGianHang" /> </a>
												</div>
												<div class="address">
													<s:property value="diaChi" />
													<b>(<s:property value="tinhThanhPho.tenTinhThanhPho" />)</b>
												</div>
												<div class="clear"></div>
											</td>
											<td class="col_4">
												<div class="phone">

													<script type="text/javascript"
														src="http://download.skype.com/share/skypebuttons/js/skypeCheck.js"></script>
													<a href="skype:<s:property value="dienThoai" />?call"><img
														src="http://download.skype.com/share/skypebuttons/buttons/call_blue_white_124x52.png"
														style="border: none;" width="124" height="52"
														alt="Skype Me™!" /> </a>

												</div>
												<div class="fax">
													Fax:
													<s:property value="fax" />
												</div>
												<div class="yahoo">
													<a href="ymsgr:sendim?<s:property value="yahoo"/>"
														title="Hỗ trợ trực tuyến"> <img
														src="http://opi.yahoo.com/online?u=<s:property value="yahoo"/>&m=g&t=1">
													</a>
												</div>
											</td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
							<br>
						</s:form>
					</div>
					<!-- Phan trang -->
					<div id="pagination">
						<s:if test="tongSoTrang > 1">
							<s:url id="prev" action="GianHang_danhSach">
								<s:param name="trang" value="trang - 1"></s:param>
							</s:url>
							<s:if test="trang > 1">
								<a href="${prev }" class="pn next">&lt;&lt;Trước</a>
							</s:if>
							<s:iterator value="soTrang" status="stat">
								<s:url id="danhSach" action="GianHang_danhSach">
									<s:param name="trang" value="%{#stat.count}"></s:param>
								</s:url>
								<s:if test="trang == #stat.count">
									<span><s:property /> </span>
								</s:if>
								<s:else>
									<a href="${danhSach }"> <s:property /> </a>
								</s:else>
							</s:iterator>
							<s:url id="next" action="GianHang_danhSach">
								<s:param name="trang" value="trang + 1"></s:param>
							</s:url>

							<s:if test="trang < tongSoTrang">
								<a href="${next }" class="pn next">Sau »</a>
							</s:if>
						</s:if>
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