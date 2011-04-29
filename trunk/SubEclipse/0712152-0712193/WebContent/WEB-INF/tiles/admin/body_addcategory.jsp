<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>



<div class="center_title_bar" align="center">Thêm danh mục</div>

<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
			<s:bean name="action.DanhMucAction" var="danhMucAction"></s:bean>
		<s:form action="DanhMuc_themDanhMuc.action" method="post" validate="true">
			<s:textfield name="danhMuc.tenDanhMuc" maxlength="20" label="Tên danh mục "
				size="20" />
			<s:select  name="idCatalogue"  value="" label="Chọn tên danh mục cha "
				list="#danhMucAction.dsDanhMucShow" listKey="maDanhMuc"
				listValue="tenDanhMuc" />
			<s:submit method="themDanhMuc" key="Thêm"
				align="center" />
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
