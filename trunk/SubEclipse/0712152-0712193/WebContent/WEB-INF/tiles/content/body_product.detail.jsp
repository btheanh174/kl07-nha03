<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<script type="text/javascript">
$(document).ready(function(){
	
	var tabs = $("#detailtabs").tabs();
	$('.anchorclass').click(function(){
		$tabs.tabs('select',2);
		return false;
	}
	);
	
}
);
</script>
<sj:head />

<%
String context = request.getContextPath();
%>

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
		<s:if test="loaiSanPham.equals('DIENTHOAI')">
		
			<ul>
			<li>Hãng sản xuất: <b> <s:property value="hangSanXuat"/> </b></li>
			<li>Kiểu dáng: <b> <s:property value="kieuDang"/> </b></li>
			<li>Kích thước màn hình: <b> <s:property value="kichThuocManHinh" /> </b></li>
			<li>Độ phân giải: <b> <s:property value="doPhanGiai" /> </b></li>
			<li>Bộ nhớ trong: <b> <s:property value="boNhoTrong" /> </b></li>
			<li>Trọng lượng: <b> <s:property value="trongLuong"/> </b></li>
			<li>Camera: <b><s:property value="camera"/> </b>
			<li>Thời gian chờ: <b> <s:property value="thoiGianCho"/> </b>
			<li>Thời gian đàm thoại: <b> <s:property value="thoiGianDamThoai"/> </b>
			</ul>
			
		</s:if>
		<s:else>
			<ul>
			<li>Hãng sản xuất: <b> <s:property value="hangSanXuat"/> </b></li>
			<li>Kích thước màn hình: <b> <s:property value="kichThuocManHinh" /> </b></li>
			<li>Dung lượng HDD: <b> <s:property value="hdd" /> </b></li>
			<li>Loại CPU: <b> <s:property value="cpu" /> </b></li>
			<li>RAM: <b><s:property value="ram"/> </b>
			<li>Battery: <b> <s:property value="pin"/> </b>
			<li>Trọng lượng: <b> <s:property value="trongLuong"/> </b></li>
			</ul>
		</s:else>
		<div style="text-align: right"> <a href="#" class="anchorclass" 
		>Xem chi tiết</a> </div>
		<div class="break_module"></div>
		<div class="break_line"></div>
		</div>
		</div>
		<div class="clear"></div>
	</div>
<div class="break_module"></div>

<!-- Phan hien thi cac tab ve thong so ky thuat va danh sach gian hang -->

<div style="clear: both;">

<ul class="tabs">
    <li><a href="#tab1">So sánh giá</a></li>
    <li><a href="#tab2">Thông số kỹ thuật</a></li>
    <li><a href="#tab3">Sản phẩm cùng loại</a></li>
    <li><a href="#tab4">Hình ảnh</a></li>
</ul>

<div id="detailtabs" class="tab_container">
    <div id="tab1" class="tab_content">
        <!--Content-->
        <s:if test="sanPham.dsGianHangSanPham.size() < 1">
        	Chưa có gian hàng nào bán sản phẩm này.
        </s:if>
        <s:else>
        <s:form>
			<table class="shop_table" cellpadding="0" cellspacing="0">
				<tbody>
					<tr class="tr text_title">
						<td class="col_1" align="center"><b></b></td>
						<td class="col_2">Giá</td>
						<td class="col_3">Tình trạng</td>
						<td class="col_4">Bảo hành</td>
						<td class="col_5" align="center"><b>Logo</b></td>
						<td class="col_6" align="center"><b>Thông tin cửa hàng</b></td>
						<td class="col_7" align="center"><b>Liên hệ</b></td>
					</tr>
					<s:iterator value="dsGianHangSanPham" status="status">
						<tr class="tr">
							<s:url action="store" id="store">
								<s:param name="maGianHang" value="getGianHang().maGianHang"></s:param>
								<s:param name="maSanPham" value="getSanPham().maSanPham"></s:param>
							</s:url>
							<td class="col_1">
							<div class="No"><s:property value="#status.count" /></div>
							</td>
							<td class="col_2">
							<div ><span class="price"><s:property value="giaRieng" /></span> VNĐ</div>
							</td>
							<td class="col_3">
							<div class="status"><s:property value="tinhTrang" /></div>
							</td>
							<td class="col_4">
							<div class="warranty"><s:property value="baoHanh" /> Tháng</div>
							</td>
							<td class="col_5">
							<div class="picture_small"><a href="${store }"
								class="tooltip"><img
								src='<%=context %><s:property value="%{gianHang.logo}"/>' width="80"
								height="60" alt=""> </a></div>
							</td>
							<td class="col_6">
							<div class="company_name"><a href="${store }"
								class="text_link" target="_blank"><s:property
								value="getGianHang().tenGianHang" /> </a></div>
							<div class="address"><s:property
								value="getGianHang().diaChi" /> <b>(<s:property
								value="getGianHang().tinhThanhPho.tenTinhThanhPho" />)</b></div>
							<div class="detail"><a target="_blank" href="${store }">Xem chi tiết</a></div>
							<div class="clear"></div>
							</td>
							<td class="col_7">
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
		</s:form>
		</s:else>
    </div>
    <div id="tab2" class="tab_content">
       <!--Content-->
       <s:if test="loaiSanPham.equals('DIENTHOAI')">
	       	<s:include value="/WEB-INF/tiles/content/table_mobile.jsp"></s:include>
	       	</s:if>
	       	<s:else>
	       	<s:include value="/WEB-INF/tiles/content/table_laptop.jsp">
	       	</s:include>
	       	</s:else>
    </div>
    <div id="tab3" class="tab_content">
       <!--Content-->
       <s:iterator value="dsSanPhamCungLoai" status="statusSanPham">
	
			<s:url action="SanPham_chiTiet" var="productDetail">
				<s:param name="maSanPham" value="maSanPham"></s:param>
			</s:url>
	
			<div class="product_box jTip">
				<div class="product_image">
					<div class="product_image_holder">
						<a class="jTip" rel="" href="${productDetail }"> <img
							id="block_tip_1" alt="Điện thoại di động Apple iPhone 3GS"
							src="${hinhAnh }"> </a>
					</div>
				</div>
				<div class="product_seller">
					<b><s:property value="dsGianHangSanPham.size()"/></b> gian hàng bán
				</div>
				<div class="product_seller">
					 <!-- Lay gia thap nhat trong tat ca cac gian hang --> 
					Giá: <b><s:property value="giaText"/> VNĐ</b>
				</div>
				<div class="product_name">
					<a title='<s:property value="tenSanPham"/>' href="${productDetail }">
						<s:property value="tenSanPham" /> </a>
				</div>
			</div>
			</s:iterator>
    </div>
    <div id="tab4" class="tab_content">
       <!--Content-->
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
</div>
</div>
</div>
</div>