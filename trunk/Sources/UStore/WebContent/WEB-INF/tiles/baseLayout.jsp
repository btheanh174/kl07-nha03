<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="pageTitle" /></title>
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body id="index" class="index">
	<div id="header"><tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	<div id="content">
		<!-- Phần thân của template sẽ được kế thừa lại
			Phần này sẽ được chèn bởi một layout khác.
		 -->
		<tiles:insertDefinition name="body"></tiles:insertDefinition>
	</div>
	<div id="footer"><tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>