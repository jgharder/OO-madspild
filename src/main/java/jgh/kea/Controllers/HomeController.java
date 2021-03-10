package jgh.kea.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    //comment
    @GetMapping("/")
        public String index(){
        return "index.html";
    }

    @GetMapping("/fakta")
    public String fakta(){

        return "fakta";
    }

}

