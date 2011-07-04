<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<li	class="<s:if test="#danhMucStatus.odd == true ">odd</s:if>
 		  	<s:else>even</s:else>">
 		  	
 		  	<s:url action="SanPham_danhSach" var="urlTag" >
		    	<s:param name="maDanhMuc"><s:property value="#root.maDanhMuc"/></s:param>
			</s:url>
			<a href="<s:property value="#urlTag" />" ><s:property value="#root.tenDanhMuc" /></a>

	<s:if test="#root.dsDanhMucCon.size() != 0 && #root.dsDanhMucCon != null"> 
		<ul>
		<s:iterator value="#root.dsDanhMucCon">
			<s:include value="/WEB-INF/tiles/node.jsp" />
		</s:iterator>
		</ul>
	</s:if>
</li>

