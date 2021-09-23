package pl.nieoczywisty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String displayMainPage(Model model) {
        model.addAttribute("page","homepage");
        return "indexNew";
    }
}
