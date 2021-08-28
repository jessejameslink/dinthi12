<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
    <h2>
        <a href="/product?action=create">Add New Product</a>
    </h2>
</center>
<div align="center">
    <div>
        <form action="/product" method="post">
            <div class="input-group">
                <div class="form-outline">
                    <input type="text" name="search"  id="form1" class="form-control" placeholder="search..."/>
                </div>
            </div>
            <input type="hidden" name="action" value="search">
        </form>
    </div>

    <table border="1" cellpadding="5">
        <caption><h2>List of Product</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Manufacturer</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.description}"/></td>
                <td><c:out value="${product.manufacturer}"/></td>
                <td>
                    <a href="/product?action=edit&id=${product.id}">Edit</a>
                    <a href="/product?action=delete&id=${product.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>