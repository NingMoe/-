<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="insider.css">
<title>用户管理界面</title>
</head>
<body>
<!-- 头部 -->
<div class="head_top">
<div class="head_top_cneter">
<div class="head_topimg">
<img alt="tubiao" src="Picuter/u= .jpg">
</div>
<div class="head_topcenter">
<div class="head-topwelcome">
欢迎你  管理员
</div>
</div>
<div class="head_topleft">
<div class="head-rights">
<div class="reach">
<a href="${pageContext.request.contextPath }/jsp/admin/register.jsp">添加用户</a>
<form action="${pageContext.request.contextPath }/admin/selectAllUserBy.action">
<input type="text" name="nameorid"> <input type="submit" value='搜索用户'/>
</form>
</div>
<div class="reachio">
<a class="mainre">热门搜索</a>
<a>付键明</a>
<a>骆明林</a>
<a>马俊</a>
</div>
</div>
<div class="head-rightbottom">
<div class="bottomsc">
<img alt="acss" src="Picuter/q-icon.png">
</div>
</div>
</div>
</div>
</div>

<!-- 中间 -->
<div class="container">
<div class="imgbox" style="margin:0 auto;width:990px;text-align:center;">
<a class="adClickCss" href="" target="_blank" >
<img alt="cs" src="http://static.zongheng.com/upload/recommend/hao123/2017/1491554410920.jpg" width="990" height="60" border="0">
</a>
</div>
</div>

<table>
<c:forEach var="allUser" items="${allUser}">  
<tr>  
    <td><a href="${pageContext.request.contextPath }/admin/selectuser.action?userid=${ allUser.userid}">${allUser.userid}</a></td>  
	<td>${allUser.utype}</td>  
	<td>${allUser.uname}</td>  
	<td>${allUser.upassword}</td>  
	<td>${allUser.uphone}</td>  
	<td>${allUser.uaddr}</td>  
	<td>${allUser.usex}</td>  
	<td>${allUser.umoney}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/userdelete.action?userid=${ allUser.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/selectuser.action?userid=${ allUser.userid}">更改用户信息</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/selectuserforstore.action?userid=${ allUser.userid}">升级为商家</a></td>
</tr>  
</c:forEach>
</table>
 
 
 
 
 
</body>
</html>