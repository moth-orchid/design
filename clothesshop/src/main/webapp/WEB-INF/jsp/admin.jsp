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
<h2>这是管理员页面：</h2>
<a href="${pageContext.request.contextPath }/consumerManager">消费者管理</a>
<a href="${pageContext.request.contextPath }/sellerManager">商家管理</a>
<a href="${pageContext.request.contextPath }/">商品管理</a>
</body>
</html>