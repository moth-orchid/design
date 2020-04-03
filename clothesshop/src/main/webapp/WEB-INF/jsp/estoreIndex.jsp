<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>服装销售商城-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	//点击X 删除效果
	$(".c4_b2_y .search_del").on("click",function(){
		var li = this.parentNode;
		var ul  = li.parentNode;
		ul.removeChild(li);
	});
	//价格和出版社选择
	$(".c4_b3_search a").on("click",function(){
		
		var ul = $(".c4_b2_y");
		
		var name=$(this).parent().parent().find(".c4_b3_name").html();
		
		var old  = $(".c4_b2_y .search_key");
		$.each(old,function(index,obj){
			if(obj.innerHTML==name){
				var li = this.parentNode;
				var ul  = li.parentNode;
				ul.removeChild(li);
			}
		})
		
		var value = this.innerHTML;
		
		var li = $("<li><span class='search_key'>"+name+"</span><span class='search_val'>"+value+"</span><span class='search_del'></span></li>");
		ul.append(li);
		ul.find(".search_del").on("click",function(){
			var li = this.parentNode;
			var ul  = li.parentNode;
			ul.removeChild(li);
		});
		
		
		
	});
	
	//销量等
	$(".c4_b4_nav a").on("click",function(){
		var mythis = this;
		$(this.parentNode).addClass("current");
		$.each($(".c4_b4_nav a"),function(index,obj){
			if(mythis!=obj){
				$(obj.parentNode).removeClass("current");
			}
		});
	});
	
	
	
	
});	
	

function addShopCart(bookName){
	alert(bookName+"加入购物车成功");
}
</script>
</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
            	<%-- <li><a href="${pageContext.request.contextPath }/userLogin">登录</a>|</li> --%>
            	<li><a href="${pageContext.request.contextPath }/userLogin">退出</a>|</li>
                <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注商城<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="index.html"><img src="images/u=2514378785,3326817705&fm=11&gp=0.jpg"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	<a href="${pageContext.request.contextPath }/personalManager?consumerId=${consumerId}">个人信息</a>
                <span class="sj_down"></span>
             </div>
            <div id="g" class="tsc">
            	<a href="${pageContext.request.contextPath }/shopCart">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部服装分类
            </div>
            <ul>
                <li><a href="${pageContext.request.contextPath }/showDuanXiu?SortId=3" target="_top">短袖</a></li>
                <li><a href="${pageContext.request.contextPath }/showFengYi?SortId=1">风衣</a></li>
                <li><a href="${pageContext.request.contextPath }/showMianYi?SortId=2">棉衣</a></li>
                <li><a href="${pageContext.request.contextPath }/showKuZi?SortId=4">裤子</a></li>
            </ul>
        </div>
    </div>
    
    <!--内容-->
    <div class="container4">
    	<!--热卖-->
    	<div class="c4_b1">
        	<ul class="c4_b1_boxes">
        		<c:forEach items="${clothesList}" var="clothes" varStatus="BrandlistStatu">
        			<c:if test="${ BrandlistStatu.count%4!='0'}">
        				<li>
        					<img  src="${pageContext.request.contextPath}/${clothes.clothesImg}">
        					<div class="c4_b1_box_txt">
                    			<p>${clothes.clothesIntroduction}</p>
                        		<h1>活动价：<b>${clothes.price}</b></h1>
                        		<h2><a href="${pageContext.request.contextPath }/enterDetail?clothesId=${clothes.clothesId}&consumerId=${consumerId}">立即抢购</a></h2>
                    		</div>
        					<%-- <c:if test="${ BrandlistStatu.last}">     					
        					<img  src="${pageContext.request.contextPath}/${clothes.clothesImg}">
        					<div class="c4_b1_box_txt">
                    			<p>${clothes.clothesIntroduction}</p>
                        		<h1>活动价：<b>${clothes.price}</b></h1>
                        		<h2><a href="${pageContext.request.contextPath }/enterDetail?clothesId=${clothes.clothes.clothesId}&consumerId=${consumerId}>立即抢购</a></h2>
                    		</div>
                    		</c:if> --%>
        					</li>
        					<%-- </c:if> --%>
        			</c:if>
        			<c:if test="${ BrandlistStatu.count%4=='0'}">
        				<li>
        					<img  src="${pageContext.request.contextPath}/${clothes.clothesImg}">
        					<div class="c4_b1_box_txt">
                    			<p>${clothes.clothesIntroduction}</p>
                        		<h1>活动价：<b>${clothes.price}</b></h1>
                        		<h2><a href="${pageContext.request.contextPath }/enterDetail?clothesId=${clothes.clothesId}&consumerId=${consumerId}">立即抢购</a></h2>
                    		</div>
        				</li>
        			</c:if>
        		</c:forEach>
    <%--         	<li>
                	<img src="upload/u=1599784163,1193658515&fm=26&gp=0.jpg" >
                    <div class="c4_b1_box_txt">
                    	<p>短袖1</p>
                        <h1>活动价：<b>￥30</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/addShopaCart?clothes_id=1">立即抢购</a></h2>
                    </div>
                </li>
                <li>
                	<img src="upload/u=2990585868,1482978940&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>短袖2 </p>
                        <h1>活动价：<b>￥40</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=1334020606,2132816256&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>短袖3</p>
                        <h1>活动价：<b>￥50</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=3195208389,3623672950&fm=15&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>短袖4</p>
                        <h1>活动价：<b>￥60</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
            </ul>
            <ul class="c4_b1_boxes">
            	<li>
                	<img src="upload/u=1633123617,1472358408&fm=26&gp=0.jpg" >
                    <div class="c4_b1_box_txt">
                    	<p>裤子1</p>
                        <h1>活动价：<b>￥50</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                <li>
                	<img src="upload/u=1484750414,3560783029&fm=15&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>裤子2</p>
                        <h1>活动价：<b>￥60</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=1447785165,4227386111&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>裤子3</p>
                        <h1>活动价：<b>￥70</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=2814117944,1779427407&fm=11&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>裤子4</p>
                        <h1>活动价：<b>￥80</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
            </ul>
             <ul class="c4_b1_boxes">
            	<li>
                	<img src="upload/u=1778206224,3864620769&fm=26&gp=0.jpg" >
                    <div class="c4_b1_box_txt">
                    	<p>风衣1</p>
                        <h1>活动价：<b>￥100</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                <li>
                	<img src="upload/u=3027697566,3762361070&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>风衣2</p>
                        <h1>活动价：<b>￥110</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=3993609961,1204861889&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>风衣3</p>
                        <h1>活动价：<b>￥120</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=2758402544,1686103832&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>风衣4</p>
                        <h1>活动价：<b>￥130</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
            </ul>
            <ul class="c4_b1_boxes">
            	<li>
                	<img src="upload/u=1135352485,571497989&fm=26&gp=0.jpg" >
                    <div class="c4_b1_box_txt">
                    	<p>棉衣1</p>
                        <h1>活动价：<b>￥200</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                <li>
                	<img src="upload/u=1603090157,3986134302&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>棉衣2</p>
                        <h1>活动价：<b>￥210</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=3345144545,4220159272&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>棉衣3</p>
                        <h1>活动价：<b>￥220</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li>
                 <li>
                	<img src="upload/u=3774376090,15928152&fm=26&gp=0.jpg">
                    <div class="c4_b1_box_txt">
                    	<p>棉衣4</p>
                        <h1>活动价：<b>￥230</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
                    </div>
                </li> --%>
            </ul>
        </div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
         <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>