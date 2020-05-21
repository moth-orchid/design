<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
<title>购物车页面</title>
<link href="css/myCart.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/myCart.js"></script>
</head>

<body>
<div id="header"><img src="images/u=2514378785,3326817705&fm=11&gp=0.jpg" alt="logo" height="80px" width="150px"/></div>
<div id="nav">您的位置：<a href="${pageContext.request.contextPath }/consumer">首页</a> > 我的购物车</div>
<div id="navlist">
  <ul>
    <li class="navlist_red_left"></li> 
    <li class="navlist_red">1. 查看购物车</li> 
    <li class="navlist_red_arrow"></li>
    <li class="navlist_gray">2. 确认订单信息</li> 
    <li class="navlist_gray_arrow"></li> 
     <li class="navlist_gray">3. 付款到支付宝</li> 
    <li class="navlist_gray_arrow"></li>   
     <!-- <li class="navlist_gray">4. 确认收货</li> 
    <li class="navlist_gray_arrow"></li> 
    <li class="navlist_gray">5. 评价</li> 
    <li class="navlist_gray_right"></li>   --> 
  </ul>
</div> 

<div id="content">
 <table width="100%" border="0" cellspacing="0" cellpadding="0" id="shopping">
 <!-- name="myform" -->
 <form action="${pageContext.request.contextPath }/order?consumerId=${consumerId}" method="get" >
  <tr>
    <td class="title_1"><input id="allCheckBox" type="checkbox" value="" onclick="selectAll()" />全选</td>
    <td class="title_2" colspan="2">店铺宝贝</td>
    <td class="title_3">获积分</td>
    <td class="title_4">单价（元）</td>
    <td class="title_5">数量</td>
    <td class="title_6">小计（元）</td>
    <td class="title_7">操作</td>
  </tr>
  <tr>
    <td colspan="8" class="line"></td>
  </tr>
  <c:forEach  items="${ realShopCart}" var="shopCart">
  <tr>
    <td colspan="8" class="shopInfo">店铺：<a href="#">${shopCart.seller.sellerName }</a>
   <%--  <input  type="hidden" name="sellerName" value="${shopCart.seller.sellerName }"/> --%></td>
  </tr>
   <tr id="product1">
    <td class="cart_td_1"><input name="cartCheckBox" type="checkbox" value="product1" onclick="selectSingle()" /></td>
    <td class="cart_td_2"><img src="${shopCart.clothes.clothesImg }" height="100px" width="100px"/>
   <%--  <input  type="hidden" name="clothesImg" value="${shopCart.clothes.clothesImg }"/> --%></td>
    <td class="cart_td_3"><a href="#">${shopCart.clothes.clothesIntroduction }</a><br />
        保障：<img src="images/taobao_icon_01.jpg" alt="icon" />
     <%--  <input  type="hidden" name="clothesIntroduction" value="${shopCart.clothes.clothesIntroduction }"/> --%>  </td>
    <td class="cart_td_4">1<!-- <input  type="hidden" name="count" value=""/> --></td>
    <td class="cart_td_5">${shopCart.clothes.price }
   <%--  <input  type="hidden" name="price" value="${shopCart.clothes.price }"/> --%></td>
    <td class="cart_td_6"><img src="images/taobao_minus.jpg" alt="minus" onclick="changeNum('num_1','minus')" class="hand"/> <input id="num_1" type="text"  value="${shopCart.count }" class="num_input" readonly="readonly"/> <img src="images/taobao_adding.jpg" alt="add" onclick="changeNum('num_1','add')"  class="hand"/></td>
    <td class="cart_td_7"></td>
    <td class="cart_td_8"><a href="javascript:deleteRow('product1');">删除</a></td>
  </tr>
  </c:forEach>
  
   <tr>
   <td  colspan="3"><a href="javascript:deleteSelectRow()"><img src="images/taobao_del.jpg" alt="delete"/></a></td>
    <td colspan="5" class="shopend">商品总价（不含运费）：<label id="total" class="yellow"></label>元<br />
   <!--  可获积分 <label class="yellow" id="integral"></label> 点<br /> -->
   <!-- <input name=" " type="image" src="images/taobao_subtn.jpg" /> -->
   <a href="${pageContext.request.contextPath }/order?consumerId=${consumerId}">立即购买</a>
  </tr>
  </form>
</table>

</div>
</body>
</html>
