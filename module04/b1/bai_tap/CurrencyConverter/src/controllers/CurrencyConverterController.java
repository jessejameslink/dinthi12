package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {
    @GetMapping("/converter")
    public String index(){
        return "index";
    }
    @PostMapping("/usd")
    public String submit(@RequestParam String usd, String rate, Model model){
        float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result",result);
        return "submit";
    }
}
