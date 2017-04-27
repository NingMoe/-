<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员后台</title>
<link rel="stylesheet" type="text/css" href="Back.css">
</head>
<body>
<%@ include file="top.jsp" %>
<div class="admin">
<div class="admin-center">
<div class="admin_left">
<div class="admin_left_top">
<p><span class="span_1">商城当前注册的用户数:</span>
<strong><a class="admin_left_top1" href="#"></a></strong>
<span class="span_2"></span>
</p>
</div>
<div class="admin_left_header">
<div class="admin_center">
<a href="${pageContext.request.contextPath }/admin/userInfo.action" class="adminji" id="">
<span>查看商城用户信息</span>
</a>
</div>
<div class="admin_bottom">
<p class="pid"><b>商城活跃会员</b></p>
<table class="tableid">
 <tr>
  <th><a href="">会员ID</a></th>
  <th><a href="">姓 名</a></th>
  <th><a href="">性 别</a></th>
  <th><a href="">电话</a></th>
  <th><a href="">余 额</a></th>
 </tr>
 <tr class="art">
 <td><a href="">001</a></td>
 <td>张三</td>
 <td>男</td>
 <td>13132577</td>
 <td>100</td>
 </tr>
 <tr>
 <td><a href="">002</a></td>
 <td>王彪</td>
 <td>男</td>
 <td>13132577</td>
 <td>100</td>
 </tr>
  <tr class="art">
 <td><a href="">001</a></td>
 <td>张三</td>
 <td>男</td>
 <td>13132577</td>
 <td>100</td>
 </tr>
 <tr>
 <td><a href="">001</a></td>
 <td>张三</td>
 <td>男</td>
 <td>13132577</td>
 <td>100</td>
</tr>
 <tr class="art">
 <td><a href="">001</a></td>
 <td>张三</td>
 <td>男</td>
 <td>13132577</td>
 <td>100</td>
 </tr>
</table>
</div>
</div>
</div>

<div class="admin_store">
<div class="store_1">
<div class="store11">
<b>商城当前店铺数</b>
</div>
<div class="store12">
<p class="er">
<a href="">125</a>家</p>
</div>
<div class="store12"></div>
</div>
<div class="store_2">
<a class="atie" href="${pageContext.request.contextPath }/admin/storeInfo.action">进入商家管理页面？</a>
</div>
</div>
</div>
</div>
</body>
</html>