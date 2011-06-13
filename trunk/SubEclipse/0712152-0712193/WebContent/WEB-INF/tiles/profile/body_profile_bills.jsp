<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<link href="css/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="js/tablecloth.js"></script>

<div class="table">
	<img src="all/images/admin/bg-th-left.gif" width="8" height="7" alt=""
		class="left" /> <img src="all/images/admin/bg-th-right.gif" width="7"
		height="7" alt="" class="right" />

	<table class="tablecloth" border="1px" align="left" cellpadding="0" cellspacing="0">
		<tr>
			<th width="120">Ngày lập</th>
			<th width="220">Tên cửa hàng</th>
			<th width="120">Hình thức vận chuyển</th>
			<th width="120">Tình trạng</th>
			<th width="80">Thông tin</th>
		</tr>

		<s:iterator value="dsHoaDon" status="stat">

			<tr>
				<s:url action="Profile_xemChiTietHoaDon" var="billUserDetail">
					<s:param name="maHoaDon" value="maHoaDon"></s:param>
				</s:url>

				<td><s:property value="formatter.format(ngayLap)" />
				</td>
				<td><s:property value="gianHang.tenGianHang" />
				</td>
				<td>Chưa rõ</td>
				<td><s:property value="tinhTrang.getTenTinhTrang()" />
				</td>
				<td><a style="color: blue;" href="${billUserDetail}">Chi
						tiết...</a></td>
			</tr>

		</s:iterator>
	</table>
</div>
