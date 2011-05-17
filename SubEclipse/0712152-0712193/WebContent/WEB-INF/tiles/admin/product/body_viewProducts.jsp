<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">

		<!--  start page-heading -->
		<div id="page-heading">
			<h1>Danh sách sản phẩm</h1>
		</div>
		<s:url id="remoteurl" action="jsontable" />
		<s:url id="editurl" action="edit-grid-entry" />
		<sjg:grid id="gridedittable" caption="Customers Examples (Editable)"
			dataType="json" href="%{remoteurl}" pager="true" navigator="true"
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
			<sjg:gridColumn name="id" index="id" title="ID" width="30"
				formatter="integer" editable="false" sortable="false" search="true"
				searchoptions="{sopt:['eq','ne','lt','gt']}" />
			<sjg:gridColumn name="name" index="name" title="Name" width="250"
				editable="true" edittype="text" sortable="true" search="false" />
			<sjg:gridColumn name="lastName" index="lastName" title="Last Name"
				sortable="false" hidden="true" />
			<sjg:gridColumn name="firstName" index="firstName" title="First Name"
				sortable="false" hidden="true" />
			<sjg:gridColumn name="addressLine1" index="addressLine1"
				title="Adress" sortable="false" hidden="true" />
			<sjg:gridColumn name="country" index="country" title="Country"
				editable="true" edittype="select"
				editoptions="{value:'France:France;USA:USA;Australia:Australia;Norway:Norway;Poland:Poland;Germany:Germany;Spain:Spain'}"
				sortable="false" search="false" />
			<sjg:gridColumn name="city" index="city" title="City" editable="true"
				edittype="text" sortable="false" search="false" />
			<sjg:gridColumn name="creditLimit" index="creditLimit"
				title="Credit Limit" align="right" formatter="currency"
				editable="true" edittype="text" sortable="false" search="false" />
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
