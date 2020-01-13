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
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/add.css">
	
	
	<script>
var agt = navigator.userAgent.toLowerCase();
var is_op = (agt.indexOf("opera") != -1);
var is_ie = (agt.indexOf("msie") != -1) && document.all && !is_op;
function ResizeTextarea(a,row){
    if(!a){return}
    if(!row)
        row=5;
    var b=a.value.split("\n");
    var c=is_ie?1:0;
    c+=b.length;
    var d=a.cols;
    if(d<=20){d=40}
    for(var e=0;e<b.length;e++){
        if(b[e].length>=d){
            c+=Math.ceil(b[e].length/d)
        }
    }
    c=Math.max(c,row);
    if(c!=a.rows){
        a.rows=c;
    }
}
</script>


  </head>
  
  <body>
  	<form action="wenzhang_addWenZhang.action" method="post">
  		<div id="addPart" class="addPart">
  			<div id="addPartMain" class="addPartMain">
  				<div id="addLanMu" class="addText">
  					<font size="6" face="微软雅黑">${lanmu}</font>
  				</div>
  				<div id="addLanMu" class="addText" style="display: none;">
  					<input name="tablename" value="${tablename}">
  				</div>
  				<div id="addLanMu" class="addText" style="display: none;">
  					<input name="currentPage" value="1">
  				</div>
  				<div id="addTitle" class="addText">
  					<div id="tt" class="text">
  						<font size="4" face="微软雅黑">标题：</font>
  					</div>
  					<div id="ttinput" class="input">
  						<input name="wenZhang.title" type="text">
  					</div>
  					
  				</div>
  				<div id="addAuthor" class="addText">
	  				<div id="at" class="text">
	  						<font size="4" face="微软雅黑">作者：</font>
	  					</div>
	  					<div id="atinput" class="input">
	  						<input name="wenZhang.author" type="text">
	  					</div>
	  					
	  				</div>
  				<div id="addMain" class="addMain">
  					<div id="at" class="text">
	  						<font size="4" face="微软雅黑">内容：</font>
	  				</div>
	  				<div id="textar" class="textar">
	  						<textarea name="wenZhang.main"></textarea>
	  				</div>
	  					
	  			</div>
  				</div>
  				<div id="anniu" class="anniu">
  					<div id="sub" class="sub">
  						<div id="bc" class="an">
  							<input type="submit" value="保存" align="middle">
  						</div>
  						
  					</div>
  					<div id="reset" class="sub">
  						<div id="bc" class="an">
  							<input type="reset" value="重置" align="middle"/>
  						</div>
  						
  					</div>
  				</div>
  			</div>
  		</div>
  	</form>
  </body>
</html>
