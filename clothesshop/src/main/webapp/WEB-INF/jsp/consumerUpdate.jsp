<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>
个人信息：
<table width="100%" border=1>
	<tr>
		<td>id</td>
		<td>用户名</td>
		<td>密码</td>
		<td>邮箱</td>
		<td>地址</td>
		<td>电话</td>
		<td>邮编</td>
	</tr>
<c:forEach items="${consumer}" var="consumer">
	<tr>
		<td>${consumer.consumerId}</td>
		<td>${consumer.consumerName}</td>
		<td>${consumer.consumerPassword}</td>	
		<td>${consumer.consumerEmail}</td>
		<td>${consumer.consumerAddress}</td>
		<td>${consumer.consumerPhone}</td>
		<td>${consumer.consumerZip}</td>
	</tr>
</c:forEach>
</table> 
</form>
</body>

</html>