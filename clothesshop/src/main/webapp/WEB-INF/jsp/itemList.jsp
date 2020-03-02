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
 <form action="${pageContext.request.contextPath }/userList" method="get">
 查询条件：
<table width="100%" border=1>
<tr>
<td>用户名称:<input type="text" name="userName"></td>
<td>用户年龄:<input type="text" name="userAge"></td>
</tr>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table> 
 
<%-- <form action="${pageContext.request.contextPath }/userList1" method="get">
新增用户：
<table width="100%" border=1>
<tr>
<td>用户id:<input type="text" name="userId"></td>
<td>用户名称:<input type="text" name="userName"></td>
<td>用户年龄:<input type="text" name="userAge"></td>
</tr>
<tr>
<td><input type="submit" value="新增"/></td>
</tr>
</table> --%>

商品列表：
<table width="100%" border=1>
	<tr>
		<td>用户id</td>
		<td>用户姓名</td>
		<td>用户年龄</td>
		<td>操作</td>
	</tr>
<c:forEach items="${userList}" var="user">
	<tr>
		<td>${user.userId}</td>
		<td>${user.userName}</td>
		<td>${user.userAge}</td>	
		<td><a href="${pageContext.request.contextPath }/userDelete?userId=${user.userId}">删除</a></td>
	</tr>
</c:forEach>

</table>
</form>
</body>

</html>