<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>

<div class="contact_form">

<div>
<b><s:property value="tenGianHang"/></b><br>
<b>Địa chỉ:</b> <s:property value="diaChi"/><br>
<b>Điện thoại:</b> <s:property value="dienThoai"/><br>
<b>Fax:</b> <s:property value="fax"/><br>
<b>Yahoo:</b> <s:property value="yahoo"/>
<br><br>
</div>

	<s:form>
		<s:textfield name="hoTen" label="Họ tên" labelposition="top"></s:textfield>
		<s:textfield name="hoTen" label="Email" labelposition="top"></s:textfield>
		<s:textfield name="hoTen" label="Điện thoại" labelposition="top"></s:textfield>
		<s:textfield name="hoTen" label="Công ty" labelposition="top"></s:textfield>
		
		<sjr:tinymce name="noiDung" label="Nội dung" labelposition="top"></sjr:tinymce>
		<s:submit value="Gửi"></s:submit>
	</s:form>
</div>