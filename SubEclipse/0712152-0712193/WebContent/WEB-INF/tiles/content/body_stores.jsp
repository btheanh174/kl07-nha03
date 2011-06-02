<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="content">
<div class="block_title"><span>Danh sách cửa hàng</span></div>
<div class="break_line"></div>
<s:if test="dsGianHang.size() > 0">
	<div>
		<s:form>
			<table class="shop_table" cellpadding="0" cellspacing="0">
				<tbody>
					<tr class="text_title">
						<td class="col_1" align="center"><b></b>
						</td>
						<td class="col_2" align="center"><b>Logo</b>
						</td>
						<td class="col_3" align="center"><b>Thông tin cửa hàng</b>
						</td>
						<td class="col_4" align="center"><b>Liên hệ</b>
						</td>
					</tr>
					
					<s:iterator value="dsGianHang" status="status">
					<!--class="<s:if test="(#status.count % 2) != 0">tr_odd</s:if> <s:else>tr</s:else>"-->
						<tr>
							<s:url action="store" id="store">
								<s:param name="maGianHang" value="maGianHang"></s:param>
							</s:url>
							<td class="col_1"><div class="No">
									<s:property value="#status.count" />
								</div>
							</td>
							<td class="col_2">
								<div class="picture_small">
									<s:if test="logo != null">
										<a href="${store }" class="tooltip"><img src="${logo }"
											width="80" height="60" alt=""> </a>
									</s:if>
									<s:else>
										<a href="${store }" class="tooltip"><img src="images/no_photo_x_small.gif"
											width="80" height="60" alt=""> </a>
									</s:else>
								</div></td>
							<td class="col_3">
								<div class="company_name">
									<a href="${store }" class="text_link" target="_blank"><s:property
											value="tenGianHang" /> </a>
								</div>
								<div class="address">
									<s:property value="diaChi" />
									<b>(<s:property value="tinhThanhPho.tenTinhThanhPho" />)</b>
								</div>
								<div class="clear"></div>
							</td>
							<td class="col_4">
								<div class="phone">

									<script type="text/javascript"
										src="http://download.skype.com/share/skypebuttons/js/skypeCheck.js"></script>
									<a href="skype:<s:property value="dienThoai" />?call"><img
										src="http://download.skype.com/share/skypebuttons/buttons/call_blue_white_124x52.png"
										style="border: none;" width="124" height="52" alt="Skype Me™!" />
									</a>

								</div>
								<div class="fax">
									Fax:
									<s:property value="fax" />
								</div>
								<div class="yahoo">
									<a href="ymsgr:sendim?<s:property value="yahoo"/>"
										title="Hỗ trợ trực tuyến"> <img
										src="http://opi.yahoo.com/online?u=<s:property value="yahoo"/>&m=g&t=1">
									</a>
								</div>
							</td>
						</tr>

					</s:iterator>
				</tbody>
			</table>
			<br>
		</s:form>
	</div>
	<!-- Phan trang -->
	<div id="pagination">
		<s:if test="tongSoTrang > 1">
			<s:url id="prev" action="GianHang_danhSach">
				<s:param name="trang" value="trang - 1"></s:param>
			</s:url>
			<s:if test="trang > 1">
				<a href="${prev }" class="pn next">&lt;&lt;Trước</a>
			</s:if>
			<s:iterator value="soTrang" status="stat">
				<s:url id="danhSach" action="GianHang_danhSach">
					<s:param name="trang" value="%{#stat.count}"></s:param>
				</s:url>
				<s:if test="trang == #stat.count">
					<span><s:property /> </span>
				</s:if>
				<s:else>
					<a href="${danhSach }"> <s:property /> </a>
				</s:else>
			</s:iterator>
			<s:url id="next" action="GianHang_danhSach">
				<s:param name="trang" value="trang + 1"></s:param>
			</s:url>

			<s:if test="trang < tongSoTrang">
				<a href="${next }" class="pn next">Sau »</a>
			</s:if>
		</s:if>
	</div>
</s:if>
<s:else>
	<s:label>Không có cửa hàng nào!</s:label>
</s:else>
</div>