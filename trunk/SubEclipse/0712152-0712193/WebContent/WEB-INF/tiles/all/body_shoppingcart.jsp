<%@page import="model.pojo.GioHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>


<s:if test="#session['gh'].laySoLuongMatHang() == 0">
		Giỏ hàng chưa có sản phẩm nào!
		<s:url id="index" action="Store">
			<s:param name="maGianHang" value="maGianHang"></s:param>
		</s:url>
		<a href="${index }">Tiếp tục mua</a>
</s:if>
<s:else>
	<s:form method="get" action="GioHang_capNhat">
		<table cellspacing="0" cellpadding="0" border="0" width="100%">
			<tbody>
				<tr>
					<td>
						<table cellspacing="0" cellpadding="0" border="0" width="100%">
							<tbody>
								<tr>
									<td class="pageHeading"><b>Giỏ hàng của tôi</b>
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
									<td align="center" class="productListing-heading">Xóa</td>
									<td class="productListing-heading">Sản phẩm</td>
									<td align="center" class="productListing-heading">Số lượng</td>
									<td align="center" class="productListing-heading">Thành
										tiền</td>
								</tr>
								<s:iterator value="#session['gh'].getEnumeration()"
									status="stat">
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
											type="hidden" name="dsMaSanPham" value="${sanPham.maSanPham}">
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
												value="#session['gh'].layTongTien()" /> VNĐ</b>
									</td>
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
										<table cellspacing="0" cellpadding="2" border="0" width="100%">
											<tbody>
												<tr>
													<td width="10"></td>
													<td class="main"><input type="image"
														src="images/button_update_cart.gif"></td>

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
</s:else>
