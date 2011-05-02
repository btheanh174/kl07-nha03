<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


    <div class="title_box">Thông tin cá nhân</div>
        <ul class="left_menu">
        <li class="even"><a href="<s:url action="Profile_hienThi"/>">Sửa thông tin</a></li>
        <li class="even"><a href="<s:url action="show_myprofile_password"/>">Đổi mật khẩu</a></li>
		<li class="even"><a href="password_change.html">Nạp tiền vào tài khoản</a></li>
		<li class="even"><a href="password_change.html">Nâng cấp lên gian hàng</a></li>
        </ul> 

     <div class="title_box">Quản lý rao vặt</div>
        <ul class="left_menu">
        <li class="even"><a href="<s:url action=""/>">Đăng tin rao vặt</a></li>
        <li class="even"><a href="password_change.html">Danh sách tin rao vặt</a></li>
        <li class="even"><a href="password_change.html">Danh sách tin rao vặt đã hết hạn</a></li>
		</ul>
        
     <div class="title_box">Tin nhắn cá nhân</div>  
        <ul class="left_menu">
        <li class="odd"><a href="<s:url action="show_myprofile_newmessage"/>">Gửi tin nhắn</a></li>
        <li class="odd"><a href="password_change.html">Danh sách tin đã gửi</a></li>
        <li class="odd"><a href="password_change.html">Danh sách tin đã nhận</a></li>
        </ul>     