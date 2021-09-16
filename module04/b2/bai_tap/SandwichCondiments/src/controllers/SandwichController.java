package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/sandwich")
    public String index(){

        return "select";
    }

    @PostMapping("/save")
    public String selectCondiments(@RequestParam("condiments") String[] condiments, Model model){
        model.addAttribute("condiments",condiments);

        return "index";

    }
}
