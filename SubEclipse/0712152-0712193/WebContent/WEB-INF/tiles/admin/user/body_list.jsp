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
						account.</a>
				</td>
				<td class="blue-right"><a class="close-blue"><img
						src="images/table/icon_close_blue.gif" alt="" />
				</a>
				</td>
			</tr>
		</table>
	</div>
	<!--  end message-blue -->

	<!--  -->
	<form id="mainform" action="ThanhVien_sua" method="get">
		<table border="0" width="100%" cellpadding="0" cellspacing="0"
			id="product-table">
			<tr>
				<th class="table-header-check"></th>
				<th class="table-header-repeat line-left"></th>
				<th class="table-header-repeat line-left"><a>Tên truy cập</a>
				</th>
				<th class="table-header-repeat line-left"><a>Nhóm người
						dùng</a>
				</th>
				<th class="table-header-repeat line-left"><a>Ngày tham gia</a>
				</th>
				<th class="table-header-options line-left"></th>
			</tr>
			<s:iterator value="dsTaiKhoan" status="stat">
				<tr
					class='<s:if test="#stat.index%2 == 0"></s:if><s:else>alternate-row</s:else>'>
					<td><input type="checkbox" />
					<s:hidden name="maTaiKhoan" value="%{maTaiKhoan}"></s:hidden>
					</td>
					<td><font size="3"><s:property value="#stat.count" />
					</font>
					</td>
					<td><font size="3"><s:property value="tenTruyCap" />
					</font>
					</td>
					<td><font size="3"><s:property
								value="nhomNguoiDung.tenNhom" />
					</font>
					</td>
					<td><font size="3"><s:property value="ngayKichHoat" />
					</font>
					</td>
					<td class="options-width">
					<s:url id="xoa" action="ThanhVien_xoa">
						<s:param name="maTaiKhoan" value="maTaiKhoan"></s:param>
					</s:url>
					<a href="" title="Sửa"
						class="icon-1 info-tooltip"></a> <a href="${xoa }" title="Xóa"
						class="icon-2 info-tooltip"></a> <a href="" title="Cập nhật"
						class="icon-5 info-tooltip"></a>
					</td>
				</tr>
			</s:iterator>
		</table>
		<!--   -->
	</form>

	<!--  start paging..................................................... -->
	<table border="0" cellpadding="0" cellspacing="0" id="paging-table">
		<tr>
			<s:url id="left" action="ThanhVien_danhSach">
				<s:param name="trang" value="1"></s:param>
			</s:url>
			<s:url id="right" action="ThanhVien_danhSach">
				<s:param name="trang" value="tongSoTrang"></s:param>
			</s:url>
			<s:url id="next" action="ThanhVien_danhSach">
					<s:param name="trang" value="trang + 1"></s:param>
			</s:url>
			<s:url id="prev" action="ThanhVien_danhSach">
				<s:param name="trang" value="trang - 1"></s:param>
			</s:url>
			<td>
			<a href="${left }" class="page-far-left"></a> 
			<a href="${prev }"
				class="page-left"></a>
				
				<div id="page-info">
					Trang <strong> <s:property value="trang" />
					</strong> /
					<s:property value="tongSoTrang" />
				</div> 
			<a href="${next }" class="page-right"></a> 
			<a href="${right }"
				class="page-far-right"></a></td>
		</tr>
	</table>
	<!--  end paging................ -->
</div>