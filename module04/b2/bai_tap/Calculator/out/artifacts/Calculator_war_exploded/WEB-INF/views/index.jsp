<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SQ
  Date: 9/16/2021
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/cal" method="post">
    <input type="number" placeholder="left" name="left" required>
     <select class="form-control" name="operator">
    <option value="+" th:th:selected="${operator.equals('+')}">+</option>
    <option value="-" th:selected="${operator.equals('-')}">-</option>
    <option value="*" th:selected="${operator.equals('*')}">*</option>
    <option value="/" th:selected="${operator.equals('/')}">/</option>
    <option value="^" th:selected="${operator.equals('^')}">^</option>
</select>

    <input type="number" placeholder="right" name="right" required/> =
    <input type="number" placeholder="result" name="result" value="${result}"/>
    <p><input type="submit" value="Save"></p>
</form>


</body>
</html>
