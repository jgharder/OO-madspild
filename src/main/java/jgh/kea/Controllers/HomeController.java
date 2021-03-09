package jgh.kea.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
        public String index(Model model){

        return "index.html";
    }

    @GetMapping("/fakta")
    public String fakta(){

        return "fakta";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam("ingredient") String ingredient, RedirectAttributes attributes){
        attributes.addAttribute("ingredients", ingredient);
        

        return "redirect:/submitted";
    }

    @GetMapping("/submitted")
    public String submitted(){

        return "submitted";
    }

}
