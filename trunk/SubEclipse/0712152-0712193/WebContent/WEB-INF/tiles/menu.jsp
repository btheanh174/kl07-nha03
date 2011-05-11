<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="left_menu_corner"></div>

<ul class="menu">
	<li><a href="<s:url action="show_index"/>" class="nav1"> Trang
			chủ </a>
	</li>
	<li class="divider"></li>
	<li><a href="<s:url action="SanPham_danhSach"/>" class="nav2">Sản
			phẩm</a>
	</li>
	<li class="divider"></li>
	<li><a href="<s:url action=""/>" class="nav3">Rao vặt</a>
	</li>
	<li class="divider"></li>
	<li><a href="<s:url action=""/>" class="nav3">Cửa hàng</a>
	</li>
	<li class="divider"></li>
	<li><a href="<s:url action="show_contact_contact"/>" class="nav6">Liên
			hệ</a>
	</li>

	<s:if test="#session['nhomNguoiDung'] == 4">
		<li class="divider"></li>
		<li><a href="<s:url action="show3_admin_category_index"/>"
			class="nav6">Quản lý category admin</a>
		</li>

	</s:if>


	<s:if test="#session['tk'] == null">
		<li><a href="<s:url action="show_user_login"/>" class="nav4">Đăng
				nhập</a>
		</li>
		<li class="right_divider"></li>
		<li><a href="<s:url action="show_user_register"/>" class="nav4">Đăng
				ký</a>
		</li>
	</s:if>
	<s:else>
		<li><a href="<s:url action="User_logout"/>" class="nav4">Đăng
				xuất</a>
		</li>
		<li class="right_divider"></li>
		<s:url action="Profile_hienThi" id="showProfile">
			<s:param name="maTaiKhoan" value="#session['tk'].maTaiKhoan"></s:param>
		</s:url>
		<li><a href="${showProfile}" class="nav4"><s:property
					value="#session['tk'].tenTruyCap" />
		</a>
		</li>
	</s:else>


</ul>

<div class="right_menu_corner"></div>
