<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>  
<sx:treenode label="%{#root.tenDanhMuc}">

	<s:if test="#root.dsDanhMucCon.size() != 0 && #root.dsDanhMucCon != null"> 
		<s:iterator value="#root.dsDanhMucCon">
			<s:include value="/admin/category/treenode.jsp" />
			
		</s:iterator>
	</s:if>


</sx:treenode>
