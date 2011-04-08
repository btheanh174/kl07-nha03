<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!--<sx:div id="loginDiv" highlightColor="#234567">
	<div style="border-style: solid; background-color: gray; height: 100%;">
	<s:form
		action="User_login">
		<tr>
			<td colspan="2" align="center"><h3 style="text-align: center; color: blue;">Đăng nhập</h3></td>
			
		</tr>
		<tr>
			<td colspan="2"><s:actionerror /></td>
		</tr>
		<tr>
			<s:textfield name="userName" label="Tên đăng nhập"></s:textfield>
			<s:password name="password" label="Mật khẩu"></s:password>
			<sx:submit value="Đăng nhập" align="center" targets="loginDiv"
				notifyTopics="/User_login"></sx:submit>
		</tr>
	</s:form>
	</div>
</sx:div>
-->

<div style="border-style: solid; background-color: gray; height: 100%;">
	<s:form
		action="User_login">
		<tr>
			<td colspan="2" align="center"><h3 style="text-align: center; color: blue;">Đăng nhập</h3></td>
			
		</tr>
		<tr>
			<td colspan="2"><s:actionerror /></td>
		</tr>
		<tr>
			<s:textfield name="userName" label="Tên đăng nhập"></s:textfield>
			<s:password name="password" label="Mật khẩu"></s:password>
			<s:submit value="Đăng nhập" align="center"></s:submit>
		</tr>
	</s:form>
</div>