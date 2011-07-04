<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>

<sj:div>
<sj:tabbedpanel id="panelTaiKhoan">
	<sj:tab id="tab1" target="div1" label="Tổng quan tài khoản"></sj:tab>
	<sj:div id="div1">
		<img src="" alt="">
		Xin chào, <s:property value="%{#session['tk'].thanhVien.hoTen}"/><a href="#">chỉnh sửa hồ sơ &gt;&gt;</a>
		<br>
		<a href="#">Xem cửa hàng</a>
	</sj:div>
</sj:tabbedpanel>
</sj:div>