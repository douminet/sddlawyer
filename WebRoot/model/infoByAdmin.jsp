<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/info.css">
	

  </head>
  
  <body>
    <div id="infomain" class="infomain">
    	<div id="jianjietext" class="jianjietext">律师简介</div>
    	<div>
  			<input name="info.iid" type="text" value="${info.iid}" style="display:none;">
  		</div>
    	<div id="infomaintext" class="infomaintext">
    		<pre>${info.info }</pre>
    	</div>
    	<div id="updtext" class="updtext">
    		<a href="enterUpdInfo?info.iid=${info.iid }" target="_self">修改</a>
    	</div>
    </div>
  </body>
</html>
