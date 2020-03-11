<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加收货地址</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/addAddress1" method="get">
<table width="100%" border=1  align="center" height="300px">
<tr>
<td >收件人：<input type="text" name="addressee"></td>
</tr>
<tr>
<td >收件地址;<input type="text" name="address"></td>
</tr>
<tr>
<td >电话：<input type="text" name="phone"></td>
<input  type="hidden" name="consumerId" value="${consumerId}" >
</tr>
<tr>
<td><input type="submit" value="添加"/></td>
</tr>
</table> 
</form>
</body>

</html>