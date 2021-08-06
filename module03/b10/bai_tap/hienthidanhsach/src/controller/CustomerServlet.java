package controller;

import bean.customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "")
public class CustomerServlet extends HttpServlet {

    private static List<customer> customerList;

    @Override
    public void init() throws ServletException {

        customerList = new ArrayList<>();

        customerList.add(new customer(1, "Mai Van Hoan", "1983-08-20", "Ha Noi", ""));
        customerList.add(new customer(2, "Nguyen Van Nam", "1983-08-21", "Bac Giang", ""));
        customerList.add(new customer(3, "Nguyen Thai Hoa", "1983-08-22", "Nam Dinh", ""));
        customerList.add(new customer(4, "Tran Dang Khoa", "1983-08-17", "Ha Tay", ""));
        customerList.add(new customer(5, "Nguyen Dinh Thi", "1983-08-19", "Ha Noi", ""));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/WEB-INF/view/list.jsp").forward(request, response);
    }
}
