<%@page import="com.estore.core.model.pojo.TaiKhoan"%>
<%@page import="com.estore.core.model.pojo.ThanhVien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%!TaiKhoan tk;
	ThanhVien tv;%>
<%
	tk = (TaiKhoan) session.getAttribute("tk");
	tv = tk.getThanhVien();
	if (tk == null) {
		response.sendRedirect("show_user_login.action");
	}
%>

<script type="text/javascript">
	function checkAll() {

			if (document.getElementById('cbSaoChepThongTin').checked) {
				document.getElementById('tfTenNguoiNhan').value = " <%=tv.getHoTen()%> ";
				document.getElementById('tfDiaChi').value = " <%=tv.getDiaChi()%> ";
				document.getElementById('tfEmail').value = " <%=tv.getEmail()%> ";
				document.getElementById('tfDienThoai').value = " <%=tv.getDienThoai()%>";
			}
		
	}
</script>
<s:form action="step3_PaymentMethod" method="post" theme="simple">
	<h1>Bước 2: Điền thông tin người nhận:</h1>
	<s:hidden name="maGianHang" value="%{top.maGianHang}"></s:hidden>
	<table border="0" cellpadding="0" cellspacing="5" id="id-form">
		<tr>
			<th>Tự động điền thông tin người nhận là chính bạn:</th>
			<td align="left"><input type="checkbox" name="everything"
				id="cbSaoChepThongTin" onClick="checkAll()" /></td>
			<td></td>
		</tr>
		<tr>
			<th>Tên người nhận:</th>
			<td><s:textfield name="nguoiNhan.tenNguoiNhan"
					id="tfTenNguoiNhan" size="30"></s:textfield></td>
			<td></td>
		</tr>
		<tr>
			<th>Địa chỉ:</th>
			<td><s:textfield name="nguoiNhan.diaChi" id="tfDiaChi" size="30"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Email:</th>
			<td><s:textfield name="nguoiNhan.email" id="tfEmail" size="30"></s:textfield>
			</td>
			<td></td>
		</tr>
		<tr>
			<th>Điện thoại:</th>
			<td><s:textfield name="nguoiNhan.dienThoai" id="tfDienThoai"
					size="30"></s:textfield></td>
			<td></td>
		</tr>
		<tr>
			<th>Ghi chú:</th>
			<td><s:textarea name="nguoiNhan.ghiChu" id="tfGhiChu"
					value="Phải là nhân viên nữ giao!" cols="35" rows="8" />
			</td>
			<td></td>
		</tr>
		<tr>
			<th></th>
			<td><s:submit value="Bước tiếp theo" />
			</td>
			<td></td>
		</tr>
	</table>
</s:form>