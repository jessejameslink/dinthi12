<%--
  Created by IntelliJ IDEA.
  User: SQ
  Date: 9/15/2021
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/usd">
    <input type="hidden" name="rate" value="22000"><br>
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD"><br>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>
