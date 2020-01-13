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
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/add.css">

  </head>
  
  <body>
    <div id="addPart" class="addPart">
  			<div id="addPartMain" class="addPartMain">
  				<div id="addLanMu" class="addText" style="margin-bottom: 15px">
  					<font size="6" face="微软雅黑">${lanmu}</font>
  				</div>
  				<div>
  					<input name="wenZhang.id" type="text" value="${wenZhang.id}" style="display:none;">
  				</div>
  				<div id="addTitle" class="addText">
  					<div id="tt" class="text">
  						<font size="4" face="微软雅黑">标题：</font>
  					</div>
  					<div id="ttinput" class="input">
  						${wenZhang.title}
  					</div>
  					
  				</div>
  				<div id="addAuthor" class="addText">
	  				<div id="at" class="text">
	  						<font size="4" face="微软雅黑">作者：</font>
	  					</div>
	  					<div id="atinput" class="input">
	  						${wenZhang.author}
	  					</div>
	  					
	  				</div>
	  				<div id="addDate" class="addText">
	  				<div id="at" class="text">
	  						<font size="4" face="微软雅黑">日期：</font>
	  					</div>
	  					<div id="atinput" class="input">
	  						${wenZhang.date}
	  					</div>
	  					
	  				</div>
  				<div id="addMain" class="addMain">
  					<div id="at" class="text">
	  						<font size="4" face="微软雅黑">内容：</font>
	  				</div>
	  				<div id="textar" class="textar">
	  					<pre width="700px">${wenZhang.main}</pre>
	  				</div>
	  					
	  			</div>
  				</div>
  		</div>
  </body>
</html>
