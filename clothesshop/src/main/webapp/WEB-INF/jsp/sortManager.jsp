<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>类别管理</title>
</head>
<body> 
分类列表：
<a href="${pageContext.request.contextPath }/addSort">新增类别</a>
<table width="100%" border=1>
	<tr>
		<td>类别id</td>
		<td>类别名称</td>
		<td>操作</td>
	</tr>
<c:forEach items="${sortList}" var="sort">
	<tr>
		<td>${sort.sortId}</td>
		<td>${sort.sortName}</td>
		<td><a href="${pageContext.request.contextPath }/sortDelete?sortId=${sort.sortId}">删除</a></td>
	</tr>
</c:forEach>

</table>
</form>
</body>

</html>