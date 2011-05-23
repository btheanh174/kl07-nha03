<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="main_navi" class="clearfix">
	<div id="main_navi_in">
		<ul id="nav">
			<li><a href="<s:url action="Index"/>">eStore.com</a></li>
			<s:url id="store">
				<s:param name="maGianHang" value="maGianHang"></s:param>
			</s:url>
			<li><a href="${store }">Trang chủ</a></li>
			<li><a href="">Sản phẩm</a>
				<ul>
				<s:iterator value="dsDanhMuc">
				<li>
				<a href="#"><s:property value="tenDanhMuc"/></a>
				</li>
				</s:iterator>
				</ul>
			</li>
			<s:url id="store_policy" action="Store_policy">
				<s:param name="maGianHang" value="maGianHang"></s:param>
			</s:url>
			<li><a href="${store_policy }">Chính sách</a></li>
			<s:url id="store_intro" action="Store_intro">
				<s:param name="maGianHang" value="maGianHang"></s:param>
			</s:url>
			<li><a href="${store_intro }">Giới thiệu</a></li>
			
			<s:url id="store_contact" action="Store_contact">
				<s:param name="maGianHang" value="maGianHang"></s:param>
			</s:url>
			<li><a href="${store_contact }">Liên hệ</a></li>
			
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