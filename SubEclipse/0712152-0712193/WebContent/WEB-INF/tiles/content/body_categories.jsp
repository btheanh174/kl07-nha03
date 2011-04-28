<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<div class="center_title_bar">


	<li><a href="<s:url action="show3_admin_category_add"/>">Thêm danh mục</a></li>
	

</div>

<div class="prod_box_big">
	<div class="top_prod_box_big">Danh sách danh mục sản phẩm</div>
	</br></br>
	
			<s:bean name="model.bean.DanhMucBean" var="danhMucBean"></s:bean>
			<sx:tree id="books" label="Danh sách danh mục" title="test">
				<s:iterator id="root" value="#danhMucBean.dsDanhMuc"
					status="danhMucStatus">
					<s:include value="/admin/category/treenode.jsp" />
					<%-- <sx:treenode label="%{#root.tenDanhMuc}"></sx:treenode> --%>
				</s:iterator>
			</sx:tree>

	<div class="bottom_prod_box_big"></div>
</div>
