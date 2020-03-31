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
<h1>商家后台管理</h1>

	<a href="${pageContext.request.contextPath }/clothesManager?sellerId=${sellerId}">删除</a>
	<%-- <table width="100%" border=1>
	<tr>
		<td>商品id</td>
		<td>商品图片</td>
		<td>商品介绍</td>
		<td>商品价格</td>
		<td>商品数量</td>
		<td>商品种类</td>
		<td>操作</td>
	</tr>
<c:forEach items="${clothesList}" var="clothes">
	<tr>
		<td>${clothes.clothesId}</td>
		<td><img src="upload/${ clothes.clothesImg}"></td>
		<td>${clothes.clothesIntroduction}</td>	
		<td>${clothes.price}</td>
		<td>${clothes.cothesCount}</td>
		<td>${clothes.sortId}</td>
		<td><a href="${pageContext.request.contextPath }/clothesDelete?clothesId=${clothes.clothesId}">删除</a></td>
	</tr>
</c:forEach> --%>
</body>
</html>