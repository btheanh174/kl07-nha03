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
		<div id="page-heading">
			<h1>Add product</h1>
		</div>
		<div class="claro"
			style="clear: both; line-height: 25px; font-size: 15px; height: 500px; width: 1200px; padding: 15px 0 15px 25px; margin: 0 20px;">
			<div id="appLayout" class="demoLayout"
				style="height: 100%; clear: none;"
				data-dojo-type="dijit.layout.BorderContainer"
				data-dojo-props="design: 'headline'">
				<div class="centerPanel" data-dojo-type="dijit.layout.TabContainer"
					data-dojo-props="region: 'center', tabPosition: 'top'">
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: 'Thêm'"
						style="line-height: 15px; margin-bottom: 0;">
						<h4>Thêm danh mục</h4>
						<br />
						<s:form action="DanhMuc_themDanhMuc.action" method="post"
							validate="true">
							<s:textfield name="danhMuc.tenDanhMuc" maxlength="20"
								label="Tên danh mục " size="20" id="idTenDanhMuc" />
							<s:hidden id="idIdCatalogue" name="idCatalogue" value="0" />
							<s:submit method="themDanhMuc" key="    Thêm    " align="center" />
						</s:form>


					</div>
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: '     Xóa     '">
						<h4>Xóa danh mục</h4>
						<s:form action="DanhMuc_xoaDanhMuc.action" method="post"
							validate="false">
							<s:label id="labelXoa" label="Danh mục cần xóa: "></s:label>
							<s:textfield name="danhMuc.tenDanhMuc" maxlength="20"
								label="Tên danh mục " size="20" id="idTenDanhMuc" />
							<s:hidden id="idIdCatalogueXoa" name="idCatalogue" value="0" />
							<s:submit method="xoaDanhMuc" key="     Xóa      " align="left" />
						</s:form>
					</div>
					<div data-dojo-type="dijit.layout.ContentPane"
						data-dojo-props="title: 'Cập nhật'" class="font11">
						<h4>Cập nhật danh mục</h4>
						<s:form action="DanhMuc_capNhatDanhMuc.action" method="post"
							validate="false">

							<s:textfield name="danhMuc.tenDanhMuc" maxlength="20"
								label="Tên danh mục " size="20" id="idTenDanhMucCapNhat" />
							<s:hidden id="idIdCatalogueCapNhat" name="idCatalogue" value="0" />
							<s:label id="labelDanhMucCha" label="Danh mục cha: "></s:label>

							<sj:dialog id="myeffectdialog" showEffect="slide"
								hideEffect="explode" autoOpen="false" modal="true"
								title="Dialog with Effect" height="400"
								openTopics="openEffectDialog" closeTopics="closeEffectDialog">
								<div style="width: 100%; height: 400px; clear: both; line-height: 25px; font-size: 100%">

									<sjt:tree id="subtreeDynamicAjax" jstreetheme="default"
										rootNode="danhMucGoc" childCollectionProperty="dsDanhMucCon"
										nodeTitleProperty="tenDanhMuc" nodeIdProperty="maDanhMuc"
										onClickTopics="treeClicked" />

								</div>
								<hr />
								<sj:a onClickTopics="closeEffectDialog" button="true"
									buttonIcon="ui-icon-newwin">
	    	Đóng
	    </sj:a>
							</sj:dialog>
							<sj:a onClickTopics="openEffectDialog" button="true"
								buttonIcon="ui-icon-newwin">
						    	Chọn danh mục cha
						    </sj:a>

							<s:submit method="capNhatDanhMuc" key="     Cập nhật      "
								align="left" />
						</s:form>
					</div>
				</div>
				<div class="edgePanel" data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="region: 'top'">
					<h2>Quản lý danh mục</h2>
					<label id="labelTitle">Root</label>
				</div>



				<div id="leftCol" class="edgePanel" style="width: 14em"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="region: 'left', splitter: true">

					<s:url id="echo" value="echo.action" />
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
										//alert('Clicked ID : ' + item.attr("id") + ' - Text ' + item.text());
										var str = item.text().toString();
										str = str.replace(/^\s+|\s+$/g, '');
										str = str.replace('\n', "-");
										//document.getElementById('idTenDanhMuc').value = str.split("-",1);
										document.getElementById('labelXoa').innerText = str
												.split("-", 1);
										document.getElementById('labelTitle').innerText = str
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
									});
				</script>
			</div>

		</div>
		<div class="clear">&nbsp;</div>
	</div>
	<!--  end content-outer........................................................END -->
</div>
