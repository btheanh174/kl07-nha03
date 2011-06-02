<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<div class="top_bar">
	<s:form method="get" action="SanPham_timNhanh">
		<s:hidden name="tieuChi.loaiSanPham" value=""></s:hidden>
		<s:hidden name="tieuChi.giaDuoi" value=""></s:hidden>
		<s:hidden name="tieuChi.giaTren" value=""></s:hidden>
		<div class="top_search">
		<div class="search_text">
			
			<%-- <s:a action="show3_admin_product_advancedsearch">Tìm kiếm nâng cao</s:a> --%>
		</div>
			<input type="text" value="<s:property value="tieuChi.tenSanPham"/>" class="search_input" name="tieuChi.tenSanPham" /> 
			<input type="image" src="images/search.gif" class="search_bt" />
		</div>
	</s:form>
	</div>

<div id="header">

<div id="logo"><a href="#"></a> Logo &#7903; &#273;&acirc;y</div>

</div>