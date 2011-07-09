<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>
	
<script
	src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true&amp;key=ABQIAAAAsrSt9n1rZ-ayH9IWuNpDCxSWP9drhxZ1ttktyMhGxwkSxUH-ixTdQ_iEcLBMMIScG86zoaVBwd-QVA"
	type="text/javascript"></script>
<script type="text/javascript">

	var map;
	function initialize() {
		if (GBrowserIsCompatible()) {
			map = new GMap2(document.getElementById("map_canvas"));
			map.setCenter(new GLatLng(37.4419, -122.1419), 13);
			map.setUIToDefault();
		}
	}
	
	function luuToaDo()
	{
		if (GBrowserIsCompatible()) {
			alert("Vĩ độ = " + map.getCenter().lat() + 
					"\nKinh độ = " + map.getCenter().lng() + 
					"\nZoom = " + map.getZoom());
		}
	}
</script>
<body onload="initialize()" onunload="GUnload()">
    <div id="map_canvas" style="width: 500px; height: 300px"></div>
  </body>

<button type="button" onclick="luuToaDo()">Click Me!</button>
<div id="main" class="main section">
	<div id="Blog1" class="widget Blog">
	Tên cửa hàng: <s:property value="gianHang.tenGianHang"/>
	<s:property value="thongTin"/>
	</div>
</div>