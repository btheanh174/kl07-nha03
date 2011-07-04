<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Chọn phương thức thanh toán</h1>
<table cellpadding="0" cellspacing="10">
	<tr>
		<th>Loại thanh toán trực tuyến</th>
		<th></th>
	</tr>
	<tr>
		<td>PAYPAL</td>
		<td>
			<form action='payment/paypal/expresscheckout.jsp' METHOD='POST'>
				<input type='image' name='submit'
					src='https://www.paypal.com/en_US/i/btn/btn_xpressCheckout.gif'
					border='0' align='top' alt='Check out with PayPal' />
			</form></td>
	</tr>
	<tr>
	<td>Bảo kim</td>
		<td><a
			href="https://www.baokim.vn/payment/deal_payment/product?receiver=thanhhuy89vn@gmail.com&url_success=http://vnexpress.net/&url_cancel=http://gmail.com/">
				<img
				src="https://www.baokim.vn/application/uploads/buttons/btn_pay_now_2.png"
				alt="Thanh toán an toàn với Bảo Kim !" border="0"
				title="Thanh toán trực tuyến an toàn dùng tài khoản Ngân hàng (VietcomBank, TechcomBank, Đông Á, VietinBank, Quân Đội, VIB, SHB,... và thẻ Quốc tế (Visa, Master Card...) qua Cổng thanh toán trực tuyến BảoKim.vn">
		</a></td>
	</tr>
</table>