<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>



<div id="center-column">

	<div class="top-bar">
		<h1>Thông tin cửa hàng</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Thông tin cửa hàng</a>
		</div>
	</div>

	<br /> <br /> <br />

	<s:form action="Store_capNhat" method="post" enctype="multipart/form-data" theme="simple">
		<s:actionerror />
		<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
		<fieldset>
			<legend align="left">Thông tin người dùng: </legend>
			<table border="0" cellpadding="0" cellspacing="0" id="id-form">
				<tr>
					<th>Tên truy cập (*):</th>
					<td><s:textfield name="tenTruyCap"></s:textfield></td>
					<td></td>
				</tr>
				<tr>
					<th>Mật khẩu (*):</th>
					<td><s:password name="matKhau" value="123456"></s:password></td>
					<td></td>
				</tr>
				<tr>
					<th>Xác nhận mật khẩu (*):</th>
					<td><s:password name="xacNhanMatKhau" value="123456"></s:password>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Họ tên (*):</th>
					<td><s:textfield name="hoTen" value="Tên tuổi"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Email (*):</th>
					<td><s:textfield name="email" value="email123123123@yahoo.com"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Xác nhận email (*):</th>
					<td><s:textfield name="xacNhanEmail"
							value="email123123123@yahoo.com"></s:textfield></td>
					<td></td>
				</tr>
				<tr>
					<th>Giới tính:</th>
					<td><s:radio name="gioiTinh" list="{'Nam', 'Nữ'}"
							label="Giới tính"></s:radio></td>
					<td></td>
				</tr>
				<tr>
					<th>Tỉnh/Thành phố:</th>
					<td><s:select name="tinhThanhPho"
							list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
							listValue="tenTinhThanhPho" label="Tỉnh/Thành phố"></s:select>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Địa chỉ (*):</th>
					<td><s:textfield name="diaChi" value="123 Đường A"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Điện thoại:</th>
					<td><s:textfield name="dienThoai" value="0909123456"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Mã an toàn:</th>
					<td><jcaptcha:image height="150" width="300" /></td>
					<td></td>
				</tr>

				<tr>
					<th>Mở gian hàng:</th>
					<td align="left"><s:checkbox name="moGianHang"
							onchange="show_gianHang()" id="cbMoGianHang" /></td>
					<td></td>
				</tr>
			</table>
		</fieldset>
	</s:form>

</div>