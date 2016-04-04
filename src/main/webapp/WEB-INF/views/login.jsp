<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<style type="text/css">
.error{
	color : #F00000;
	font-family : 微软雅黑,宋体;
	font-size : 11px;
}
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<form:form method="post" modelAttribute="loginModel" id="loginForm">
		<table>
			<tr>
				<td>用户名</td>
				<td><form:input path="name"/><form:errors path="name" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><form:password path="password"/><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2"><form:button>登录</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>