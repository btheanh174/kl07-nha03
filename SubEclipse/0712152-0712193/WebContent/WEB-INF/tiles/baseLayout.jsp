<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252" />
<title><tiles:getAsString name="pageTitle" /></title>

<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/stickytooltip.css" />
<link rel="stylesheet" type="text/css" href="css/xitai.css" />



<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->

<script type="text/javascript" src="js/boxOver.js"></script>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/stickytooltip.js"></script>
<!-- fancyzoom -->
<script type="text/javascript" src="js/scriptaculous.js"></script>
<script type="text/javascript" src="js/fancyzoom.js"></script>
<!-- -->

<sj:head />

</head>
<body>
<div id="main_container"><tiles:insertAttribute name="header"></tiles:insertAttribute>

<div id="main_content">

<div id="menu_tab"><tiles:insertAttribute name="menu"></tiles:insertAttribute>
</div>

<div class="crumb_navigation">Navigation: <span class="current"><a
	href="<s:url action="show3_content_store_products"/>">List Test</a></span></div>

<div class="left_content"><tiles:insertAttribute name="left"></tiles:insertAttribute>
</div>
<!-- end of left content -->

<div class="center_content_full"><tiles:insertAttribute
	name="center"></tiles:insertAttribute></div>
<!-- end of center content --> <%-- 
   		<div class="right_content">
   			<tiles:insertAttribute name="right"></tiles:insertAttribute>
   		</div> --%><!-- end of right content --></div>
<!-- end of main content -->

<div class="footer"><tiles:insertAttribute name="footer"></tiles:insertAttribute>
</div>
</div>
<!-- end of main_container -->
</body>
</html>