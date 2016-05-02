<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.12.1.min.js" charset="UTF-8" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/resources/js/lottery.js" charset="UTF-8" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/resources/js/layer-v2.2/layer/layer.js" charset="UTF-8" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/resources/js/layer-v2.2/layer/skin/layer.css" rel="stylesheet" type="text/css" media="screen">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC-Lottery</title>
<style type="text/css">
.roll{width:50px;border:1px #ccc solid;text-align:center;}
.active{border-color:red;}
</style>
<script type="text/javascript">
	/* $(document).ready(function(){
		$("#start").bind('click',lottery.reset);
	}) */
	
	<%-- function lottery(){
		$.ajax({
			cache : false,
			type : "POST",
			url : "<%=request.getContextPath()%>/lottery/lottery",
			async : false,
			dataType : "json",
			success : function(data) {
				if(data == -1){
					layer.msg('奖品已空', {icon: 1});
				}else{
					console.info(lottery.index);
					//lottery.reset;
				}
			}
		});
	} --%>
</script>
</head>
<body>
	<table>
		<tr>
			<td id="roll-1" class="roll roll-1 active">1年超级会员</td>
			<td></td>
			<td id="roll-2" class="roll roll-2">iphone6 plus</td>
			<td></td>
			<td id="roll-3" class="roll roll-3">下载宝</td>
			<td>
		</tr>
		<tr>
			<td id="roll-8" class="roll roll-8">50元红包</td>
			<td></td>
			<td class="roll"></td>
			<td></td>
			<td id="roll-4" class="roll roll-4">10元红包</td>
			<td></td>
		</tr>
		<tr>
			<td id="roll-7" class="roll roll-7">赚钱宝</td>
			<td></td>
			<td id="roll-6" class="roll roll-6">15天迅雷会员</td>
			<td></td>
			<td id="roll-5" class="roll roll-5">1年白金会员</td>
			<td>
		</tr>
	</table>
	<button id="start" onclick="doLottery()">start</button>
	<script type="text/javascript">
	function doLottery(){
		$.ajax({
			cache : false,
			type : "POST",
			url : "<%=request.getContextPath()%>/lottery/lottery",
			async : false,
			dataType : "json",
			success : function(data) {
				if(data == -1){
					layer.msg('奖品已空', {icon: 1});
				}else{
					lottery.reset(data);
				}
			}
		});
	}
	</script>
</body>
</html>