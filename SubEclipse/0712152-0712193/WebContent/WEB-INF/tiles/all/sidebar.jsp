<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="sidebar">
	<!-- shopping cart -->
	<div class="widget cart_section">
		<div class="cart_section_bottom clearfix">
			<h2>Đăng nhập</h2>
			<div class="clear"></div>
			<div class="login">
				<s:url var="register" action="User_register"></s:url>
				<s:url var="login" action="User_login"></s:url>
				<form onsubmit="check_form_login(); return false;" method="post"
					action="%{login}" name="form_login">
					<br>
					<div class="name">
						<span lang="vi">Tên đăng nhập</span>
					</div>
					<div class="control">
						<input type="text" name="loginname" class="form_control">
					</div>
					<div class="name">
						<span lang="vi">Mật khẩu</span>
					</div>
					<div class="control">
						<input type="password" name="password" class="form_control">
					</div>
					<div class="button">
						<input type="submit" value="Đăng nhập" class="form_button">
					</div>
					<div class="link">

						<a lang="vi" href="%{register}">Đăng ký</a>&nbsp; | &nbsp;<a
							lang="vi" href="">Quên mật khẩu</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- end shopping cart -->

	<!-- danh muc -->
	<div id="sidebar" class="widget1 section">
		<div id="LinkList1" class="widget LinkList">
			<h2>Danh mục</h2>
			<div class="widget-content">
				<ul>
					<s:iterator id="root" value="dsDanhMuc">
						<li><a href=""><s:property value="tenDanhMuc"/></a></li>
					</s:iterator>
				</ul>
				<div class="clear"></div>
			</div>
		</div>
		<!-- end danh muc -->
		<!-- Thong tin store -->
		<div id="Subscribe1" class="widget Subscribe">
			<div style="white-space: nowrap">
				<h2 class="title">Thông tin</h2>

				<div class="widget-content">
					<br> <b>Tên cửa hàng:</b>
					<s:property value="tenGianHang" />
					<br>
					<div class="siteLogo">
						<img width="200" height="150" alt=""
							src="<s:property value="logo"/>">
					</div>
					<br>
					<div class="siteInfo">
						<b>Chủ cửa hàng:</b>
						<s:property value="taiKhoan.tenTruyCap" />
						<br> <b>Vùng:</b>
						<s:property value="tinhThanhPho.tenTinhThanhPho" />
						<br> <b>Địa chỉ:</b>
						<s:property value="diaChi" />
						<br> <b>Điện thoại:</b>
						<s:property value="dienThoai" />
					</div>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</div>