<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link rel="Stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css" />
</head>
<body onload='document.loginForm.username.focus();'>
	<div id="login-box">
		<h3>Login with Username and Password</h3>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		<form name='loginForm'
			action="<%=request.getContextPath() %>/j_spring_security_check" method='POST'>
			<table>
				<tr>
					<td>用户:</td>
					<td><input type='text' name='j_username'></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type='password' name='j_password' /></td>
				</tr>
				<tr>
					<td>记住我一周:</td>
					<td><input type="checkbox" id="remember_me" name='_spring_security_remember_me' /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit" value="提交" /></td>
				</tr>
			</table>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
</body>
</html>