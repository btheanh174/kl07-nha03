<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="center_title_bar">Đăng ký thành viên, gian hàng</div>
<div class="prod_box_big">
<div class="top_prod_box_big"></div>
<div class="center_prod_box_big">
	<s:form method="post" action="User_register" validate="true">
	<s:actionerror/>
		    <s:textfield name="tenTruyCap" label="Tên truy cập (*)"></s:textfield>
		    
		    <s:password name="matKhau" label="Mật khẩu (*)"></s:password>
		    <s:password name="xacNhanMatKhau" label="Xác nhận mật khẩu (*)"></s:password>
		    
		    <s:textfield name="hoTen" label="Họ tên (*)"></s:textfield>
			
			<s:textfield name="email" label="Email (*)"></s:textfield>
			<s:textfield name="xacNhanEmail" label="Xác nhận email (*)"></s:textfield>
			
			<s:radio name="gioiTinh" list="{'Nam', 'Nữ'}" label="Giới tính"></s:radio>
			
			<s:textfield name="ngaySinh" label="Ngày sinh"></s:textfield>
			
			<s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
			<s:select name="tinhThanhPho" list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho" listValue="tenTinhThanhPho" label="Tỉnh/Thành phố"></s:select>
			
			<s:textfield name="diaChi" label="Địa chỉ"></s:textfield>
			<s:textfield name="dienThoai" label="Điện thoại"></s:textfield>
			<s:textfield name="captcha" label="Mã an toàn (*)"></s:textfield>
			
	        <s:submit value="Đăng ký"/>
	        
      <%-- <table width="100%" border="0" align="center" cellpadding="5">
        <tr>
          <td width="40%" align="right" valign="top">T&ecirc;n truy c&#7853;p: </td>
          <td align="left"><label>
            <input type="text" name="tenTruyCap" />
            <br />
          </label>- Tên truy cập không được bỏ trống.<br />
- Nếu đăng ký gian hàng, xin hãy lấy tên phù hợp với Công ty của bạn.<br />
- Ví dụ: Công ty TNHH Mai Huy thì nên lấy tên &quot;maihuy&quot;<br />
- Tên gian hàng sẽ được hiển thị http://&lt;domain&gt;/maihuy</td>
        </tr>
        
        <tr>
          <td align="right">M&#7853;t kh&#7849;u: </td>
          <td align="left"><label>
            <input type="password" name="matKhau" />
          </label></td>
        </tr>
        <tr>
          <td align="right">X&aacute;c nh&#7853;n m&#7853;t kh&#7849;u: </td>
          <td align="left"><label>
            <input type="password" name="xacNhanMatKhau" />
          </label></td>
        </tr>
        <tr>
          <td align="right">H&#7885; t&ecirc;n: </td>
          <td align="left"><label>
            <input type="text" name="hoTen" />
          </label></td>
        </tr>
        <tr>
          <td align="right">Email:</td>
          <td align="left"><label>
            <input type="text" name="email" />
          </label></td>
        </tr>
        <tr>
          <td align="right">X&aacute;c nh&#7853;n Email: </td>
          <td align="left"><label>
            <input type="text" name="xacNhanEmail" />
          </label></td>
        </tr>
        <!-- <tr>
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
 		-->        
 		<tr>
          <td align="right">Ngày sinh: </td>
          <td align="left"><label>
            <input type="text" name="textfield8" />
          (dd/mm/yyyy) </label></td>
        </tr>
        <tr>
          <td align="right">Tỉnh/Thành phố: </td>
          <td align="left"><label>
            <select name="tinhThanhPho">
              <option value="1">TP HCM</option>
              <option value="2">Hà Nội</option>
              <option value="3">Tây Ninh</option>
            </select>
          </label></td>
        </tr>
        <tr>
          <td align="right">Mã an toàn: </td>
          <td align="left"><label>
            <input type="text" name="captcha" />
          </label></td>
        </tr>
        <tr>
          <td align="right">&nbsp;</td>
          <td align="left"><label>
            <input type="checkbox" name="checkbox" value="checkbox" />
          Tôi đồng ý với các điều khoản</label></td>
        </tr>
        <tr>
          <td align="right">&nbsp;</td>
          <td align="left"><label>
            <input type="checkbox" name="checkbox2" value="checkbox" />
          Chọn nếu muốn đăng ký gian hàng</label></td>
        </tr>
        <tr>
          <td align="right">&nbsp;</td>
          <td align="left"><label>
            <input type="submit" name="DangKy" value="Đăng ký" class="btn" />
          </label>
            <label>
            <input type="submit" name="LamLai" value="Làm lại" class="btn" />
          </label></td>
        </tr>
    </table>
 		--%>  
 	</s:form>
</div>
<div class="bottom_prod_box_big"></div>
</div>
