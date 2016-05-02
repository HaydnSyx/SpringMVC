<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
</head>
<body>
	<h4>Hello！你访问的时间为：</h4>
	<strong>${time}</strong>
	<br />
	<a href="<%=request.getContextPath()%>/test/login">login测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/test/register">register测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/test/json/init">json测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/webflow/init">webflow测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/mybatis/init">mybatis测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/security/init">security测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/ehcache/init">ehcache测试页面</a>
	<br />
	<a href="<%=request.getContextPath()%>/lottery/init">抽奖测试页面</a>
</body>
</html>