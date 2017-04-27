
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>支付页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jsp/css/motter.css">
</head>
<body>
	<div class="top">
		<div class="top_center">
			<div id="top_center_left">
				<img alt="zhuye" src="Picuter/home.png"> <a href="">返回商城首页</a>
			</div>
			<div id="top_center_right">
				<div class="top_one">
					<span id="usernameHtml02">17618646268</span>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_3"> <%="我的订单"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_4"> <%="骆驼货运"%> </a>
				</div>
				<div>
					<a href="#" target="_blank" id="right_menu_5"> <%="购物车"%> </a>
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

	<div id="newJuHeader">
		<div id="tpl-mainHeader" class="main-header">
			<span class="sn-logo" name1="mps_index_header_snlogo"> <a
				href=""> <img alt="logo" src="Picuter/MainIcon.jpg" alt="骆驼易购">
			</a> </span> <span class="ju-logo" name1="mps_index_header_djhlogo"> <a
				target="_blank" href=""> <img
					src="//image4.suning.cn/uimg/nmps/PDLG/147900361037274784.jpg">
			</a> </span>

			<div id="sncity" class="ju-city" name1="mps_index_header_city">
				<div class="ui-city">
					<a class="ui-city-toggle" name="item_none_dizhi_01" href=""> <em
						class="address-placement"> <span id="provinceName" class="pr"
							role="220,,,贵州">贵州</span> <span id="citybName" class="ct"
							role="1000076,9076,01,贵阳">贵阳</span> </em> <b class="arr"></b> </a>
				</div>
			</div>
			<span class="ju-ensure"> <a href="" target="_Blank"> <img
					src="//res.suning.cn/project/nmps/pc/images/ju-ensure.jpg"
					alt="苏宁保障"> </a> </span>
		</div>

		<div class="main-nav">
			<div class="main-nav-category">
				<a class="nmc-all" href=""> <em class="ng-iconfont"></em> <span>全部商品条目</span>
				</a>
			</div>
		</div>
	</div>

	<div class="ju-prodlist-wrapper lazy-dom" style="min-height:400px;">
		<ul class="clearfix productsListUl">
			<c:forEach var="product" items="${allProduct}">
				<li id="5343" class="ju-prodlist-item">
				<div class="item-wrap">
					<a id="" href="${pageContext.request.contextPath }/product/details.action?pid=${product.pid}" target="_blank" class="prd-link"></a> <img
						class="prd-pic lazy-loading" alt=""
						src="${pageContext.request.contextPath }/jsp/Picuter/${product.pimageno }.jpg"
						width="100" height="150">
					<div class="detail">
						<p class="prd-name fixed-height-name"> ${product.pname}</p>
						<p class="prd-desp-items fixed-height-desp">
							<span>五一聚惠</span> <span>晒单送会员</span> <span>性价比款</span>
						</p>
					</div>

					<div class="sale clearfix">
						<div class="prd-price clearfix">
							<div class="sn-price">
								<i>¥</i> <em>  ${product.pprice} <b>.00</b> </em>
							</div>
							<div class="discount">
								<p class="dis-num clearfix"></p>
								<p class="full-price">
									<i>¥</i> <em> 5299 <b>.00</b> </em>
								</p>
							</div>
						</div>
						<div class="prd-sale">
							<p id="" class="prd-quan"></p>
							<p class="sale-amount">
								<span>4</span> 件已售
							</p>

						</div>
					</div>
			</li>
			</c:forEach>
			
		</ul>
	</div>
</body>
</html>