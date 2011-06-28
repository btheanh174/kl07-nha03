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

	<s:form action="Store_capNhat" method="post"
		enctype="multipart/form-data" theme="simple">
		<s:hidden name="maGianHang"
			value="%{#session['tk'].gianHang.maGianHang}"></s:hidden>
		<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
		<fieldset>
			<legend align="left">Thông tin người dùng: </legend>
			<table border="0" cellpadding="0" cellspacing="0" id="id-form">
				<tr>
					<th>Hình logo:</th>
					<td><img width="120" height="120"
						src="<s:property value="%{#session['tk'].gianHang.logo}"/>">
					</td>
				</tr>
				<tr>
					<td></td>
					<td><s:file name="images" label="Logo"></s:file>
						<div class="txt">Sửa logo</div></td>
				</tr>
				<tr>
					<th width="500">Hình banner:</th>
					<td><img width="500" height="100"
						src="<s:property value="%{#session['tk'].gianHang.banner}"/>">
					</td>
				</tr>
				<tr>
					<td></td>
					<td><s:file name="images" label="Banner"></s:file></td>
				</tr>

				<tr>
					<th>Xác nhận mật khẩu (*):</th>
					<td><s:password name="xacNhanMatKhau" value="123456"></s:password>
					</td>
					<td></td>
				</tr>
				<tr>
					<th style="width: 10px;">Tên gian hàng:</th>
					<td><s:textfield name="tenGianHang"
							value="%{#session['tk'].gianHang.tenGianHang}"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Tỉnh/thành phố:</th>
					<td><sj:autocompleter name="gianHang.tinhThanhPho"
							list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
							listValue="tenTinhThanhPho"
							value="%{#session['tk'].gianHang.tinhThanhPho.maTinhThanhPho}"></sj:autocompleter>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Địa chỉ:</th>
					<td><s:textfield name="gianHang.diaChi"
							value="%{#session['tk'].gianHang.diaChi}"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Fax:</th>
					<td><s:textfield name="gianHang.fax"
							value="%{#session['tk'].gianHang.fax}"></s:textfield>
					</td>
					</td>
					<td></td>
				</tr>

				<tr>
					<th>Điện thoại:</th>
					<td><s:textfield name="gianHang.dienThoai"
							value="%{#session['tk'].gianHang.dienThoai}"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Yahoo:</th>
					<td><s:textfield name="gianHang.yahoo"
							value="%{#session['tk'].gianHang.yahoo}"></s:textfield>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Giới thiệu cửa hàng:</th>
					<td><sjr:ckeditor id="richtextEditor" width="500"
							value="%{#session['tk'].gianHang.thongTin}"
							name="gianHang.thongTin" rows="10" cols="80">
						</sjr:ckeditor>
					</td>
					<td></td>
				</tr>
				<tr>
					<th></th>
					<td><s:submit value="Lưu"></s:submit>
					</td>
					<td></td>
				</tr>
			</table>
		</fieldset>
	</s:form>

</div>