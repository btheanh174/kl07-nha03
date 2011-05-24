<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%
	int trang = 1;
	if (request.getParameter("trang") != null) {
		session.setAttribute("trang", request.getParameter("trang"));
		trang = Integer.parseInt(request.getParameter("trang"));
	} else {
		session.setAttribute("trang", 1);
	}
%>

<!-- <div class="center_title_bar">Kết quả tìm kiếm</div>
<div class="prod_box_big_full">
	<div class="top_prod_box_big_full"></div>
	<div class="center_prod_box_big_full"> -->
<s:if test="listSanPham.size() > 0">
	<div>
		<s:form>
			<table class="view_list_table">
				<tbody>
					<tr class="tr text_title">
						<td class="col_1"></td>
						<td class="col_2" align="center"><b>Ảnh</b></td>
						<td class="col_3" align="center"><b>Tên sản phẩm</b></td>
						<td class="col_4" align="center"><b>Giá bán</b></td>
					</tr>
					<s:iterator value="listSanPham" status="spStatus">
						<tr class="tr">
							<s:url action="SanPham_chiTiet" var="productDetail">
								<s:param name="maSanPham" value="maSanPham"></s:param>
							</s:url>
							<td class="col_1"></td>
							<td class="col_2">
								<div class="picture_small">
									<a href="${productDetail }" class="tooltip"><img src="${hinhAnh }" alt="">
									</a>
								</div></td>
							<td class="col_3">
								<div class="name">
									<a href="${productDetail }"><b> <s:property
												value="maSanPham" /> <s:property value="toShortString()" />
									</b> </a>
								</div>
								<div>
									<a href="${productDetail }"><em><s:property
												value="tenSanPham" /> </em> </a>.
									<s:property value="toLongString()" />
								</div> <%-- <div class="fl">
										<div>
											<span class="star_vote"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"> </span><b class="star">0</b>
										</div>
									</div> --%>

								<div class="clear"></div></td>
							<td class="col_4">
								<div>
									<strong><span class="price"><b><s:property
													value="giaText" /> </b> </span> VNĐ</strong>
								</div>
								<div>
									<a href="#">Có <b><s:property value="dsGianHang.size()" />
									</b> gian hàng bán</a>
								</div>
							</td>
						</tr>

					</s:iterator>
				</tbody>
			</table>
			<br>
		</s:form>
	</div>
	<div class="pagination">
		<ul>
			<li><a href="#" class="prevnext disablelink">« Trước</a>
			</li>

			<s:iterator value="soTrang" status="stat">
				<s:url id="timNhanh" action="SanPham_timNhanh">
					<s:param name="tieuChi.loaiSanPham" value="tieuChi.loaiSanPham"></s:param>
					<s:param name="tieuChi.tenSanPham" value="tieuChi.tenSanPham"></s:param>
					<s:param name="tieuChi.giaDuoi" value="tieuChi.giaDuoi"></s:param>
					<s:param name="tieuChi.giaTren" value="tieuChi.giaTren"></s:param>
					<s:param name="trang" value="%{#stat.count}"></s:param>
				</s:url>
				<li><a href="${timNhanh }"> <s:property /> </a>
				</li>
			</s:iterator>

			<li><a href="#" class="prevnext">Sau »</a>
			</li>
		</ul>
	</div>
</s:if>
<s:else>
	<s:label>Không tìm thấy sản phẩm nào</s:label>
</s:else>
<!-- </div>
	<div class="bottom_prod_box_big_full"></div>
</div> -->
