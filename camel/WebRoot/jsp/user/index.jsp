<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>骆驼商城</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jsp/css/Ncrf.css">

</head>
<body>
<%
		session.setAttribute("userid", "10010");
%>
	
	<div class="top">
		<div class="top_center">
			<div id="top_center_left">
				<a href="#" target="_blank">网站导航</a> <a href="#" target="_blank">商家入驻</a>
			</div>
			<div id="top_center_right">
				<div>
					<a href="${pageContext.request.contextPath }/jsp/login_reg/login.jsp" target="_blank"><%="登录"%> </a> <a href="${pageContext.request.contextPath }/jsp/login_reg/register.jsp"
						target="_blank"><%="注册"%> </a>
				</div>
				<div>
					<a href="${pageContext.request.contextPath }" target="_blank" id="right_menu_3"> <%="我的订单"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_4"> <%="骆驼货运"%> </a>
				</div>
				<div>
					<a href="${pageContext.request.contextPath }/product/showCar.action" target="_blank" id="right_menu_5"> <%="购物车"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_6"> <%="手机骆驼"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_7"> <%="企业采购"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_8"> <%="客户服务"%> </a>
				</div>
			</div>
		</div>
	</div>

	<div class="search">
		<div class="serch_bground">
			<div class="search_center">
				<div style="background-image: url('${pageContext.request.contextPath }/jsp/Picuter/MainIcon.jpg');" class="search_center_left"></div>
				<div class="search_center_right">
					<div class="search_center_top">
						<form action="">
							<input type="text" name="serch" value="" placeholder="4.18商城狂欢">
							<button type="submit">搜索</button>
						</form>

					</div>
					<div class="search_center_bottom">
						<p id="bottom_ft">
							<a href="#" target="_blank">9.9元抢好货</a> <a href="#"
								target="_blank">9.9元抢好货</a> <a href="#" target="_blank">9.9元抢好货</a>
							<a href="#" target="_blank">9.9元抢好货</a> <a href="#"
								target="_blank">9.9元抢好货</a> <a href="#" target="_blank">9.9元抢好货</a>
						</p>
					</div>
				</div>
			</div>
		</div>

	</div>
	<div class="clear"></div>

	

	<div class="display_main">
		<div class="display_main_bg">
			<div class="display_main_topbg">
				<h5 class="floor_name">
					<span>美食</span> <i class="slogon"></i>
				</h5>
				
				<a id="ju_more" targer="_blank" href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${allProduct['美食'][0].typeid}"> <span>更多美食商品</span> <i></i>
					<em class="left"></em> <em class="right"></em> </a>
			</div>
			<div class="display_main_bottombg">
				<div class="commodity_tab">
					<ul class="commodity_tab_bg">
					
					<c:forEach var="product" items="${allProduct['美食']}" varStatus="status">
					
						<li id="tab_bg_1"><a href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" target="_blank" id="tabbg_1"
							> <img alt=""
								src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
								<p id="">${product.pname }</p>
								<p id="tabbg11">
									<span id="tabbg111"> <i>¥</i> <em>${product.pprice }</em> </span> <span
										id="tabbg1111"> <i>¥</i> <em>139.00</em> </span>
								</p> </a></li>
					
					</c:forEach>
					
					
					
					
						
					</ul>
				</div>

			</div>
		</div>
	</div>


<%-- <c:forEach var="products" items="${allProduct}" varStatus="status">
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
		


