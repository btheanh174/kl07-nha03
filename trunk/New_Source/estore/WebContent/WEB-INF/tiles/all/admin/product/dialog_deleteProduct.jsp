<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



	<s:hidden name="echo" value="%{echo}"></s:hidden>
	Bạn có chắc xóa sản phẩm
	<br/>
	<div style="color:FF0000; font-size:15px;" "><s:property value="ghSanPham.getSanPham().tenSanPham" /></div>

