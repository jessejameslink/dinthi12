package cg.wbd.grandemonstration.servlet;


import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.CustomerServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class CustomerServlet extends HttpServlet{
    private CustomerService customerService = CustomerServiceFactory.getInstance();

    @GetMapping("/customers")
    public String showList(HttpServletRequest request) {
        List<Customer> customers = customerService.findAll();
            request.setAttribute("customers", customers);

        return "list";
    }

}
