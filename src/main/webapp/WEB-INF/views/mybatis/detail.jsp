<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
<script type="text/javascript">
</script>
</head>
<body>
	<form:form modelAttribute="userModel" action="save" method="post">
		<form:hidden path="id"/>
		<table width="500px">
			<tr>
				<td width="20%">姓名：</td>
				<td width="80%"><form:input path="name"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><form:input path="age"/></td>
			</tr>
			<tr>
				<td>生日：</td>
				<td><form:input path="birthday"/></td>
			</tr>
			<tr>
				<td>工资：</td>
				<td><form:input path="moeny"/></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><form:radiobuttons path="sex" items="${userModel.sexMap}"/></td>
			</tr>
			<tr>
				<td>是否有手机：</td>
				<td><form:checkbox path="hasPhone"/></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><form:textarea path="address" cssStyle="height: 70px;resize: none;"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><form:button>保存</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>