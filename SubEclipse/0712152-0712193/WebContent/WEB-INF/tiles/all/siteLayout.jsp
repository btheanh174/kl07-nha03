<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>

<link href="all/css/style.css" rel="stylesheet" type="text/css" />

<sj:head/>

</head>
<body>


	<!-- navbar -->
	<tiles:insertAttribute name="navbar"></tiles:insertAttribute>
	<!-- end navbar -->

	<div id="wrapper">
		<!-- header -->
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
		<!-- end header -->
		<!-- menu -->
		<tiles:insertAttribute name="menu"></tiles:insertAttribute>
		<!-- end menu -->
		<!-- sidebar -->
		<tiles:insertAttribute name="sidebar"></tiles:insertAttribute>
		<!-- end sidebar -->

		<!-- content -->
		<div id="content">
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
			<div class="clearfix"></div>
		</div>
		<!-- end content -->
		<div class="clearfix"></div>
	</div>
	<!-- footer -->
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	<!-- end footer -->
</body>
</html>