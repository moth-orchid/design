<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>购物车</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style1.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/js.js"></script>
	</head>
		
	<body>
		<div align="center" style="height: 50px">
			<a type="button" href="${pageContext.request.contextPath }/choseAddress?consumerId=1" >收获地址选择</a>
		</div>
		<div id="box">
			<div id="content_box">
				<div class="imfor_top">
					<div class="check_top">
						<input type="checkbox" id="all" />全选
					</div>
					<div class="pudc_top">商品</div>
					<div class="pices_top">单价</div>
					<div class="num_top">数量</div>
					<div class="totle_top">小计</div>
					<div class="del_top">操作</div>
				</div>
				<c:forEach  items="${ realShopCart}" var="order">
				<div class="imfor">
					<div class="check">
						<input type="checkbox" class="Each" />
					</div>
					<div class="pudc"><img src="${order.clothes.clothesImg }" />${order.clothes.clothesIntroduction}</span>
					</div>
					<div class="pices">${order.clothes.price}</div>
					<div class="num"><span class="reduc">&nbsp;-&nbsp;</span><input type="text" value="${order.count}" /><span class="add">&nbsp;+</span></div>
					<div class="totle">5999.8</div>
					<div class="del">删除</div>
				</div>
				</c:forEach>
		<!-- 		<div class="imfor">
					<div class="check">
						<input type="checkbox" class="Each" />
					</div>
					<div class="pudc"><img src="img/2.jpg" /><span>Canon/佳能 PowerShot SX50 HS</span></div>
					<div class="pices"> 3888.5</div>
					<div class="num"><span class="reduc">&nbsp;-&nbsp;</span><input type="text" value="1" /><span class="add">&nbsp;+</span></div>
					<div class="totle">3888.5</div>
					<div class="del">删除</div>
				</div>
				<div class="imfor">
					<div class="check">
						<input type="checkbox" class="Each" />
					</div>
					<div class="pudc"><img src="img/3.jpg" /><span>Sony/索尼 DSC-WX300</span></div>
					<div class="pices">1428.5</div>
					<div class="num"><span class="reduc">&nbsp;-&nbsp;</span><input type="text" value="1" /><span class="add">&nbsp;+</span></div>
					<div class="totle">1428.5</div>
					<div class="del">删除</div>
				</div>
				<div class="imfor">
					<div class="check">
						<input type="checkbox" class="Each" />
					</div>
					<div class="pudc"><img src="img/4.jpg" /><span>Fujifilm/富士 instax mini 25</span></div>
					<div class="pices">640.6</div>
					<div class="num"><span class="reduc">&nbsp;-&nbsp;</span><input type="text" value="1" /><span class="add">&nbsp;+</span></div>
					<div class="totle">640.6</div>
					<div class="del">删除</div>
				</div> -->
			</div>
			<div class="foot">
				<div class="foot_cash">结算</div>
				<div class="foot_tol"><span>合计：￥</span><span id="susum">0</span></div>
			</div>
		</div>
	</body>

</html>