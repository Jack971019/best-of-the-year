package org.lessons.Bestof.Controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class IndexController {

    @GetMapping
    public String index(Model model){
        String myName = "Giacomo Testori";
        model.addAttribute("name", myName);
        return "homepage";
    }

   /* @GetMapping ("/movies")
    public String movies(){
        return "movies";
    }*/

    @GetMapping ("/songs")
    public String songs(){
        return "songs";
    }
}
