<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>



<div id="center-column">

	<div class="top-bar">
		<h1>Thêm sản phẩm</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Thêm sản phẩm</a>
		</div>
	</div>

	<br /> <br /> <br /> <br /> <br />
	<h2>Tìm kiếm sản phẩm từ hệ thống</h2>
	<a href="#">(Nếu không có sản phẩm cần tim, click tại đây)</a> <br />
	<br />
	<s:form action="AdminStore_Step2_themSanPham.action" method="post">
		<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
		<table border="1px" height="400px">
			<tr height="30px">
				<th width="300px">Chọn danh mục</th>
				<th width="300px">Danh sách sản phẩm</th>

			</tr>
			<tr>
				<s:url id="echo" value="echo.action" />
				<td valign="top"><sjt:tree id="treeDynamicAjax"
						jstreetheme="default" cssStyle=""
						rootNode="#danhMucAction.danhMucGoc"
						childCollectionProperty="dsDanhMucCon"
						nodeTitleProperty="tenDanhMuc" nodeIdProperty="maDanhMuc"
						nodeHref="%{echo}" nodeHrefParamName="echo" nodeTargets="result2" />
				</td>
				<td><sx:div id="result2"></sx:div></td>
			</tr>
		</table>
		<br/>
		<br/>
		<br/>
		<div align="left">
			<s:submit value="Đồng ý" />
		</div>
	</s:form>
</div>