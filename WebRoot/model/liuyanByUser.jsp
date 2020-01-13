<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
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
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/add.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>css/addliuyan.css">
	<!--[if IE]>
		<style type="text/css">
		.textarduihua1{
			width: 500px;
			float: left;
			background-size: 100% 100%;
			-moz-background-size:100% 100%;
		  	-webkit-background-size:100% 100%;
		  	-o-background-size:100% 100%;
		  	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
		    src='http://localhost:8080/sddlawyer/img/duihuakuang.png',
		    sizingMethod='scale');
		    padding-top: 40px;
		    padding-left: 40px;
		    padding-right: 40px;
		    padding-bottom: 40px;
		    margin-top: 20px;
		    text-align: left;
		    background-image: url("");
		}
		.textarduihua0{
			width: 500px;
			float: right;
			-ms-background-color:#93FF1D;
			background-size: 100% 100%;
			-moz-background-size:100% 100%;
		  	-webkit-background-size:100% 100%;
		  	-o-background-size:100% 100%;
		  	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
		    src='http://localhost:8080/sddlawyer/img/duihuakuang.png',
		    sizingMethod='scale');
		    padding-top: 40px;
		    padding-left: 40px;
		    padding-right: 40px;
		    padding-bottom: 40px;
		    margin-top: 20px;
		    text-align: left;
		    background-image: url("");
		}
	</style>
	<![endif]-->
	
  </head>
  
  <body>
    <div id="addPart" class="addPart">
  			<div id="addPartMain" class="addPartMain">
  				
  				<div>
  					<input name="liuYan.lid" type="text" value="${liuYan.lid}" style="display:none;">
  				</div>
  				<div id="addTitle" class="addText">
  					
  					<div id="ttinput" class="input" style="margin-top: 40px;">
  						<font size="6" face="微软雅黑">${liuYan.l_title}</font>
  					</div>
  					
  				</div>
  				
  				<div id="addMain" class="addMain" style="margin-top: 15px">
	  				
	  				<s:iterator value="huiFus" var="v_hf">
	  					<s:if test="isyk==1">
		  					<div id="textar" class="textarduihua1">
		  						<pre><font size="3" face="微软雅黑">${v_hf.h_main}</font></pre>
		  					</div>
	  					</s:if>
	  					<s:else>
	  						<div id="textar" class="textarduihua0">
		  						<pre><font size="3" face="微软雅黑">${v_hf.h_main}</font></pre>
		  					</div>
	  					</s:else>
					</s:iterator>
	  			</div>
	  			<form action="addHuiFu.action" method="post">
		  				<div style="display: none;">
		  					<input type="text" name="huiFu.lid" value="${liuYan.lid }">
		  					<input type="text" name="huiFu.isyk" value="1">
		  					<input type="text" name="huiFu.h_name" value="游客">
		  				</div>
	    				
		  					
	  			</form>
  			</div>
  		</div>
  </body>
</html>
