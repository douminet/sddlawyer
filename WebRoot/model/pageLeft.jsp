<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/headleft.css">

  </head>
  
  <body>
    <div id="leftmain" class="leftmain"> 
    	<div id="lefthead" class="lefthead">
    		<div id="photo" class="photo">
    			<img alt="doudou" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/doudou.JPG" height="176px" width="123px">
    		</div>
    	</div>
    	<div id="leftmiddle" class="leftmiddle">
    		<div id="xingming" class="xingming">
    			<div id="textsdd" class="textsdd">
    				<font size="5px" face="微软雅黑" style="font-weight: bold;" color="#046BBC" >商斗斗    律师</font>
    			</div>
    		</div>
    	</div>
    	<div id="leftbottom" class="leftbottom">
    		<div id="rexian" class="rexian">
    			<div id="textrx" class="text">
    				<font size="3px" face="微软雅黑" style="font-weight: bold;">咨询热线：${person.phone }</font>
    			</div>
    		</div>
    		<div id="email" class="email">
    			<div id="textem" class="text">
    				<font size="3px" face="微软雅黑" style="font-weight: bold;">Email：${person.email }</font>
    			</div>
    		</div>
    		<div id="qq" class="qq">
    			<div id="textqq" class="text">
    				<font size="3px" face="微软雅黑" style="font-weight: bold;">QQ:${person.qq }</font>
    			</div>
    		</div>
    		
    		<div id="wangzhi" class="wangzhi_left">
    			<div id="textwz" class="text">
    				<font size="3px" face="微软雅黑" style="font-weight: bold;">网址：${person.wangzhi }</font>
    			</div>
    		</div>
    		<div id="lianxidizhi" class="lianxidizhi">
    			<div id="textdz" class="textdz">
    				<font size="3px" face="微软雅黑" style="font-weight: bold;">联系地址：${person.address }</font>
    			</div>
    		</div>
    		<div id="weixin" class="weixin">
    			<div id="imgwx" class="imgwx">
    				<img alt="二维码" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>img/erweima.jpg" height="196px" width="196px">
    			</div>
    		</div>
    	</div>
    </div>
  </body>
</html>
