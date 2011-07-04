<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>


<%-- <div class="prod_box_big">
	<div class="top_prod_box_big">Danh sách danh mục sản phẩm</div>
	

	<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
	<sx:tree id="books" label="Danh sách danh mục" title="test">
		<s:iterator id="root" value="#danhMucAction.dsDanhMuc"
			status="danhMucStatus">
			<s:if test="#root.capDanhMuc == 1">
				<s:include value="/admin/category/treenode.jsp" />
				<s:property value="#root.tenDanhMuc" />
			</s:if>
		</s:iterator>
	</sx:tree>
	<sx:tabbedpanel id=""></sx:tabbedpanel>

	<div class="bottom_prod_box_big"></div>
</div> --%>

<html>
<head>

<title>Quản lý danh mục</title>
<style type="text/css">
@import "dojo-release-1.6.0-src/dijit/themes/tundra/tundra.css";

@import "css/dojo.css" body , html { font-family:helvetica , arial , sans-serif
	;
font-size




:




90%;
}
</style>

<script
	src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"
	djConfig="parseOnLoad: true,locale: 'vi'">
	
</script>
<script type="text/javascript">
	dojo.require("dojo.parser");
	dojo.require("dijit.layout.SplitContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.require("dojo.data.ItemFileReadStore");
	dojo.require("dijit.Tree");
</script>
<link rel="stylesheet" type="text/css"
	href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css" />
</head>
<body class="tundra">
	<div class="center_title_bar">
		<a href="<s:url action="show3_admin_category_add"/>">Thêm danh mục</a>
		<a href="<s:url action="show3_admin_category_delete"/>">Xóa danh
			mục</a> <a href="<s:url action="show3_admin_category_update"/>">Sửa
			danh mục</a>
	</div>

	<div dojoType="dijit.layout.SplitContainer" orientation="horizontal"
		sizerWidth="10" activeSizing="true"
		style="border: 1px solid #000000; width: 570px; height: 400px;">

		<div dojoType="dijit.layout.ContentPane" sizeMin="10" sizeShare="10">
			<p>
				<b>Danh sách danh mục</b>
			</p>

			<div dojoType="dojo.data.ItemFileReadStore" jsId="continentStore"
				url="dojo-release-1.6.0-src/dijit/tests/_data/countries.json"></div>
			<div dojoType="dijit.tree.ForestStoreModel" jsId="continentModel"
				store="continentStore" query="{type:'continent'}"
				rootId="continentRoot" rootLabel="Continents"
				childrenAttrs="children"></div>
			<div dojoType="dijit.Tree" id="mytree" model="continentModel"
				openOnClick="false">
				<script type="dojo/method" event="onClick" args="item">
                alert("Execute of node " + continentStore.getLabel(item) + ", population=" + continentStore.getValue(item, "population"));
            </script>
			</div>

		</div>
		<div dojoType="dijit.layout.ContentPane" sizeMin="10" sizeShare="10">
			<p>
				<b>Chi tiết</b>
			</p>

			<s:form action="DanhMuc_themDanhMuc.action" method="post"
				validate="true">
				<s:textfield name="danhMuc.tenDanhMuc" maxlength="20"
					label="Tên danh mục " size="20" />
				<s:select name="idCatalogue" value="" label="Chọn tên danh mục cha "
					list="#danhMucAction.dsDanhMucShow" listKey="maDanhMuc"
					listValue="tenDanhMuc" />
				<s:submit method="themDanhMuc" key="Thêm" align="center" />
			</s:form>


		</div>
	</div>

</body>
</html>
