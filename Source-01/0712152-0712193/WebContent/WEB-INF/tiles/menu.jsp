<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="s" uri="/struts-tags" %>
	<div class="left_menu_corner"></div>

     <ul class="menu">
          <li><a href="<s:url action="show_index"/>" class="nav1">  Trang chủ </a></li>
          <li class="divider"></li>
          <li><a href="<s:url action="load_SanPham"/>" class="nav2">Sản phẩm</a></li>
          <li class="divider"></li>
          <li><a href="#" class="nav3">Rao vặt</a></li>
          <li class="divider"></li>
          <li><a href="#" class="nav3">Cửa hàng</a></li>
          <li class="divider"></li>
          <li><a href="<s:url action="show_contact_contact"/>" class="nav6">Liên hệ</a></li>
          
          <%-- <li class="divider"></li>
          <li class="currencies">Tiền tệ
          <select>
          <option>USD</option>
          <option>VNĐ</option>
          </select>
          </li> --%>
          <!-- <li class="divider"></li> -->
          <li><a href="<s:url action="show_user_login"/>" class="nav4">Đăng nhập</a></li>
          <li class="divider"></li>
          <li><a href="<s:url action="show_user_register"/>" class="nav4">Đăng ký</a></li>                         
          
     </ul>

 	<div class="right_menu_corner"></div>
    