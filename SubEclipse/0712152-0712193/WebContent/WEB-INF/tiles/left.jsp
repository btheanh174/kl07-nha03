<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/dropdown.js"></script>
<link rel="stylesheet" type="text/css" href="css/left_style.css" />
<div class="title_box">Danh mục sản phẩm</div>

<ul class="left_menu" id="nav">
	<s:bean name="model.bean.DanhMucBean" var="danhMucBean"></s:bean>
	<s:iterator id="root" value="#danhMucBean.dsDanhMuc" status="danhMucStatus">
			<s:include value="/WEB-INF/tiles/node.jsp" />
	</s:iterator>
</ul>

<div class="title_box">Sản phẩm đặc biệt</div>
<div class="border_box">
	<div class="product_title">
		<a href="details.html">Motorola 156 MX-VL</a>
	</div>
	<div class="product_img">
		<a href="details.html"><img src="images/laptop.png" alt=""
			title="" border="0" /> </a>
	</div>
	<div class="prod_price">
		<span class="reduce">350$</span> <span class="price">270$</span>
	</div>
</div>


<div class="title_box">Newsletter</div>
<div class="border_box">
	<input type="text" name="newsletter" class="newsletter_input"
		value="your email" /> <a href="#" class="join">join</a>
</div>

<div class="banner_adds"></div>
