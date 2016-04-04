<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>SpringMVC</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<jsp:include page="common-js/jquery-validate.jsp"></jsp:include>
<script src="<%=request.getContextPath()%>/resources/js/jquery.metadata.js" charset="UTF-8" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery-validation-1.15.0/localization/messages_zh.js" charset="UTF-8" type="text/javascript"></script>
<style type="text/css">
.error{
	color : #F00000;
	//font-family : 微软雅黑,宋体;
	font-size : 11px;
}
</style>
<script type="text/javascript">
	$(function(){
		$('#registerForm').validate();
		$("#registerForm").validate({ meta : "validate" });
		$("#registerForm").validate({
	        debug:true
	    });
	});
</script>
</head>
<body>
	<form:form method="post" modelAttribute="registerModel" id="registerForm">
		<table>
			<tr>
				<td>用户名</td>
				<td><form:input path="name" cssClass="{validate:{ required :true}}"/><form:errors path="name"></form:errors></td>
			</tr>
			<%-- <tr>
				<td>密码</td>
				<td><form:password path="password" cssClass="{validate:{ required :true}}"/><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="password" id="rePassword" name="rePassword" class="{validate:{ required :true, equalTo :'#password'}}"/></td>
			</tr> --%>
			<%-- <tr>
				<td>密码</td>
				<td><input type="password" id="rePassword" name="rePassword" class="required equalTo:'#password'"/></td>
			</tr>
			<tr>
				<td>婚姻状况</td>
				<td><form:checkbox path="maritalStatus" cssClass="required"/><form:errors path="maritalStatus"></form:errors></td>
			</tr>
			<tr>
				<td>手机</td>
				<td><form:input path="phone" cssClass="required phone"/><form:errors path="phone"></form:errors></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><form:input path="email" cssClass="required email"/><form:errors path="email"></form:errors></td>
			</tr> --%>
			<tr>
				<td colspan="2"><form:button>注册</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>