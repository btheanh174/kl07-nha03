<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>	

<html>
<head>
<title>
<tiles:getAsString name="pageTitle" />
</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="all/css/style.css" />
<link rel="stylesheet" type="text/css" href="all/css/decotemplate.css" />
</head>
<body>
	<table width="996" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td height="607" valign="top">
				<!-- top -->
				 <!-- logo --> <!-- end logo --> <!-- menu --> <!-- end menu -->
				 <tiles:insertAttribute name="top"></tiles:insertAttribute>
				<!-- end top --> 
				<!--banner--> 
				<tiles:insertAttribute name="banner"></tiles:insertAttribute>
				<!---end banner--> 
				<!-- body --> 
				<table width="996" border="0" cellspacing="0" cellpadding="0">
					<tr align="left" valign="top">
						<td width="202" height="334">
						<!-- left categories --> 
						<tiles:insertAttribute name="left"></tiles:insertAttribute>		
						<!-- end left categories -->
						</td>
						
						<td width="20">&nbsp;</td>
						<td width="774">
						<tiles:insertAttribute name="body"></tiles:insertAttribute>
						</td>
					</tr>
				</table> <!-- end body --> 
				<!-- footer --> 
				<tiles:insertAttribute name="footer"></tiles:insertAttribute>
				<!-- end footer --></td>
		</tr>
	</table>
</body>
</html>
