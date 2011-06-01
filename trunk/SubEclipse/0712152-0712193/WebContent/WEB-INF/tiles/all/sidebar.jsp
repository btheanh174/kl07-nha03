<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="sidebar">
	<!-- shopping cart -->
	<div class="widget cart_section">
		<div class="cart_section_bottom clearfix">
			<s:if test="#session['tk'] == null">
				<h2>Đăng nhập</h2>
				<div class="clear"></div>
				<div class="login">
					<s:url var="register" action="User_register"></s:url>
					<s:url var="login" action="User_login"></s:url>
					<s:form method="post" action="User_login" name="form_login">
						<s:textfield name="taiKhoan.tenTruyCap" label="Tên đăng nhập"
							labelposition="top"></s:textfield>
						<s:password name="taiKhoan.matKhau" label="Mật khẩu"
							labelposition="top"></s:password>
						<s:submit value="Đăng nhập"></s:submit>

						<div class="link">
							<a lang="vi" href="${register}">Đăng ký</a>&nbsp; | &nbsp;<a
								lang="vi" href="">Quên mật khẩu</a>
						</div>
					</s:form>
				</div>
			</s:if>
			<s:else>
				<h2>Đăng nhập</h2>
				<div class="clear"></div>
				<div class="login">
					Xin chào,
					<s:property value="tenTruyCap" />
					<br>
					<s:a action="User_logout">Đăng xuất</s:a>
				</div>
			</s:else>
		</div>
	</div>
	<!-- end shopping cart -->

	<!-- danh muc -->
	<div id="sidebar" class="widget1 section">
		<div id="LinkList1" class="widget LinkList">
			<h2>Danh mục</h2>
			<div class="widget-content">
				<ul>
					<s:iterator id="root" value="dsDanhMuc">
					<s:url id="danhsach" action="store">
						<s:param name="maGianHang" value="maGianHang"></s:param>
						<s:param name="maDanhMuc" value="maDanhMuc"></s:param>
					</s:url>
						<li><a href="${danhsach }"><s:property value="tenDanhMuc" /> </a></li>
					</s:iterator>
				</ul>
				<div class="clear"></div>
			</div>
		</div>
		<!-- end danh muc -->
		<!-- Thong tin store -->
		<div id="Subscribe1" class="widget Subscribe">
			<div style="white-space: nowrap">
				<h2 class="title">Thông tin</h2>

				<div class="widget-content">
					<br> <b>Tên cửa hàng:</b>
					<s:property value="tenGianHang" />
					<br>
					<div class="siteLogo">
						<s:if test="logo != null">
							<img class="logo" alt=""
								src="<s:property value="logo"/>">
						</s:if>
						<s:else>
							<img width="200" height="150" alt=""
								src="images/no_photo_x_small.gif">
						</s:else>

					</div>
					<br>
					<div class="siteInfo">
						<table>
							<tbody>
							<tr><td><b>Chủ cửa hàng:</b></td>
							<td><s:property value="taiKhoan.tenTruyCap" /></td></tr>
							<tr><td><b>Vùng:</b></td>
							<td><s:property value="tinhThanhPho.tenTinhThanhPho" /></td></tr>
							<!--<tr><td><b>Địa chỉ:</b></td>
							<td><s:property value="diaChi" /></td></tr>
							--><tr><td><b>Điện thoại:</b></td>
							<td><s:property value="dienThoai" /></td></tr>
							
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</div>