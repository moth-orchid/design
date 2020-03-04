<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户</title>
</head>
<body> 
商家列表：
<a href="${pageContext.request.contextPath }/addSeller">添加商家</a>
<table width="100%" border=1>
	<tr>
		<td>用户id</td>
		<td>用户姓名</td>
		<td>用户地址</td>
		<td>操作</td>
	</tr>
<c:forEach items="${sellerList}" var="seller">
	<tr>
		<td>${seller.sellerId}</td>
		<td>${seller.sellerName}</td>
		<td>${seller.sellerAddress}</td>	
		<td><a href="${pageContext.request.contextPath }/sellerDelete?sellerId=${seller.sellerId}">删除</a></td>
	</tr>
</c:forEach>

</table>
</form>
</body>

</html>