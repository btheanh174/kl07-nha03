<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div class="center_title_bar">Tìm kiếm nâng cao</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<label></label>
		<sj:select name="loaiTimKiem" headerKey="-1" headerValue="Chọn loại tìm kiếm" list="#{'0':'Tìm nhanh','1':'Tìm điện thoại','2':'Tìm laptop'}"></sj:select>
		<s:if test="loaiTimKiem == 0">Tim nhanh</s:if>
		<s:elseif test="loaiTimKiem == 1">Tim dien thoai</s:elseif>
		<s:else>Tim laptop</s:else>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>