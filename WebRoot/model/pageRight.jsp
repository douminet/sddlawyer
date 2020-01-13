<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>">
    
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/pageright.css">
	<!--[if IE]>
		<style type="text/css">
		.rightPart{
			height: 290px;
			width: 320px;
			margin-left: 5px;
			float: left;
			border-right: 3px solid #f3f3f3;
			background-image: url("../img/rightpart4.png");
			background-size: 100% 100%;
			-moz-background-size:100% 100%;
		  	-webkit-background-size:100% 100%;
		  	-o-background-size:100% 100%;
		  	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
		    src='http://localhost:8080/sddlawyer/img/rightpart4.png',
		    sizingMethod='scale');
			padding-top: 12px;
			padding-left: 15px;
			margin-top: 3px;
			background-image: url("");
		}
	</style>
	<![endif]-->

  </head>
  
  <body>
    <div id="rightMain" class="rightMain">
    	<div id="rightMainCenter" class="rightMainCenter">
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="wenzhang_findByPageByUser?currentPage=1&tablename=fagui" target="_blank">
    						<font size="4">劳动法规</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="fagui" var="v_fagui">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="wenzhang_enterWenZhangByUser.action?tablename=fagui&wenZhang.id=${v_fagui.id}"><font size="2">${v_fagui.title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_fagui.date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="wenzhang_findByPageByUser?currentPage=1&tablename=zhongcai" target="_blank">
    						<font size="4">劳动仲裁</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="zhongcai" var="v_zhongcai">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="wenzhang_enterWenZhangByUser.action?tablename=zhongcai&wenZhang.id=${v_zhongcai.id}"><font size="2">${v_zhongcai.title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_zhongcai.date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="wenzhang_findByPageByUser?currentPage=1&tablename=susong" target="_blank">
    						<font size="4">劳动诉讼</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="susong" var="v_susong">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="wenzhang_enterWenZhangByUser.action?tablename=susong&wenZhang.id=${v_susong.id}"><font size="2">${v_susong.title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_susong.date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="wenzhang_findByPageByUser?currentPage=1&tablename=anli" target="_blank">
    						<font size="4">经典案例</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="anli" var="v_anli">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="wenzhang_enterWenZhangByUser.action?tablename=anli&wenZhang.id=${v_anli.id}"><font size="2">${v_anli.title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_anli.date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="wenzhang_findByPageByUser?currentPage=1&tablename=xinwen" target="_blank">
    						<font size="4">新闻资讯</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="xinwen" var="v_xinwen">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="wenzhang_enterWenZhangByUser.action?tablename=xinwen&wenZhang.id=${v_xinwen.id}"><font size="2">${v_xinwen.title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_xinwen.date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    		<div id="rightPart" class="rightPart">
    			<div id="partTitle" class="partTitle">
    				<div id="partTitleImg" class="partTitleImg">
    					<img alt="tubiao" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/tubiao.png" height="20px" width="20px">
    				</div>
    				<div id="partTitleText" class="partTitleText">
    					<a href="enterLiuYanList?currentPage=1" target="_blank">
    						<font size="4">留言咨询</font>
    					</a>
    				</div>
    			</div>
    			<div id="partMain" class="partMain">
    				<s:iterator value="liuyan" var="v_liuyan">
    					<div id="partMainTitleText" class="partMainTitleText">
    						<a href="enterLiuYanByUser.action?liuYan.lid=${v_liuyan.lid }" target="_blank"><font size="2">${v_liuyan.l_title }</font></a>
    					</div>
    					<hr style="height:1px;border:none;border-top:1px dashed #046BBC;width: 300px; float: left;" />
    					<!--<div id="partMainDateText" class="partMainDateText">
    						<font size="3">${v_liuyan.l_date }</font>
    					</div>
    				--></s:iterator>
    			</div>
    		</div>
    	</div>
    </div>
  </body>
</html>
