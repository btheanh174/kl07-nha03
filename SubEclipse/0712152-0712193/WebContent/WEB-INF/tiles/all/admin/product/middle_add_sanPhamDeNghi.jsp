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
	<h2>Thêm sản phẩm đề nghị</h2>

	<br />
	<s:form action="AdminStore_themSanPhamDeNghi.action" method="post" enctype="multipart/form-data"
		theme="simple">
		<table border="0px" height="400px">
			<tr height="30px">
				<td width="150px">Tên sản phẩm:</td>
				<td width="300px"><s:textfield name="spDeNghi.tenSanPham"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Giá bán:</td>
				<td width="300px"><s:textfield name="spDeNghi.gia"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Số lượng:</td>
				<td width="300px"><s:textfield name="spDeNghi.soLuong"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Bảo hành:</td>
				<td width="300px"><s:textfield name="spDeNghi.baoHanh"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Chất lượng:</td>
				<td width="300px"><s:textfield name="spDeNghi.chatLuong"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Xuất sứ:</td>
				<td width="300px"><s:textfield name="spDeNghi.xuatSu"></s:textfield>
				</td>
			</tr>

			<tr height="30px">
				<td>Thông tin khác:</td>
				<td width="300px"><s:textarea name="spDeNghi.thongTinKhac"
						wrap="true" cols="35" rows="8"></s:textarea></td>
			</tr>

			<tr height="30px">
				<td>Ghi chú:</td>
				<td width="300px"><s:textarea name="spDeNghi.ghiChu"
						wrap="true" cols="35" rows="8"></s:textarea></td>
			</tr>

			<tr height="30px">
				<td>Hình ảnh:</td>
				<td><s:file name="attachment"/>
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><s:submit value="Đồng ý" />
				</td>
			</tr>

		</table>
		<br />
		<br />
		<br />

	</s:form>
</div>