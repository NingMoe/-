<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="utf-8">
<link rel="stylesheet" type="text/css" href="Ad.css">
<title>管理员登录</title>
</head>
<body>
  <div class="top">
  <div class="top_left">
  <img alt="商城图标" src="Picuter/MainIcon.jpg">
  </div>
  <div class="top_center">
  <a id="top_center_pa" target="_blank"><strong>你好！欢迎你来到管理员界面</strong></a>
  </div>
  <div class="top_right"></div>
  </div>
  <div class="center">
  <div class="center_Sign">
  <div class="center_Sign_img"></div>
  <div class="center_Sign_In">
   <div id="center_Sign_In_top">
    <a href="#" id="center_bottom_Signa">使用账号和密码登录</a>
  <div class="warning">公众场合不建议登录!
  <img alt="warning" src="Picuter/sprite.png">
  </div>
    <form action="${pageContext.request.contextPath }/admin/adminlogin.action" method="post" class="from_action">
    <input type="text" name="adminid" value="" id="form_1" placeholder="请输入管理员账号" ><br/>
     <input type="password" name="adminpassword" id="form_2"  value="" placeholder="请输入管理员身份标识密码" ><br/><br/>
     <button type="submit" onclik="" id="button_1">提交</button> 
    </form>
    <form action="${pageContext.request.contextPath }/admin/adminreset.action">
    <button type="Reset" id="button_2">重置</button>
    </form>
    <hr style="height:1.5px;border:none;border-top:2px dotted #185598;margin-top:90px;" />
   </div>  
   <div id="center_Sign_In_bottom"> <a href="#" >免费注册 有惊喜</a></div>
   
  </div>
  </div>
  </div> 

  <div class="bottom">
  <div class="bottom_main">
  <div class="bottom_main_center">
  <p id="list_1">
  <a href="http://www.suning.cn/" target="_blank" name="" rel="nofollow">骆驼云商</a>
  <span>|</span>
  <a href="http://10035.suning.com/" target="_blank" name="" rel="nofollow">骆驼互联</a>
  <span>|</span>
  <a href="http://jinrong.suning.com/" target="_blank" name="" rel="nofollow">骆驼金融</a>
  <span>|</span>
  <a href="https://passport.suning.com/ids/trustLogin?sysCode=epp&targetUrl=https://pay.suning.com/epp-epw/login/login.action" target="_blank" name="" rel="nofollow">易支付</a>
  <span>|</span>
  <a href="href="http://www.pptv.com target="_blank" name="" rel="nofollow">PPTV</a>
  <span>|</span>
  <a href="http://redbaby.suning.com/" target="_blank" name="public0_none_wb_yqlj0106" rel="nofollow">红孩子</a>
  <span>|</span>
  <a href="http://binggo.suning.com/" target="_blank" name="public0_none_wb_yqlj0107" rel="nofollow">缤购</a>
  <span>|</span>
  <a href="http://laox.suning.com/" target="_blank" name="public0_none_wb_yqlj0108" rel="nofollow">乐购仕</a>
  <span>|</span>
  <a href="http://wuliu.suning.com/" target="_blank" name="public0_none_wb_yqlj0111" rel="nofollow">骆驼物流</a>
  <span>|</span>
  <a href="http://usa.suning.com/" target="_blank" name="public0_none_wb_yqlj0109" rel="nofollow">骆驼美国</a>
  <span>|</span>
  <a href="http://hk.suning.com/" target="_blank" name="public0_none_wb_yqlj0110" rel="nofollow">骆驼香港</a>
  <span>|</span>
  <a href=" http://m.suning.com/" target="_blank" name="public0_none_wb_yqlj0111">骆驼苏宁</a>
  </p>
  <p id="list_2">
  <a href="http://club.suning.com/hr/aboutus.html" target="_blank" name="public0_none_wb_yqlj0201" rel="nofollow">关于骆驼商城</a>
  <span>|</span>
  <a href="http://help.suning.com/page/id-469.htm" target="_blank" name="public0_none_wb_yqlj0202" rel="nofollow">联系我们</a>
  <span>|</span>
  <a href="http://careers.cnsuning.com/" target="_blank" name="public0_none_wb_yqlj0203" rel="nofollow">诚聘英才</a>
  <span>|</span>
  <a href="http://sop.suning.com/" target="_blank" name="public0_none_wb_yqlj0204" rel="nofollow">供应商入驻</a>
  <span>|</span>
  <a href="http://union.suning.com/" target="_blank" name="public0_none_wb_yqlj0205" rel="nofollow">骆驼联盟</a>
  <span>|</span>
  <a href="http://zb.suning.com/" target="_blank" name="public0_none_wb_yqlj0206" rel="nofollow">骆驼招标</a>
  <span>|</span>
  <a href="http://union.suning.com/aas/links.html" target="_blank" name="public0_none_wb_yqlj0207">友情链接</a>
  <span>|</span>
  <a href="http://help.suning.com/page/id-281.htm" target="_blank" name="public0_none_wb_yqlj0208" rel="nofollow">法律申明</a>
  <span>|</span>
  <span>|</span>
  <a href="http://ued.suning.com/survey/" target="_blank" name="public0_none_wb_yqlj0209" rel="nofollow">用户体验提升计划</a>
  <span>|</span>
  <a href="http://mrs.suning.com/mrs-web/stockholder/check.htm" target="_blank" name="public0_none_wb_yqlj0209" rel="nofollow">股东会员认证</a>
  </p>
  <p id="list_3">
  Copyright? 2002-2017 ，苏宁云商集团股份有限公司版权所有
  <a href="http://www.miitbeian.gov.cn" target="_blank" style="color:#999">苏ICP备10207551号-4</a>
  <a href="http://img.suning.cn/public/v3/images/SUB1-20130131.png" target="_blank" rel="nofollow" style="color:#999">苏B1-20130131</a>
  <a href="http://img.suning.cn/public/v3/images/SUB2-20130376.png" target="_blank" rel="nofollow" style="color:#999">苏B2-20130376</a>
  <a href="http://img.suning.cn/public/v3/images/SUB2-20130391.png" target="_blank" rel="nofollow" style="color:#999">苏B2-20130391</a>
    出版物经营许可证新出发苏批字第A-243号
  </p>
  </div>
  </div>
  
  </div>  
  
</body>
</html>