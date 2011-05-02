<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0" prefix="jcaptcha" %>

   	<div class="center_title_bar">Gửi tin nhắn</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<sj:div>
		<s:form>
		<s:textfield name="dsNguoiNhan" label="Danh sách người nhận" />
		<s:textfield name="tieuDe" label="Tiêu đề"/>
		<sj:textarea name="noiDung" label="Nội dung"></sj:textarea>
		<jcaptcha:image height="50" width="300" label="Mã an toàn (*):"/>
		<s:submit value="Gửi"></s:submit>
		<s:reset value="Làm lại"></s:reset>
		</s:form>
	</sj:div>	
 	</div>
	<div class="bottom_prod_box_big"></div>
	</div>
