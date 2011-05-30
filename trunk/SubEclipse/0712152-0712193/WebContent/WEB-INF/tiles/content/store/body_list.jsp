<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!-- Danh sách theo 3 loại: Nổi bật (body_top_products.jsp), Tất cả (body_all_products.jsp)
	và Danh sách cửa hàng với danh mục đang đc chọn (body_cat_stores.jsp)
 -->

<sj:tabbedpanel id="panelDanhSach">
	<sj:tab id="tabTop" label="Nổi bật nhất" target="top"></sj:tab>
	<sj:tab id="tabAll" label="Toàn bộ" target="all"></sj:tab>
	<sj:tab id="tabStores" label="Danh sách cửa hàng" target="stores"></sj:tab>

	<div id="top">
		<s:include value="/WEB-INF/tiles/content/store/body_top_products.jsp"></s:include>
	</div>
	<div id="all">
		<s:include value="/WEB-INF/tiles/content/store/body_all_products.jsp"></s:include>
	</div>
	<div id="stores">
		<s:include value="/WEB-INF/tiles/content/store/body_cat_stores.jsp"></s:include>
	</div>
</sj:tabbedpanel>
