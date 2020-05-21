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
<body background="${pageContext.request.contextPath }/images/u=2598104198,3797992104&fm=26&gp=0.jpg"
 style="background-size: cover;background-repeat: no-repeat;">
 <h1 align="center" >欢迎来到服装商城</h1>
<form action="${pageContext.request.contextPath }/consumer" method="get">
<table width="400px" border=1  align="center" height="300px">
<tr>
<td >用户名：&nbsp;&nbsp;&nbsp;&nbsp;<input name="name"  type="text"></td>
</tr>
<tr>
<td >密&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;&nbsp;<input name="password" type="text"></td>
</tr>
<tr>
<td >身&nbsp;&nbsp;&nbsp;份：&nbsp;&nbsp;&nbsp;&nbsp;<input name="status"  type="text" ></td>
</tr>
<tr>
<td><input type="submit" value="登录"/></td>
</tr>
</table> 
</form>
</body>

</html>