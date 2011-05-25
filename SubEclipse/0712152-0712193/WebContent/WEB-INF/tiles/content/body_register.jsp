<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0"
	prefix="jcaptcha"%>

<sx:head debug="false" cache="false" compressed="true" />
<sj:head />
<script>
	function show_gianHang() {
		if (document.getElementById('cbMoGianHang').checked) {
			document.getElementById('resultnormal').style.display = 'block';
		} else {
			document.getElementById('resultnormal').style.display = 'none';
		}
	}
</script>



<div class="center_title_bar">Đăng ký thành viên, gian hàng</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="post" action="User_register" validate="true"
			theme="simple">
			<s:actionerror />
			<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
			<fieldset>
				<legend align="left">Thông tin người dùng: </legend>
				<table border="0" cellpadding="0" cellspacing="0" id="id-form">
					<tr>
						<th>Tên truy cập (*):</th>
						<td><s:textfield name="tenTruyCap"></s:textfield>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Mật khẩu (*):</th>
						<td><s:password name="matKhau" value="123456"></s:password>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Xác nhận mật khẩu (*):</th>
						<td><s:password name="xacNhanMatKhau" value="123456"></s:password></td>
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
						<td><s:textfield name="xacNhanEmail" value="email123123123@yahoo.com"></s:textfield>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Giới tính:</th>
						<td><s:radio name="gioiTinh" list="{'Nam', 'Nữ'}"
								label="Giới tính"></s:radio>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Tỉnh/Thành phố:</th>
						<td><s:select name="tinhThanhPho"
								list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
								listValue="tenTinhThanhPho" label="Tỉnh/Thành phố"></s:select></td>
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
						<td><jcaptcha:image height="150" width="300" />
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Mở gian hàng:</th>
						<td align="left"><s:checkbox name="moGianHang"
								onchange="show_gianHang()" id="cbMoGianHang" />
						</td>
						<td></td>
					</tr>
				</table>
			</fieldset>

			<br />
			<br />

			<s:div id="resultnormal" style="display: none">
				<fieldset>
					<legend align="left">Thông tin gian hàng: </legend>

					<table border="0" cellpadding="0" cellspacing="0" id="id-form2">
						<tr>
							<th>Tên gian hàng (*):</th>
							<td><s:textfield name="gianHang.tenGianHang" value="Cửa hàng 1"></s:textfield>
							</td>
							<td></td>
						</tr>
						<tr>
							<th>Tỉnh/Thành phố:</th>
							<td><s:select name="gianHang.tinhThanhPho"
									list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
									listValue="tenTinhThanhPho" label="Tỉnh/Thành phố"></s:select>
							</td>
							<td></td>
						</tr>
						<tr>
							<th>Địa chỉ:</th>
							<td><s:textfield name="gianHang.diaChi" value="Địa chỉ gian hàng ABC"></s:textfield></td>
							<td></td>
						</tr>
						<tr>
							<th>Fax:</th>
							<td><s:textfield name="gianHang.fax" value="94819414124"></s:textfield></td>
							<td></td>
						</tr>
						<tr>
							<th>Điện thoại:</th>
							<td><s:textfield name="gianHang.dienThoai" value="0124325355"></s:textfield>
							</td>
							<td></td>
						</tr>
						<tr>
							<th>Yahoo:</th>
							<td><s:textfield name="gianHang.yahoo" value="yahooID!"></s:textfield>
							</td>
							<td></td>
						</tr>
						<tr>
							<th>Logo:</th>
							<td><s:file name="logo" /></td>
							<td></td>
						</tr>
						<tr>
							<th>Banner:</th>
							<td><s:file name="banner" /></td>
							<td></td>
						</tr>
					</table>

				</fieldset>

			</s:div>

			<s:submit value="Đăng ký" />


		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
