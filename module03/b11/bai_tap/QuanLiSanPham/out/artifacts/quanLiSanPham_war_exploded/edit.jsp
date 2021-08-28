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
        <a href="product?action=product">List All Products</a>
    </h2>
</center>
<div align="center">
    <c:if test="${product != null}">
        <form method="post" action="/product">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit Product
                    </h2>
                </caption>

                <tr>
                    <th>Name:</th>
                    <td>
                        <input type="text" name="name" size="45"
                               value="<c:out value='${product.name}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Price:</th>
                    <td>
                        <input type="text" name="price" size="45"
                               value="<c:out value='${product.price}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Description:</th>
                    <td>
                        <input type="text" name="description" size="15"
                               value="<c:out value='${product.description}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Manufacturer:</th>
                    <td>
                        <input type="text" name="manufacturer" size="15"
                               value="<c:out value='${product.manufacturer}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>

            </table>
            <input type="hidden" name="id" value="<c:out value='${product.id}' />"/>
            <input type="hidden" name="action" value="edit">
        </form>
    </c:if>
</div>
</body>
</html>