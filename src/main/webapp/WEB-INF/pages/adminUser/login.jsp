<%--
  Created by IntelliJ IDEA.
  User: wuzhangyi
  Date: 2018-12-02
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form action="/adminUser/login" id="adminUser" name="adminUser" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" id="name" name="name" /> </td>
            </tr>
            <tr>
                <td>密  码：</td>
                <td><input type="password" id="password" name="password" /> </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" /> </td>
            </tr>

        </table>
    </form>
</body>
</html>
