<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="jcaptcha"
	uri="/WEB-INF/lib/jcaptcha4struts2-2.0.2.jar"%>
<s:hidden name="maTaiKhoan" value="7"></s:hidden>
<div>

	<sj:tabbedpanel id="panelProfile" animate="true" collapsible="true">
		<sj:tab id="tab1" target="div1" label="Thông tin cơ bản"></sj:tab>
		<sj:tab id="tab2" target="div2" label="Thay đổi mật khẩu"></sj:tab>
		<sj:tab id="tab3" target="div3" label="Thay đổi địa chỉ email"></sj:tab>

		<div id="div1">
			<s:form action="Profile_capNhatThongTin" method="post"
				validate="true">
				<s:hidden name="maTaiKhoan" value="%{top.maTaiKhoan}"></s:hidden>
				<s:file label="Logo/Avatar" name="file" value="" />
				<s:textfield label="Họ tên" name="hoTen"
					value="%{#session['tk'].thanhVien.hoTen}" />
				<s:textfield label="Email" name="email"
					value="%{#session['tk'].thanhVien.email}" />
				<sj:datepicker name="ns" showAnim="slideDown" displayFormat="dd/mm/yy"
					label="Ngày sinh" value="%{#session['tk'].thanhVien.ngaySinh}"></sj:datepicker>
				
				<s:textfield label="Địa chỉ" name="diaChi"
					value="%{#session['tk'].thanhVien.diaChi}" />

				<s:textfield label="Điện thoại" name="dienThoai"
					value="%{#session['tk'].thanhVien.dienThoai}" />

				<s:textfield label="Website" name="website"
					value="%{#session['tk'].thanhVien.website}" />
				<s:bean name="com.estore.shop.action.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
				<sj:autocompleter label="Tỉnh/thành phố" name="maTTP"
					list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
					listValue="tenTinhThanhPho"
					value="%{#session['tk'].thanhVien.tinhThanhPho.maTinhThanhPho}"></sj:autocompleter>

				<s:select list="{'Nam', 'Nữ'}" label="Giới tính" name="gioiTinh"></s:select>

				<!--<jcaptcha:image height="50" width="300" label="Mã an toàn" />
				-->
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

