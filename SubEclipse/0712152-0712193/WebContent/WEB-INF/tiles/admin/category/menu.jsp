<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--  start nav-outer-repeat............................. START -->
<div class="nav-outer-repeat">
	<!--  start nav-outer -->
	<div class="nav-outer">

		<!-- start nav-right -->
		<div id="nav-right">

			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account">
				<a style="color:white; float: left; font-size: 15px; font-weight: bold;"> <s:property
						value="#session['tk'].tenTruyCap" /> </a>

			</div>
			<div class="nav-divider">&nbsp;</div>
			<a href="" id="logout"><img
				src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" />
			</a>
			<div class="clear">&nbsp;</div>

			<!--  start account-content -->
			<div class="account-content">
				<div class="account-drop-inner">
					<a href="" id="acc-settings">Settings</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-details">Personal details </a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-project">Project details</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-inbox">Inbox</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-stats">Statistics</a>
				</div>
			</div>
			<!--  end account-content -->

		</div>
		<!-- end nav-right -->


		<!--  start nav -->
		<div class="nav">
			<div class="table">

				<ul class="select">
					<li><a href="#nogo"><b>Thống kê</b> <!--[if IE 7]><!--> </a></li>
				</ul>

				<div class="nav-divider">&nbsp;</div>

				<ul class="select">
					<li><a href="#nogo"> <b>Sản phẩm</b> <!--[if IE 7]><!--> </a>
						<!--<![endif]--> <!--[if lte IE 6]><table><tr><td><![endif]-->
						<div class="select_sub show">
							<ul class="sub">
								<li><a
									href="<s:url action="SanPham_xemDanhSachSanPham.action"/> ">Xem
										danh sách</a>
								</li>
								<li class="sub_show"><a
									href="<s:url action="QuanLyProducts.action"/> ">Thêm sản
										phẩm</a>
								</li>
								<li><a href="#nogo">Xóa sản phẩm</a>
								<li><a href="<s:url action="SanPham_xemDanhSachSanPhamDeNghi.action"/> ">Sản phẩm đề nghị</a></li>
								</li>
							</ul>
						</div> <!--[if lte IE 6]></td></tr></table></a><![endif]--></li>
				</ul>

				<div class="nav-divider">&nbsp;</div>

				<ul class="current">
					<li><a href="<s:url action="QuanLyCategories"/>"> <b>Danh
								mục</b> <!--[if IE 7]><!--> </a> <!--<![endif]--> <!--[if lte IE 6]><table><tr><td><![endif]-->
					</li>
				</ul>

				<div class="nav-divider">&nbsp;</div>

				<ul class="select">
					<li><a href="#nogo"><b>Người dùng</b> <!--[if IE 7]><!-->
					</a> <!--<![endif]--> <!--[if lte IE 6]><table><tr><td><![endif]-->
						<div class="select_sub">
							<ul class="sub">
								<li><a href="#nogo">Clients Details 1</a>
								</li>
								<li><a href="#nogo">Clients Details 2</a>
								</li>
								<li><a href="#nogo">Clients Details 3</a>
								</li>

							</ul>
						</div> <!--[if lte IE 6]></td></tr></table></a><![endif]--></li>
				</ul>

				<div class="nav-divider">&nbsp;</div>



				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>
		<!--  start nav -->

	</div>
	<div class="clear"></div>
	<!--  start nav-outer -->
</div>
<!--  start nav-outer-repeat............................ END -->