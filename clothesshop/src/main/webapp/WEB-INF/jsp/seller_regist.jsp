<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body background="${pageContext.request.contextPath }/images/seller.jpg"
 style="background-size: cover;background-repeat: no-repeat;">
<h1 align="center" >欢迎入驻</h1>
<form action="${pageContext.request.contextPath }/sellerRegist" method="get">
<table width="400px" border=1  align="center" height="300px">
<tr>
<td >用户名：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerName"></td>
</tr>
<tr>
<td >密&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerPassword"></td>
</tr>
<tr>
<td >邮&nbsp;&nbsp;&nbsp;箱：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerEmail"></td>
</tr>
<tr>
<td >地&nbsp;&nbsp;&nbsp;址：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerAddress"></td>
</tr>
<tr>
<td >电&nbsp;&nbsp;&nbsp;话：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerPhone"></td>
</tr>
<tr>
<td >邮&nbsp;&nbsp;&nbsp;编：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sellerZip"></td>
</tr>
<tr>
<td><input type="submit" value="注册"/></td>
</tr>
</table> 
</form>
</body>

</html>