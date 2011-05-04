<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0"
	prefix="jcaptcha"%>

<sj:head/>

<div class="center_title_bar">Thông tin cá nhân</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">

		<s:div>
			<s:form action="Profile_capNhatThongTin" method="post"
				validate="true">

				<s:hidden name="maTaiKhoan" value="maTaiKhoan"></s:hidden>
				<s:file label="Logo/Avatar" name="file" value="" />
				<s:textfield label="Họ tên" name="hoTen"
					value="%{#session['tk'].thanhVien.hoTen}" />
				<s:textfield label="Email" name="email"
					value="%{#session['tk'].thanhVien.email}" />
				<sj:datepicker showAnim="slideDown" displayFormat="dd/mm/yy"
					label="Ngày sinh" value="%{#session['tk'].ngaySinh}"></sj:datepicker>
				<s:textfield label="Địa chỉ" name="diaChi"
					value="%{#session['tk'].thanhVien.diaChi}" />
					
				<s:textfield label="Điện thoại" name="dienThoai"
					value="%{#session['tk'].thanhVien.dienThoai}" />
					
				<s:textfield label="Website" name="website"
					value="%{#session['tk'].thanhVien.website}" />
				<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
				<sj:autocompleter label="Tỉnh/thành phố" name="tinhThanhPho"
					list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
					listValue="tenTinhThanhPho"
					value="%{#session['tk'].thanhVien.tinhThanhPho.maTinhThanhPho}"></sj:autocompleter>

				<sj:select name="gioiTinh" list="{'Nam', 'Nữ'}" label="Giới tính" autocomplete="true"></sj:select>
				
				<jcaptcha:image height="50" width="300" label="Mã an toàn" />
				<s:submit value="Cập nhật"></s:submit>

			</s:form>
		</s:div>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>