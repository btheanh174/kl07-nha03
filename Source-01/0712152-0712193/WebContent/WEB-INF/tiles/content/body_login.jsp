<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<div class="center_title_bar">Đăng nhập</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<s:form method="post" action="User_login" validate="true">
			<s:actionerror/>
		    <s:textfield name="tenTruyCap" label="Tên truy cập"></s:textfield>
		    <s:password name="matKhau" label="Mật khẩu"></s:password>
		    <s:checkbox name="nhoMatKhau" label="Nhớ mật khẩu"></s:checkbox>
	        <s:submit value="Đăng nhập"></s:submit>
		  <%-- <a href="<s:url action="show_user_register"/>">đăng ký</a> ngay.<br />
		    Nếu quên mật khẩu. Hãy click <a href="#">vào đây</a>. --%>
	</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
    