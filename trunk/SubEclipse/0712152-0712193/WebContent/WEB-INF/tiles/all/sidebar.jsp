<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>


<%

int soLuotTruyCap = 1;

String globalcounter = "TongSoLuotTruyCap_" + request.getAttribute("maGianHang");

if(application.getAttribute(globalcounter) != null){
	soLuotTruyCap = (Integer)application.getAttribute(globalcounter);
	soLuotTruyCap++;
}
	application.setAttribute(globalcounter, soLuotTruyCap);

%>

<!-- danh muc -->
<div id="sidebar" class="widget1 section">
	<div id="Search" class="widget">
		<h2>Tìm kiếm sản phẩm</h2>
		<div class="widget-content">
		<div id="search_section">
			<s:form action="store" method="get">
				<s:hidden name="maGianHang" value="%{maGianHang}"></s:hidden>
				<s:hidden name="module" value="search"></s:hidden>
				<s:select name="loai"
					tooltip="Chọn loại sản phẩm cần tìm"
					list="#{'':'Tất cả','DIENTHOAI':'Điện thoại', 'LAPTOP':'Laptop'}"
					label="Loại sản phẩm" labelposition="top"></s:select>
				<s:textfield name="ten"
					tooltip="Nhập tên sản phẩm cần tìm" label="Tên sản phẩm"
					labelposition="top"></s:textfield>
				<s:textfield name="min" label="Giá từ"
					labelposition="top"></s:textfield>
				<s:textfield name="max" label="Đến" labelposition="top"></s:textfield>
				<s:submit value="Tìm kiếm"></s:submit>
			</s:form>
</div>
		</div>
	</div>
	<div id="categories" class="widget">
		<h2>Danh mục</h2>
		<div class="widget-content">
			<ul>
				<%-- <li><a href="#">Tất cả</a>
				<s:iterator id="root" value="dsDanhMuc">
					<s:url id="danhsach" action="store">
						<s:param name="maGianHang" value="maGianHang"></s:param>
						<s:param name="maDanhMuc" value="maDanhMuc"></s:param>
					</s:url>
					<li><a href="${danhsach }"><s:property value="tenDanhMuc" />
					</a></li>
				</s:iterator> --%>
					
					<s:iterator value="dsDanhMucGianHang">
						<li><a href="#"> <s:property value="danhMuc.tenDanhMuc"/> </a></li>
					</s:iterator>
				
			</ul>
			<div class="clear"></div>
		</div>
	</div>
	<!-- end danh muc -->
	<!-- Thong tin store -->
	<div id="information" class="widget Subscribe">
		<div style="white-space: nowrap">
			<h2 class="title">Thông tin</h2>

			<div class="widget-content">
				<br> <b>Tên cửa hàng:</b>
				<s:property value="tenGianHang" />
				<br>
				<div class="siteLogo">
					<s:if test="logo != null">
						<img class="logo" alt="" src="<s:property value="logo"/>">
					</s:if>
					<s:else>
						<img width="200" height="150" alt=""
							src="images/no_photo_x_small.gif">
					</s:else>

				</div>
				<br>
				<div class="siteInfo">
					<table>
						<tbody>
							<tr>
								<td><b>Chủ cửa hàng:</b></td>
								<td><s:property value="taiKhoan.tenTruyCap" /></td>
							</tr>
							<tr>
								<td><b>Vùng:</b></td>
								<td><s:property value="tinhThanhPho.tenTinhThanhPho" />
								</td>
							</tr>
							<!--<tr><td><b>Địa chỉ:</b></td>
							<td><s:property value="diaChi" /></td></tr>
							-->
							<tr>
								<td><b>Điện thoại:</b></td>
								<td><s:property value="dienThoai" /></td>
							</tr>
							<tr>
								<td><b>Lượt truy cập:</b></td>
								<td> <%=soLuotTruyCap%> </td>
							</tr>
							<tr>
								<td><b>Tham gia:</b></td>
								<td><s:property value="ngayThamGia" /></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
