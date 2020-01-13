<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/wenzhang.css">

  </head>
  
  <body>
    <div id="rightmain" class="wenzhangrightmain">
    	<div id="righthead" class="righthead">
    		<div id="headtitle" class="headtitle">
    			律师简介
    		</div>
    		
    	</div>
    	<div id="rightmiddle" class="rightmiddle">
    		<div id="hr" class="hr">
				<HR style="FILTER: progid:DXImageTransform.Microsoft.Shadow(color:#987cb9,direction:145,strength:1)" width="90%" color=#987cb9 SIZE=1>
			</div>
    		<div id="wenzhangmain" class="wenzhangmain">
    			<div>
    				<img alt="doudou" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/doudou.JPG" height="176px" width="123px">
    			</div>
    			<div id="wenzhangmaintext" class="wenzhangmaintext">
    				<pre>${info.info}</pre>
    			</div>
    		</div>
    	</div>
    </div>
  </body>
</html>
