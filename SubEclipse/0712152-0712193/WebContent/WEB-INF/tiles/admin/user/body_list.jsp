<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<div id="table-content">
<br>
<!--  start message-blue -->
<div id="message-blue">
<table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr>
		<td class="blue-left">Welcome back. <a href="">View my
		account.</a></td>
		<td class="blue-right"><a class="close-blue"><img
			src="images/table/icon_close_blue.gif" alt="" /></a></td>
	</tr>
</table>
</div>
<!--  end message-blue --> 

<!--  -->
<form id="mainform" action="">
<table border="0" width="100%" cellpadding="0" cellspacing="0"
	id="product-table">
	<tr>
		<th class="table-header-check"></th>
		<th class="table-header-repeat line-left"></th>
		<th class="table-header-repeat line-left"><a>Tên truy cập</a></th>
		<th class="table-header-repeat line-left"><a>Nhóm người dùng</a></th>
		<th class="table-header-repeat line-left"><a>Ngày tham gia</a></th>
		<th class="table-header-options line-left"></th>
	</tr>
	<s:iterator value="dsTaiKhoan" status="stat">
		<tr class='<s:if test="#stat.index%2 == 0"></s:if><s:else>alternate-row</s:else>'>
			<td><input type="checkbox" /></td>
			<td><font size="3"><s:property value="#stat.count" /></font></td>
			<td><font size="3"><s:property value="tenTruyCap" /></font></td>
			<td><font size="3"><s:property value="nhomNguoiDung.tenNhom" /></font></td>
			<td><font size="3"><s:property value="ngayKichHoat" /></font></td>
			<td class="options-width"><a href="" title="Sửa"
				class="icon-1 info-tooltip"></a> <a href="" title="Xóa"
				class="icon-2 info-tooltip"></a> <a href="" title="Cập nhật"
				class="icon-5 info-tooltip"></a></td>
		</tr>
	</s:iterator>
</table>
<!--   -->
</form>
</div>