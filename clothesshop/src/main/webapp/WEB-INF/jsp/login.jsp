<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎你来到服装商城</h3>
						<form action="${pageContext.request.contextPath }/consumer" name="f" method="get">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="name" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="status" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="text" placeholder="请输入身份">
							</div>
							<div class="mb2"><input type="submit" value="登录" style="color: #FFFFFF"/></div>
							<!-- <div class="mb2"><a class="act-but submit" href="javascript:;" style="color: #FFFFFF">登录</a></div> -->
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="${pageContext.request.contextPath }/js/TweenLite.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/EasePack.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/rAF.js"></script>
		<script src="${pageContext.request.contextPath }/js/demo-1.js"></script>
	</body>
</html>