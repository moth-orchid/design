<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加消费者</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/addConsumer1" method="get">
<table width="100%" border=1  align="center" height="300px">
<tr>
<td >用户名：<input type="text" name="consumerName"></td>
</tr>
<tr>
<td >密码：<input type="text" name="consumerPassword"></td>
</tr>
<tr>
<td >邮箱：<input type="text" name="consumerEmail"></td>
</tr>
<tr>
<td >地址：<input type="text" name="consumerAddress"></td>
</tr>
<tr>
<td >电话：<input type="text" name="consumerPhone"></td>
</tr>
<tr>
<td >邮编：<input type="text" name="consumerZip"></td>
</tr>
<tr>
<td><input type="submit" value="添加"/></td>
</tr>
</table> 
</form>
</body>

</html>