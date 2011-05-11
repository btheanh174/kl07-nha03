<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="center_title_bar">Giỏ hàng</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:if test="!#session['gioHang'] == null">
		Giỏ hàng chưa có sản phẩm nào!
		<s:a action="show_index">Tiếp tục mua</s:a>
		</s:if>
		<s:else>
		<s:form method="get"
		action=""
		name="soLuong">
	<table cellspacing="0" cellpadding="0" border="0" width="100%">
		<tbody>
			<tr>
				<td>
				<table cellspacing="0" cellpadding="0" border="0" width="100%">
					<tbody>
						<tr>
							<td class="pageHeading"><b>Giỏ hàng của tôi</b></td>
							<td align="right" class="pageHeading"></td>
						</tr>
					</tbody>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><!--  --> <!--  -->
				<table cellspacing="0" cellpadding="0" border="0" width="100%"
					class="productListing">
					<tbody>
						<tr>
							<td align="center" class="productListing-heading">Xóa</td>
							<td class="productListing-heading">Sản phẩm</td>
							<td align="center" class="productListing-heading">Số lượng</td>
							<td align="center" class="productListing-heading">Thành tiền</td>
						</tr>
						<tr class="productListing-even">
							<td align="center" valign="top" class="productListing-data"><input
								type="checkbox" value="1377" name="xoaSanPham"></td>
							<td class="productListing-data">
							<table cellspacing="2" cellpadding="2" border="0">
								<tbody>
									<tr>
										<td align="center" class="productListing-data">
											<a href="product_info.php?products_id=1377"></a>
										</td>
										<td valign="top" class="productListing-data">
											<a href="product_info.php?products_id=1377"><b>Flashing Bouncy Ball</b></a></td>
									</tr>
								</tbody>
							</table>
							</td>
							<td align="center" valign="top" class="productListing-data">
							<input type="text" size="4" value="1" name="soLuong">
								<input type="hidden" value="1377" name="maSanPham">
							</td>
							<td align="center" valign="top" class="productListing-data"><b>£3.44</b></td>
						</tr>
					</tbody>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
				<table>
				<tbody>
				<tr>
				<td align="right" width="100%"><b>Tổng số tiền: £3.44</b></td><td></td>
				</tr>
				</tbody>
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
										<td class="main">
											<s:a><img title="Update Cart" alt="UpdateCart" src="images/button_update_cart.gif"/></s:a>
										</td>
										<td class="main">
											<s:a><img border="0"
											title=" Continue Shopping " alt="Continue Shopping"
											src="images/button_continue_shopping.gif"></s:a>
										</td>
										<td align="right" class="main">
											<s:a><img
											border="0" title=" Checkout " alt="Checkout"
											src="images/button_checkout.gif"></s:a>
										</td>
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
		</s:else>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
