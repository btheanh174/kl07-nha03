<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="main_navi" class="clearfix">
	<div id="main_navi_in">
		<ul id="nav">
			<li><a href="">eStore.com</a></li>
			<li><a href="">Trang chủ</a></li>
			<li><a href="">Sản phẩm</a>
				<ul>
				<s:iterator value="dsDanhMuc">
				<li>
				<a href="#"><s:property value="tenDanhMuc"/></a>
				</li>
				</s:iterator>
				</ul>
			</li>
			<li><a href="">Giới thiệu</a></li>
			<li><a href="">Liên hệ</a></li>
			<li><a href="">Giỏ hàng</a></li>
		</ul>
		<div class="searchform">
			<form method="get" id="searchform" action="/search">
				<input type="text" value="Nhập chuỗi tìm kiếm ở đây" name="q" id="s"
					class="s"> <input type="image"
					src="all/images/b_search.png" class="search_btn"
					alt="Submit button">
			</form>
		</div>
	</div>
</div>