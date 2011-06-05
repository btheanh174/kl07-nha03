<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="title_box">Thông tin cá nhân</div>
<ul class="left_menu">
	<li class="even"><a href="<s:url action="show_myprofile_account"/>">Tổng quan tài khoản</a></li>
	<li class="even"><a href="<s:url action="Profile_hienThi"/>">Thông tin
			cá nhân</a></li>
	<li class="even"><a href="">Nạp tiền vào tài khoản</a></li>
	<li class="even"><a href="<s:url action="show_myprofile_message"/>">Tin nhắn</a></li>
	<li class="even"><a href="<s:url action="Profile_xemHoaDon"/>">Hóa đơn giao dịch</a></li>
</ul>

<s:if test="#session['nhomNguoiDung'] == 2">
	<div class="title_box">Dành cho người bán</div>
	<ul class="left_menu">
		<li class="even"><a href="<s:url action="Store_hienThi"/>">Quản lý cửa hàng</a></li>
		<li class="even"><a href="">Quản lý sản phẩm</a></li>
		<li class="even"><a href="">Quản lý danh mục</a></li>
		<li class="even"><a href="">Quản lý đơn hàng</a></li>
	</ul>

</s:if>

<div class="title_box">Quản lý rao vặt</div>
<ul class="left_menu">
	<li class="even"><a href="<s:url action=""/>">Đăng tin rao vặt</a>
	</li>
	<li class="even"><a href="">Danh sách tin rao vặt</a></li>
	<li class="even"><a href="">Danh sách tin rao vặt đã hết hạn</a></li>
</ul>
