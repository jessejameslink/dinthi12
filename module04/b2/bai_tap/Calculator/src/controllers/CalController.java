package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalController {

    @GetMapping("/home")
    public String home (){
        return "index";
    }

    @PostMapping("/cal")
    public String cal(@RequestParam String left, String right, String operator, Model model){

        Float result ;

        switch (operator){
            case "+":
                result =Float.parseFloat(left) + Float.parseFloat(right);
                break;
            case "-":
                result = Float.parseFloat(left) - Float.parseFloat(right);
                break;
            case "*":
                result = Float.parseFloat(left) * Float.parseFloat(right);
                break;
            case "/":
                result = Float.parseFloat(left) / Float.parseFloat(right);
                break;
            default:
                result = Float.valueOf(0);

        }
        model.addAttribute("result",result);

        return "index";

    }
}
