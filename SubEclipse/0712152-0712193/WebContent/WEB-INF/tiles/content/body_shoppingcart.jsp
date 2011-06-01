<%@page import="model.pojo.GioHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	GioHang gh = (GioHang) session.getAttribute("gh");
	if (gh == null) {
		gh = new GioHang();
		session.setAttribute("gh", gh);
	}
%>

<div class="block_title"><span>QUẢN LÝ GIỎ HÀNG</span></div>
<div class="break_line"></div>


<s:if test="#session['gh'].laySoMiniCart() == 0">
	<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">Giỏ hàng chưa có sản phẩm nào! <s:a
		action="Index">Tiếp tục mua</s:a></div>
	<div class="bottom_prod_box_big"></div>
	</div>
</s:if>
<s:else>
	<s:iterator value="#session['gh'].layMiniCartEnumeration()"
		status="stat0">

		<s:if test="laySoLuongMatHang() > 0">

			<div class="order_title">Đơn hàng <s:property
				value="#stat0.count" />: <s:property value="layTenGianHang()" /></div>
			<s:form method="get" action="GioHang_capNhat">
				<s:hidden id="idMaGianHang" name="maGianHang"
					value="%{top.maGianHang}"></s:hidden>
				<s:hidden name="viTriMiniCart" value="%{top.maGianHang}"></s:hidden>

				<table class="cart_table" cellspacing="0" cellpadding="0">
					<tbody>
						<tr class="text_title">
							<td class="col_1">STT</td>
							<td class="col_2">Xóa
							</td>

							<td class="col_3">Sản phẩm</td>

							<td class="col_4">Số
							lượng</td>

							<td class="col_5">Thành
							tiền</td>
						</tr>

						<s:iterator value="layDsMatHang()" status="stat">
							<tr>
								<td><s:property value="#stat.count" /></td>
								<td align="center" valign="top"><input type="checkbox"
									name="dsDuocChon" value="${sanPham.maSanPham }"></td>

								<s:url action="store" var="productDetail">
									<s:param name="maGianHang" value="maGianHang"></s:param>
									<s:param name="maSanPham" value="sanPham.maSanPham"></s:param>
								</s:url>

								<td valign="top"><a href="${productDetail }"><b> <s:property
									value="%{sanPham.tenSanPham}" /> </b> </a></td>

								<td align="center" valign="top"><input type="text" size="4"
									value="${soLuong }" name="dsSoLuong" /> <input type="hidden"
									name="dsMaSanPham" value="${sanPham.maSanPham}"></td>

								<td align="center" valign="top"><b> <s:property
									value="thanhTien" /> VNĐ</b></td>
							</tr>
						</s:iterator>

						<tr align="right">
								
								<td colspan="5">
								<table>
								<tr>
									<td><span><b>Tổng tiền - </b> </span></td>
									<td><b>VNĐ : </b><span class="price"><s:property
										value="layChuoiTongTienVND()" /></span></td>
								</tr>
								<tr>
									<td></td>
									<td>(<b>USD : </b><span class="price"><s:property
										value="layChuoiTongTienUSD()" /></span>)
									</td>
								</tr>
								</table>
								</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td>
							<table cellspacing="1" cellpadding="2" border="0" width="100%"
								class="infoBlankBox">
								<tbody>
									<tr class="infoBoxContents">
										<td>
										<table cellspacing="0" cellpadding="2" border="0" width="100%">
											<tbody>
												<tr>
													<td width="10"></td>
													<td class="main"><input type="image"
														src="images/button_update_cart.gif"></td>

													<td><s:url var="clear" action="GioHang_xoaTatCa"></s:url>
													<s:a href="%{clear}">Xóa tất cả</s:a></td>

													<td class="main"><s:url var="continue"
														action="show_index"></s:url> <s:a href="%{continue}">
														<img border="0" title=" Continue Shopping "
															alt="Continue Shopping"
															src="images/button_continue_shopping.gif">

													</s:a></td>
													<s:url id="urlCheckout" action="step2_Information">
														<s:param name="maGioHangMini">
															<s:property value="%{top.maGianHang}" />
														</s:param>
													</s:url>
													<td align="right" class="main"><s:a
														href="%{urlCheckout}">
														<img border="0" title=" Checkout " alt="Checkout"
															src="images/button_checkout.gif">
													</s:a></td>
													<td width="10"></td>
												</tr>
											</tbody>
										</table>
										</td>
									</tr>
								</tbody>
							</table>
							</td>
						</tr>
					</tbody>
				</table>
			</s:form>

		</s:if>

		<s:if test="#stat0.count != #session['gh'].laySoMiniCart()">
			<br>
			<div class="break_line"></div>
		</s:if>
	</s:iterator>
</s:else>

