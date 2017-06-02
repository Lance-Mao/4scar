<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-23
  Time: 下午7:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新的汽车信息</title>
    <script src="/car/Jquery/jquery-1.8.0.js"></script>
    <link rel="stylesheet" href="/car/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/car/layui/layui.js">
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>添加汽车相关信息</legend>
</fieldset>

<form class="layui-form" action="/addCarServlet" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">车型</label>
        <div class="layui-input-block">
            <input type="text" name="models" lay-verify="title" autocomplete="off" placeholder="请输入汽车车型" class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">价格</label>
        <div class="layui-input-block">
            <input type="text" name="price" lay-verify="title" autocomplete="off" placeholder="请输入汽车价格" class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">尺寸</label>
        <div class="layui-input-block">
            <input type="text" name="size" lay-verify="title" autocomplete="off" placeholder="请输入汽车尺寸" class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">油耗</label>
        <div class="layui-input-block">
            <input type="text" name="fuel_consumption" lay-verify="title" autocomplete="off" placeholder="请输入汽车油耗" class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">数量</label>
        <div class="layui-input-block">
            <input type="text" name="number" lay-verify="title" autocomplete="off" placeholder="请输入汽车数量" class="layui-input">
        </div>

    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <input type="submit"class="layui-btn" value="立即提交">
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
</html>