</c:forEach> --%>

	<div class="display_top">
		<div class="content_module display_top_left">
			<div class="title">
				<h5><!-- 精选好货${allProduct["衣服"][0].pid} -->衣服</h5>
				<a href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${allProduct['衣服'][0].typeid}" target="_blank"> <span>更多好货</span> <i></i> </a>
			</div>
			<div class="content">
				<ul class="clearfix">
				<c:forEach var="product" items="${allProduct['衣服']}" varStatus="status">
				   <c:if test="${status.index==0 }">
							<li class="leftclear"><a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" target="_blank"> 
							<img class="zhu_img lazy_loading" alt="" src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							<p class="com-name">${product.pname }</p>
							<p class="desc">${product.pdes }</p>
							<p class="zan">
								
							</p> </a></li>
				   </c:if>
				   
				   <c:if test="${status.index!=0 }">
				   			<li class="normal"><a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" name="" target="_blank">
							<img class="lazy-loading" alt=""
							src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							<p class="com-name">${product.pname }</p>
							<p class="zan">
							</p> </a></li>
				   
				   </c:if>
				</c:forEach>
					
					
				</ul>
			</div>
		</div>
		<div class="content_module display_top_right">
			<div class="title">
				<h5>裤子</h5>
				<div class="phb-tab">
					<a class="current" href="" data-flag="ture">纸品清洁</a> <a calss=""
						href="">手机</a> <a calss="" href="">家电精装</a> <a calss="" href="">休闲零食</a>
					<a calss="" href="">运动装备</a>
				</div>
				<a href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${allProduct['裤子'][0].typeid}" target="_blank" id="" name="" target="_blank"> <span>更多好货</span>
					<i></i> </a>
			</div>
			<div class="content">
				<ul class="clearfix current">
					<c:forEach var="product" items="${allProduct['裤子']}" varStatus="status">
						 <c:if test="${status.index==0 }">
						 	<li class="leftclear"><a id="" name="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" target="_blank">
							<span class="phFlag phFlag1"></span>
							<div class="img-wrapper">
								<img class="zhu-img lazy-loading"
									alt=""
									src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							</div>
							<p class="com-name"><%-- ${product。pname } --%>${product.pname}</p>
							<p class=price>
								<i>¥</i> ${product.pprice}
							</p> </a></li>
						 </c:if>
						 
						 <c:if test="${status.index!=0 }">
						 	<li class="normal"><a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" target="_blank" name="">
							<span class="phFlag2"></span> <img class="lazy-loading"
							alt=""
							src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							<p class="com-name">${product.pname}</p>
							<p class="price">
								<i>¥</i> ${product.pprice}
							</p> </a></li>
						 </c:if>
					
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>


	<div class="display_center">
		<div class="content-module suxiansheng-module">
			<div class="title">
				<h5>手机</h5>
				<a href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${allProduct['手机'][0].typeid}" target="_blank"
					name=""> <span>更多</span> <i></i> </a>
			</div>
			<div class="content">
				<ul class="clearfix">
				<c:forEach var="product" items="${allProduct['手机']}" varStatus="status">
				   <c:if test="${status.index==0 }">
							<li class="leftclear"><a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" target="_blank"> 
							<img class="zhu_img lazy_loading" alt="" src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							<p class="com-name">${product.pname }</p>
							<p class="desc">${product.pdes }</p>
							<p class="zan">
								
							</p> </a></li>
				   </c:if>
				   
				   <c:if test="${status.index!=0 }">
				   			<li class="normal"><a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }" name="" target="_blank">
							<img class="lazy-loading" alt=""
							src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg">
							<p class="com-name">${product.pname }</p>
							<p class="zan">
							</p> </a></li>
				   
				   </c:if>
				</c:forEach>
					
					
				</ul>
			</div>
		</div>

		<div class="content-module zhuti-module ml10">
			<div class="title">
				<h5>电脑</h5>
				<a href="${pageContext.request.contextPath }/product/alllProductType.action?typeid=${allProduct['电脑'][0].typeid}" target="_blank"
					name=""> <span>更多</span> <i></i> </a>
			</div>
			<div class="content">
				<c:forEach var="product" items="${allProduct['电脑']}" varStatus="status">
				
					<div class="shop-infor">
					<p class="shop-name">
						<a
							href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }"
							target="_blank" name=""> <i>${product.pname}</i></a>
					</p>
					<ul class="clearfix">
						<li><a
							href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid }"
							target="_blank" name=""> <img
								src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg"
								alt=""> </a></li>
						
					</ul>
					</div>
				
				</c:forEach>
			
			
				
				
				
				
				<div class="line"></div>
			</div>
		</div>
	</div>


	<div class="middle-three middle-floor">
		<a href="#" target="_blank" title="九阳超级品牌日"> <img class="first"
			d-alt="九阳超级品牌日"
			src="//image.suning.cn/uimg/aps/material/149277825943972267.jpg"
			alt="九阳超级品牌日"> </a> <a href="//cuxiao.suning.com/ktdckx.html"
			target="_blank"> <img class="lazy-loading" alt="空调"
			src="//image3.suning.cn/uimg/cms/img/149267454112185246.jpg"> </a>
		<a href="#" title="美菱" target="_blank"> <img class="throed"
			alt="美菱"
			src="//image.suning.cn/uimg/aps/material/149308392456856136.jpg">
		</a>
	</div>


	<div class="floor reco-floor J-floor11">
		<div class="title">
			<span class="border"></span>
			<h5>猜你喜欢</h5>
			<p></p>
		</div>
		<div class="rec-content">
			<ul class="clearfix"></ul>
			<p class="end">
				<span class="line-left"></span> END <span class="line-right"></span>
			</p>
		</div>
	</div>

	<div class="footer"></div>
</body>
</html>