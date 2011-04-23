<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:hidden name="maTaiKhoan" value="7"></s:hidden>
<div>
Mã tài khoản: <s:property value="#session['tk'].maTaiKhoan"/><br>
Tên truy cập: <s:property value="#session['tk'].tenTruyCap"/><br>
Mật khẩu: <s:property value="#session['tk'].matKhau"/>
</div>