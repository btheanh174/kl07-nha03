<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<div class="center_title_bar">Login</div>
    <div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
	<form method="post" action="">
	  <table width="80%" border="0" align="center" cellpadding="5">
		<tr>
		  <td colspan="2" align="center"><span class="style1">Đăng nhập hệ thống </span></td>
		</tr>
		<tr>
		  <td width="40%" align="right">Tên truy cập: </td>
		  <td align="left">
		    <s:textfield name="userName"></s:textfield>
		  </td>
		</tr>
		<tr>
		  <td align="right">Mật khẩu: </td>
		  <td align="left">
		    <s:textfield name="password"></s:textfield>
		 	</td>
		</tr>
		<tr>
		  <td align="right">&nbsp;</td>
		  <td align="left">
		    <s:checkbox name="rememberPassword" label="Nhớ mật khẩu"></s:checkbox>
	      </td>
		</tr>
		<tr>
		  <td align="right">&nbsp;</td>
		  <td align="left">
		    <s:submit value="Đăng nhập" class="btn"></s:submit>
		 </td>
	    </tr>
		<tr>
		  <td colspan="2" align="center"><p>Nếu chưa có tài khoản. Hãy <a href="<s:url action="show_user_register"/>">đăng ký</a> ngay.<br />
		    Nếu quên mật khẩu. Hãy click <a href="#">vào đây</a>. </p>
	      </td>
	    </tr>
	  </table>
	</form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
    