<%--
  Created by IntelliJ IDEA.
  User: SQ
  Date: 9/15/2021
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>English-Vietnamese Dictionary</h3>
<form method="post" action="/result">
    <label>
        <input type="search" name="key">
    </label>
    <input type="submit" value="Search">
</form>
<a href="/views/index.jsp">Back</a>

</body>
</html>
