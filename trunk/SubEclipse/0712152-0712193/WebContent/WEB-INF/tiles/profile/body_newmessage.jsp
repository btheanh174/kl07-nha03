<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>


   	<div class="center_title_bar">Gửi tin nhắn</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<form action="" method="post" enctype="multipart/form-data" name="RegisterForm" id="RegisterForm">
      <table width="100%" border="0" align="center" cellpadding="5">
        
        
        <tr>
          <td width="40%" align="right">Danh sách người nhận(*): </td>
          <td align="left"><label>
            <input type="text" name="textfield4" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Tiêu đề(*):</td>
          <td align="left"><label>
            <input type="text" name="textfield5" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Nội dung(*): </td>
          <td align="left"><label>
          <textarea name="textarea"></textarea>
          (cần có 1 editor để định dạng) </label></td>
        </tr>

        <tr>
          <td align="right">Mã an toàn (*): </td>
          <td align="left"><label>
            <input type="text" name="textfield7" />
          </label></td>
        </tr>
        
        
        <tr>
          <td align="right">&nbsp;</td>
          <td align="left"><label>
            <input type="submit" name="Submit" value="Gửi" class="btn" />
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
