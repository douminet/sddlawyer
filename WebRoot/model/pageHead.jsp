<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/headpage.css">

  </head>
  
  <body>
    <div id="headmain" class="headmain">
    	<div id="headtop" class="headtop">
    		<div id="logo" class="logo">
    			<a>
    				<img alt="logo" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/logo6.png" height="100px" width="100px">
    			</a>
    		</div>
    		<div id="wangzhi" class="wangzhi">
    			<div id="pingtai" class="pingtai">
    				<font size="5" face="微软雅黑" style="font-weight: bold;" color="#01810D">斗斗律师服务平台</font>
    			</div>
    			<div id="address" class="address">
    				<font size="4" face="微软雅黑" style="font-weight: bold;" color="#01810D">www.sddlawyer.com</font>
    			</div>
    		</div>
    		<div id="doudou" class="doudou">
    			<div id="shangdoudou" class="shangdoudou">
    				<font size="8" face="微软雅黑" style="font-weight: bold;" color="#046BBC">商斗斗</font>
    			</div>
    		</div>
    		<div id="phone" class="phone">
    			<div id="laodongjiufen" class="laodongjiufen">
    				<font size="5" face="微软雅黑" style="font-weight: bold;" color="#01810D">济南劳动争议律师</font>
    			</div>
    			<div id="zixunrexian" class="zixunrexian">
    				<div id="dianhuatubiao" class="dianhuatubiao">
    					<img alt="dianhua" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/dianhua.jpg" height="18px" width="18px">
    				</div>
    				<div id="haoma" class="haoma">
    					<font size="4" face="微软雅黑" style="font-weight: bold;" color="#01810D">13256672962</font>
    				</div>
    			</div>
    		</div>
    	</div>
    	<div id="headmiddle" class="headmiddle">
    		<div id="shouye" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="index.action" target="_self">首页</a>
    			</div>
    		</div>
    		<div id="lvshijianjie" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="enterinfo" target="_self">律师简介</a>
    			</div>
    		</div>
    		<div id="laodongfagui" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="wenzhang_findByPageByUser?currentPage=1&tablename=fagui" target="_self">
    					劳动法规
    				</a>
    			</div>
    		</div>
    		<div id="laodongzhongcai" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="wenzhang_findByPageByUser?currentPage=1&tablename=zhongcai" target="_self">劳动仲裁</a>
    			</div>
    		</div>
    		<div id="laodongsusong" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="wenzhang_findByPageByUser?currentPage=1&tablename=susong" target="_self">劳动诉讼</a>
    			</div>
    		</div>
    		<div id="jingdiananli" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="wenzhang_findByPageByUser?currentPage=1&tablename=anli" target="_self">经典案例</a>
    			</div>
    		</div>
    		<div id="liuyanzixun" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="enterLiuYanList?currentPage=1" target="_self">留言咨询</a>
    			</div>
    		</div>
    		<div id="lianxilvshi" class="middlepart" onmouseout="this.className='middlepart'" onmouseover="this.className='middlepart_over'">
    			<div class="middleparttext">
    				<a href="findPersonByUser.action" target="_self">联系律师</a>
    			</div>
    		</div>
    	</div>
    	<div id="headbottom" class="headbottom">
    		<div id="suninhand" class="suninhand">
    			<embed src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/suninhand.swf" height="132px" width="998px">
    		</div>
    	</div>
    </div>
  </body>
</html>
