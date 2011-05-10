<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">Tìm kiếm điện thoại</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="get" action="SanPham_timNangCao">
			<s:actionerror />
			<s:hidden name="loaiSanPham" value="DIENTHOAI"></s:hidden>
			<table width="500" cellspacing="0" cellpadding="0" border="0"
				align="center">
				<tbody>
					<tr>
						<td width="110">&nbsp;</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0">
								<tbody>
									<tr>
										<td width="177"></td>
										<td width="211" style="padding-bottom: 4px;"><s:textfield
												label="Tên sản phẩm" name="dt.tenSanPham"></s:textfield></td>
									</tr>
								</tbody>
							</table></td>
					</tr>
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td width="110"><strong>Thông tin cơ bản</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="dt.hangSanXuat" label="Hãng sản xuất"
												list="dsHangSanXuat" headerValue="--[Bạn hãy chọn]--">
											</s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="dt.mang"
												label="Mạng" list="dsMang"></s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												label="Kiểu dáng" list="dsKieuDang"
												name="dt.kieuDang"></s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.trongLuong" label="Trọng lượng (<)"
												list="#{'0':'--[Bạn hãy chọn]--','100':'100g','200':'200g','300':'300g'}"></s:select>
											<input type="hidden" value="&lt;" name="c5">
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.loaiManHinh" label="Loại màn hình (>)"
												list="dsLoaiManHinh"></s:select> <input
											type="hidden" value="&gt;" name="c6" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.doPhanGiai" label="Độ phân giải (>)"
												list="dsDoPhanGiai"></s:select> <input
											type="hidden" value="&gt;" name="c7" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.kieuChuong" label="Kiểu chuông"
												list="dsKieuChuong"></s:select> <input
											type="hidden" value="=" name="c8" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:checkbox name="dt.rung"
												label="Rung"></s:checkbox> <input type="hidden" value="="
											name="c9" />
										</td>
									</tr>
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<!-- -->
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td width="110"><strong>Bộ nhớ</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="dt.sim" label="Số sim"
												list="#{'0':'--[Bạn hãy chọn]--','1':'1 Sim','2':'2 Sim'}"></s:select> <input
											type="hidden" value="&gt;" name="c11">
										</td>
									</tr>
									
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.loaiTheNho" label="Loại thẻ nhớ"
												list="dsLoaiTheNho"></s:select> <input
											type="hidden" value="=" name="c13">
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.boNhoTrong" label="Bộ nhớ trong"
												list="dsBoNhoTrong"></s:select> <input
											type="hidden" value="&gt;" name="c14" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="dt.ram"
												label="Ram (>)" list="dsRam"></s:select> <input
											type="hidden" value="&gt;" name="c15" />
										</td>
									</tr>
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<!-- -->
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td width="110"><strong>Dữ liệu</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="dt.heDieuHanh" label="Hệ điều hành"
												list="dsHeDieuHanh"></s:select>
										</td>
									</tr>

									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="dt.tinNhan"
												label="Tin nhắn" list="dsTinNhan"></s:select>
										</td>
									</tr>
									
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<!-- -->
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td width="110"><strong>Tính năng nổi bật</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="dt.camera" label="Camera (>)"
												list="dsCamera"></s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="dt.mauSac"
												label="Màu sắc" list="dsMauSac"></s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.tinhNangCoBan" label="Tính năng cơ bản"
												list="dsTinhNangCoBan"></s:select>
										</td>
									</tr>
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<!-- -->
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td><strong>Pin</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="dt.pin" label="Pin"
												list="dsPin"></s:select>
										</td>

									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.thoiGianCho" label="Thời gian chờ (>)"
												list="dsThoiGianCho"></s:select>
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="dt.thoiGianDamThoai" label="Thời gian đàm thoại (>)"
												list="dsThoiGianDamThoai"></s:select>
										</td>
									</tr>
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<!-- -->
					<tr height="10">
						<td>&nbsp;</td>
					</tr>

				</tbody>
			</table>

			<table cellspacing="0" cellpadding="0" align="center">
				<tbody>
					<tr>
						<td></td>
						<td><s:textfield name="dt.giaDuoi" label="Giá từ"></s:textfield>
						</td>

						<td></td>
						<td><s:textfield name="dt.giaTren" label="Đến"></s:textfield></td>
					</tr>
				</tbody>
			</table>

			<br>
			<table width="100%" cellspacing="0" cellpadding="0">
				<tbody>
					<tr align="center">
						<td align="center" width="211" style="padding-bottom: 4px;">
							<s:submit value="Tìm kiếm"></s:submit></td>
					</tr>
				</tbody>
			</table>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
