<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form action="step3_PaymentMethod" method="post" theme="simple">
	<h1>Bước 2: Điền thông tin người nhận:</h1>
	<table border="0" cellpadding="0" cellspacing="5" id="id-form">
		<tr>
			<th>Tên người nhận:</th>
			<td><s:textfield name="nguoiNhan.tenNguoiNhan" value ="Tôi nhận"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Địa chỉ:</th>
			<td><s:textfield name="nguoiNhan.diaChi" value ="My home"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Email:</th>
			<td><s:textfield name="nguoiNhan.email" value ="myemail3@yahoo.com"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Điện thoại:</th>
			<td><s:textfield name="nguoiNhan.dienThoai" value ="0909113114"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Ghi chú:</th>
			<td><s:textarea name="nguoiNhan.ghiChu" value ="Giao hàng nhiệt tình!"cols="30" rows="8" />
			</td>
			<td></td>
		</tr>
		<tr>
			<th></th>
			<td><s:submit value="Bước tiếp theo"/>
			</td>
			<td></td>
		</tr>
	</table>
</s:form>