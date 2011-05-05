<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Demo: Layout with Dijit</title>
<link rel="stylesheet" href="css/category_style.css" media="screen">
<link rel="stylesheet"
	href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css"
	media="screen">
<!-- load dojo and provide config via data attribute -->

<script
	src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"
	data-dojo-config="isDebug: true,parseOnLoad: true">
	
</script>
<script>
	dojo.require("dijit.layout.BorderContainer");
	dojo.require("dijit.layout.TabContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.require("dojo.data.ItemFileReadStore");
	dojo.require("dijit.Tree");
</script>
</head>
<body class="claro">

	<div id="appLayout" class="demoLayout"
		data-dojo-type="dijit.layout.BorderContainer"
		data-dojo-props="design: 'headline'">
		<div class="centerPanel" data-dojo-type="dijit.layout.TabContainer"
			data-dojo-props="region: 'center', tabPosition: 'bottom'">
			<div data-dojo-type="dijit.layout.ContentPane"
				data-dojo-props="title: 'Thêm'">
				<h4>Thêm danh mục</h4>
				<p>
						<s:property value="tenDanhMuc"/>
						<s:form action="DanhMuc_themDanhMuc.action" method="post"
							validate="false">
							<s:textfield id = "idTenDanhMuc" name="danhMuc.tenDanhMuc" maxlength="20"
								label="Tên danh mục " size="20" />
							<s:hidden id="idIdCatalogue" name="idCatalogue" value="0" />
							<s:submit method="themDanhMuc" key="Thêm" align="center" />
						</s:form>
				</p>

			</div>
			<div data-dojo-type="dijit.layout.ContentPane"
				data-dojo-props="title: 'Xóa'">
				<h4>Group 2 Content</h4>
			</div>
			<div data-dojo-type="dijit.layout.ContentPane"
				data-dojo-props="title: 'Sửa'">
				<h4>Group 3 Content</h4>
			</div>
		</div>
		<div class="edgePanel" data-dojo-type="dijit.layout.ContentPane"
			data-dojo-props="region: 'top'">Quản lý danh mục</div>
			
			
			
		<div id="leftCol" class="edgePanel"
			data-dojo-type="dijit.layout.ContentPane"
			data-dojo-props="region: 'left', splitter: true">
			
		<!-- Tạo JSON -->
		<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
		<%-- <s:set id="idDMRoot" name="dmRoot" value="#danhMucAction.danhMucRoot"/> --%>
		<s:hidden id="danhMucAction.danhMucroot" name="dmRoot" value ="#danhMucAction.danhMucRoot"/>		
			
			<div dojoType="dojo.data.ItemFileReadStore" jsId="continentStore"
				url="dojo-release-1.6.0-src/dijit/tests/_data/categories.json"></div>
			<div dojoType="dijit.tree.ForestStoreModel" jsId="continentModel"
				store="continentStore" 
				rootId="continentRoot" rootLabel="Danh mục"
				childrenAttrs="children"></div>
			<div dojoType="dijit.Tree" id="mytree" model="continentModel"
				openOnClick="false">
				<script type="dojo/method" event="onClick" args="item">
				document.getElementById('idIdCatalogue').value = continentStore.getValue(item, "id");
	         </script>

				<script type="text/javascript">
					dojo.addOnLoad(function() {
						alert("add On Load");
						var myObj = document.getElementById("danhMucAction.danhMucroot").value;
						
						alert(myObj);
						alert("end");
						var myJsonString = dojox.json.ref.toJson($("idDMRoot").value);
						alert(myJsonString);
						if (document.pub) {
							document.pub();
						}
					});
				</script>
			</div>

		</div>
	</div>
</body>
</html>