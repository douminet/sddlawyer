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
	
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/headright.css">
	

  </head>
  
  <body>
    <div id="rightmain" class="rightmain">
    	<div id="righthead" class="righthead">
    		<div id="headtitle" class="headtitle">
    			${lanmu }
    		</div>
    		
    	</div>
    	<div id="rightmiddle" class="rightmiddle">
    		<div id="hr" class="hr">
				<HR style="FILTER: progid:DXImageTransform.Microsoft.Shadow(color:#987cb9,direction:145,strength:1)" width="90%" color=#987cb9 SIZE=1>
			</div>
    		<s:iterator value="wens" var="v_wen">
				<div class="oneWenZhang">
					<div class="titletext">
						<a href="wenzhang_enterWenZhangByUser.action?tablename=${tablename }&wenZhang.id=${v_wen.id}" target="_blank"><font size="2">${v_wen.title }</font></a>
					</div>
					<div class="datetext"><font size="2">${v_wen.date }</font></div>
				</div>    			
			</s:iterator>
			<div id="pageStyle" class="pageStyle">
				<div id="hr" class="hr">
					<HR style="FILTER: progid:DXImageTransform.Microsoft.Shadow(color:#987cb9,direction:145,strength:1)" width="90%" color=#987cb9 SIZE=1>
				</div>
				<div id="pagecenter" class="pagecenter">
					<div id="currentPage" class="pagetext"><font size="2">第${currentPage }页</font></div>
					<div id="maxpage" class="pagetext"><font size="2">共${maxPage }页</font></div>
					<div id="firstpage" class="pagetext">
						<a href="wenzhang_findByPageByUser?currentPage=1&tablename=${tablename }"><font size="2">首页</font></a>
					</div>
					<div id="prepage" class="pagetext">
						<s:if test="currentPage>1"><a href="wenzhang_findByPageByUser?currentPage=${currentPage-1 }&tablename=${tablename }"><font size="2">上一页</font></a></s:if>　　
	     				<s:else><font size="2">上一页</font></s:else>
					</div>
					<div id="nextpage" class="pagetext">
						<s:if test="currentPage<maxPage"><a href="wenzhang_findByPageByUser?currentPage=${currentPage+1 }&tablename=${tablename }"><font size="2">下一页</font></a></s:if>
	    				 <s:else><font size="2">下一页</font></s:else>　
					</div>
					<div id="lastpage" class="pagetext">
						<a href="wenzhang_findByPageByUser?currentPage=${maxPage}&tablename=${tablename }"><font size="2">尾页</font></a>
					</div>
				</div>
			</div>
    	</div>
    </div>
  </body>
</html>
