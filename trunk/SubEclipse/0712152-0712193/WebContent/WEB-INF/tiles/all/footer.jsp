<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="#session['nhomNguoiDung'] == 2">

	<div align="center">
		<a href="<s:url action="show3_all_admin_index" />" >Bảng điều khiển
			của người quản trị </a>
	</div>

</s:if>


<div id="footer">
	<div class="footer_top">Copyright @ estore 2011</div>
<hr>
	<div class="footer_bottom">
		<s:text name="%{gianHang.footer}"></s:text>
	</div>
	
</div>