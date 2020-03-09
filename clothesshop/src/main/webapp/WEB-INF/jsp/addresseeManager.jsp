<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户收货地址</title>
</head>
<body>
	地址列表：
	<a href="${pageContext.request.contextPath }/addAddress?cus_id=${consumerId}">新增</a>
<table width="100%" border=1>
	<tr>
		<td>地址id</td>
		<td>收件人</td>
		<td>收件地址</td>
		<td>电话</td>
		<td>操作</td>
	</tr>
<c:forEach items="${addressList}" var="address">
	<tr>
		<td>${address.id}</td>
		<td>${address.addressee}</td>
		<td>${address.address}</td>	
		<td>${address.phone}</td>	
		<td><a href="${pageContext.request.contextPath }/addressDelete?id=${address.id}">删除</a></td>
	</tr>
</c:forEach>

</table>
</body>

</html>