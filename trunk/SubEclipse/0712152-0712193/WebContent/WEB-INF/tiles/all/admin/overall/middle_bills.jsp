<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>

<div id="center-column">

	<div class="top-bar">
		<h1>Danh mục</h1>
		<div class="breadcrumbs">
			<a href="">Quản lý tổng thể</a> / <a href="">Hóa đơn</a>
		</div>
	</div>

	<br />

	<div class="select-bar">

		<label> <input type="text" name="textfield" /> </label> <label>

			<input type="submit" name="Submit" value="Search" /> </label>

	</div>

	<div class="table">
		<img src="all/images/admin/bg-th-left.gif" width="8" height="7" alt=""
			class="left" /> <img src="all/images/admin/bg-th-right.gif"
			width="7" height="7" alt="" class="right" />

		<table class="listing" cellpadding="0" cellspacing="0">
			<tr>

				<th class="first" width="120">Ngày lập</th>

				<th >Tên khách hàng</th>

				<th>Hình thức vận chuyển</th>

				<th>Tình trạng</th>

				<th class="last" width="80">Thông tin</th>

			</tr>

			<s:iterator value="dsHoaDon" status="stat">

				<s:if test="#stat.odd == true">
					<tr class="bg">
				</s:if>
				<s:else>
					<tr>
				</s:else>

				<td><s:property value="formatter.format(ngayLap)" /></td>
				<td><s:property value="thanhVien.hoTen" /></td>
				<td>Chưa rõ</td>
				<td><s:property value="tinhTrang.getTenTinhTrang()" /></td>
				<td><a style="color: blue;" href="#">Chi tiết...</a></td>
				</tr>

			</s:iterator>

			<tr>

				<td class="first style1">- Lorem Ipsum</td>

				<td><img src="all/images/admin/login-icon.gif" width="16"
					height="16" alt="" />
				</td>

				<td><img src="all/images/admin/save-icon.gif" width="16"
					height="16" alt="save" /></td>

				<td><img src="all/images/admin/add-icon.gif" width="16"
					height="16" alt="add" /></td>

				<td class="last"><a hreft="#">Chi tiết...</a></td>

			</tr>

			<tr class="bg">

				<td class="first style2">- Lorem Ipsum</td>

				<td><img src="all/images/admin/login-icon.gif" width="16"
					height="16" alt="login" /></td>

				<td><img src="all/images/admin/save-icon.gif" width="16"
					height="16" alt="save" /></td>

				<td><img src="all/images/admin/add-icon.gif" width="16"
					height="16" alt="add" /></td>

				<td class="last"><a hreft="#">Chi tiết...</a></td>

			</tr>
		</table>

		<div class="select">
			<strong>Other Pages: </strong> <select>

				<option>1</option>

			</select>

		</div>


	</div>
</div>