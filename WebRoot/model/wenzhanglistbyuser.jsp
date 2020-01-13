<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
	

  </head>
  
  <body>
   <div id="main" class="main">
    		<div id="pagehead" class="pagehead">
    			<%@ include file="pageHead.jsp" %>
    		</div>
    		<div id="pageleft" class="pageleft" >
    			<%@ include file="pageLeft.jsp" %>
    		</div>
    		<div id="pageright" class="pageright">
    			<%@ include file="pageRightWenZhangList.jsp" %>
    		</div>
    		<div id="pagefooter" class="pagefooter" >
    			<%@ include file="footer.jsp" %>
    		</div>
    	</div>
  </body>
</html>
