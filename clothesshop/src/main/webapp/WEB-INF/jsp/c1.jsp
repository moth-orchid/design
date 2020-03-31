<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>短袖</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }js/jquery-1.8.3.min.js"></script>
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
<div class="c4_b1">
        	<ul class="c4_b1_boxes">
            	<li>
                	<img src="upload/u=1599784163,1193658515&fm=26&gp=0.jpg" >
                    <div class="c4_b1_box_txt">
                    	<p>短袖1</p>
                        <h1>活动价：<b>￥30</b></h1>
                        <h2><a href="${pageContext.request.contextPath }/userLogin">立即抢购</a></h2>
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
          
        </div>
</body>

</html>