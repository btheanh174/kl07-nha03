<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>


   	<div class="center_title_bar">Đổi mật khẩu</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<form action="" method="post" enctype="multipart/form-data" name="RegisterForm" id="RegisterForm">
      <table width="100%" border="0" align="center" cellpadding="5">
        
        
        <tr>
          <td width="40%" align="right">Mật khẩu cũ (*): </td>
          <td align="left"><label>
            <input type="password" name="matKhauCu" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Mật khẩu mới (*):</td>
          <td align="left"><label>
            <input type="password" name="matKhauMoi" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Xác nhận mật khẩu (*): </td>
          <td align="left"><label>
            <input type="password" name="xacNhanMatKhau" />
          </label></td>
        </tr>

        <tr>
          <td align="right">Mã an toàn (*): </td>
          <td align="left"><label>
            <input type="text" name="captcha" />
          </label></td>
        </tr>
        
        
        <tr>
          <td align="right">&nbsp;</td>
          <td align="left"><label>
            <input type="submit" name="Submit" value="Cập nhật" class="btn" />
          </label>
            <label>
            <input type="submit" name="Submit2" value="Làm lại" class="btn" />
          </label></td>
        </tr>
    </table>
  </form>
	</div>
	<div class="bottom_prod_box_big"></div>
	</div>
    