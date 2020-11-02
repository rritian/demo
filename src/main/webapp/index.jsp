<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body style="background-image: url(img/background.jpg);background-size: 100%;">

<div class="container">
    <form class="form-horizontal" action="login" method="post" style="margin-top:15%;">
        <h2 class="text-center">RTMALL</h2>
        <div class="form-group">
            <div class="col-md-4 col-md-offset-4">
                <input type="text" class="form-control" style="height:auto;padding:10px;" placeholder="输入用户名" name="id">
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-4 col-md-offset-4">
                <input type="password" class="form-control" style="height:auto;padding:10px;" placeholder="输入密码" name="pwd">
            </div>
        </div>
        <div class="col-md-4 col-md-offset-4">
            <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        </div>


    </form>
    <div>
        <a href="register.jsp">还没有账号？注册</a>
    </div>

</div>

</body>
</html>