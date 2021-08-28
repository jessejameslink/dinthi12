package controller;

import bean.DichVu;
import bean.TiecCuoi;
import com.sun.org.apache.xpath.internal.operations.Div;
import service.ITiecCuoi;
import service.TiecCuoiImpl;

import javax.rmi.CORBA.Tie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TiecCuoiServlet",urlPatterns = "/tieccuoi")
public class TiecCuoiServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ITiecCuoi tiecCuoi = new TiecCuoiImpl();

    public TiecCuoiServlet() {
        super();

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertTiecCuoi(request, response);
                    break;
                case "edit":
                    updateTiecCuoi(request, response);
                    break;
//                case "search":
//                    selectTiecCuoiByName(request, response);
//                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteTiecCuoi(request, response);
                default:
                    listTiecCuoi(request, response);
                    break;
            }
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void listTiecCuoi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<TiecCuoi> tiecCuoiList = tiecCuoi.selectAllTiecCuoi();
        request.setAttribute("tiecCuoiList", tiecCuoiList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteTiecCuoi(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        tiecCuoi.deleteTiecCuoi(id);

        List<TiecCuoi> tiecCuoiList = tiecCuoi.selectAllTiecCuoi();
        request.setAttribute("tiecCuoiList", tiecCuoiList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<DichVu> dichVuList =tiecCuoi.selectAllDichVu();
        request.setAttribute("dichVuList",dichVuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        TiecCuoi existingUser = tiecCuoi.selectTiecCuoi(id);
        List<DichVu> dichVuList =tiecCuoi.selectAllDichVu();

        request.setAttribute("dichVuList",dichVuList);
        request.setAttribute("tieccuoi", existingUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");

        dispatcher.forward(request, response);
    }


    private void insertTiecCuoi(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String NgayToChuc = request.getParameter("NgayToChuc");
        String TenCoDau = request.getParameter("TenCoDau");
        String TenChuRe = request.getParameter("TenChuRe");
        String SoLuongBan = request.getParameter("SoLuongBan");
        int id_DichVu = Integer.parseInt(request.getParameter("id_DichVu"));
        String TienNoThanhToan =request.getParameter("TienNoThanhToan");
        String NgayDatCoc = request.getParameter("NgayDatCoc");
        String GhiChu = request.getParameter("GhiChu");
        String TrangThai = request.getParameter("TrangThai");
        TiecCuoi newTiecCuoi = new TiecCuoi(NgayToChuc, TenCoDau, TenChuRe,SoLuongBan,id_DichVu,TienNoThanhToan,NgayDatCoc,GhiChu,TrangThai);

        tiecCuoi.insertTiecCuoi(newTiecCuoi);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        dispatcher.forward(request, response);
    }

    private void updateTiecCuoi(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String NgayToChuc = request.getParameter("NgayToChuc");
        String TenCoDau = request.getParameter("TenCoDau");
        String TenChuRe = request.getParameter("TenChuRe");
        String SoLuongBan = request.getParameter("SoLuongBan");
        int id_DichVu = Integer.parseInt(request.getParameter("id_DichVu"));
        String TienNoThanhToan = request.getParameter("TienNoThanhToan");
        String NgayDatCoc = request.getParameter("NgayDatCoc");
        String GhiChu = request.getParameter("GhiChu");
        String TrangThai = request.getParameter("TrangThai");

        TiecCuoi book = new TiecCuoi(id,NgayToChuc,TenCoDau,TenChuRe,SoLuongBan,id_DichVu,TienNoThanhToan,NgayDatCoc,GhiChu,TrangThai);

        tiecCuoi.updateTiecCuoi(book);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        dispatcher.forward(request, response);
    }

//    private void selectTiecCuoiByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//        String search = request.getParameter("search");
//        List<TiecCuoi> tiecCuoiList = tiecCuoi.selectAllTiecCuoi(search);
//        request.setAttribute("tiecCuoiList", tiecCuoiList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
//        dispatcher.forward(request, response);
//    }
}
