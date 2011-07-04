<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>	
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title> <tiles:getAsString name="pageTitle" /> </title>
<link rel="stylesheet" type="text/css" href="css/style1.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>

<sj:head/>

</head>
<body>
<div id="main_container">
	
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	
	<div id="main_content"> 
    
   		<div class="left_content">
   			<tiles:insertAttribute name="left"></tiles:insertAttribute>
   		</div><!-- end of left content -->
   
   		<div class="center_content_full">
   			<tiles:insertAttribute name="center"></tiles:insertAttribute>
   		</div><!-- end of center content -->   
            
   </div><!-- end of main content -->
   
	<div class="footer">
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>	 
	</div>
</div>
<!-- end of main_container -->
</body>
</html>