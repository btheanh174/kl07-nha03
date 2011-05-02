
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0" prefix="jcaptcha" %>

   	<div class="center_title_bar">Đổi mật khẩu</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<sj:div>
		<s:form action="Profile_doiMatKhau" method="post" validate="true">
			<s:actionerror/>
			<s:hidden name="maTaiKhoan" value="maTaiKhoan"></s:hidden>
			<s:password label="Mật khẩu cũ" name="matKhauCu" />
			<s:password label="Mật khẩu mới" name="matKhauMoi" />
			<s:password label="Xác nhận mật khẩu" name="xacNhanMatKhau" />
			<%-- <jcaptcha:image height="50" width="300" label="Mã an toàn (*):"/> --%>
			
			<s:submit value="Cập nhật"/>
			
		</s:form>
	</sj:div>
	</div>
	<div class="bottom_prod_box_big"></div>
	</div>
    