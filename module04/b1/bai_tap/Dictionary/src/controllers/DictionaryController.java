package controllers;

import models.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DictionaryService;

import java.util.List;

@Controller
public class DictionaryController {
    private DictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/search")
    public String search(){
        return "index";
    }

    @PostMapping("/result")
    public String mean(@RequestParam String key, Model model){
        List<Dictionary> dictionaryList =this.dictionaryService.findAll();
        for (int i = 0; i < dictionaryList.size();i++){
            if (key.equalsIgnoreCase(dictionaryList.get(i).getEnglish())){
                model.addAttribute("word",dictionaryList.get(i).getVietnamese());
                model.addAttribute("key",key);
                return "mean";
            }
        }
        return "mean";
    }
}
