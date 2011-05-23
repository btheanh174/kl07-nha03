<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="center_title_bar">Danh sách cửa hàng</div>
<s:if test="dsGianHang.size() > 0">
	<s:iterator value="dsGianHang" status="stat">
		<s:url action="GianHang_chiTiet" var="storeDetail">
			<s:param name="maGianHang" value="maGianHang"></s:param>
		</s:url>
	</s:iterator>
</s:if>
<s:else>
	Không có cửa hàng nào!
</s:else>
