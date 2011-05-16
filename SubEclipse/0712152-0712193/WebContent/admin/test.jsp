<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjt" uri="/struts-jquery-tree-tags"%>
<html>
<head>

<sj:head jqueryui="true" />
</head>
<body>
	<div class="normal" style="z-index: 0">
		<sj:dialog id="myeffectdialog" showEffect="slide" hideEffect="explode"
			autoOpen="false" modal="true" title="Dialog with Effect" height="400"
			openTopics="openEffectDialog" closeTopics="closeEffectDialog" >  
			<div>

				<sjt:tree id="treeDynamicAjax" jstreetheme="default"
					rootNode="danhMucGoc" childCollectionProperty="dsDanhMucCon"
					nodeTitleProperty="tenDanhMuc" nodeIdProperty="maDanhMuc"
					onClickTopics="treeClicked" />



			</div>
			<hr />
			<sj:a onClickTopics="closeEffectDialog" button="true"
				buttonIcon="ui-icon-newwin">
	    	Close effect dialog
	    </sj:a>
		</sj:dialog>
		<sj:a onClickTopics="openEffectDialog" button="true"
			buttonIcon="ui-icon-newwin">
    	Open effect dialog
    </sj:a>
	</div>

	<script type="text/javascript">
		$.subscribe('treeClicked',
				function(event, data) {
					alert('Hello!');
					var item = event.originalEvent.data.rslt.obj;
					alert('Clicked ID : ' + item.attr("id") + ' - Text '
							+ item.text());
				});
	</script>



</body>
</html>