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

<div class="center_title_bar">Giỏ hàng</div>
<s:if test="#session['gh'].laySoMiniCart() == 0">
	<div class="prod_box_big">
		<div class="top_prod_box_big"></div>
		<div class="center_prod_box_big">
			Giỏ hàng chưa có sản phẩm nào!
			<s:a action="Index">Tiếp tục mua</s:a>
		</div>
		<div class="bottom_prod_box_big"></div>
	</div>
</s:if>
<s:else>
	<s:iterator value="#session['gh'].layMiniCartEnumeration()" status="stat0">
		<div class="prod_box_big">
			<div class="top_prod_box_big"></div>
			<div class="center_prod_box_big">

				<s:form method="get" action="GioHang_capNhat">
					<s:property value="maGianHang"/>
					<s:hidden name="maGianHang" value="maGianHang"></s:hidden>
					<table cellspacing="0" cellpadding="0" border="0" width="100%">
						<tbody>
							<tr>
								<td>
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody>
											<tr>
												<td style="font-size: 18; color: blue; font-weight: bold;"><b>Giỏ
														hàng của bạn tại công ty: <s:property
															value="layTenGianHang()" /> </b>
												</td>
												<td align="right" class="pageHeading"></td>
											</tr>
										</tbody>
									</table></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>
									<!--  --> <!--  -->
									<table cellspacing="0" cellpadding="0" border="0" width="100%">
										<tbody>
											<tr>
												<td align="center" class="productListing-heading"><b>Xóa</b>
												</td>
												<td class="productListing-heading"><b>Sản phẩm</b>
												</td>
												<td align="center" class="productListing-heading"><b>Số
														lượng</b>
												</td>
												<td align="center" class="productListing-heading"><b>Thành
														tiền</b>
												</td>
											</tr>
											
											<s:iterator value="dsMatHang" status="stat">
												<tr>
													<td align="center" valign="top"><input type="checkbox"
														name="dsDuocChon" value="${sanPham.maSanPham }"></td>
													<td>
														<table cellspacing="2" cellpadding="2" border="0">
															<tbody>
																<tr>

																	<s:url action="SanPham_chiTiet" var="productDetail">
																		<s:param name="maSanPham" value="sanPham.maSanPham"></s:param>
																	</s:url>

																	<td align="center"><a href=""></a>
																	</td>
																	<td valign="top"><a href="${productDetail }"><b>
																				<s:property value="%{sanPham.tenSanPham}" /> </b> </a>
																	</td>
																</tr>
															</tbody>
														</table></td>
													<td align="center" valign="top"><input type="text"
														size="4" value="${soLuong }" name="dsSoLuong" /> <input
														type="hidden" name="dsMaSanPham"
														value="${sanPham.maSanPham}">
													<td align="center" valign="top"><b> <s:property
																value="thanhTien" /> VNĐ</b>
													</td>
												</tr>
											</s:iterator>
										</tbody>
									</table></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>
									<table>
										<tbody>
											<tr>
												<td align="right" width="100%"><b>Tổng số tiền: <s:property
															value="layChuoiTongTien()" /> VNĐ </b></td>
												<td></td>
											</tr>
										</tbody>
									</table></td>
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
													<table cellspacing="0" cellpadding="2" border="0"
														width="100%">
														<tbody>
															<tr>
																<td width="10"></td>
																<td class="main"><input type="image"
																	src="images/button_update_cart.gif"></td>

																<!--<td>
												<s:url var="clear" action="GioHang_xoaTatCa"></s:url>
												<s:a href="%{clear}">Xóa tất cả</s:a>
											</td>
											-->
																<td class="main"><s:url var="continue"
																		action="show_index"></s:url> <s:a href="%{continue}">
																		<img border="0" title=" Continue Shopping "
																			alt="Continue Shopping"
																			src="images/button_continue_shopping.gif">

																	</s:a>
																</td>
																<td align="right" class="main"><s:a>
																		<img border="0" title=" Checkout " alt="Checkout"
																			src="images/button_checkout.gif">
																	</s:a>
																</td>
																<td width="10"></td>
															</tr>
														</tbody>
													</table></td>
											</tr>
										</tbody>
									</table></td>
							</tr>
						</tbody>
					</table>
				</s:form>
			</div>
			<div class="bottom_prod_box_big"></div>
		</div>
	</s:iterator>
</s:else>

