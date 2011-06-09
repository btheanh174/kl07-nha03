<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<title>Quản lý gian hàng</title>
<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
<sx:head/>
<style media="all" type="text/css">
@import "all/css/adminStyle.css";
</style>
</head>
<sj:head jqueryui="true" jquerytheme="redmond" />
<body>

	<div id="main">
		<tiles:insertAttribute name="menu"></tiles:insertAttribute>
		<div id="middle">
			<tiles:insertAttribute name="left"></tiles:insertAttribute>
			<tiles:insertAttribute name="middle"></tiles:insertAttribute>
			<tiles:insertAttribute name="right"></tiles:insertAttribute>		
		</div>
		<div id="footer"></div>
	</div>
</body>

</html>
