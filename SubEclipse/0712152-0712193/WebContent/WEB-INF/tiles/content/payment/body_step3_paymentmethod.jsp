<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Chọn phương thức thanh toán</h1>

<form action='payment/paypal/expresscheckout.jsp' METHOD='POST'>
	<input type='image' name='submit'
		src='https://www.paypal.com/en_US/i/btn/btn_xpressCheckout.gif'
		border='0' align='top' alt='Check out with PayPal' />
</form>