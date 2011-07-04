<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<sj:head jqueryui="true" jquerytheme="redmond" />
</head>
<body>

<sj:div>
	<sj:tabbedpanel id="laptop" animate="true" collapsible="true"
		selectedTab="0">
		<sj:tab id="tabThongSoChung" target="two" label="Thông số kỹ thuật"></sj:tab>
		<sj:tab id="tabHinhAnh" target="three" label="Hình ảnh"></sj:tab>


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
</body>
</html>
