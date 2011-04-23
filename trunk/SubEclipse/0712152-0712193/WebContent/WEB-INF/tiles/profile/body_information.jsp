<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="s" uri="/struts-tags" %>


   	<div class="center_title_bar">Thông tin cá nhân</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<form action="" method="post" enctype="multipart/form-data" name="RegisterForm" id="RegisterForm">
      <table width="100%" border="0" align="center" cellpadding="5">
        <tr>
          <td width="40%" align="right" valign="top">Hình đại diện: </td>
          <td align="left"><label>
            <input type="file" name="file" />
          </label></td>
        </tr>
        
        <tr>
          <td align="right">H&#7885; t&ecirc;n: </td>
          <td align="left"><label>
            <input type="text" name="textfield4" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Email:</td>
          <td align="left"><label>
            <input type="text" name="textfield5" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Website: </td>
          <td align="left"><label>
            <input type="text" name="textfield6" />
          </label></td>
        </tr>

        <tr>
          <td height="34" align="right">Gi&#7899;i t&iacute;nh: </td>
          <td align="left"><table width="178">
            <tr>
              <td width="76"><label>
                <input type="radio" name="RadioGroup1" value="radNam" />
                Nam</label></td>

              <td width="112"><label>
                <input type="radio" name="RadioGroup1" value="radNu" />
                Nữ</label></td>
		            </tr>
          </table>            <label></label></td>
        </tr>
        <tr>
          <td align="right">Ngày sinh: </td>
          <td align="left"><label>
12.04.2011          (dd/mm/yyyy) </label></td>
        </tr>
        <tr>
          <td align="right">Tỉnh/Thành phố: </td>
          <td align="left"><label>
            <select name="select2">
              <option value="1">TP HCM</option>
              <option value="2">Hà Nội</option>
              <option value="3">Tây Ninh</option>
            </select>
          </label></td>
        </tr>
        <tr>
          <td align="right">Mã an toàn: </td>
          <td align="left"><label>
            <input type="text" name="textfield7" />
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