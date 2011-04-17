<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

   	<div class="center_title_bar">Danh Muc Sản Phẩm</div>
    
    <div class="prod_box_big">
       	<div class="top_prod_box_big"></div>
        <div class="center_prod_box_big">                        
			<table>
				<tr>
					<th>Mã</th>
					<th>Tên sản phẩm</th>
					<th>Giá</th>
					<th>Mô tả ngắn</th>
					<th>Mô tả dài</th>
					<th>Danh mục</th>
				</tr>
				<s:iterator value="dsSanPham">
					<tr>
						<td> <s:property value="maSanPham"/> </td>
						<td> <s:property value="tenSanPham"/> </td>
						<td> <s:property value="gia"/> </td>
						<td> <s:property value="moTaNgan"/> </td>
						<td> <s:property value="moTaDai"/> </td>
						<td> <s:property value="danhMuc.tenDanhMuc"/> </td>
					</tr>
				</s:iterator>
			</table>                                     
        </div>
        <div class="bottom_prod_box_big"></div>                                
     </div>
