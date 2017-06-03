<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-23
  Time: 下午7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>修改汽车信息</title>
    <script src="/car/Jquery/jquery-1.8.0.js"></script>
    <link rel="stylesheet" href="/car/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/car/layui/layui.js">
</head>
<body>

<form action="/ModifyServlet" method="post" class="layui-form" >
    请输入您要修改的车型：<input type="text" id="models" name="models">
    <div class="layui-form-item">
        <br>
        <br>
        <br>
        请修改该以下参数
        <br>
        <br>
        <br>

        <label class="layui-form-label">价格</label>
        <div class="layui-input-block">
            <input type="text" id="price" name="price" lay-verify="title" autocomplete="off" placeholder="请输入汽车价格"
                   class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">尺寸</label>
        <div class="layui-input-block">
            <input type="text" id="size" name="size" lay-verify="title" autocomplete="off" placeholder="请输入汽车尺寸"
                   class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">油耗</label>
        <div class="layui-input-block">
            <input type="text" id="fuel_consumption" name="fuel_consumption" lay-verify="title" autocomplete="off" placeholder="请输入汽车油耗"
                   class="layui-input">
        </div>
        <br>

        <label class="layui-form-label">数量</label>
        <div class="layui-input-block">
            <input type="text" id="number" name="number" lay-verify="title" autocomplete="off" placeholder="请输入汽车数量"
                   class="layui-input">
        </div>

    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <input type="submit" class="layui-btn" value="确认修改">
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<form class="layui-form" action="/ModifyServlet" method="post">
    请输入您要修改的车型：<input type="text">
    <div class="layui-form-item">
        <label class="layui-form-label">价格</label>
        <div class="layui-input-block">
            <input type="text" name="price" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
        </div>

        <label class="layui-form-label">尺寸</label>
        <div class="layui-input-block">
            <input type="text" name="size" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
        </div>

        <label class="layui-form-label">油耗</label>
        <div class="layui-input-block">
            <input type="text" name="fuel_consumption" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
        </div>

        <label class="layui-form-label">数量</label>
        <div class="layui-input-block">
            <input type="text" name="number" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form();

        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>

</body>
</html>
