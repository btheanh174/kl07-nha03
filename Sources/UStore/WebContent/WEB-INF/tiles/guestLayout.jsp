<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class="container">
	<div class="leftcol"><tiles:insertAttribute name="left"></tiles:insertAttribute>
	</div>
	<div class="main"><tiles:insertAttribute name="main"></tiles:insertAttribute>
	</div>
</div>