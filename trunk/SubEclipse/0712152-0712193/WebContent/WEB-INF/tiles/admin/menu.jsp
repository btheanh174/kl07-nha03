<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--  start nav-outer-repeat............................. START -->
<div class="nav-outer-repeat">

	<!--  start nav-outer -->
	<div class="nav-outer">

		<!-- start nav-right -->
		<div id="nav-right">
		
		<s:if test="#session['admin'] != null">
			<div class="nav-divider">&nbsp;</div>
			<s:property value="#session['admin]"/>
			<div class="nav-divider">&nbsp;</div>
			<a href="<s:url action="doLogout"/>" id="logout"><font color="white">Đăng xuất</font>
			</a>
			<div class="clear">&nbsp;</div>
		</s:if>
		<s:else>
			<s:action name="login" executeResult="true"></s:action>
		</s:else>
		</div>
		<!-- end nav-right -->

		<!--  start nav -->
		<div class="nav">
			<div class="table">
				<ul class="select">
					<li><a href="<s:url action="SanPham_xemDanhSachSanPham.action"/> ">
					<b>Sản phẩm</b> <!--[if IE 7]><!--> </a> <!--<![endif]-->
						<!--[if lte IE 6]><table><tr><td><![endif]-->
						<div class="select_sub show">
							<ul class="sub">
								<li><a href="<s:url action="SanPham_xemDanhSachSanPham.action"/> ">Xem danh sách</a></li>
								<li class="sub_show"><a href="<s:url action="QuanLyProducts.action"/> ">Thêm sản phẩm</a></li>
								<li><a href="#nogo">Xóa sản phẩm</a></li>
								<li><a href="<s:url action="SanPham_xemDanhSachSanPhamDeNghi.action"/> ">Sản phẩm đề nghị</a></li>
							</ul>
						</div> <!--[if lte IE 6]></td></tr></table></a><![endif]-->
					</li>
				</ul>
				<div class="nav-divider">&nbsp;</div>
				<ul class="select">
					<li><a href="<s:url action="QuanLyCategories"/>">
							<b>Danh mục</b> <!--[if IE 7]><!--> </a> <!--<![endif]--> 
					</li>
				</ul>
				<div class="nav-divider">&nbsp;</div>
				<ul class="select">
					<li><a href="<s:url action="ThanhVien_danhSach"/>"><b>Người dùng</b> <!--[if IE 7]><!--> </a> <!--<![endif]-->
					</li>
				</ul>
				<div class="nav-divider">&nbsp;</div>
				<ul class="select">
					<li><a href="#"><b>Cấu hình</b></a></li>
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