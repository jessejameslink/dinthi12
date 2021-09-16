<%--
  Created by IntelliJ IDEA.
  User: SQ
  Date: 9/16/2021
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<form action="/save" method="post">
    <input type="checkbox" value="Lettuce" name="condiments">Lettuce
    <input type="checkbox" value="Tomato" name="condiments"/>Tomato
    <input type="checkbox" value="Mustard" name="condiments"/>Mustard
    <input type="checkbox" value="Sprouts" name="condiments"/>Sprouts
    <p><input type="submit" value="Save"></p>
</form>
</body>
</html>
