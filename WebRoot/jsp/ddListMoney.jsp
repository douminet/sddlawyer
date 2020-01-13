<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    <title>我斗记账</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bordered.css" rel="stylesheet" type="text/css">
	<link href="css/buttons.css" rel="stylesheet" type="text/css">
	<script language="javascript" type="text/javascript" src="js/WdatePicker.js"></script>
  </head>
  
  <body>
  	<div>
    	<form action="listByDate.action" method="post">
    	<label>
			<span><font face="微软雅黑">月份:</font></span>
			<!-- <input id="email" type="email" name="email" placeholder="Valid Email Address" /> -->
			<input name="inputDateString" style="width: 120px;" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM'})" />
			<input class="button button-pill button-tiny" type="submit" value="提交" />
		</label>
		</form>
    </div>
    <br/><br/>
    <h1><span><a href="jsp/ddMoney.jsp">辛苦了！老婆！么么哒！</a></span></h1>
    
    <table class="bordered">
    	<tr>
    		<td style="display:none;"></td>
    		<td>日期</td>
    		<td>金额</td>
    		<td>支出/收入</td>
    		<td>相关人</td>
    		<td>用途</td>
    	</tr>
    	<s:iterator value="list" var="v_money">
    		<tr>
    			<td style="display:none;"><a href="">${v_money.uuid }</a></td>
    			<td><a href="editMoney.action?uuid=${v_money.uuid }">${v_money.date }</a></td>
    			<td><a href="editMoney.action?uuid=${v_money.uuid }"">${v_money.amount }</a></td>
    			<td><a href="editMoney.action?uuid=${v_money.uuid }"">${v_money.type }</a></td>
    			<td><a href="editMoney.action?uuid=${v_money.uuid }"">${v_money.name }</a></td>
    			<td><a href="editMoney.action?uuid=${v_money.uuid }"">${v_money.use }</a></td>
    		</tr>
    	</s:iterator>
    	<tr>
    		<td style="display:none;"></td>
    		<td></td>
    		<td>支出总计：${chuSum}<br/>收入总计：${ruSum }<br/>合计：${sum }</td>
    		<td></td>
    		<td></td>
    		<td></td>
    	</tr>
    </table>
  </body>
</html>
    