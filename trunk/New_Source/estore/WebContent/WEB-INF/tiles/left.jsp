<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/dropdown.js"></script>
<link rel="stylesheet" type="text/css" href="css/left_style.css" />
<div class="title_box">Danh mục sản phẩm</div>

<ul class="left_menu" id="nav">
	<s:bean name="com.estore.shop.action.DanhMucAction" var="danhMucAction"></s:bean>
	<s:iterator id="root" value="#danhMucAction.dsDanhMuc"
		status="danhMucStatus">
		<s:if test="#root.capDanhMuc == 1">
			<s:include value="/WEB-INF/tiles/node.jsp" />
		</s:if>
	</s:iterator>
</ul>
