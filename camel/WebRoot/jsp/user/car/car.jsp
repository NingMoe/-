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
<form action="${pageContext.request.contextPath }/product/updateCar.action">
<table border="1"> 
<c:forEach var="all" items="${allCarProduct }">  
<tr>  
	<input type="hidden" name="pid" value=${ all.pid}/>
	<td>${ all.pid}</td>  
	<td>${ all.userid}</td>  
	<td>${ all.number}</td> 
	<td><input type="text" value=${ all.number} name="number"/></td> 
	<td>${ all.pname}</td> 
	<td><a href="${pageContext.request.contextPath }/product/DeleteProduct.action?pid=${all.pid}">删除</a></td> 
	<%-- <td><a href="${pageContext.request.contextPath }/product/updateCar.action?pid=${all.pid}&number=${all.number}">修改</a></td> --%>
	<td><input type="submit" value="修改"/></td>
</tr>  
</c:forEach>
</table> 
</form>
</body>
</html>