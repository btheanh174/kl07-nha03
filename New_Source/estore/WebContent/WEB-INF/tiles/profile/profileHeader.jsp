<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="top_bar">
	<!-- <div class="top_search">
		<div class="search_text">
			<a href="#">Tìm kiếm nâng cao</a>
		</div>
		<input type="text" class="search_input" name="search" /> <input
			type="image" src="images/search.gif" class="search_bt" />
	</div> -->

	<div class="languages"></div>
</div>

<div id="menu_tab">
	<div class="left_menu_corner"></div>
	<ul class="menu">

		<li><a href="" class="nav4"><s:property
					value="#session.tk.tenTruyCap" />
		</a>
		</li>
		<li class="divider"></li>
		<li><a href="<s:url action="User_logout"/>" class="nav4">Thoát</a>
		</li>
		<li class="divider"></li>
		<li><a href="<s:url action="XemGioHang"/>" class="nav3">Giỏ
				hàng</a>
		</li>


		<li><a href="<s:url action=""/>" class="right_nav6">Hướng dẫn</a>
		</li>

		<s:if test="#session['nhomNguoiDung'] == 2">
			<li class="right_divider"></li>
			<s:url id="store" action="store">
				<s:param name="maGianHang" value="#session['tk'].gianHang.maGianHang"></s:param>
			</s:url>
			<li><a target="_blank" href="${store }" class="right_nav2">Cửa hàng</a>
			</li>
		</s:if>
		<li class="right_divider"></li>
		<li><a href="<s:url action="index"/>" class="right_nav1">
				Trang chủ </a>
		</li>

	</ul>

	<div class="right_menu_corner"></div>
</div>
<!-- end of menu tab -->
