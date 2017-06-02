<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-23
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <title>4S汽车管理系统</title>
    <meta charset="UTF-8" />
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/demo.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
</head>
<body>
<div class="container">

    <section>
        <div id="container_demo" >
            <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
            <a class="hiddenanchor" id="toregister"></a>
           <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <form  action="${pageContext.request.contextPath}/LoginServlet" autocomplete="on" method="post">
                        <h1>Log in</h1>
                        <p>
                            <label for="username" class="uname" data-icon="u" > Your email or username </label>
                            <input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                        </p>
                        <p>
                            <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                            <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" />
                        </p>
                        <p class="keeplogin">
                            <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" />
                            <label for="loginkeeping">Keep me logged in</label>
                        </p>
                        <p class="login button">
                            <input type="submit" value="Login" />
                        </p>
                        <span style="margin-left: 100px;color:red;margin-top: 5px" id="msg_p"></span>
                        <p class="change_link">
                            还没有注册 ?
                            <a href="#toregister" class="to_register">点击注册</a>
                        </p>
                    </form>
                </div>

                <div id="register" class="animate form">
                    <form  action="${pageContext.request.contextPath}/RegisterServlet" method="post">
                        <h1> Sign up </h1>
                        <p>
                            <label for="usernamesignup" class="uname" data-icon="u">用户名</label>
                            <input id="usernamesignup" name="username" required="required" type="text" placeholder="请输入用户名" />
                        </p>

                        <p>
                            <label for="passwordsignup" class="youpasswd" data-icon="p">密码 </label>
                            <input id="passwordsignup" name="password" required="required" type="password" placeholder="请设置您的密码"/>
                        </p>
                        <p>
                            <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">确认密码</label>
                            <input id="passwordsignup_confirm" name="password_confirm" required="required" type="password" placeholder="请确认您的密码"/>
                        </p>
                        <p class="signin button">
                            <input type="submit" value="Sign up"/>
                        </p>
                        <p class="change_link">
                            已经有帐号了 ?
                            <a href="#tologin" class="to_register"> 去登录 </a>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

</body>
</html>