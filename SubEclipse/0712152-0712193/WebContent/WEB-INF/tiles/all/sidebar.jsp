<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="sidebar">
	<!-- shopping cart -->
	<div class="widget cart_section">
		<div class="cart_section_bottom clearfix">
			<h2>Đăng nhập</h2>
			<div class="clear"></div>
			<div class="login">
				<form onsubmit="check_form_login(); return false;" method="post"
					action="/home/act_login.php" name="form_login">
					<div class="name">
						<span lang="vi">Tên đăng nhập</span>
					</div>
					<div class="control">
						<input type="text" name="loginname" class="form_control">
					</div>
					<div class="name">
						<span lang="vi">Mật khẩu</span>
					</div>
					<div class="control">
						<input type="password" name="password" class="form_control">
					</div>
					<div class="button">
						<input type="submit" value="Đăng nhập" class="form_button">
					</div>
					<div class="link">
						<a lang="vi" href="/home/register.php">Đăng ký</a>&nbsp; | &nbsp;<a
							lang="vi" href="/home/lost_password.php">Quên mật khẩu</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- end shopping cart -->

	<!-- danh muc -->
	<div id="sidebar" class="widget1 section">
		<div id="LinkList1" class="widget LinkList">
			<h2>Danh mục</h2>
			<div class="widget-content">
				<ul>
					<li><a href="">Dell</a>
					</li>
					<li><a href="">Acer</a>
					</li>
					<li><a href="">Sony</a>
					</li>
					<li><a href="">Lenovo</a>
					</li>
					<li><a href="">HP</a>
					</li>
				</ul>
				<div class="clear"></div>
			</div>
		</div>
		<!-- end danh muc -->
		<!-- subscribel -->
		<div id="Subscribe1" class="widget Subscribe">
			<div style="white-space: nowrap">
				<h2 class="title">Subscribe To</h2>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</div>