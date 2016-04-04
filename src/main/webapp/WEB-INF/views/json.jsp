<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
<script type="text/javascript">
	function abc(){
		$.ajax({
			cache : true,
			type : "POST",
			url : "<%=request.getContextPath()%>/test/json/study",
			async : false,
			dataType : "json",
			success : function(json) {
				console.info(json);
			}
		});
	}
</script>
</head>
<body>
	<a href="#" onclick="abc()">测试</a>
</body>
</html>