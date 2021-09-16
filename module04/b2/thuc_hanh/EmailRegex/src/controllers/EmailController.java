package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final  String EMAIL_REGEX = "^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}$";

    public EmailController(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/email")
    String getIndex(){
        return "index";
    }

    @PostMapping("/validate")
    String validateEmail(@RequestParam("email") String email, Model model){

        boolean isvalid = this.validate(email);

        if (!isvalid){
            model.addAttribute("message","email is invalid");
            return "index";

        }
        model.addAttribute("email",email);
        return "success";
    }

    private boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}