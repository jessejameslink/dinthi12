import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/display-discount")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float listPrice = Float.parseFloat(request.getParameter("List Price"));
        float DiscountPercent = Float.parseFloat(request.getParameter("Discount Percent"));

        float DiscountAmount = (float) (listPrice * DiscountPercent * 0.01);
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Discount Amount: " + DiscountAmount+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
