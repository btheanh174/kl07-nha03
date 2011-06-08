<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="main" class="main section">
	<s:if test="chinhSach != null">
		<s:include value="policy_01.html"></s:include>
	</s:if>
</div>