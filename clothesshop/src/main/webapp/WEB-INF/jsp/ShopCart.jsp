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
<!-- <div id="header"><img src="images/taobao_logo.gif" alt="logo" /></div>
<div id="nav">您的位置：<a href="#">首页</a> > <a href="#">我的淘宝</a> > 我的购物车</div>
<div id="navlist">
  <ul>
    <li class="navlist_red_left"></li> 
    <li class="navlist_red">1. 查看购物车</li> 
    <li class="navlist_red_arrow"></li>
    <li class="navlist_gray">2. 确认订单信息</li> 
    <li class="navlist_gray_arrow"></li> 
     <li class="navlist_gray">3. 付款到支付宝</li> 
    <li class="navlist_gray_arrow"></li>   
     <li class="navlist_gray">4. 确认收货</li> 
    <li class="navlist_gray_arrow"></li> 
    <li class="navlist_gray">5. 评价</li> 
    <li class="navlist_gray_right"></li>   
  </ul>
</div> -->

<div id="content">
 <table width="100%" border="0" cellspacing="0" cellpadding="0" id="shopping">
 <form action="" method="post" name="myform">
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
  <tr>
    <td colspan="8" class="shopInfo">店铺：<a href="#">纤巧百媚时尚鞋坊</a>    卖家：<a href="#">纤巧百媚</a> <img src="images/taobao_relation.jpg" alt="relation" /></td>
  </tr>
   <tr id="product1">
    <td class="cart_td_1"><input name="cartCheckBox" type="checkbox" value="product1" onclick="selectSingle()" /></td>
    <td class="cart_td_2"><img src="images/taobao_cart_01.jpg" alt="shopping"/></td>
    <td class="cart_td_3"><a href="#">日韩流行风时尚美眉最爱独特米字拼图金属坡跟公主靴子黑色</a><br />
        颜色：棕色 尺码：37<br />
        保障：<img src="images/taobao_icon_01.jpg" alt="icon" /></td>
    <td class="cart_td_4">5</td>
    <td class="cart_td_5">138.00</td>
    <td class="cart_td_6"><img src="images/taobao_minus.jpg" alt="minus" onclick="changeNum('num_1','minus')" class="hand"/> <input id="num_1" type="text"  value="1" class="num_input" readonly="readonly"/> <img src="images/taobao_adding.jpg" alt="add" onclick="changeNum('num_1','add')"  class="hand"/></td>
    <td class="cart_td_7"></td>
    <td class="cart_td_8"><a href="javascript:deleteRow('product1');">删除</a></td>
  </tr>
  
  <tr>
    <td colspan="8" class="shopInfo">店铺：<a href="#">香港我的美丽日记</a>    卖家：<a href="#">lokemick2009</a> <img src="images/taobao_relation.jpg" alt="relation" /></td>
  </tr>
   <tr id="product2">
    <td class="cart_td_1"><input name="cartCheckBox" type="checkbox" value="product2" onclick="selectSingle()" /></td>
    <td class="cart_td_2"><img src="images/taobao_cart_02.jpg" alt="shopping"/></td>
    <td class="cart_td_3"><a href="#">chanel/香奈尔/香奈尔炫亮魅力唇膏3.5g</a><br />
        保障：<img src="images/taobao_icon_01.jpg" alt="icon" /> <img src="images/taobao_icon_02.jpg" alt="icon" /></td>
    <td class="cart_td_4">12</td>
    <td class="cart_td_5">265.00</td>
    <td class="cart_td_6"><img src="images/taobao_minus.jpg" alt="minus" onclick="changeNum('num_2','minus')" class="hand"/> <input id="num_2" type="text"  value="1" class="num_input" readonly="readonly"/> <img src="images/taobao_adding.jpg" alt="add" onclick="changeNum('num_2','add')"  class="hand"/></td>
    <td class="cart_td_7"></td>
    <td class="cart_td_8"><a href="javascript:deleteRow('product2');">删除</a></td>
  </tr>
  
   <tr>
    <td colspan="8" class="shopInfo">店铺：<a href="#">实体经营</a>    卖家：<a href="#">林颜店铺</a> <img src="images/taobao_relation.jpg" alt="relation" /></td>
  </tr>
   <tr id="product3">
    <td class="cart_td_1"><input name="cartCheckBox" type="checkbox" value="product3"  onclick="selectSingle()"/></td>
    <td class="cart_td_2"><img src="images/taobao_cart_03.jpg" alt="shopping"/></td>
    <td class="cart_td_3"><a href="#">蝶妆海晳蓝清滢粉底液10#（象牙白）</a><br />
        保障：<img src="images/taobao_icon_01.jpg" alt="icon" /> <img src="images/taobao_icon_02.jpg" alt="icon" /></td>
    <td class="cart_td_4">3</td>
    <td class="cart_td_5">85.00</td>
    <td class="cart_td_6"><img src="images/taobao_minus.jpg" alt="minus" onclick="changeNum('num_3','minus')" class="hand"/> <input id="num_3" type="text"  value="1" class="num_input" readonly="readonly"/> <img src="images/taobao_adding.jpg" alt="add" onclick="changeNum('num_3','add')"  class="hand"/></td>
    <td class="cart_td_7"></td>
    <td class="cart_td_8"><a href="javascript:deleteRow('product3');">删除</a></td>
  </tr>
  
   <tr>
    <td colspan="8" class="shopInfo">店铺：<a href="#">红豆豆的小屋</a>    卖家：<a href="#">taobao豆豆</a> <img src="images/taobao_relation.jpg" alt="relation" /></td>
  </tr>
   <tr id="product4">
    <td class="cart_td_1"><input name="cartCheckBox" type="checkbox" value="product4" onclick="selectSingle()" /></td>
    <td class="cart_td_2"><img src="images/taobao_cart_04.jpg" alt="shopping"/></td>
    <td class="cart_td_3"><a href="#">相宜促销专供 大S推荐 最好用的LilyBell化妆棉</a><br />
        保障：<img src="images/taobao_icon_01.jpg" alt="icon" /></td>
    <td class="cart_td_4">12</td>
    <td class="cart_td_5">12.00</td>
    <td class="cart_td_6"><img src="images/taobao_minus.jpg" alt="minus" onclick="changeNum('num_4','minus')" class="hand"/> <input id="num_4" type="text"  value="2" class="num_input" readonly="readonly"/> <img src="images/taobao_adding.jpg" alt="add" onclick="changeNum('num_4','add')"  class="hand"/></td>
    <td class="cart_td_7"></td>
    <td class="cart_td_8"><a href="javascript:deleteRow('product4');">删除</a></td>
  </tr>
  
   <tr>
   <td  colspan="3"><a href="javascript:deleteSelectRow()"><img src="images/taobao_del.jpg" alt="delete"/></a></td>
    <td colspan="5" class="shopend">商品总价（不含运费）：<label id="total" class="yellow"></label> 元<br />
    可获积分 <label class="yellow" id="integral"></label> 点<br />
    <input name=" " type="image" src="images/taobao_subtn.jpg" /></td>
  </tr>
  </form>
</table>

</div>
</body>
</html>
