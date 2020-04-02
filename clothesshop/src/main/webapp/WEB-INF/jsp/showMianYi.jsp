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
        	<c:forEach items="${clothesList}" var="clothes" varStatus="BrandlistStatu">
        			<c:if test="${ BrandlistStatu.count%4!='0'}">
        				<li>
        					<img  src="${pageContext.request.contextPath}/${clothes.clothesImg}">
        					<div class="c4_b1_box_txt">
                    			<p>${clothes.clothesIntroduction}</p>
                        		<h1>活动价：<b>${clothes.price}</b></h1>
                        		<h2><a href="${pageContext.request.contextPath }/addShopaCart?clothesId=${clothesId}">立即抢购</a></h2>
                    		</div>
        					<%-- <c:if test="${ BrandlistStatu.last}">     					
        					<img  src="${pageContext.request.contextPath}/${clothes.clothesImg}">
        					<div class="c4_b1_box_txt">
                    			<p>${clothes.clothesIntroduction}</p>
                        		<h1>活动价：<b>${clothes.price}</b></h1>
                        		<h2><a href="${pageContext.request.contextPath }/addShopaCart?clothesId=${clothesId}>立即抢购</a></h2>
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
                        		<h2><a href="${pageContext.request.contextPath }/addShopaCart?clothesId=${clothesId}">立即抢购</a></h2>
                    		</div>
        				</li>
        			</c:if>
        		</c:forEach>
            <%-- 	<li>
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
                </li> --%>
            </ul>
          
        </div>
</body>

</html>