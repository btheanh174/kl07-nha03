<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<script type="text/javascript">
	$.subscribe('rowselect', function(event, data) {
		$("#gridinfo").html(
				'<p>Edit Mode for Row : ' + event.originalEvent.id + '</p>');
	});
	$.subscribe('oneditsuccess', function(event, data) {
		var message = event.originalEvent.response.statusText;
		$("#gridinfo").html('<p>Status: ' + message + '</p>');
	});
	$.subscribe('rowadd', function(event, data) {
		$("#gridedittable").jqGrid('editGridRow', "new", {
			height : 280,
			reloadAfterSubmit : false
		});
	});
	$.subscribe('searchgrid', function(event, data) {
		$("#gridedittable").jqGrid('searchGrid', {
			sopt : [ 'cn', 'bw', 'eq', 'ne', 'lt', 'gt', 'ew' ]
		});
	});
	$.subscribe('showcolumns', function(event, data) {
		$("#gridedittable").jqGrid('setColumns', {});
	});
	</pre>
</script>


<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">

		<!--  start page-heading -->
		<div id="page-heading">
			<h1>Danh sách sản phẩm</h1>
		</div>
		<s:url id="remoteurl" action="jsonBangSanPham" />
		<s:url id="editurl" action="edit-grid-entry" />
		<sjg:grid id="gridedittable" caption="Customers Examples (Editable)"
			dataType="json" href="%{remoteurl}" pager="true" navigator="true"
			rownumbers="true"
			navigatorSearchOptions="{sopt:['eq','ne','lt','gt']}"
			navigatorAddOptions="{height:280,reloadAfterSubmit:true}"
			navigatorEditOptions="{height:280,reloadAfterSubmit:false}"
			navigatorEdit="false" navigatorView="false" navigatorDelete="true"
			navigatorDeleteOptions="{height:280,reloadAfterSubmit:true}"
			navigatorExtraButtons="{
    		seperator: { 
    			title : 'seperator'  
    		}, 
    		hide : { 
	    		title : 'Show/Hide', 
	    		icon: 'ui-icon-wrench', 
	    		topic: 'showcolumns'
    		},
    		alert : { 
	    		title : 'Alert', 
	    		onclick: function(){ alert('Grid Button clicked!') }
    		}
    	}"
			gridModel="gridModel" rowList="10,15,20" rowNum="15"
			editurl="%{editurl}" editinline="true" onSelectRowTopics="rowselect"
			onEditInlineSuccessTopics="oneditsuccess" viewrecords="true">
			<sjg:gridColumn name="maSanPham" index="maSanPham" title="Mã"
				width="30" formatter="integer" editable="false" sortable="false"
				search="true" searchoptions="{sopt:['eq','ne','lt','gt']}" />
			<sjg:gridColumn name="tenSanPham" index="tenSanPham" title="Tên"
				width="250" editable="true" edittype="text" sortable="true"
				search="false" />
			<sjg:gridColumn name="gia" index="gia" title="Giá tham khảo"
				align="right" formatter="currency" editable="true" edittype="text"
				sortable="false" search="false" />
			<sjg:gridColumn name="hangSanXuat" index="hangSanXuat" title="Hãng sản xuất"
				sortable="false"/>
			<sjg:gridColumn name="loaiSanPham" index="loaiSanPham" title="Loại"
				editable="true" edittype="select"
				editoptions="{value:'LAPTOP:LAPTOP;DIENTHOAI:DIENTHOAI'}"
				sortable="false" search="false" />
		</sjg:grid>
		<br />
		<sj:submit id="grid_edit_addbutton" value="Add Row"
			onClickTopics="rowadd" button="true" />
		<sj:submit id="grid_edit_searchbutton" value="Search"
			onClickTopics="searchgrid" button="true" />
		<sj:submit id="grid_edit_colsbutton" value="Show/Hide Columns"
			onClickTopics="showcolumns" button="true" />
		<br /> <br />
		<div id="gridinfo" class="ui-widget-content ui-corner-all">
			<p>Edit Mode for Row :</p>
		</div>


		<div class="clear">&nbsp;</div>
	</div>
	<!--  end content-outer........................................................END -->
</div>
