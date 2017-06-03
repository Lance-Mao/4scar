
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-23
  Time: 下午4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>4S汽车管理系统</title>
    <script src="/car/Jquery/jquery-1.8.0.js"></script>
    <link rel="stylesheet" href="/car/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/car/layui/layui.js">

</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>汽车</legend>
</fieldset>
<div class="layui-btn-group" style="padding-left: 10px">
    <a href="/car/addCar.jsp" class="layui-btn">添加汽车信息</a>
</div>


<script type="text/javascript">
    $("#add").append("<tr> <th>
</script>
<div class="layui-form" id="aaa">
    <table class="layui-table">
        <colgroup width="350">
            <col width="100">
            <col width="250">
            <col width="250">
            <col width="250">
            <col width="250"/>
        </colgroup>
        <thead id="add">
        <tr>
            <th>车型</th>
            <th>价格</th>
            <th>尺寸</th>
            <th>油耗</th>
            <th>数量</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${pageContext.request.getAttribute("carList")[0]}</td>
            <td>${pageContext.request.getAttribute("carList")}</td>
            <td>${pageContext.request.getAttribute("carList")}</td>
            <td>${pageContext.request.getAttribute("carList")}</td>
            <td>${pageContext.request.getAttribute("carList")}</td>
            <td>
                <a href="/car/modifyCar.jsp" class="layui-btn">修改该数据</a>
                <button class="layui-btn layui-btn-danger" id="delCar">删除该数据</button>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>