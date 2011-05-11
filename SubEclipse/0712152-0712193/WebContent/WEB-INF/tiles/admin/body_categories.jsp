<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



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


<div class="claro">
	<!-- start content-outer ........................................................................................................................START -->
	<div id="content-outer">
		<!-- start content -->
		<div id="content">

			<!--  start page-heading -->
			<div id="page-heading">
				<h1>Add product</h1>
			</div>
			<!-- end page-heading -->

			<table border="0" width="100%" cellpadding="0" cellspacing="0"
				id="content-table">
				<tr>
					<th rowspan="3" class="sized"><img
						src="images/shared/side_shadowleft.jpg" width="20" height="300"
						alt="" />
					</th>
					<th class="topleft"></th>
					<td id="tbl-border-top">&nbsp;</td>
					<th class="topright"></th>
					<th rowspan="3" class="sized"><img
						src="images/shared/side_shadowright.jpg" width="20" height="300"
						alt="" />
					</th>
				</tr>
				<tr>
					<td id="tbl-border-left"></td>
					<td>
						<!--  start content-table-inner ...................................................................... START -->
						<div id="content-table-inner">

							<!--  start table-content  -->
							<div id="table-content">
								<div style="width: 1100px; height: 500px">
									<div id="appLayout" class="demoLayout" style="height: 100%"
										data-dojo-type="dijit.layout.BorderContainer"
										data-dojo-props="design: 'headline'">
										<div class="centerPanel"
											data-dojo-type="dijit.layout.TabContainer"
											data-dojo-props="region: 'center', tabPosition: 'bottom'">
											<div data-dojo-type="dijit.layout.ContentPane"
												data-dojo-props="title: 'Thêm'">
												<h4>Thêm danh mục</h4>
											

											</div>
											<div data-dojo-type="dijit.layout.ContentPane"
												data-dojo-props="title: 'Xóa'">
												<h4>Group 2 Content</h4>
											</div>
											<div data-dojo-type="dijit.layout.ContentPane"
												data-dojo-props="title: 'S?a'">
												<h4>Group 3 Content</h4>
											</div>
										</div>
										<div class="edgePanel"
											data-dojo-type="dijit.layout.ContentPane"
											data-dojo-props="region: 'top'">
											<h2>Quản lý danh mục</h2>
											</div>



										<div id="leftCol" class="edgePanel" style="width: 14em"
											data-dojo-type="dijit.layout.ContentPane"
											data-dojo-props="region: 'left', splitter: true">
											Cây danh mục (update later)...
											</div>
										
									</div>
								</div>


							</div>
							<!--  end table-content  -->

							<div class="clear"></div>

						</div> <!--  end content-table-inner ............................................END  -->
					</td>
					<td id="tbl-border-right"></td>
				</tr>
				<tr>
					<th class="sized bottomleft"></th>
					<td id="tbl-border-bottom">&nbsp;</td>
					<th class="sized bottomright"></th>
				</tr>
			</table>
			<div class="clear">&nbsp;</div>

		</div>
		<!--  end content -->
		<div class="clear">&nbsp;</div>
	</div>
	<!--  end content-outer........................................................END -->
	</div>
