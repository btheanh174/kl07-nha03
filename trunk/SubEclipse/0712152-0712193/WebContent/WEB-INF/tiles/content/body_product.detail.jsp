
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<sj:head/>

	   	<s:if test="sanPham.loaiSanPham.equals('DIENTHOAI')">
       	<s:include value="/WEB-INF/tiles/content/div_dienthoai.detail.jsp"></s:include>
       	</s:if>
       	<s:else>
       	<s:include value="/WEB-INF/tiles/content/div_laptop.detail.jsp">
       	</s:include>
       	</s:else>
       
       	<%-- <div class="center_title_bar">Sản phẩm cùng loại</div>
 
      	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/laptop.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
                       
            <a href="details.html" class="prod_details">Chi tiết</a>            
            </div>                     
        </div>
    
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Iphone Apple</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/p4.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
            <a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="details.html" class="prod_details">Chi tiết</a>             
            </div>                     
        </div>
 
     	<div class="prod_box">
        	<div class="top_prod_box"></div>
            <div class="center_prod_box">            
                 <div class="product_title"><a href="details.html">Samsung Webcam</a></div>
                 <div class="product_img"><a href="details.html"><img src="images/p5.gif" alt="" title="" border="0" /></a></div>
                 <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>                        
            </div>
            <div class="bottom_prod_box"></div>             
            <div class="prod_details_tab">
	            <a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
	            <a href="details.html" class="prod_details">Chi tiết</a>            
            </div>                     
        </div> --%>