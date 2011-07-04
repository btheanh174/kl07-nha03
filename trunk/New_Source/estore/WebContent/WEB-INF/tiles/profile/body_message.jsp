<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0"
	prefix="jcaptcha"%>
<sj:div>
	<sj:tabbedpanel id="panelMessage" animate="true" collapsible="true">
		<sj:tab id="tab1" target="div1" label="Gửi tin nhắn"></sj:tab>
		<sj:tab id="tab2" target="div2" label="Tin chưa đọc"></sj:tab>
		<sj:tab id="tab3" target="div3" label="Tin nhắn hệ thống"></sj:tab>
		<sj:tab id="tab4" target="div4" label="Tin rác"></sj:tab>

		<div id="div1">
			<s:form>
				<s:textfield name="dsNguoiNhan" label="Danh sách người nhận" />
				<s:textfield name="tieuDe" label="Tiêu đề" />
				<sj:textarea name="noiDung" label="Nội dung"></sj:textarea>
				<jcaptcha:image height="50" width="300" label="Mã an toàn (*):" />
				<s:submit value="Gửi"></s:submit>
				<s:reset value="Làm lại"></s:reset>
			</s:form>
		</div>
		<div id="div2">Tin nhắn chưa đọc</div>
		<div id="div3">Tin nhắn hệ thống</div>
		<div id="div4">Tin rác</div>
	</sj:tabbedpanel>
</sj:div>
