<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品主页</title>
</head>
<body>
	<%
		session.setAttribute("userid", "10010");
	%>
	<form
		action="${pageContext.request.contextPath }/product/splitPage.action"
		name="from1">
		<%-- <table><!-- 這裡面為測試代碼  可以刪掉，這個頁面為駱駝商城主頁 -->

<c:forEach var="allProduct" items="${ allProduct}">  
<tr>  
    <td><a href="${pageContext.request.contextPath }/product/details.action?pid=${ allProduct.pid}">${ allProduct.pid}</a></td>  
    <td>${ allProduct.storeid}</td>
	<td>${ allProduct.typeid}</td>  
	<td>${ allProduct.pname}</td>  
	<td>${ allProduct.pprice}</td>  
	<td>${ allProduct.pdes}</td>  
	<td>${ allProduct.pno}</td>  
	<td>${ allProduct.pimageno}</td>  
</tr>  
</c:forEach>


<c:forEach var="allType" items="${ allType}">  
<tr>  
    <td>${ allType.typeid}</td>  
    <td>${ allType.typename}</td>
</tr>  
</c:forEach>${products.value.get(0).typeid}
</table> 
 --%>
	</form>
		${allProduct["衣服"][0].pid}
		<c:forEach var="products" items="${allProduct}" varStatus="status">
			<c:if test="${status.index%2==0 }">
				<br>
			</c:if>
			
			 <h4>${products.key}</h4>
			<a href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${products.value[0].typeid}">更多</a>
				<c:forEach var="product" items="${products.value}">
				    ${product.pid}
				    ${product.pname}
				    ${product.pprice}
				</c:forEach>
		
		</c:forEach><br>
	<a href="${pageContext.request.contextPath }/product/showCar.action">购物车</a>
	
	<a href="${pageContext.request.contextPath }/jsp/user/Homepage.jsp">haha</a>

</body>
</html>