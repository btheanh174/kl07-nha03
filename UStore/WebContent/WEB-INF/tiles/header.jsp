<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="header_nav">
<div id="logo" class="logo"></div>

<ul class="topnav">
	<li id="current"><a href="#"><span>Trang chủ</span></a></li>
	<li><a href="#"><span>Sản phẩm</span></a></li>
	<li><a href="#"><span>Rao vặt</span></a></li>
	<li><a href="#"><span>Gian hàng</span></a></li>
	<li><a href="#"><span>Liên hệ</span></a></li>
</ul>
</div>
<div id="header_sub">
<ul class="login">
	<li title="Quên mật khẩu?" id="forgot"><img
		src="images/unlock.png" /> Quên mật khẩu?</li>
	<li title="Đăng nhập" id="login"><img src="images/key.png" />
	<s:a action="User_login">Đăng nhập!</s:a></li>
	
	<li title="Đăng ký!" id="register"><img src="images/register.png" />
	<s:a action="User_register">Đăng ký!</s:a></li>
</ul>
</div>
<div class="banner">Đây là banner</div>