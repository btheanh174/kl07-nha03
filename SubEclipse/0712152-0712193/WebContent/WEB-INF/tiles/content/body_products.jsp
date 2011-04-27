<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

   	<div class="center_title_bar">Danh Muc Sản Phẩm</div>
    
            
			
			
			<%-- <table>
				<tr>
					<th>Tên sản phẩm</th>
					<th>Giá</th>
					<th>Nhà sản xuất</th>
				</tr>
				<s:iterator value="listSanPham">
					<tr>
						<td> <s:property value="tenSanPham"/> </td>
						<td> <s:property value="gia"/> </td>
						<td> <s:property value="nhaSanXuat"/> </td>
					</tr>
				</s:iterator>
			</table>        --%>   
			
			
			
		 <s:iterator value="listSanPham" status="statusSanPham">
	     	<div class="prod_box">
	     		 <div class="top_prod_box"></div>
		         <div class="center_prod_box">            
		              <div class="product_title"><a href="details.html"><s:property value="tenSanPham"/></a></div>
		              <div class="product_img"><a href="details.html">
		              		<img src="<s:property value="dsHinhAnh.get(0).urlHinhAnh"/>" alt="" title="" border="0" />
		              </a></div>
		              <div class="prod_price"><span class="reduce">350$</span> <span class="price"><s:property value="gia"/></span></div>                        
		         </div>
		         <div class="bottom_prod_box"></div>             
		         <div class="prod_details_tab">
		         <a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
		         <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="images/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
		         <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="images/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
		         <a href="#" class="prod_details">Chi tiết</a>            
		         </div>                     
	     	</div>
 
     </s:iterator>
			                           
  
     
     
     
    