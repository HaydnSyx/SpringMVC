<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/resources/js/layer-v2.2/layer/layer.js" charset="UTF-8" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/resources/js/layer-v2.2/layer/skin/layer.css" rel="stylesheet" type="text/css" media="screen">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
<script type="text/javascript">
	function del(id){
		layer.confirm('您确定要删除此条信息？', {icon: 3, title:'询问'}, function(index) {
			$.ajax({
				type : "get",
				url : "<%=request.getContextPath()%>/mybatis/delete/" + id,
				cache : false,
				success : function() {
					layer.alert("删除成功", {
						icon : 6
					},function(index){
						window.location.replace("<%=request.getContextPath()%>/mybatis/init");
					});
				}
			});
		});
	}
</script>
</head>
<body>
	<a href="<%=request.getContextPath()%>/mybatis/detail">添加\修改</a>
	<br>
	<table border="1" bordercolor="#a0c6e5" style="border-collapse: collapse;">
		<tr>
			<th align="center">姓名</th>
			<th align="center">密码</th>
			<th align="center">年龄</th>
			<th align="center">生日</th>
			<th align="center">工资</th>
			<th align="center">是否有手机</th>
			<th align="center">性别</th>
			<th align="center">地址</th>
			<th align="center">操作</th>
		</tr>
		<c:forEach var="user" items="${userList}">
			<tr>
				<td align="center"><a href="<%=request.getContextPath() %>/mybatis/detail?id=${user.id}" style="text-decoration: none;">${user.name}</a></td>
				<td align="center">${user.password}</td>
				<td align="center">${user.age}</td>
				<td align="center"><fmt:formatDate value="${user.birthday}" type="date" dateStyle="long"/></td>
				<td align="center"><fmt:formatNumber type="currency">${user.moeny}</fmt:formatNumber></td>
				<c:if test="${user.hasPhone}"><td align="center">√</td></c:if>
				<c:if test="${user.hasPhone == false}"><td align="center">×</td></c:if>
				<c:if test="${user.sex == 1}"><td align="center">男</td></c:if>
				<c:if test="${user.sex == 2}"><td align="center">女</td></c:if>
				<td align="center" width="400px">${user.address}</td>
				<td align="center"><a href="#" style="text-decoration: none;" onclick="del('${user.id}')">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>