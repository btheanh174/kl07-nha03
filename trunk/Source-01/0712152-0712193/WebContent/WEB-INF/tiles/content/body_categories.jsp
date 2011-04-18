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
					<th>Tên</th>
				</tr>
				<s:iterator value="dsDanhMuc">
					<tr>
						<td> <s:property value="maDanhMuc"/> </td>
						<td> <s:property value="tenDanhMuc"/> </td>
					</tr>
				</s:iterator>
			</table>                                     
        </div>
        <div class="bottom_prod_box_big"></div>                                
     </div>
