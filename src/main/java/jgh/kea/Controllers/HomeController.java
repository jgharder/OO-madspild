package jgh.kea.Controllers;

import jgh.kea.Services.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
        public String index(Model model){
        model.addAttribute("ingredient", new Ingredient());
        return "index.html";
    }

    @PostMapping("/")
    public String submit(@ModelAttribute Ingredient ingredient, Model model ){
model.addAttribute("ingredient", ingredient);

        return "result";
    }

    @GetMapping("/fakta")
    public String fakta(){

        return "fakta";
    }



    @GetMapping(value="/submitted")
    public String submitted(@RequestParam String ingredient, Model model) {
model.getAttribute(ingredient);
        return "result";
    }
}

