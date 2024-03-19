<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/03/2024
  Time: 10:34 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<style>
    .login {
        height: 180px;
        width: 230px;
        margin: 0;
        padding: 10px;
        border: 1px #ccc solid;
    }
</style>
<body>
<form>
    <h2>Login</h2>
    <div class="login">
        <label>
            <input type="text" name="username" size="30" placeholder="username"/>
        </label>
        <label>
            <input type="password" name="password" size="30" placeholder="password"/>
        </label>
        <label>
            <input type="submit" value="Sign in"/>
        </label>
    </div>
</form>
</body>
</html>
