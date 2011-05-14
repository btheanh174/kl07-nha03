<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<!-- start content-outer -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">


		<div id="page-heading">
			<h1>Thêm sản phẩm</h1>
		</div>


		<table border="0" width="100%" cellpadding="0" cellspacing="0"
			id="content-table">
			<tr>
				<th rowspan="3" class="sized"><img
					src="images/shared/side_shadowleft.jpg" width="20" height="300"
					alt="" />
				</th>
				<th class="topleft"></th>
				<td id="tbl-border-top">&nbsp;</td>
				<th class="topright"></th>
				<th rowspan="3" class="sized"><img
					src="images/shared/side_shadowright.jpg" width="20" height="300"
					alt="" />
				</th>
			</tr>
			<tr>
				<td id="tbl-border-left"></td>
				<td>
					<!--  start content-table-inner -->
					<div id="content-table-inner">

						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr valign="top">
								<td>
									<!--  start step-holder -->
									<div id="step-holder">
										<div class="step-no-off">1</div>
										<div class="step-light-left">
											<a href="">Thêm sản phẩm</a>
										</div>
										<div class="step-light-right">&nbsp;</div>
										<div class="step-no">2</div>
										<div class="step-dark-left">Thông tin chi tiết</div>
										<div class="step-dark-right">&nbsp;</div>
										<div class="step-no-off">3</div>
										<div class="step-light-left">Hoàn tất</div>
										<div class="step-light-round">&nbsp;</div>
										<div class="clear"></div>
									</div> <!--  end step-holder --> <!-- start id-form --> <s:form
										action="SanPham_themSanPham_2.action" method="post"
										theme="simple">
																			
										<%-- <s:hidden name="laptop.tenSanPham" value = "%{sanPham.tenSanPham}"></s:hidden>
										<s:hidden name="laptop.gia" value = "%{sanPham.gia}"></s:hidden>
										<s:hidden name="laptop.hangSanXuat" value = "%{sanPham.hangSanXuat}"></s:hidden>
										
										<s:hidden name="laptop.danhMuc" value = "%{sanPham.danhMuc}"></s:hidden>
										<s:hidden name="laptop.dsHinhAnh" value = "%{sanPham.dsHinhAnh}"></s:hidden>
										<s:hidden name="laptop.dsGianHang" value = "%{sanPham.dsGianHang}"></s:hidden> --%>
										<table border="0" cellpadding="0" cellspacing="0" id="id-form">
											<tr>
												<th>Mainboard: </th>
												<td><s:textfield name="laptop.mainboard" value="Gigabyte X5220" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>CPU: </th>
												<td><s:textfield name="laptop.cpu" value="I7 2.2GHz" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>HDD: </th>
												<td><s:textfield name="laptop.hdd" value="500GB" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>RAM: </th>
												<td><s:textfield name="laptop.ram" value="4GB" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>VGA: </th>
												<td><s:textfield name="laptop.vga" value="Geforce NVIDA 9600 1GB"size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>USB: </th>
												<td><s:textfield name="laptop.usb" value="2.0, support 3.0" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>LAN: </th>
												<td><s:textfield name="laptop.lan" value="Lan Ethernet" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Wifi: </th>
												<td><s:textfield name="laptop.wifi" value="Chuẩn n" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Hệ điều hành: </th>
												<td><s:textfield name="laptop.heDieuHanh" value="Windows 7 Home Basic" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Chuột: </th>
												<td><s:textfield name="laptop.chuot" value="Không có" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Pin: </th>
												<td><s:textfield name="laptop.pin" value="8cells, 6h" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Trọng lượng: </th>
												<td><s:textfield name="laptop.trongLuong" value="1.5 Kg" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Kích thước màn hình: </th>
												<td><s:textfield name="laptop.kichThuocManHinh" value="15.6 inch" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Độ phân giải: </th>
												<td><s:textfield name="laptop.doPhanGiai" value="1028x760px" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th>Tính năng khác: </th>
												<td><s:textfield name="laptop.tinhNangKhac" value="Bảo mật vân tay" size="30"></s:textfield>
												</td>
												<td></td>
											</tr>
											<tr>
												<th></th>

												<td><s:submit key="  Đồng ý  " style="margin-top:30px;" />
												</td>
												<td></td>
											</tr>


										</table>
										<!-- end id-form  -->
									</s:form></td>
								<td></td>
							</tr>
							<tr>
								<td><img src="images/shared/blank.gif" width="695"
									height="1" alt="blank" />
								</td>
								<td></td>
							</tr>
						</table>

						<div class="clear"></div>


					</div> <!--  end content-table-inner  --></td>
				<td id="tbl-border-right"></td>
			</tr>
			<tr>
				<th class="sized bottomleft"></th>
				<td id="tbl-border-bottom">&nbsp;</td>
				<th class="sized bottomright"></th>
			</tr>
		</table>

	</div>
	<div class="clear">&nbsp;</div>
	<!--  end content -->
	<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->