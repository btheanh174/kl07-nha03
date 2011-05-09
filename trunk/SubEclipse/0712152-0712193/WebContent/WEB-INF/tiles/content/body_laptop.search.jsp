<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">Tìm kiếm laptop</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="get" action="Laptop_timKiem">
			
			<table width="500" cellspacing="0" cellpadding="0" border="0" align="center">
				<tbody>
					<tr>
						<td width="110">&nbsp;</td>
						<td>
							
							<table width="100%" cellspacing="0" cellpadding="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px;"><s:textfield
												label="Tên sản phẩm" name="tenSanPham"></s:textfield></td>
									</tr>
									
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="hangSanXuat" label="Hãng sản xuất"
												list="{'--[Bạn hãy chọn]--'}">
											</s:select> <input type="hidden" value=":" name="c1"></td>
									</tr>
									
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="mainboard" label="Mainboard Chipset"
												list="{'--[Bạn hãy chọn]--'}">
											</s:select> <input type="hidden" value=":" name="c1"></td>
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
						<td width="110"><strong>Màn hình</strong>
						</td>
						<td>
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;"><s:select name="kichThuocManHinh"
												label="Độ lớn (>)" list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="=" name="c2"></td>
									</tr>
									
									
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="doPhanGiai" label="Độ phân giải (>)"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c7" />
										</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<!-- -->
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td width="110"><strong>HDD</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="hdd" label="Dung lượng (>)"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c11">
										</td>
									</tr>
									
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="soVongQuay" label="Số vòng quay"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="=" name="c13">
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
						<td width="110"><strong>CPU</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="cpu" label="Loại CPU"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value=":" name="c17">
										</td>
									</tr>

									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="tocDo"
												label="Tốc độ (>)" list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="=" name="c20">
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
						<td width="110"><strong>Graphic</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="chipset" label="Chipset"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c24">
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select name="vga"
												label="Memory (>)" list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="=" name="c25">
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
						<td><strong>Memory</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="ram" label="Dung lượng (>)"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c28">
										</td>

									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="loaiRam" label="Loại"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c30">
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
						<td><strong>Network</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="lan" label="Lan"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c28">
										</td>

									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="wifi" label="Wifi"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c30">
										</td>
									</tr>
									
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					<tr>
						<td
							style="border-bottom: 1px dotted rgb(102, 102, 102); font-size: 1px;"
							colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td><strong>Khác</strong>
						</td>
						<td>
							<!-- bb -->
							<table width="100%" cellspacing="0" cellpadding="0" border="0">
								<tbody>
									<tr>
										<td width="130"></td>
										<td width="145" style="padding-bottom: 4px; padding-top: 3px;">
											<s:select name="chuot" label="Chuột"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c28">
										</td>

									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="heDieuHanh" label="OS"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c30">
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="trongLuong" label="Trọng lượng (<)"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c30">
										</td>
									</tr>
									<tr>
										<td></td>
										<td style="padding-bottom: 4px;"><s:select
												name="pin" label="Pin"
												list="{'--[Bạn hãy chọn]--'}"></s:select> <input
											type="hidden" value="&gt;" name="c30">
										</td>
									</tr>
								</tbody>
							</table> <!-- bb -->
						</td>
					</tr>
					
					<tr height="10">
						<td>&nbsp;</td>
					</tr>

				</tbody>
			</table>
			<br />
			<table cellspacing="0" cellpadding="0" align="center">
				<tbody>
					<tr>
						<td class="form_name">Giá từ :</td>
						<td nowrap="nowrap" class="form_text"><input type="text" />
						</td>
						<td>VNĐ</td>
						<td class="form_name">Đến :</td>
						<td nowrap="nowrap" class="form_text"><input type="text" />
						</td>
						<td>VNĐ</td>
					</tr>
				</tbody>
			</table>
			<br />
			<table cellspacing="0" cellpadding="0" align="center">
				<tbody>
					<tr>
						<td><s:submit value="Tìm kiếm"></s:submit> </td>
						<td><s:reset value="Làm lại"></s:reset> </td>
					</tr>
				</tbody>
			</table>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
