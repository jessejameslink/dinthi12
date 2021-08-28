<%@ page import="service.TiecCuoiImpl" %>
<%@ page import="bean.DichVu" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/tieccuoi?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <div>
        <form action="/tieccuoi" method="post">
            <div class="input-group">
                <div class="form-outline">
                    <input type="text" name="search"  id="form1" class="form-control" placeholder="search..."/>
                </div>
            </div>
            <input type="hidden" name="action" value="search">
        </form>
    </div>
<%--    //        NgayToChuc date--%>
<%--    //        TenCoDau varchar(45)--%>
<%--    //        TenChuRe varchar(45)--%>
<%--    //        SoLuongBan int(11)--%>
<%--    //        id_DichVu int(11)--%>
<%--    //        TienNoThanhToan float--%>
<%--    //        NgayDatCoc date--%>
<%--    //        GhiChu varchar(45)--%>
<%--    //        TrangThai varchar(45)--%>

    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>id</th>
            <th>NgayToChuc</th>
            <th>TenCoDau</th>
            <th>TenChuRe</th>
            <th>SoLuongBan</th>
            <th>id_DichVu</th>
            <th>TienNoThanhToan</th>
            <th>NgayDatCoc</th>
            <th>GhiChu</th>
            <th>TrangThai</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="tieccuoi" items="${tiecCuoiList}">
            <tr>
                <td><c:out value="${tieccuoi.id}"/></td>
                <td><c:out value="${tieccuoi.ngayToChuc}"/></td>
                <td><c:out value="${tieccuoi.tenCoDau}"/></td>
                <td><c:out value="${tieccuoi.tenChuRe}"/></td>
                <td><c:out value="${tieccuoi.soLuongBan}"/></td>
              <td>
                <c:set var="myTest" value="${tieccuoi.id_DichVu}"/>
                <% int id = (int) pageContext.getAttribute("myTest"); %>
                <% TiecCuoiImpl tiecCuoi = new TiecCuoiImpl();
                DichVu dichVu = tiecCuoi.selsectDichVuId(id);
                out.print(dichVu.getTenDichVu());
                %>
              </td>
                <td><c:out value="${tieccuoi.tienNoThanhToan}"/></td>
                <td><c:out value="${tieccuoi.ngayDatCoc}"/></td>
                <td><c:out value="${tieccuoi.ghiChu}"/></td>
                <td><c:out value="${tieccuoi.trangThai}"/></td>
                <td>
                    <a href="/tieccuoi?action=edit&id=${tieccuoi.id}">Edit</a>
                    <a href="/tieccuoi?action=delete&id=${tieccuoi.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
