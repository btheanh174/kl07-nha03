<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.: Edit User :.</title>
</head>
<body>
	
	<s:form>
			<s:hidden name="id"></s:hidden>
			<s:textfield name="userName" label="User Name" value="userName"></s:textfield>
			<s:password name="password" label="Password" value="password"></s:password>
			<s:radio list="{'Male', 'Female'}" name="gender" label="Gender"></s:radio>
			<s:textarea name="about" label="About You" value="about"></s:textarea>
			<s:submit value="Save"/>
	</s:form>
</body>
</html>