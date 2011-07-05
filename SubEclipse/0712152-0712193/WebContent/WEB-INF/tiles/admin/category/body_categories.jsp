<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>



<link rel="stylesheet" type="text/css"
	href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css" />


<!-- load dojo and provide config via data attribute -->
<script
	src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"
	data-dojo-config="isDebug: true,parseOnLoad: true">
	
</script>
<script>
	dojo.require("dijit.layout.BorderContainer");
	dojo.require("dijit.layout.TabContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.require("dojo.parser");
</script>



<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">

		<!--  start page-heading -->
		<div class="claro"
			style="clear: both; line-height: 25px; font-size: 15px; height: 500px; width: 1000px; padding: 15px 0 15px 25px; margin: 0 20px;">
			<div id="appLayout" class="demoLayout"
				style="height: 100%; clear: none;"
				data-dojo-type="dijit.layout.BorderContainer"
				data-dojo-props="design: 'headline'">
				<div class="centerPanel" data-dojo-type="dijit.layout.TabContainer"
					data-dojo-props="region: 'center', tabPosition: 'top'">
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: 'Thêm'"
						style="line-height: 15px; margin-bottom: 0;">
						<s:include
							value="/WEB-INF/tiles/admin/category/include_addCategory.jsp"></s:include>
					</div>
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: '     Xóa     '">
						<s:include
							value="/WEB-INF/tiles/admin/category/include_deleteCategory.jsp"></s:include>
					</div>
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: 'Cập nhật'" class="font11">
						<s:include
							value="/WEB-INF/tiles/admin/category/include_updateCategory.jsp"></s:include>
					</div>
				</div>
				<div class="edgePanel" data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="region: 'top'">
					<h2>Quản lý danh mục</h2>

				</div>



				<div id="leftCol" class="edgePanel" style="width: 14em"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="region: 'left', splitter: true">

					<sjt:tree id="treeDynamicAjax" jstreetheme="default"
						rootNode="danhMucGoc" childCollectionProperty="dsDanhMucCon"
						nodeTitleProperty="tenDanhMuc" nodeIdProperty="maDanhMuc"
						onClickTopics="treeClicked" />
				</div>
				<script type="text/javascript">
					$
							.subscribe(
									'treeClicked',
									function(event, data) {
										var item = event.originalEvent.data.rslt.obj;
										//alert('Clicked ID : ' + item.attr("id"));
										var str = item.text().toString();
										str = str.replace(/^\s+|\s+$/g, '');
										str = str.replace('\n', "-");
										//document.getElementById('idTenDanhMuc').value = str.split("-",1);
										document.getElementById('labelXoa').innerText = str
												.split("-", 1);
										document.getElementById('labelThem').innerText = str
												.split("-", 1);

										document
												.getElementById('idTenDanhMucCapNhat').value = str
												.split("-", 1);

										document
												.getElementById('idIdCatalogue').value = item
												.attr("id");
										document
												.getElementById('idIdCatalogueXoa').value = item
												.attr("id");
										document
												.getElementById('idIdCatalogueCapNhat').value = item
												.attr("id");
										document
										.getElementById('slDanhMuc').value = item
										.attr("id");
									});
				</script>
			</div>

		</div>
		<div class="clear">&nbsp;</div>
	</div>
	<!--  end content-outer........................................................END -->
</div>
