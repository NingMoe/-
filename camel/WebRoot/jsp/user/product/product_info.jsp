<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
</head>
<body>
<!-- 一下为商品详情测试代码 不需要可以自行删除 -->
${productDetails.pid }
${productDetails.pname }
${productDetails.sname }
<a href="${pageContext.request.contextPath }/product/addToCart.action?pid=${productDetails.pid}&pname=${productDetails.pname }">加入购物车</a>
<%-- <a href="${pageContext.request.contextPath }/product/addToCart.action?spCustom=${productDetails}">加入购物车</a> --%>
</body>
</html>