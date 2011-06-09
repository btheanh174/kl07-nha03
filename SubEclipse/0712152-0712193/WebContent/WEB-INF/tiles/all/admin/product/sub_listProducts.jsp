<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<s:updownselect 
id="idUpDownList"
list="dsSanPham"
listKey="maSanPham" listValue="tenSanPham"
name="favSanPham"
headerKey="-1"
headerValue="--- Chọn một loại sản phẩm ---"
emptyOption="true" size="20"
allowSelectAll="false"
allowMoveDown="false"
allowMoveUp="false"
tooltip ="true" 
onchange="chonSanPham()"/>
