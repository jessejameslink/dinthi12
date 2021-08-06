<%--
  Created by IntelliJ IDEA.
  User: SQ
  Date: 8/3/2021
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="display-discount" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="Product Description" placeholder="Product Description" /><br/>
  <label>List Price: </label><br/>
  <input type="text" name="List Price" placeholder="List Price" /><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="Discount Percent" placeholder="Discount Percent"/><br/>

  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
