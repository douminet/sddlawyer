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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table align="center">
	  <tr>
	  	<td>
			    <table width="1000px" border="1" cellpadding="2" cellspacing="1" bgcolor="#CCCCCC" align="center">
			    	<tr>
			    		<td width="70%" align="center">
			    			<font size="5" face="微软雅黑">${lanmu }</font>
			    		</td>
			    		<td width="15%" align="center">
			    			<font size="5" face="微软雅黑">日期</font>
			    		</td>
			    		<td colspan="2" align="center">
			    			<font size="5" face="微软雅黑"><a href="wenzhang_enterAddWenZhang.action?tablename=${tablename }" target="mainFrame">添加新内容</a></font>
			    		</td>
			    	</tr>
			    		<s:iterator value="wens" var="v_wen">
			    			<tr>
			    				<td align="center"><font size="4" face="微软雅黑">
			    				<a href="wenzhang_enterWenZhang.action?tablename=${tablename }&wenZhang.id=${v_wen.id}" target="_blank">${v_wen.title }</a>
			    				</font></td>
			    				<td align="center"><font size="4" face="微软雅黑">${v_wen.date }</font></td>
			    				<td align="center"><a href="wenzhang_enterUpdWenZhang.action?tablename=${tablename }&wenZhang.id=${v_wen.id}" target="_self"><font size="4" face="微软雅黑">修改</font></a></td>
			    				<td align="center"><a href="wenzhang_delWenZhang.action?tablename=${tablename }&wenZhang.id=${v_wen.id}&currentPage=1"><font size="4" face="微软雅黑">删除</font></a></td>
			    			</tr>
			    		</s:iterator>
			    </table>
			</td>
	    </tr>
	    <tr>
    <td align="center">
	     第${currentPage }页　共${maxPage }页
	     <a href="wenzhang_findByPage?currentPage=1&tablename=${tablename }">首页</a>
	     <s:if test="currentPage>1"><a href="wenzhang_findByPage?currentPage=${currentPage-1 }&tablename=${tablename }">上一页</a></s:if>　　
	     <s:else>上一页</s:else>
	     <s:if test="currentPage<maxPage"><a href="wenzhang_findByPage?currentPage=${currentPage+1 }&tablename=${tablename }">下一页</a></s:if>
	     <s:else>下一页</s:else>　
	       <a href="wenzhang_findByPage?currentPage=${maxPage}&tablename=${tablename }">尾页</a>  
   转至
   <select  onchange="self.location.href=options[selectedIndex].value">
      <s:iterator value="pages" var="v_page">
      	<option value="wenzhang_findByPage?currentPage=${v_page}&tablename=${tablename }">${v_page }</option>
      </s:iterator>
	   </select>	  </td>
  </tr>
    </table>
  </body>
</html>
