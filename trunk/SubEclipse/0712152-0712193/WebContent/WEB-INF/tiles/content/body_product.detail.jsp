<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<sj:head />


<div id="content">

<div class="block_title"><span> <s:property value="tenSanPham"/> </span></div>
<div class="break_line"></div>


<div class="product_info">

	<div class="product_detail">
		<div class="fl">
		<div class="picture_fullsize">
		<div class="picture">
		<a href="#" title=""><img
			src="${hinhAnh}" alt="" title="" border="0"/>
		</a>
		</div>
			<div class="picture_thumbnail_list">
				<table class="picture_thumbnail" cellspacing="3" cellpadding="0"
					align="center">
					<tbody>
						<tr>
							<s:iterator value="dsHinhAnh">
							<td><a><img alt="" 
							src='<s:property value="urlHinhAnh"/>'> </a>
							</td>
							</s:iterator>
						</tr>
					</tbody>
				</table>
			<div class="clear">
			</div>
		</div>
		</div>
		</div>
		
		<div class="fr">
		<div class="information">
		Giá bán thấp nhất: <strong><span class="price"><s:property value="giaText"/></span></strong> VNĐ
		<div class="break_module"></div>
		<div class="break_line"></div>
		Thông số khác
		<div class="break_module"></div>
		<div class="break_line"></div>
		</div>
		</div>
		<div class="clear"></div>
	</div>
<div class="break_module"></div>

<!-- Phan hien thi cac tab ve thong so ky thuat va danh sach gian hang -->

<div style="clear: both;">

<sj:div>
	<sj:tabbedpanel id="laptop" animate="true" collapsible="true"
		selectedTab="0">

		<sj:tab id="tabThongSo" target="one" label="Thông số kỹ thuật"></sj:tab>
		<sj:tab id="tabSanPhamLienQuan" target="two"
			label="Các sản phẩm liên quan"></sj:tab>
		<sj:tab id="tabGianHangBanSanPham" target="three"
			label="Gian hàng bán sản phẩm"></sj:tab>
		<sj:tab id="tabHinhAnh" target="four" label="Hình ảnh"></sj:tab>

		<div id="one">
		
			<s:if test="loaiSanPham.equals('DIENTHOAI')">
	       	<s:include value="/WEB-INF/tiles/content/table_mobile.jsp"></s:include>
	       	</s:if>
	       	<s:else>
	       	<s:include value="/WEB-INF/tiles/content/table_laptop.jsp">
	       	</s:include>
	       	</s:else>
			
		</div>
		<div id="two"><s:iterator value="dsSanPhamCungLoai">
			<s:url action="SanPham_chiTiet" var="productDetail">
				<s:param name="maSanPham" value="maSanPham"></s:param>
			</s:url>

			<div class="prod_box">
			<div class="top_prod_box"></div>
			<div class="center_prod_box">
			<div class="product_title"><a href="${productDetail}"><s:property
				value="tenSanPham" /> </a></div>


			 Noi dung se duoc hien thi trong tooltip 
			<div id="mystickytooltip" class="stickytooltip">
			<div id="${maSanPham }" style="width: 200px;"><s:property
				value="toShortString()" /> <img alt="" src="${hinhAnh}"
				class="hinhtooltip"> <s:property value="toLongString()" /></div>
			</div>
			  

			<div class="product_img"><a href="${productDetail}"
				data-tooltip="${maSanPham }"> <img src="${hinhAnh}" alt=""
				title="" border="0" class="danhsach" /> </a></div>

			<div class="prod_price"><span class="reduce"></span> <span
				class="price"><s:property value="giaText" /> VNĐ</span></div>
			</div>
			<div class="bottom_prod_box"></div>
			<div class="prod_details_tab"><a href="#"
				title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
				src="images/cart.gif" alt="" title="" border="0" class="left_bt" />
			</a><a href="${productDetail}" class="prod_details">Chi tiết</a></div>
			</div>
		</s:iterator></div>
		<div id="three">
		<div><s:form>
			<table class="shop_table" cellpadding="0" cellspacing="0">
				<tbody>
					<tr class="tr text_title">
						<td class="col_1" align="center"><b></b></td>
						<td class="col_2" align="center"><b>Logo</b></td>
						<td class="col_3" align="center"><b>Thông tin cửa hàng</b></td>
						<td class="col_4" align="center"><b>Liên hệ</b></td>
					</tr>
					<s:iterator value="dsGianHangSanPham" status="status">
						<tr class="tr">
							<s:url action="store" id="store">
								<s:param name="maGianHang" value="getGianHang().maGianHang"></s:param>
							</s:url>
							<td class="col_1">
							<div class="No"><s:property value="#status.count" /></div>
							</td>
							<td class="col_2">
							<div class="picture_small"><a href="${store }"
								class="tooltip"><img
								src="<s:property value="getGianHang().logo"/>" width="80"
								height="60" alt=""> </a></div>
							</td>
							<td class="col_3">
							<div class="company_name"><a href="${store }"
								class="text_link" target="_blank"><s:property
								value="getGianHang().tenGianHang" /> </a></div>
							<div class="address"><s:property
								value="getGianHang().diaChi" /> <b>(<s:property
								value="getGianHang().tinhThanhPho.tenTinhThanhPho" />)</b></div>
							<div class="clear"></div>
							</td>
							<td class="col_4">
							<div class="phone"><script type="text/javascript"
								src="http://download.skype.com/share/skypebuttons/js/skypeCheck.js"></script>
							<a
								href="skype:<s:property value="getGianHang().dienThoai" />?call">
							<img
								src="http://download.skype.com/share/skypebuttons/buttons/call_blue_white_124x52.png"
								style="border: none;" width="124" height="52" alt="Skype Me™!" />
							</a></div>
							<div class="fax">Fax: <s:property value="getGianHang().fax" />
							</div>
							<div class="yahoo"><a
								href="ymsgr:sendim?<s:property value="getGianHang().yahoo"/>"
								title="Hỗ trợ trực tuyến"> <img
								src="http://opi.yahoo.com/online?u=<s:property value="getGianHang().yahoo"/>&m=g&t=1">
							</a></div>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<br>
		</s:form></div>
		</div>
		<div id="four">
			<table width="100%">
				<tbody>
				<s:iterator value="dsHinhAnh">
				<tr align="center">
				<td>
				<img alt="" src="${urlHinhAnh}">
				</td>
				</tr>
				</s:iterator>
				</tbody>
			</table>
		</div>
	</sj:tabbedpanel>
</sj:div>

</div>
</div>

</div>