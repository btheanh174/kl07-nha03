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
					alt="" /></th>
				<th class="topleft"></th>
				<td id="tbl-border-top">&nbsp;</td>
				<th class="topright"></th>
				<th rowspan="3" class="sized"><img
					src="images/shared/side_shadowright.jpg" width="20" height="300"
					alt="" /></th>
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
										<div class="step-no-off">2</div>
										<div class="step-light-left">Thông tin chi tiết</div>
										<div class="step-light-right">&nbsp;</div>
										<div class="step-no-off">3</div>
										<div class="step-dark-left">Hoàn tất</div>
										<div class="step-light-round">&nbsp;</div>
										<div class="clear"></div>
									</div> <!--  end step-holder --> <!-- start id-form --> <s:form
										action="SanPham_themSanPham_3.action" method="post"
										theme="simple">

										<table width="400" border="1" align="center" cellpadding="25"
											cellspacing="30" style="font-size: 15px; line-height: 25px">
											<tr>
												<td align="center">Tên sản phẩm:</td>
												<td align="center"><s:property
														value="laptop.tenSanPham" /></td>
											</tr>
											<tr>
												<td align="center">Giá tham khảo:</td>
												<td align="center"><s:property value="laptop.gia" /></td>
											</tr>
											<tr>
												<td align="center">Danh mục:</td>
												<td align="center"><s:property
														value="laptop.danhMuc.tenDanhMuc" /></td>
											</tr>
											<tr>
												<td align="center">Hãng sản xuất:</td>
												<td align="center"><s:property
														value="laptop.hangSanXuat" /></td>
											</tr>
											<tr>
												<td align="center">HDD:</td>
												<td align="center"><s:property value="laptop.hdd" />
												</td>
											</tr>
											<tr>
												<td align="center">RAM:</td>
												<td align="center"><s:property value="laptop.ram" />
												</td>
											</tr>
											<tr>
												<td align="center">CPU:</td>
												<td align="center"><s:property value="laptop.cpu" />
												</td>
											</tr>
											<tr>
												<td align="center">VGA:</td>
												<td align="center"><s:property value="laptop.vga" />
												</td>
											</tr>
											<tr>
												<td align="center">OS:</td>
												<td align="center"><s:property
														value="laptop.heDieuHanh" /></td>
											</tr>
											<tr>
												<td align="center">Chuột:</td>
												<td align="center"><s:property value="laptop.chuot" />
												</td>
											</tr>
											<tr>
												<td align="center">Cổng USB:</td>
												<td align="center"><s:property value="laptop.usb" />
												</td>
											</tr>
											<tr>
												<td align="center">LAN:</td>
												<td align="center"><s:property value="laptop.lan" />
												</td>
											</tr>
											<tr>
												<td align="center">WIFI:</td>
												<td align="center"><s:property value="laptop.wifi" />
												</td>
											</tr>
											<tr>
												<td align="center">Pin:</td>
												<td align="center"><s:property value="laptop.pin" />
												</td>
											</tr>
											<tr>
												<td align="center">Trọng lượng:</td>
												<td align="center"><s:property
														value="laptop.trongLuong" /></td>
											</tr>
											<tr>
												<td align="center">Độ phân giải:</td>
												<td align="center"><s:property
														value="laptop.doPhanGiai" /></td>
											</tr>
											<tr>
												<td align="center">Kích thước màn hình:</td>
												<td align="center"><s:property
														value="laptop.kichThuocManHinh" />
												</td>
											</tr>
											<tr>
												<td align="center">Tính năng khác:</td>
												<td align="center"><s:property
														value="laptop.tinhNangKhac" /></td>
											</tr>
											<tr>
												<th></th>

												<td><s:submit key="  Đồng ý  " style="margin-top:30px;" />
												</td>
												<td></td>
											</tr>

										</table>

										<!-- end id-form  -->
									</s:form>
								</td>
								<td></td>
							</tr>
							<tr>
								<td><img src="images/shared/blank.gif" width="695"
									height="1" alt="blank" /></td>
								<td></td>
							</tr>
						</table>

						<div class="clear"></div>


					</div> <!--  end content-table-inner  -->
				</td>
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