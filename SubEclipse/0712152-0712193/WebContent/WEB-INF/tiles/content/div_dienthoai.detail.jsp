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
				title="header=[Zoom] body=[&nbsp;] fade=[on]"> <img
				src="${hinhAnh}" alt="" title="" border="0" /> </a>


			<div class="thumbs">
				<!--<a href="#"
	title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img
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
				Bảo hành: <span class="blue">12 Tháng</span><br /> Số lượng: <span
					class="blue">1</span><br /> Chất lượng: <span class="blue">Mới</span><br />
				Phí vận chuyển: <span class="blue">Liên hệ</span><br /> Xuất xứ: <span
					class="blue">Chính hảng</span><br />
			</div>
			<div class="prod_price_big">
				<div class="prod_price_big">
					<strong><span class="price"><b><s:property
									value="giaText" />
						</b> </span> VNĐ</strong>
				</div>
			</div>

			<s:form action="GioHang_them" method="post">
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
		<sj:div cssClass="">
			<sj:tabbedpanel id="dienthoai" animate="true" collapsible="true"
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
							<td align="left"><s:property value="hangSanXuat" />
							</td>
						</tr>
						<tr>
							<td align="right">Mạng:</td>
							<td align="left"><s:property value="mang" />
							</td>
						</tr>
						<tr>
							<td align="right">Kiểu dáng:</td>
							<td align="left"><s:property value="kieuDang" />
							</td>
						</tr>
						<tr>
							<td align="right">Màn hình:</td>
							<td align="left"><s:property value="manHinh" />
							</td>
						</tr>
						<tr>
							<td align="right">Độ phân giải:</td>
							<td align="left"><s:property value="doPhanGiai" />
							</td>
						</tr>
						<tr>
							<td align="right">Hệ điều hành:</td>
							<td align="left"><s:property value="heDieuHanh" />
							</td>
						</tr>
						<tr>
							<td align="right">Bộ nhớ trong:</td>
							<td align="left"><s:property value="boNhoTrong" />
							</td>
						</tr>
						<tr>
							<td align="right">Ram:</td>
							<td align="left"><s:property value="ram" />
							</td>
						</tr>
						<tr>
							<td align="right">Tin nhắn:</td>
							<td align="left"><s:property value="tinNhan" />
							</td>
						</tr>
						<tr>
							<td align="right">Trọng lượng:</td>
							<td align="left"><s:property value="trongLuong" />
							</td>
						</tr>
						<tr>
							<td align="right">Kích thước:</td>
							<td align="left"><s:property value="kichThuoc" />
							</td>
						</tr>
						<tr>
							<td align="right">Kiểu chuông:</td>
							<td align="left"><s:property value="kieuChuong" />
							</td>
						</tr>
						<tr>
							<td align="right">Camera:</td>
							<td align="left"><s:property value="camera" />
							</td>
						</tr>
						<tr>
							<td align="right">Màu sắc:</td>
							<td align="left"><s:property value="mauSac" />
							</td>
						</tr>
						<tr>
							<td align="right">Pin:</td>
							<td align="left"><s:property value="pin" />
							</td>
						</tr>
						<tr>
							<td align="right">Thời gian đàm thoại:</td>
							<td align="left"><s:property value="thoiGianDamThoai" />
							</td>
						</tr>
						<tr>
							<td align="right">Thời gian chờ:</td>
							<td align="left"><s:property value="thoiGianCho" />
							</td>
						</tr>
						<tr>
							<td align="right">Số sim:</td>
							<td align="left"><s:property value="sim" />
							</td>
						</tr>
						<tr>
							<td align="right">Loại thẻ nhớ tích hợp:</td>
							<td align="left"><s:property value="theNho" />
							</td>
						</tr>
						<tr>
							<td align="right">Tính năng:</td>
							<td align="left"><s:property value="tinhNang" />
							</td>
						</tr>
						<tr>
							<td align="right">Tính năng khác:</td>
							<td align="left"><s:property value="tinhNangKhac" />
							</td>
						</tr>
					</table>
				</div>
				<div id="two">
					<s:form>
						<table class="shop_table" cellpadding="0" cellspacing="0">
							<tbody>
								<tr class="tr text_title">
									<td class="col_1" align="center"><b></b></td>
									<td class="col_2" align="center"><b>Logo</b></td>
									<td class="col_3" align="center"><b>Thông tin cửa hàng</b>
									</td>
									<td class="col_4" align="center"><b>Liên hệ</b></td>
								</tr>
								<s:iterator value="dsGianHang" status="status">
									<tr class="tr">
										<s:url action="store" id="store">
											<s:param name="maGianHang" value="maGianHang"></s:param>
										</s:url>
										<td class="col_1"><div class="No">
												<s:property value="#status.count" />
											</div></td>
										<td class="col_2">
											<div class="picture_small">
												<a href="${store }" class="tooltip"><img src="${logo }"
													width="80" height="60" alt=""> </a>
											</div>
										</td>
										<td class="col_3">
											<div class="company_name">
												<a href="${store }" class="text_link" target="_blank"><s:property
														value="tenGianHang" /> </a>
											</div>
											<div class="address">
												<s:property value="diaChi" />
												<b>(<s:property value="tinhThanhPho.tenTinhThanhPho" />)</b>
											</div>
											<div class="clear"></div></td>
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
											</div></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<br>
					</s:form>
				</div>
				<div id="three">
					Danh sách các gian hàng bán sản phẩm này.
					<s:iterator value="dsGianHang">
					Cửa hàng: <s:property value="tenGianHang" />
					</s:iterator>
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
