<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="header">
	<a href="" class="logo"><img
		src="all/images/admin/logo.gif" width="101" height="29" alt="" /> </a>
	<s:url id="information" value="show3_all_admin_information.action" />
	<ul id="top-navigation">

		<li class="active"><span><span>Trang chủ quản lý</span> </span></li>

		<li><span><span><a href="<s:url action="show3_all_admin_information"/>" >Quản lý tổng thể</a>
			</span> </span></li>

		<li><span><span><a href="">Giao diện</a>
			</span> </span></li>

		<li><span><span><a href="">Hóa đơn</a>
			</span> </span></li>

		<li><span><span><a href="">Khác</a>
			</span> </span></li>

	</ul>

</div>