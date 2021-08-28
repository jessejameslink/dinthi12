<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>TiecCuoi Management Application</title>
</head>
<body>
<center>
    <h1>TiecCuoi Management</h1>
    <h2>
        <a href="tieccuoi?action=tieccuoi">List All tieccuoi</a>
    </h2>
</center>
<div align="center">
    <c:if test="${tieccuoi != null}">
        <form method="post" action="/tieccuoi">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        Edit information
                    </h2>
                </caption>

                <tr>
                    <th> ngayToChuc:</th>
                    <td>
                        <input type="date" name="NgayToChuc" size="45"
                               value="<c:out value='${tieccuoi.ngayToChuc}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th> tenCoDau:</th>
                    <td>
                        <input type="text" name="TenCoDau" size="45"
                               value="<c:out value='${tieccuoi.tenCoDau}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th> tenChuRe:</th>
                    <td>
                        <input type="text" name="TenChuRe" size="45"
                               value="<c:out value='${tieccuoi.tenChuRe}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>soLuongBan:</th>
                    <td>
                        <input type="text" name="SoLuongBan" size="45"
                               value="<c:out value='${tieccuoi.soLuongBan}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>id_DichVu:</th>
                    <td>
                        <select class="form-control" name="id_DichVu" >
                            <c:forEach items="${dichVuList}" var="dichVu">
                                <c:if test="${dichVu.id_DichVu == tieccuoi.id_DichVu}">
                                    <option selected value="${dichVu.id_DichVu}">${dichVu.tenDichVu}</option>
                                </c:if>
                                <c:if test="${dichVu.id_DichVu != tieccuoi.id_DichVu}">
                                    <option value="${dichVu.id_DichVu}">${dichVu.tenDichVu}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>tienNoThanhToan:</th>
                    <td>
                        <input type="text" name="TienNoThanhToan" size="45"
                               value="<c:out value='${tieccuoi.tienNoThanhToan}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>ngayDatCoc:</th>
                    <td>
                        <input type="date" name="NgayDatCoc" size="45"
                               value="<c:out value='${tieccuoi.ngayDatCoc}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>ghiChu:</th>
                    <td>
                        <input type="text" name="GhiChu" size="45"
                               value="<c:out value='${tieccuoi.ghiChu}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>trangThai:</th>
                    <td>
                        <input type="text" name="TrangThai" size="45"
                               value="<c:out value='${tieccuoi.trangThai}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save"/>
                    </td>
                </tr>

            </table>
            <input type="hidden" name="id" value="<c:out value='${tieccuoi.id}' />"/>
            <input type="hidden" name="action" value="edit">
        </form>
    </c:if>
</div>
</body>
</html>