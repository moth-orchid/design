<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
<h1>服装销售系统</h1>
<form action="${pageContext.request.contextPath }/consumer" method="get">
<table width="100%" border=1  align="center" height="300px" title="服装销售系统">
<tr>
<td >用户名:<input type="text" name="name"></td>
</tr>
<tr>
<td >密码:   <input type="text" name="password"></td>
</tr>
<tr>
<td >身份:   <input type="text" name="status"></td>
</tr>
<tr>
<td><input type="submit" value="登录"/></td>
<td><input type="submit" value="注册"/></td>
</tr>
</table> 
</form>
</body>

</html>