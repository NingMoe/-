<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品</title>
</head>
<body>
	<!-- 一下为商品测试代码 不需要可以自行删除 -->
	<c:forEach var="product" items="${allProduct}">
	<a href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid}">${product.pid}</a>
				  
				    ${product.pname}
				    ${product.pprice}
				    
	<a
		href="${pageContext.request.contextPath }/product/addToCart.action?pid=${product.pid}&pname=${product.pname }">加入购物车</a>
	</c:forEach>


</body>
</html>