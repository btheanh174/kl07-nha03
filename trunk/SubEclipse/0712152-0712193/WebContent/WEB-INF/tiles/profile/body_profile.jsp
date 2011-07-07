<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="jcaptcha"
	uri="/WEB-INF/lib/jcaptcha4struts2-2.0.2.jar"%>
	
<%
String context = request.getContextPath();
%>

<div>

	<sj:tabbedpanel id="panelProfile" animate="true" collapsible="true">
		<sj:tab id="tab1" target="div1" label="Thông tin cơ bản"></sj:tab>
		<sj:tab id="tab2" target="div2" label="Thay đổi mật khẩu"></sj:tab>
		<sj:tab id="tab3" target="div3" label="Thay đổi địa chỉ email"></sj:tab>

		<div id="div1">
			<img alt="" src="<%=context %><s:property value="%{#session['tk'].thanhVien.hinh}"/>">
			<s:form action="Profile_capNhatThongTin" method="post" enctype="multipart/form-data">
				
				<s:file label="Logo/Avatar" name="image" />
				<s:textfield label="Họ tên" name="thanhVien.hoTen"
					value="%{#session['tk'].thanhVien.hoTen}" />
				<s:textfield label="Email" name="thanhVien.email"
					value="%{#session['tk'].thanhVien.email}" />
				<sj:datepicker name="ns" showAnim="slideDown" displayFormat="dd/mm/yy"
					label="Ngày sinh" value="%{#session['tk'].thanhVien.ngaySinh}"></sj:datepicker>
				
				<s:textfield label="Địa chỉ" name="thanhVien.diaChi"
					value="%{#session['tk'].thanhVien.diaChi}" />

				<s:textfield label="Điện thoại" name="thanhVien.dienThoai"
					value="%{#session['tk'].thanhVien.dienThoai}" />

				<s:textfield label="Website" name="thanhVien.website"
					value="%{#session['tk'].thanhVien.website}" />
				<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
				<sj:autocompleter label="Tỉnh/thành phố" name="maTTP"
					list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
					listValue="tenTinhThanhPho"
					value="%{#session['tk'].thanhVien.tinhThanhPho.maTinhThanhPho}"></sj:autocompleter>

				<s:select list="{'Nam', 'Nữ'}" label="Giới tính" name="thanhVien.gioiTinh"></s:select>

				
				<s:submit value="Cập nhật"></s:submit>

			</s:form>
		</div>
		<div id="div2">
			<s:form action="Profile_doiMatKhau" method="post" validate="true">
				<s:actionerror />
				<s:hidden name="maTaiKhoan" value="%{top.maTaiKhoan}"></s:hidden>
				<s:password label="Mật khẩu cũ" name="matKhauCu" />
				<s:password label="Mật khẩu mới" name="matKhauMoi" />
				<s:password label="Xác nhận mật khẩu" name="xacNhanMatKhau" />

				<s:submit value="Cập nhật" />
			</s:form>
		</div>
		<div id="div3">
			<s:form action="Profile_doiEmail" method="post" validate="true">
				<s:actionerror />
				<s:hidden name="maTaiKhoan" value="%{top.maTaiKhoan}"></s:hidden>
				<s:password label="Mật khẩu" name="matKhau" labelposition="left" />
				<s:textfield name="email" label="Email" labelposition="left"></s:textfield>
				<s:submit value="Cập nhật" />
			</s:form>
		</div>
	</sj:tabbedpanel>
</div>

