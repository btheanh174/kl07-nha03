<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">Kết quả tìm kiếm</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:if test="listSanPham.size() > 0">
			<s:form>
				<div style="text-align: center;">
					Trang:
					<s:iterator value="soTrang" status="stat">
						<s:url id="timNhanh" action="SanPham_timNhanh">
							<s:param name="tieuChi.loaiSanPham" value="tieuChi.loaiSanPham"></s:param>
							<s:param name="tieuChi.tenSanPham" value="tieuChi.tenSanPham"></s:param>
							<s:param name="tieuChi.giaDuoi" value="tieuChi.giaDuoi"></s:param>
							<s:param name="tieuChi.giaTren" value="tieuChi.giaTren"></s:param>
							<s:param name="trang" value="%{#stat.count}"></s:param>
						</s:url>
						<s:a href="%{timNhanh}">[<s:property />]</s:a>
					</s:iterator>
				</div>

				<table>
					<tbody>
						<tr class="tr text_title">
							<td class="col_1"></td>
							<td class="col_2" align="center">Ảnh</td>
							<td class="col_3" align="center">Tên sản phẩm</td>
							<td class="col_4" align="center">Giá bán</td>
						</tr>
						<s:iterator value="listSanPham" status="spStatus">
							<tr class="tr">
								<td class="col_1"></td>
								<td class="col_2">
									<div class="picture_small">
										<a href="" class="tooltip"><img src="" alt=""> </a>
									</div></td>
								<td class="col_3">
									<div class="name">
										<a href=""> <s:property value="tenSanPham" /> Dell
											Inspiron 14r (Intel Core i3-350M 2.26GHz, 2GB RAM, 320GB HDD,
											VGA Intel HD Graphics, 14.1 inch, PC DOS)</a>
									</div>
									<div class="teaser">
										<a href=""><em>Dell 14 N4030</em> </a>, <a href=""><em>Dell
												N4030</em> </a>
									</div>
									<div class="fl">
										<div>
											<span class="star_vote"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"><img src="images/star_0.gif"><img
												src="images/star_0.gif"> </span><b class="star">0</b>
										</div>
									</div>
									<div class="fr show_teaser">
										<a rel="nofollow" href="javascript:;" class="expand"
											title="Mở rộng"><img
											src="http://static.vatgia.com/css/multi_css_v2/standard/blank.gif">
										</a>
									</div>
									<div class="clear"></div></td>
								<td class="col_4">
									<div class="price">
										<s:property value="gia" />
									</div>
									<div class="price_usd"></div>
									<div>
										<a href="" class="text_link">Có <b>1</b> gian hàng bán</a>
									</div></td>
							</tr>

						</s:iterator>
					</tbody>
				</table>
			</s:form>
		</s:if>
		<s:else>
			<s:label>Không tìm thấy sản phẩm nào</s:label>
		</s:else>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
