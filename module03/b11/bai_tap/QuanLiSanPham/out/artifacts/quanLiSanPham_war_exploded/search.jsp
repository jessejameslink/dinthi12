<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="path/to/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">

</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: blue">
        <div>
            <a href="#" class="navbar-brand"> User
                Management Application </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">Users</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">List of Users</h3>
        <hr>
<%--        <div class="d-flex justify-content-between bg-light">--%>
<%--&lt;%&ndash;            <div ><a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add&ndash;%&gt;--%>
<%--&lt;%&ndash;                New User</a></div>&ndash;%&gt;--%>
<%--            <div>--%>
<%--                <form action="search.jsp">--%>
<%--                    <div class="input-group">--%>
<%--                        <div class="form-outline">--%>
<%--                            <input type="search" id="form1" class="form-control" placeholder="search..."/></a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--        </div>--%>

        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>nameProduct</th>
                <th>priceProduct</th>
                <th>descriptionProduct</th>
                <th>manufacturer</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="product" items="${productList}">
                <tr>
                    <td><c:out value="${product.id}" /></td>
                    <td><c:out value="${product.nameProduct}" /></td>
                    <td><c:out value="${product.priceProduct}" /></td>
                    <td><c:out value="${product.descriptionProduct}" /></td>
                    <td><c:out value="${product.manufacturer}" /></td>

<%--                    <td><a href="edit?id=<c:out value='${product.id}' />">Edit</a>--%>
<%--                        &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--                        <a href="delete?id=<c:out value='${product.id}' />">Delete</a></td>--%>
                </tr>
            </c:forEach>

            </tbody>

        </table>
    </div>
</div>
</body>
</html>
