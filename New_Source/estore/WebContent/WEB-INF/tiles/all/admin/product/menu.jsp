<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="header">
	<a href="" class="logo"><img src="all/images/admin/logo.gif"
		width="101" height="29" alt="" /> </a>
	<s:url id="information" value="show3_all_admin_information.action" />
	<ul id="top-navigation">

		<li><span><span><a
					href="#">Thống kê</a></span> </span>
		</li>

		<li><span><span><a
					href="<s:url action="show3_all_admin_information"/>">Quản lý
						tổng thể</a> </span> </span>
		</li>

		<li class="active"><span><span><a
					href="<s:url action="AdminStore_Step1_themSanPham"/>">Sản phẩm</a> </span> </span>
		</li>
		
		<li><span><span><a
					href="<s:url action="AdminStore_groupCategories"/>">Danh mục</a> </span> </span>
		</li>


		<li><span><span><a href="<s:url action="AdminStore_chooseTemplates"/>">Giao diện</a> </span> </span>
		</li>


		<li><span><span><a href="#">Khác</a> </span> </span>
		</li>

	</ul>

</div>