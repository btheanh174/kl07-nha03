<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<div class="center_title_bar">
	<a href="<s:url action="show3_admin_category_add"/>">Thêm danh mục</a>

	<a href="<s:url action="show3_admin_category_delete"/>">Xóa danh
		mục</a>



</div>

<div class="prod_box_big">
	<div class="top_prod_box_big">Danh sách danh mục sản phẩm</div>
	

	<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
	<sx:tree id="books" label="Danh sách danh mục" title="test">
		<s:iterator id="root" value="#danhMucAction.dsDanhMuc"
			status="danhMucStatus">
			<s:if test="#root.capDanhMuc == 1">
				<s:include value="/admin/category/treenode.jsp" />
			</s:if>
		</s:iterator>
	</sx:tree>

	<div class="bottom_prod_box_big"></div>
</div>
