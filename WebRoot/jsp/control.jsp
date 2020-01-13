<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="favicon.ico" rel="SHORTCUT ICON" />
    <title>斗斗律师服务平台</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="css/style.css" rel="stylesheet" type="text/css">

<body>　
<table width="1350" height="200" border="0" cellpadding="0" cellspacing="0" align="center"> 
  <tr> 
    <td height="100" colspan=8 bgcolor="#CCCCCC" align="center">
    	<font size="10" face="微软雅黑">后台管理</font>
    </td>
  </tr>
  <tr height="100" bgcolor="#CCCCCC"> 
  <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="enterinfobyadmin.action" target="_blank">
          		<font size="5" face="微软雅黑">律师简介管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="wenzhang_findByPage?currentPage=1&tablename=fagui" target="_blank">
          		<font size="5" face="微软雅黑">劳动法规管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="wenzhang_findByPage?currentPage=1&tablename=zhongcai" target="_blank">
          		<font size="5" face="微软雅黑">劳动仲裁管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="wenzhang_findByPage?currentPage=1&tablename=susong" target="_blank">
          		<font size="5" face="微软雅黑">劳动诉讼管理</font>
          	</a>
          	</td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="wenzhang_findByPage?currentPage=1&tablename=anli" target="_blank">
          		<font size="5" face="微软雅黑">经典案例管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="wenzhang_findByPage?currentPage=1&tablename=xinwen" target="_blank">
          		<font size="5" face="微软雅黑">新闻管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="findLiuYanByPage.action?currentPage=1" target="_blank">
          		<font size="5" face="微软雅黑">留言管理</font>
          	</a>
          </td>
          <td bgcolor="#D3E3F5" width="170" align="center">
          	<a href="findPerson.action" target="_blank">
          		<font size="5" face="微软雅黑">联系信息管理</font>
          	</a>
          </td>
          
  </tr>
</table>
</body>
</html>