<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
</head>
<body>
	<h4>Hello！开始测试Spring Security</h4>
	您好：${pageContext.request.userPrincipal.name}
	<br>
	<a href="<%=request.getContextPath() %>/j_spring_security_logout">退出</a>
</body>
</html>