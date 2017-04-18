<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
</head>
<body>
<!-- 一下为商品详情测试代码 不需要可以自行删除 -->
<table> 
<c:forEach var="all" items="${allCarProduct }">  
<tr>  
	<td>${ all.pid}</td>  
	<td>${ all.userid}</td>  
	<td>${ all.number}</td> 
	<td><a href="${pageContext.request.contextPath }/product/DeleteProduct.action?pid=${all.pid}">删除</a></td> 
</tr>  
</c:forEach>
</table> 
</body>
</html>