<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div id="center-column">

	<div class="top-bar">
		<h1>Thêm sản phẩm</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Thêm sản phẩm</a>
		</div>
	</div>
	<br /> <br /> <br /> <br /> <br /> <br />
	<s:form action="AdminStore_Step3_themSanPham.action" method="post"
		theme="simple">
		<sj:div>
			<sj:tabbedpanel id="laptop" animate="true" collapsible="true"
				selectedTab="0">
				<sj:tab id="tabThongSoRieng" target="one" label="Thông số kỹ thuật"></sj:tab>
				<sj:tab id="tabThongSoChung" target="two" label="Thông số kỹ thuật"></sj:tab>
				<sj:tab id="tabHinhAnh" target="three" label="Hình ảnh"></sj:tab>


				<div id="one">


					<table border="1px">
						<tr>
							<td colspan="2">Thông tin riêng</td>
						</tr>
						<tr>
							<td>Giá bán:</td>
							<td><s:textfield name="ghSanPham.giaRieng" /></td>
						</tr>
						<tr>
							<td>Bảo hành:</td>
							<td><s:textfield name="ghSanPham.baoHanh" /></td>
						</tr>
						<tr>
							<td>Số lượng hiện có:</td>
							<td><s:textfield name="ghSanPham.soLuong" /></td>
						</tr>
					</table>
				</div>

				<div id="two">
					<s:if test="\"LAPTOP\".equals(sanPham.loaiSanPham)">
						<s:include
							value="/WEB-INF/tiles/all/admin/product/include_LaptopDetail.jsp"></s:include>
					</s:if>
					<s:else>
						<s:include
							value="/WEB-INF/tiles/all/admin/product/include_DienThoaiDetail.jsp"></s:include>
					</s:else>
				</div>

				<div id="three">
					<s:iterator value="sanPham.dsHinhAnh">
						<div>
							<img alt="" src="${urlHinhAnh}">
						</div>
					</s:iterator>
				</div>
			</sj:tabbedpanel>
		</sj:div>
		<br />
		<br />
		<br />
		
		<div align="center">
			<s:submit value="Đồng ý"></s:submit>
		</div>
	</s:form>
	<br /> <br /> <br /> <br /><br />
</div>