<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
<script src="<%=request.getContextPath()%>/resources/js/clipboard.min.js" charset="UTF-8" type="text/javascript"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<textarea id="bar">fdsfsfasfdfafdfdasfdsfasfs</textarea>
	<button class="btn" data-clipboard-action="copy" data-clipboard-target="#bar">复制</button>
	<script type="text/javascript">
	var clipboard = new Clipboard('.btn');

	clipboard.on('success', function(e) {
	  console.info('Action:', e.action);
	  console.info('Text:', e.text);
	  console.info('Trigger:', e.trigger);
	  e.clearSelection();
	});

	clipboard.on('error', function(e) {
	  console.error('Action:', e.action);
	  console.error('Trigger:', e.trigger);
	});
	</script>
</body>
</html>